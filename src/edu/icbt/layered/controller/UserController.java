/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.controller;

import edu.icbt.layered.dto.UserDto;
import edu.icbt.layered.service.ServiceFactory;
import edu.icbt.layered.service.custom.UserService;
import java.util.List;

/**
 *
 * @author Oneth Sayakkara
 */
public class UserController {

    private UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public String save(UserDto userDto) throws Exception {
        return userService.saveUser(userDto);
    }

    public UserDto getUser(String username) throws Exception {
        return userService.getUser(username);
    }
  public List<UserDto> getAll() throws Exception{
        
        return userService.getAll();
    }

}

