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
public interface CrudDao2 <T,PRODUCTID> extends SuperDao {
    
    boolean add(T t) throws Exception;
     boolean update(T t) throws Exception;
      boolean delete(PRODUCTID productid) throws Exception;
      T get (PRODUCTID productid) throws Exception;
      ArrayList<T> getAll() throws Exception;
}
