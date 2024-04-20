package com.anshcodes.productservice.ProductService;


import com.anshcodes.productservice.PeoductModels.Products;
import com.anshcodes.productservice.ProductDto.ProductDto;
import org.springframework.web.client.RestTemplate;


@org.springframework.stereotype.Service
public class Service {

    public ProductDto ProductbyId(Long id) {

        RestTemplate restTemplate=new RestTemplate();

        String url="https://fakestoreapi.com/products/" + id;

        Products products= restTemplate.getForObject(url, Products.class);

        System.out.print(products);

        ProductDto obj =new ProductDto();
        obj.setId(1);
        obj.setDescription("jknifjng");
        obj.setPrice(12);
        return obj;
    }

}
