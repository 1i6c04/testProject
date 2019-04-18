/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfbeans.mockData;

import entities.Item;
import entities.Supplier;
import java.util.ArrayList;
import jsfbeans.mockData.SupplierPool;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;


/**
 * 模擬供應商的資料
 * @author a19990366@gmail.com
 */
@Singleton
public class MealPool {
    private Map<Integer, Item> repository;
    private Integer lastIndex;
    
    public MealPool() {
        repository = new HashMap<>();
        lastIndex = 1;
    }
    
    @PostConstruct
    public void init(){
        this.create(new Item(1,"龍貓便當",80,"img1.jpg",SupplierPool.getSupplier(0)));
        this.create(new Item(2,"拉拉熊便當",90,"img2.jpg",SupplierPool.getSupplier(0)));
        this.create(new Item(3,"貓咪便當",90,"img3.jpg",SupplierPool.getSupplier(1)));
        this.create(new Item(4,"柴犬便當",95,"img4.jpg",SupplierPool.getSupplier(1)));
        this.create(new Item(5,"憤怒鳥便當",70,"img5.jpg",SupplierPool.getSupplier(2)));
        this.create(new Item(6,"花媽便當",85,"img6.jpg",SupplierPool.getSupplier(2)));
    }
    
    public int create(Item item){
        int currentIdx = lastIndex;
        repository.put(currentIdx, item);
        lastIndex++;
        return currentIdx;
    }
    
    public List<Item> queryAll(){
        List<Item> results = new ArrayList<>();
        for(int i=1;i<=repository.size();i++){
            results.add(repository.get(i));
        }
        return results;
    }

    
}
