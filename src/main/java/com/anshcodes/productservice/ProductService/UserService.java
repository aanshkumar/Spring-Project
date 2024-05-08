package com.anshcodes.productservice.ProductService;

import com.anshcodes.productservice.PeoductModels.User;
import com.anshcodes.productservice.UserRepository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User createuser(String name, String email) {
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

}
