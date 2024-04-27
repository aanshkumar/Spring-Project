package com.anshcodes.productservice.PeoductModels;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="ecom_user")

public class User {
    @Id
    private Long id;

    private String name;

    private String email;


}
