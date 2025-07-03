package com.milhas.RedSocial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.milhas.RedSocial.model.Publication;
import com.milhas.RedSocial.repository.IPublicationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PublicationService {

    private final IPublicationRepository myRepository;

    public void createPublication(Publication publication) {
        myRepository.save(publication);
    }

    public List<Publication> getAllPublications() {
        return myRepository.findAll();
    }

    public List<Publication> getAllPublicationByUserId(long userId) {
        return myRepository.findByMyUserId(userId);
    }

}
