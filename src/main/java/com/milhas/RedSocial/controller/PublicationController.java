package com.milhas.RedSocial.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milhas.RedSocial.model.Publication;
import com.milhas.RedSocial.service.PublicationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/publication")
public class PublicationController {

    private final PublicationService myService;

    @PostMapping()
    public void createPublication(@RequestBody long publicationId) {
        myService.createPublication(publicationId);
    }

    @GetMapping()
    public List<Publication> getAllPublications() {
        return myService.getAllPublications();
    }

    @GetMapping("/{userId}")
    public List<Publication> getPublicationByUserId(@PathVariable long userId) {
        return myService.getAllPublicationByUserId(userId);
    }

}
