/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.icbt.layered.service.custom;

import edu.icbt.layered.dto.ProductDto;
import edu.icbt.layered.service.SuperService;
import java.util.List;

/**
 *
 * @author Oneth Sayakkara
 */
public interface ProductService extends SuperService{

    
    
    String saveProduct(ProductDto productDto) throws Exception;
     String UpdateProduct(ProductDto productDto) throws Exception;
      String DeleteProduct(String productId) throws Exception;
      ProductDto getProduct(String productId) throws Exception;
      List<ProductDto> getAll() throws Exception;

    
}
