package com.practise.JiffyCar.services;

import com.practise.JiffyCar.dtos.UserRegistrationDto;
import com.practise.JiffyCar.entities.Role;
import com.practise.JiffyCar.entities.User;
import com.practise.JiffyCar.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User>getRepUsers(){
        return userRepository.findAll();
    }

    public List<UserRegistrationDto>getAllUsers() {
        List<User>users = userRepository.findAll();
        return users.stream()
                .map(this::userToDto)
                .collect(Collectors.toList());
    }

    public User saveUser(UserRegistrationDto registrationDto){
        User user = new User(registrationDto.getEmail(), registrationDto.getFirstName(), registrationDto.getLastName(),
                registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }


    public UserRegistrationDto userToDto(User user){
        UserRegistrationDto registrationDto = new UserRegistrationDto();
        registrationDto.setId(user.getId());
        registrationDto.setFirstName(user.getFirstName());
        registrationDto.setLastName(user.getLastName());
        registrationDto.setEmail(user.getEmail());
        registrationDto.setPassword(user.getPassword());
        registrationDto.setRoles(user.getRoles());
        return registrationDto;
    }
}
