package com.anshcodes.productservice.PeoductModels;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data

public class Products {

    private long id;

    private String title;

    private String description;

    private double price;

    private String image;

    private String Category;
}
