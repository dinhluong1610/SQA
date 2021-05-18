/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.*;
import java.time.*;
import java.util.Date;

/**
 *
 * @author This PC
 */
public class Insurance implements Serializable{
    private Customer cus;
    private Config conf;
    private int id, salary;
    private Date startDate,endDate;

    public Insurance(Customer cus, Config conf, int id, int salary, Date startDate, Date endDate) {
        this.cus = cus;
        this.conf = conf;
        this.id = id;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
    }

   
    public Insurance() {
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }

    public Config getConf() {
        return conf;
    }

    public void setConf(Config conf) {
        this.conf = conf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    
    public int getCusID(){
        return cus.getId();
    }
    
    public int getConfID(){
        return conf.getId();
    }
    
    public String getCusName(){
        return cus.getName();
    }
    
    public float getHeso(){
        return conf.getHeso();
    }

    @Override
    public String toString() {
        return "Insurance{" + "cus=" + cus + ", conf=" + conf + ", id=" + id + ", salary=" + salary + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
}
