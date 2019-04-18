/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfbeans.mockData;


import entities.Supplier;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 * 模擬供應商的資料
 * @author hychen39@gm.cyut.edu.tw
 */

public class SupplierPool  {
    private static List<Supplier> suppliers = Arrays.asList(
                new Supplier(0,"大甲鵝","一餐"),
                new Supplier(1,"金鑽","二餐"),
                new Supplier(2,"古早味","三餐")
                );
    /**
     * Creates a new instance of Suppliers
     */
    public SupplierPool() {
    }
    
    
    
    public static List<Supplier> getSuppliers() {
        return suppliers;
    }

    public static Supplier getSupplier(int idx){
        return suppliers.get(idx);
        
    }
    
    
}
