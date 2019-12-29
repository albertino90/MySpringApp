package com.springtest.services;

import com.springtest.model.Image;

public interface ImageService {

    Image getImage(Long id);

    Image saveImage(Image image);
}
