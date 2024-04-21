/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.service;

import edu.icbt.layered.service.custom.impl.ProductServiceImpl;
import edu.icbt.layered.service.custom.impl.UserServiceImpl;

/**
 *
 * @author Oneth Sayakkara
 */
public class ServiceFactory {
    
    
     private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){
        
    }
    
    public static ServiceFactory getInstance(){
        
        if(serviceFactory == null) {
            
            serviceFactory = new ServiceFactory();
            
        }
        return serviceFactory;
        
    }
     public SuperService getService(ServiceType serviceType){
        
        switch(serviceType){
            
            case USER:
                return new  UserServiceImpl();
            case PRODUCT:
                return new ProductServiceImpl();
            case CUSTOMER:
                return  null;    
        default:
           
            return null;
            
                
        }
        
        
    }
    
    public enum ServiceType{
        USER,CUSTOMER,PRODUCT
        
        
    }
}
