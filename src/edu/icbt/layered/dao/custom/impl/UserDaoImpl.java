/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.dao.custom.impl;

import edu.icbt.layered.dao.CrudUtil;
import edu.icbt.layered.dao.custom.UserDao;
import edu.icbt.layered.entity.UserEntity;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author Oneth Sayakkara
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
    }

    @Override
    public boolean add(UserEntity t) throws Exception {

        return CrudUtil.executeUpdate("INSERT INTO USER  VALUES(?,?,?,?)",
                t.getUserName(),
                t.getGmail(),
                t.getPassword(),
                t.getPosition());
    }

    @Override
    public UserEntity get(String username) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM USER WHERE username=?", username);
        if (rst.next()) {
            return new UserEntity(
                    rst.getString("username"),
                    rst.getString("gmail"),
                    rst.getString("password"),
                    rst.getString("position")
            );
        }
        return null;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
       
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM user");
        while (rst.next()){
            userEntities.add( new UserEntity(rst.getString("username"),
            rst.getString("gmail"),
           rst.getString("position"),
             rst.getString("password")));
        }
       return userEntities;
    }
    }

   
    

 


