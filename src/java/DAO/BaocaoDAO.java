/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.ArrayList;
import model.*;
import java.sql.*;
           
/**
 *
 * @author This PC
 */
public class BaocaoDAO extends DAO{
  
    public BaocaoDAO(){
        super();
    }
    
    public ArrayList<Baocao> getBaocao(){
        ArrayList<Baocao> b = null;
        String sql="select Customer.name,Customer.phone,Customer.email,Customer.address ,SUM( \n" +
"(Salary*(MONTH(EndDate)-MONTH(StartDate)+(YEAR(EndDate)-YEAR(StartDate))*12))	/*Tien dong bao hiem*/\n" +
"/(MONTH(EndDate)-MONTH(StartDate)+(YEAR(EndDate)-YEAR(StartDate))*12)		/*So thang dong bao hiem*/\n" +
"*Coefficient																	/*He so*/			\n" +
"*CEILING(((MONTH(EndDate)-MONTH(StartDate)+(YEAR(EndDate)-YEAR(StartDate))*12)/12)*2)/2 	/*So nam tinh bao hiem*/\n" +
"), Curdate()\n" +
"from Insurance,Config,Customer\n" +
"where Customer.CustomerID=Insurance.CustomerID\n" +
"and Config.ConfigID=Insurance.ConfigID\n" +
"group by Customer.name,Customer.phone,Customer.email,Customer.address";
        try{
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(b == null) b = new ArrayList<Baocao>();
                Baocao bc = new Baocao();
                bc.setName(rs.getString(1));
                bc.setSdt(rs.getString(2));
                bc.setEmail(rs.getString(3));
                bc.setAddress(rs.getString(4));
                bc.setMoney(rs.getLong(5));
                bc.setD(rs.getTimestamp(6));
                b.add(bc);
            }
        }catch(Exception e){
            e.printStackTrace();
            b = null;
        }   
        return b;
    }
    
    public static void main(String[] args) {
        BaocaoDAO d = new BaocaoDAO();
        ArrayList<Baocao> lsList = new ArrayList<>();
        lsList = d.getBaocao();
        for (Baocao baocao : lsList) {
            System.out.println(baocao.getName());
            System.out.println(baocao.getMoney());
        }
    }
    
    
            
}
