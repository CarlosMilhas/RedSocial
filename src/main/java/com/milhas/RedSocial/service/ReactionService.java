package com.milhas.RedSocial.service;

import org.springframework.stereotype.Service;

import com.milhas.RedSocial.model.Reaction;
import com.milhas.RedSocial.repository.IReactionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReactionService {

    private final UserService myUserService;
    private final PublicationService myPublicationService;

    private final IReactionRepository myReactionRepository;

    public void createReaction(long userId, long publicationId) {
        Reaction myReaction = myReactionRepository.findByMyUserIdAndMyPublicationId(userId, publicationId);

        if (myReaction != null) {
            myReactionRepository.deleteById(myReaction.getId());
        } else {
            Reaction newReaction = new Reaction();
            newReaction.setMyUser(myUserService.findById(userId));
            newReaction.setMyPublication(myPublicationService.getById(publicationId));

            myReactionRepository.save(newReaction);

        }
    }

}
