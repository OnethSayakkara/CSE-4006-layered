/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.icbt.layered.dao;

import java.util.ArrayList;



/**
 *
 * @author Oneth Sayakkara
 */
public interface CrudDao<T, USERNAME> extends SuperDao {

    boolean add(T t) throws Exception;

    T get(USERNAME username) throws Exception;
     ArrayList<T> getAll() throws Exception;
   
}
