/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfbeans;

import entities.Item;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import jsfbeans.mockData.MealPool;

/**
 * used facelet page : mealManagePage.xhtml
 * @author a19990366@gmail.com
 */
@Named(value = "mealManageBean")
@SessionScoped
public class MealManageBean implements Serializable {
    private Item createItem;
    @EJB
    private MealPool mealPool;
    /**
     * Creates a new instance of MealManageBean
     */
    public MealManageBean() {
    }
    
    @PostConstruct
    public void init(){
        createItem = new Item();
    }

    public Item getCreateItem() {
        return createItem;
    }

    public void setCreateItem(Item createItem) {
        this.createItem = createItem;
    }

    public MealPool getMealPool() {
        return mealPool;
    }

    public void setMealPool(MealPool mealPool) {
        this.mealPool = mealPool;
    }
    
    public String addItem(){
        mealPool.create(createItem);
        return "mealManagePage?faces-redirect=true";
    }
}
