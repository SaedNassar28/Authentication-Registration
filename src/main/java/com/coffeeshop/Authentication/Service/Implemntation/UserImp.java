package com.coffeeshop.Authentication.Service.Implemntation;

import com.coffeeshop.Authentication.Dto.UserDTO;
import com.coffeeshop.Authentication.Entity.User;
import com.coffeeshop.Authentication.Repo.UserRepository;
import com.coffeeshop.Authentication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImp implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public String addUser(UserDTO userDTO) {

        User user =new User(
                userDTO.getId(),
                userDTO.getUsername(),
                userDTO.getPassword(),
                userDTO.getRole()
        );
        userRepository.save(user);
        return user.getUsername();
    }

}
