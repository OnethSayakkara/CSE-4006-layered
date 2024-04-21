/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.icbt.layered.dao;

import edu.icbt.layered.dao.custom.impl.ProductDaoImpl;
import edu.icbt.layered.dao.custom.impl.UserDaoImpl;

/**
 *
 * @author anjanathrishakya
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }

    public SuperDao getDao(DaoType type) {
        switch (type) {
            case USER:
                return new UserDaoImpl();
                case PRODUCT:
                return new ProductDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoType {
        USER,PRODUCT
    }
}
