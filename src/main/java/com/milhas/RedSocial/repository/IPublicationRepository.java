package com.milhas.RedSocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.milhas.RedSocial.model.Publication;

@Repository
public interface IPublicationRepository extends JpaRepository<Publication, Long> {

    List<Publication> findByMyUserId(long userId);

}
