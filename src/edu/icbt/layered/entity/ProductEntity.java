/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.entity;

/**
 *
 * @author Oneth Sayakkara
 */
public class ProductEntity {
    
   private String productId;
    private String productName;
    private Double unitPrice;
    private String category;
    private Integer qoh;

    public ProductEntity() {
    }

    public ProductEntity(String productId, String productName, Double unitPrice, String category, Integer qoh) {
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.category = category;
        this.qoh = qoh;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ProductEntity{" + "productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice + ", category=" + category + ", qoh=" + qoh + '}';
    }
  
    
}
