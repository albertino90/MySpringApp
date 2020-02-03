package com.springtest.controllers;

import com.springtest.mappers.UserMapper;
import com.springtest.model.User;
import com.springtest.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController Аннотация аккумулирует поведение двух аннотаций @Controller и @ResponseBody
//@Controller - (Слой представления) Аннотация для маркировки java класса, как класса контроллера. Данный класс
// представляет собой компонент, похожий на обычный сервлет (HttpServlet) (работающий с объектами HttpServletRequest
// и HttpServletResponse), но с расширенными возможностями от Spring Framework.
//@ResponseBody - Аннотация показывает что данный метод может возвращать кастомный объект в виде xml, json...
@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/all")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "usersList";
    }
    //    @PathVariable - Аннотация, которая показывает, что параметр метода должен быть связан с переменной из урл-адреса.
    @GetMapping("/users/{id}")
    public String getById(@PathVariable Long id, Model model) {
        model.addAttribute("user",userService.getUser(id));
        return "showUser";
    }
    @GetMapping("/adduser")
    public String createUserPage() {
        return "createUser";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute("user") User user) throws Exception {
        userService.addUser(user);
        return "redirect:/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id ){
        userService.delete(id);
        return "redirect:/all";
    }
    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, Model model){
        model.addAttribute("user", userService.getUser(id));
        return "updateUser";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("user") User user){
        userService.update(user);
        return "redirect:/user/"+user.getId();
    }



}



