package com.springtest.dto;

import com.springtest.model.Role;
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
    private String password;
    private Set<RoleDTO> roles;
}
