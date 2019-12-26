package com.springtest.controllers;

import com.springtest.dto.UserDTO;
import com.springtest.mappers.UserMapper;
import com.springtest.model.User;
import com.springtest.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//Аннотация аккумулирует поведение двух аннотаций @Controller и @ResponseBody
//@Controller - (Слой представления) Аннотация для маркировки java класса, как класса контроллера. Данный класс
// представляет собой компонент, похожий на обычный сервлет (HttpServlet) (работающий с объектами HttpServletRequest
// и HttpServletResponse), но с расширенными возможностями от Spring Framework.
//@ResponseBody - Аннотация показывает что данный метод может возвращать кастомный объект в виде xml, json...
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    //    @PathVariable - Аннотация, которая показывает, что параметр метода должен быть связан с переменной из урл-адреса.
    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable Long id) {
        User user = userService.getUser(id);
        return userMapper.toDTO(user);

    }


}


