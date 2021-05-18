/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Timestamp ;		

/**
 *
 * @author This PC
 */
public class Baocao {
    private String name;
    private String sdt;
    private String email;
    private String address;
    private long money;
    private Timestamp d;

    public Timestamp getD() {
        return d;
    }

    public void setD(Timestamp d) {
        this.d = d;
    }
    
    public Baocao(){
        
    }

    public Baocao(String name, String sdt, String email, String address, long money) {
        this.name = name;
        this.sdt = sdt;
        this.email = email;
        this.address = address;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
   
}
