/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;

/**
 * 工作單 (工單)
 * @author a19990366@gmail.com
 */
public class WorkOrder implements Serializable {
    private long workOrderNo; 
    private Supplier supplier;
    private List<Item> lines;
    private SalesOrder salesOrder;
    private String state = "未開工";
    private int workOrderTotal;
    
    public WorkOrder() {
    }
    
    public WorkOrder(Supplier supplier,List<Item> lines) {
        this.supplier=supplier;
        this.lines=lines;
    }
    
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Item> getLines() {
        return lines;
    }

    public void setLines(List<Item> lines) {
        this.lines = lines;
    }

    public SalesOrder getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(SalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }

    public long getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(long workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getWorkOrderTotal() {
        return workOrderTotal;
    }

    public void setWorkOrderTotal(int workOrderTotal) {
        this.workOrderTotal = workOrderTotal;
    }
    
}
