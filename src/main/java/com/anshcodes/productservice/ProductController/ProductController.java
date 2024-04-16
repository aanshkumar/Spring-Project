package com.anshcodes.productservice.ProductController;


import com.anshcodes.productservice.PeoductModels.Products;
import com.anshcodes.productservice.ProductDto.ProductDto;
import com.anshcodes.productservice.ProductService.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Product")

public class ProductController {

    private Service service;

    public ProductController(Service service){
        this.service=service;
    }

    @GetMapping("/{id}")
    public @ResponseBody ProductDto ProductbyId(@PathVariable("id") Long id){
        return service.ProductbyId(id);
    }


    @GetMapping("")
    public String Productid(@PathVariable("id") Long id){
        return "my first spring project" + id;
    }

    @PostMapping("/hello")
    public String createProduct(@RequestBody Products product) {
        System.out.println(product.getId());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        return "Product created.";
    }

}
