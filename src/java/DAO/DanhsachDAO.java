/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Customer;
import model.Insurance;

/**
 *
 * @author Admin
 */
public class DanhsachDAO extends DAO{
    public ArrayList<Customer> getList(){
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "SELECT * FROM Customer";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Customer c = new Customer();
                c.setId(rs.getInt("CustomerID"));
                c.setName(rs.getString("name"));
                c.setDob(rs.getString("dob"));
                c.setPhone(rs.getString("phone"));
                c.setEmail(rs.getString("email"));
                c.setAddress(rs.getString("address"));
                list.add(c);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public ArrayList<Insurance> getDetails(){
        ArrayList<Insurance> list1 = new ArrayList<>();
        String sql = "SELECT * FROM Insurance";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Insurance in = new Insurance();
                in.setId(rs.getInt("InsuranceID"));
                in.setStartDate(rs.getDate("StartDate"));
                in.setEndDate(rs.getDate("EndDate"));
                in.setSalary(rs.getInt("Salary"));
                
                list1.add(in);
            }
        } catch (Exception e) {
        }
        return list1;
    }
    
    public ArrayList<Insurance> getInsuranceById(int id){
        ArrayList<Insurance> list1 = new ArrayList<>();
        String sql = "select * from Insurance where CustomerID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Insurance in = new Insurance();
                in.setId(rs.getInt("InsuranceID"));
                in.setStartDate(rs.getDate("StartDate"));
                in.setEndDate(rs.getDate("EndDate"));
                in.setSalary(rs.getInt("Salary"));
                list1.add(in);
            }
        } catch (Exception e) {
        }
        return list1;
    }
    
}
