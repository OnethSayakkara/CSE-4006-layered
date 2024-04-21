package edu.icbt.layered.service.custom.impl;

import edu.icbt.layered.dao.DaoFactory;
import edu.icbt.layered.dao.custom.UserDao;

import edu.icbt.layered.dto.UserDto;
import edu.icbt.layered.service.custom.UserService;
import edu.icbt.layered.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Oneth Sayakkara
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.USER);

    @Override
    public String saveUser(UserDto dto) throws Exception {
        UserEntity userEntity = new UserEntity(dto.getUserName(), dto.getGmail(), dto.getPassword(), dto.getPosition());

        if (userDao.add(userEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public UserDto getUser(String userName) throws Exception {
        UserEntity userEntity = userDao.get(userName);
        if (userEntity != null) {
            return new UserDto(userEntity.getUserName(), userEntity.getGmail(), userEntity.getPassword(), userEntity.getPosition());
        } else {
            return null;
        }
    }

    @Override
    public List<UserDto> getAll() throws Exception {

        
        ArrayList<UserEntity> userEntities = userDao.getAll();
        
        List<UserDto> userDtos = new ArrayList<>();
        
        for(UserEntity userEntity :userEntities){
            userDtos.add(new UserDto(userEntity.getUserName(),userEntity.getGmail(),userEntity.getPosition(),userEntity.getPassword()));
        }
        
         return userDtos ;
    }


}
