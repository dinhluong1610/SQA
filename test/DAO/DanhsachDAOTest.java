/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Customer;
import model.Insurance;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dinhl
 */
public class DanhsachDAOTest {
    
    public DanhsachDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getList method, of class DanhsachDAO.
     */
    @Test
    public void testGetList() {
        DanhsachDAO instance = new DanhsachDAO();
        ArrayList<Customer> result = instance.getList();
        int dem=result.size();
        assertEquals(4, dem);
    }
    @Test
    public void testGetListException1(){
        DanhsachDAO instance = new DanhsachDAO();
        ArrayList<Customer> result = instance.getList();
        int dem=result.size();
        assertEquals(3, dem);
    }
    @Test
    public void testGetListException2(){
        DanhsachDAO instance = new DanhsachDAO();
        ArrayList<Customer> result = instance.getList();
        int dem=result.size();
        assertEquals(5, dem);
    }

    /**
     * Test of getDetails method, of class DanhsachDAO.
     */
    @Test
    public void testGetDetails() {
       
        DanhsachDAO instance = new DanhsachDAO();
        ArrayList<Insurance> result = instance.getDetails();
        int dem=result.size();
        assertEquals(4, dem);
       
    }
     @Test
    public void testGetDetailsEception1() {
        
        DanhsachDAO instance = new DanhsachDAO();
        ArrayList<Insurance> result = instance.getDetails();
        int dem=result.size();
        assertEquals(3, dem);
       
    }
     @Test
    public void testGetDetailsException2() {
        
        DanhsachDAO instance = new DanhsachDAO();
        ArrayList<Insurance> result = instance.getDetails();
        int dem=result.size();
        assertEquals(5, dem);
       
    }
    /**
     * Test of getInsuranceById method, of class DanhsachDAO.
     */
    @Test
    public void testGetInsuranceById() {
        
        int id = 1;
        
        DanhsachDAO instance = new DanhsachDAO();
        Insurance ins= new Insurance();
        ins.setId(1);
        ArrayList<Insurance> expResult = null;
        ArrayList<Insurance> result = instance.getInsuranceById(id);
        assertEquals(ins.getId(), result.get(0).getId());
    }
    @Test
    public void testGetInsuranceByIdException() {
        
        int id = 1;
        
        DanhsachDAO instance = new DanhsachDAO();
        Insurance ins= new Insurance();
        ins.setId(2);
        ArrayList<Insurance> expResult = null;
        ArrayList<Insurance> result = instance.getInsuranceById(id);
        assertEquals(ins.getId(), result.get(0).getId());
    }
}
