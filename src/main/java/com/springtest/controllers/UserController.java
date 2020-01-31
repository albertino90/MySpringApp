package com.springtest.controllers;

import com.springtest.dto.UserDTO;
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

    @GetMapping("/signup")
    public String showSignUpForm(User user) {
        return "add-user";
    }

    @GetMapping("/all")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "usersList";
    }

    //    @PathVariable - Аннотация, которая показывает, что параметр метода должен быть связан с переменной из урл-адреса.
    @GetMapping("/users/{id}")
    public String getById(@PathVariable Long id, Model model) {
//        User user = userService.getUser(id);
        model.addAttribute("user",userService.getUser(id));
        return "showUser";
    }
}

//    @PostMapping("/adduser")
//    public String addUser(@Valid User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-user";
//        }
//
//        userService.
//        model.addAttribute("users", userRepository.findAll());
//        return "index";
//    }


