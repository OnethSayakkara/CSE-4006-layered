/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.controller;

import edu.icbt.layered.dto.ProductDto;
import edu.icbt.layered.service.ServiceFactory;
import edu.icbt.layered.service.custom.ProductService;
import java.util.List;



/**
 *
 * @author Oneth Sayakkara
 */
public class ProductController {

    
     private ProductService productService= (ProductService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.PRODUCT);
     
    public String save(ProductDto productDto) throws Exception {
        return  productService.saveProduct(productDto);
    }
    
     public String update( ProductDto productDto) throws Exception{
        
        return productService.UpdateProduct(productDto);
    }
      public String delete(String productId) throws Exception{
        
        return productService.DeleteProduct(productId);
    }
       public ProductDto get(String productId) throws Exception{
        
        return productService.getProduct(productId);
    }
        public List<ProductDto> getAll() throws Exception{
        
        return productService.getAll();
    }

    
    
}
