package com.springtest.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ImageDTO {

    private Long id;
    private String name;
    private String originalFilename;
    private String contentType;
    private byte[] bytes;
}
