/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.service.custom.impl;

import edu.icbt.layered.dao.DaoFactory;
import edu.icbt.layered.dao.custom.ProductDao;
import edu.icbt.layered.dto.ProductDto;
import edu.icbt.layered.entity.ProductEntity;
import edu.icbt.layered.service.custom.ProductService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oneth Sayakkara
 */
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao = (ProductDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.PRODUCT);

    @Override
     public String saveProduct(ProductDto dto) throws Exception {
        ProductEntity productEntity = new ProductEntity(dto.getProductId(), dto.getProductName(), dto.getUnitPrice(), dto.getCategory(), dto.getQoh());
       
        if (productDao.add(productEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
     }
    @Override
    public String UpdateProduct(ProductDto productDto) throws Exception {
       
        ProductEntity  productEntity = new  ProductEntity(productDto.getProductId(),productDto.getProductName(),productDto.getUnitPrice(),productDto.getCategory(),productDto.getQoh());
          if(productDao.update(productEntity)){
              return "Successfully Updated";
          }else{
              return "fail";
          }
    }

    @Override
    public String DeleteProduct(String productId) throws Exception {
       
        if(productDao.delete(productId)){
            return "Successfully Deleted";
        }else{
            return "Fail";
        }
    }

    @Override
    public ProductDto getProduct(String productId) throws Exception {
         ProductEntity productEntity = productDao.get(productId);
        return new ProductDto(productEntity.getProductId(),productEntity.getProductName(),productEntity.getUnitPrice(),productEntity.getCategory(),productEntity.getQoh());
    }
   

    @Override
    public List<ProductDto> getAll() throws Exception {
        
        ArrayList<ProductEntity> productEntities = productDao.getAll();
        
        List<ProductDto> productDtos = new ArrayList<>();
        
        for(ProductEntity productEntity :productEntities){
            productDtos.add(new ProductDto(productEntity.getProductId(),productEntity.getProductName(),productEntity.getUnitPrice(),productEntity.getCategory(),productEntity.getQoh()));
        }
        
         return productDtos ;

    }

    

 
}
