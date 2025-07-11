package com.milhas.RedSocial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title, description, url;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User myUser;

}
