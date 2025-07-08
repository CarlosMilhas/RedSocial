package com.milhas.RedSocial.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milhas.RedSocial.model.Reaction;
import com.milhas.RedSocial.service.ReactionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reaction")
public class ReactionController {

    private final ReactionService myService;

    @PostMapping()
    public void createReaction(@RequestBody Reaction myReaction) {

        myService.createReaction(myReaction.getMyUser().getId(), myReaction.getMyPublication().getId());
    }

}
