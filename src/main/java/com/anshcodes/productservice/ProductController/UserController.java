package com.anshcodes.productservice.ProductController;


import com.anshcodes.productservice.PeoductModels.User;
import com.anshcodes.productservice.ProductDto.UserDTO;
import com.anshcodes.productservice.ProductService.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class UserController {


    private final UserService userservice;


    public UserController(UserService userservice){
        this.userservice=userservice;
    }

    @PostMapping()
    public User createuser(@RequestBody UserDTO userDTO){
        return userservice.createuser(userDTO.getName(), userDTO.getEmail());
    }

}
