package com.milhas.RedSocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.milhas.RedSocial.model.Reaction;

@Repository
public interface IReactionRepository extends JpaRepository<Reaction, Long> {

    Reaction findByMyUserIdAndMyPublicationId(long id, long id2);

}