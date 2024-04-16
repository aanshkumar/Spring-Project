package com.anshcodes.productservice.ProductDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductDto {

    private long id;

    private String title;

    private String description;

    private double price;
    private String image;

}
