/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import model.Config;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ConfigserviceTest {
    
    public ConfigserviceTest() {
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
     * Test of AddConfig method, of class Configservice.
     */
    @Test
    public void testAddConfig() {
        System.out.println("AddConfig");
        String name = "Bảo hiểm nhân thọ";
        float hso = 1.3F;
        int expResult = 1;
        int result = Configservice.AddConfig(name, hso);
        assertEquals(expResult, result);
     
        
    }

    /**
     * Test of EditConfig method, of class Configservice.
     */
    @Test
    public void testEditConfig() {
        System.out.println("EditConfig");
        int id = 0;
        String name = "";
        float hso = 0.0F;
        int expResult = 0;
        int result = Configservice.EditConfig(id, name, hso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteConfig method, of class Configservice.
     */
    @Test
    public void testDeleteConfig() {
        System.out.println("deleteConfig");
        int id = 0;
        int expResult = 0;
        int result = Configservice.deleteConfig(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListConfig method, of class Configservice.
     */
    @Test
    public void testGetListConfig() {
        System.out.println("getListConfig");
        ArrayList<Config> expResult = null;
        ArrayList<Config> result = Configservice.getListConfig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConfigByID method, of class Configservice.
     */
    @Test
    public void testGetConfigByID() {
        System.out.println("getConfigByID");
        int id = 0;
        Config expResult = null;
        Config result = Configservice.getConfigByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Configservice.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Configservice.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
