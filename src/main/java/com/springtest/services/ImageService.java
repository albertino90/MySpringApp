package com.springtest.services;

import com.springtest.model.Image;

public interface ImageService {

    Image getImage(Long id);

    //    <S extends T> S save(S var1);
    Image saveImage(Image image);
}
