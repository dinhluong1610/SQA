/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Config;

/**
 *
 * @author Admin
 */
public class CauHinhDAO extends DAO{
    public ArrayList<Config> getConfigs() {
        ArrayList<Config> list=  null;
        String sql = "select * from Config";
        CallableStatement cs;
        try {
            cs = conn.prepareCall(sql);
            ResultSet rs = cs.executeQuery();
            
            while (rs.next()) {
                if(list == null ) list = new ArrayList<>();
                Config c = new Config();
                c.setName(rs.getString("ConfigName"));
                c.setId(rs.getInt("ConfigID"));
                c.setHeso(rs.getFloat("Coefficient"));
                list.add(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            list=null;
        }
        return list;
    }
    public int DeleteConfig(int id) {
        int rowconut = 0;
        String sql = "delete from Config where ConfigID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rowconut = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            rowconut = 0;
        }
        return rowconut;
    }
    public int AddConfig(Config c) {
        int row = 0;
        String sql = "INSERT INTO Config(ConfigName,Coefficient) "
                + "VALUES (? ,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setFloat(2, c.getHeso());
            row = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            row = 0;
        }
        return row;
    }
    public int UpdateConfig(Config c) {
        int rowconut = 0;
        String sql = "UPDATE Config SET ConfigName= ? ,Coefficient = ? "
                + "WHERE ConfigID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(3, c.getId());
            ps.setString(1, c.getName());
            ps.setFloat(2, c.getHeso());
            rowconut = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            rowconut = 0;
        }
        return rowconut;
    }
    
    public Config getConfigById( int id) {
         Config c = null;
        String sql = "select * from Config where ConfigID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                c = new Config();
                
                c.setName(rs.getString("ConfigName"));
                c.setId(rs.getInt("ConfigID"));
                c.setHeso(rs.getFloat("Coefficient"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c;
    }
    public static void main(String[] args) {
        CauHinhDAO c = new CauHinhDAO();
        int r = c.DeleteConfig(6);
        System.out.println(r);
    }
}
