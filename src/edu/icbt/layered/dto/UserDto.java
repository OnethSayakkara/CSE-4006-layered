/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.dto;

/**
 *
 * @author Oneth Sayakkara
 */
public class UserDto {
     private String userName;
    private String gmail;
    private String password;
    private String position;
    
 

    
     
    public UserDto() {
    }

    
    public UserDto(String userName,String gmail, String password, String position) {
        this.userName = userName;
        this.gmail = gmail;
        this.password = password;
        this.position = position;
    }

    
     public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @return the gmail
     */
    public String getGmail() {
        return gmail;
    }

    /**
     * @param gmail the gmail to set
     */
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    /**
     * @return the userName
     */
   

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "UserDto{" + "userName=" + userName + ",gmail =" + gmail + ", password=" + password + ", position=" + position + '}';
    }
    
    
}
