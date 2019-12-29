package com.springtest.controllers;

import com.springtest.dto.ImageDTO;
import com.springtest.mappers.ImageMapper;
import com.springtest.model.Image;
import com.springtest.services.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


//Аннотация аккумулирует поведение двух аннотаций @Controller и @ResponseBody
//@Controller - (Слой представления) Аннотация для маркировки java класса, как класса контроллера. Данный класс
// представляет собой компонент, похожий на обычный сервлет (HttpServlet) (работающий с объектами HttpServletRequest
// и HttpServletResponse), но с расширенными возможностями от Spring Framework.
//@ResponseBody - Аннотация показывает что данный метод может возвращать кастомный объект в виде xml, json...
@RestController
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;
    private final ImageMapper imageMapper;

    @GetMapping("/images/{id}")
    public ResponseEntity<?> getImage(@PathVariable Long id) throws IOException{
        Image image = imageService.getImage(id);
        ImageDTO imageDTO = imageMapper.toDTO(image);
        return new ResponseEntity<>(imageDTO, HttpStatus.OK);
    }

    //    @PathVariable - Аннотация, которая показывает, что параметр метода должен быть связан с переменной из урл-адреса.
    @PostMapping("/images")
    public ResponseEntity<?> saveImage (@RequestParam ("file")MultipartFile file) throws IOException {

        Image image = imageMapper.toEntity(file);
        image = imageService.saveImage(image);
        ImageDTO imageDTO = imageMapper.toDTO(image);
        return new ResponseEntity<>(imageDTO, HttpStatus.CREATED);

    }


}


