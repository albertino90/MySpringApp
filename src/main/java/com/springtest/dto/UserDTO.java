package com.springtest.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private int age;
}
