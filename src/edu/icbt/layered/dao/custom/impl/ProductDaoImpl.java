/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.dao.custom.impl;

import edu.icbt.layered.dao.CrudUtil;
import edu.icbt.layered.dao.custom.ProductDao;
import edu.icbt.layered.entity.ProductEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Oneth Sayakkara
 */
public class ProductDaoImpl implements ProductDao {

    @Override
    public boolean add(ProductEntity t) throws Exception {
        
         return CrudUtil.executeUpdate("INSERT INTO product VALUES(?,?,?,?,?)",
               t.getProductId(),
               t.getProductName(),
               t.getUnitPrice(),
               t.getCategory(),
               t.getQoh());
    }

    @Override
    public boolean update(ProductEntity t) throws Exception {
      
         return CrudUtil.executeUpdate("UPDATE product SET   productName=?, unitPrice=?,category=?,  qoh=? WHERE  productId=?",
                
                t.getProductName(),
                t.getUnitPrice(),
                t.getCategory(),
                t.getQoh(),
                t.getProductId());
    }

    @Override
    public boolean delete(String productid) throws Exception {
      return CrudUtil.executeUpdate("DELETE FROM product WHERE productId=?",productid);
    }

    @Override
public ProductEntity get(String productId) throws Exception {
    ResultSet rst = CrudUtil.executeQuery("SELECT * FROM product WHERE productId = ?", productId);
    while (rst.next()) {
        return new ProductEntity(rst.getString("productId"), rst.getString("productName"), rst.getDouble("unitPrice"), rst.getString("category"), rst.getInt("qoh"));
    }
    return null;
}

    @Override
    public ArrayList<ProductEntity> getAll() throws Exception {
    
         ArrayList<ProductEntity> productEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Product");
        while (rst.next()){
            productEntities.add( new ProductEntity(rst.getString("productId"),
            rst.getString("productName"),
           rst.getDouble("UnitPrice"),
                    rst.getString("category"),
           rst.getInt("qoh")));
        }
       return productEntities;
    }
    
    
}
