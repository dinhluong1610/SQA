/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Baocao;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import DAO.*;

/**
 *
 * @author This PC
 */
public class BaocaoDAOTest {
    
    public BaocaoDAOTest() {
    }

    /*@Test
    public void testGetBaocao() {
        System.out.println("getBaocao");
        BaocaoDAO instance = new BaocaoDAO();
        ArrayList<Baocao> expResult = null;
        ArrayList<Baocao> result = instance.getBaocao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    @Test
    public void testGetListBaocao() {
        System.out.println("get list ");
        ArrayList<Baocao> expResult = new ArrayList<>();
        expResult.add(new Baocao("Nguyễn Đình Lượng", "0123456789", "nguyendinhluong@gmail.com", "Hải Phòng",17100000));
        expResult.add(new Baocao("Nguyễn Hoàng Minh", "0123456788", "nguyenhoangminh@gmail.com", "Hà Nội",9000000));
        expResult.add(new Baocao("Nguyễn Khánh Nam", "0123456787", "nguyenkhanhnam@gmail.com", "Quảng Ninh",29100000));
        expResult.add(new Baocao("Trần Quốc Nam", "0123456786", "tranquocnam@gmail.com", "Nam Định",9000000));
        System.out.println("Expected Results:");
        for (Baocao baocao : expResult) {
            System.out.println("Tên: " + baocao.getName()+", SĐT: "+ baocao.getSdt()+", Email: " + baocao.getEmail()+",Địa chỉ: " + baocao.getAddress()+",Tiền:" + baocao.getMoney());
        }
        System.out.println("\n \nResults:");
        BaocaoDAO b = new BaocaoDAO();
        ArrayList<Baocao> result = b.getBaocao();
        for (Baocao baocao : result) {
            System.out.println("Tên: " + baocao.getName()+", SĐT: "+ baocao.getSdt()+", Email: " + baocao.getEmail()+",Địa chỉ: " + baocao.getAddress()+",Tiền:" + baocao.getMoney());
        }
        for (int i = 0; i < 3; i++) {
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getSdt(), result.get(i).getSdt());
            assertEquals(expResult.get(i).getEmail(), result.get(i).getEmail());
            assertEquals(expResult.get(i).getAddress(), result.get(i).getAddress());
            assertEquals(expResult.get(i).getMoney(), result.get(i).getMoney());
        }
    }
    
    @Test
    public void testGetListBaocao2() {
        System.out.println("get list ");
        ArrayList<Baocao> expResult = new ArrayList<>();
        expResult.add(new Baocao("Nguyễn Đình Lượng", "0123456789", "nguyendinhluong@gmail.com", "Hải Phòng",156000000));
        expResult.add(new Baocao("Nguyễn Hoàng Minh", "0123456788", "nguyenhoangminh@gmail.com", "Hà Nội",72000000));
        expResult.add(new Baocao("Nguyễn Khánh Nam", "0123456787", "nguyenkhanhnam@gmail.com", "Quảng Ninh",287000000));
        expResult.add(new Baocao("Trần Quốc Nam", "0123456786", "tranquocnam@gmail.com", "Nam Định",72000000));
        System.out.println("Expected Results:");
        for (Baocao baocao : expResult) {
            System.out.println("Tên: " + baocao.getName()+", SĐT: "+ baocao.getSdt()+", Email: " + baocao.getEmail()+",Địa chỉ: " + baocao.getAddress()+",Tiền:" + baocao.getMoney());
        }
        System.out.println("\n \nResults:");
        BaocaoDAO b = new BaocaoDAO();
        ArrayList<Baocao> result = b.getBaocao2();
        for (Baocao baocao : result) {
            System.out.println("Tên: " + baocao.getName()+", SĐT: "+ baocao.getSdt()+", Email: " + baocao.getEmail()+",Địa chỉ: " + baocao.getAddress()+",Tiền:" + baocao.getMoney());
        }
        for (int i = 0; i < 3; i++) {
            assertEquals(expResult.get(i).getName(), result.get(i).getName());
            assertEquals(expResult.get(i).getSdt(), result.get(i).getSdt());
            assertEquals(expResult.get(i).getEmail(), result.get(i).getEmail());
            assertEquals(expResult.get(i).getAddress(), result.get(i).getAddress());
            assertEquals(expResult.get(i).getMoney(), result.get(i).getMoney());
        }
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testGetListBaocao_nodata() {
        String expResult="Không có dữ liệu";
        System.out.println("Expected Results:Không có dữ liệu");
        
        System.out.println("\n \nResults:");
        BaocaoDAO b = new BaocaoDAO();
        ArrayList<Baocao> list = b.getBaocao();
        String result;
        if(list==null){
            System.out.println("Không có dữ liệu");
            result="Không có dữ liệu";
            assertEquals(expResult, result);
        }
            
    }
    
    @Test
    public void testGetListBaocao2_nodata() {
        String expResult="Không có dữ liệu";
        System.out.println("Expected Results:Không có dữ liệu");
        
        System.out.println("\n \nResults:");
        BaocaoDAO b = new BaocaoDAO();
        ArrayList<Baocao> list = b.getBaocao2();
        String result;
        if(list==null){
            System.out.println("Không có dữ liệu");
            result="Không có dữ liệu";
            assertEquals(expResult, result);
        }
            
    }
}
