package com.anshcodes.productservice.ProductService;


import com.anshcodes.productservice.ExceptionHandeling.Exception;
import com.anshcodes.productservice.PeoductModels.Products;
import com.anshcodes.productservice.ProductDto.ProductDto;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Service
public class Service {

    // http://localhost:8080/swagger-ui/index.html

    public static ProductDto convertodto(Products product){
        ProductDto obj =new ProductDto();
        obj.setId(product.getId());
        obj.setDescription(product.getDescription());
        obj.setPrice(product.getPrice());
        return obj;
    }
    public List<ProductDto> AllproductByid(){

        RestTemplate restTemplate=new RestTemplate();

        String url="https://fakestoreapi.com/products/";

        Products[] products= restTemplate.getForObject(url, Products[].class);

        List<ProductDto> returnproduct=new ArrayList<>();

        for(Products product: products){
            returnproduct.add(convertodto(product));
        }
        return returnproduct;
    }

    public ProductDto ProductbyId(Long id) throws Exception {

        RestTemplate restTemplate=new RestTemplate();

        String url="https://fakestoreapi.com/products/" + id;

        Products products= restTemplate.getForObject(url, Products.class);

        System.out.print(products);

        if(products ==null){
            throw new Exception();
        }

        return convertodto(products);
    }

}
