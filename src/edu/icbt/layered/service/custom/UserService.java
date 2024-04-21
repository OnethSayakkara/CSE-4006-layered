/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.icbt.layered.service.custom;


import edu.icbt.layered.dto.UserDto;
import edu.icbt.layered.service.SuperService;
import java.util.List;


/**
 *
 * @author Oneth Sayakkara
 */
public interface UserService  extends SuperService{
    String saveUser(UserDto userDto) throws Exception;
     UserDto getUser(String userName) throws Exception;
     List<UserDto> getAll() throws Exception;
}
