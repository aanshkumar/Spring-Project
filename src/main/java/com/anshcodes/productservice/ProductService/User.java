package com.anshcodes.productservice.ProductService;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity(name ="ecomm_user")

public class User {
    @Id
    @GeneratedValue(strategy =IDENTITY)
    private long id;
    private String name;
    private String email;

}
