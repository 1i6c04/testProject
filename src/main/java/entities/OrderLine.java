/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 * Sales Order Lines 銷售訂單明細行
 * @author a19990366@gmail.com
 */
public class OrderLine implements Serializable {
    /** Order line id */
    private int id;
    /**
     * Ordered item
     */
    private Item item;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
}
