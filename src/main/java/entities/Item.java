/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 * 餐點品項
 * @author a19990366@gmail.com
 */
public class Item implements Serializable{
    private int id;
    private String name;
    private int price;
    private String imgName;
    private int quantity;
    private Supplier supplier;
    
    public Item() {
    }
    
    public Item(int id,String name,int price,String imgname,Supplier supplier) {
        this.id =id;
        this.name=name;
        this.price=price;
        this.imgName=imgname;
        this.quantity=1;
        this.supplier=supplier;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
}
