/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;

/**
 * 餐點供應商(店家)
 * @author hychen39@gm.cyut.edu.tw
 */
public class Supplier implements Serializable{
    private int supplierNo;
    /**
     * 供應商名稱
     */
    private String name;
    /**
     * 供應商簡介
     */
    private String introduction;
    private String location;
    private List<WorkOrder> workOrder;
    
    public Supplier(int supplierNo,String name,String location){
        this.supplierNo=supplierNo;
        this.name=name;
        this.location=location;
    }
    

    public int getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(int supplierNo) {
        this.supplierNo = supplierNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<WorkOrder> getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(List<WorkOrder> workOrder) {
        this.workOrder = workOrder;
    }
    
}
