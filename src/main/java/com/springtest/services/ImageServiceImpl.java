package com.springtest.services;

import com.springtest.model.Image;
import com.springtest.repositories.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    public Image getImage(Long id) {
        return imageRepository.getById(id);
    }

    @Override
    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }
}
