///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package DAO;
//
//import java.util.ArrayList;
//import model.Config;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import service.Configservice;
//
//
///**
// *
// * @author Admin
// */
//public class ConfigserviceTest {
//    
//    public ConfigserviceTest() {
//    }
//   
//    /**
//     * Test of AddConfig method, of class Configservice.
//     */
//    @Test
//    public void testAddConfig01() {
//        System.out.println("AddConfig");
//        String name = "Bảo hiểm nhân thọ";
//        float hso = (float) 1.1;
//        int expResult = 1;
//        int result = Configservice.AddConfig(name, hso);
//        assertEquals(expResult, result);   
//    }
//    @Test
//    public void testAddConfig02() {
//        String name = "Bảo hiểm huu tri";
//        float hso = (float) 1.2;
//        int expResult = 1;
//        int result = Configservice.AddConfig(name, hso);
//        assertEquals(expResult, result);   
//    }
//    @Test
//    public void testAddConfig03() {
//        String name = "Bảo hiểm that nghiep 1 ";
//        float hso = (float) -1.3;
//        int expResult = 1;
//        int result = Configservice.AddConfig(name, hso);
//        assertEquals(expResult, result);   
//    }
//    @Test
//    public void testAddConfig04() {
//        
//        String name = "Bảo hiểm that nghiep 2";
//        float hso = (float) 0;
//        int expResult = 1;
//        int result = Configservice.AddConfig(name, hso);
//        assertEquals(expResult, result);   
//        Config config = new Config(name, hso);
//        
//    }
//    @Test
//    public void testAddConfig05() {
//        
//        String name = "Bảo hiểm that nghiep 3 ";
//        float hso = (float) 2;
//        int expResult = 1;
//        int result = Configservice.AddConfig(name, hso);
//        assertEquals(expResult, result);  
//        
//    }
//
//    /**
//     * Test of EditConfig method, of class Configservice.
//     */
//    @Test
//    public void testEditConfig01() {
//        System.out.println("EditConfig");
//        int id = 7011;
//        String name = "Junit after test";
//        float hso = (float) 0.14;
//        int expResult = 1;
//        int result = Configservice.EditConfig(id, name, hso);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }
//    @Test
//    public void testEditConfig02() {
//        
//        int id = 5008;
//        String name = "Junit after test";
//        float hso = (float) 3.14;
//        int expResult = 1;
//        int result = Configservice.EditConfig(id, name, hso);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }
//    @Test
//    public void testEditConfig03() {
//        
//        int id = 7008;
//        String name = "Junit after test";
//        float hso = (float) 10.2;
//        int expResult = 1;
//        int result = Configservice.EditConfig(id, name, hso);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }
//    @Test
//    public void testEditConfig04() {
//        
//        int id = 7008;
//        String name = "Junit after test";
//        float hso = (float) -1.1;
//        int expResult = 1;
//        int result = Configservice.EditConfig(id, name, hso);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }
//    @Test
//    public void testEditConfig05() {
//        
//        int id = 7008;
//        String name = "Junit after test";
//        float hso = (float) 0;
//        int expResult = 1;
//        int result = Configservice.EditConfig(id, name, hso);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    /**
//     * Test of deleteConfig method, of class Configservice.
//     */
//    @Test
//    public void testDeleteConfig01() {
//        System.out.println("deleteConfig");
//        int id = 4008;
//        int expResult = 1;
//        int result = Configservice.deleteConfig(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail. 
//    }
//    @Test
//    public void testDeleteConfig02() {
//        int id = 0;
//        int expResult = 1;
//        int result = Configservice.deleteConfig(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail. 
//    }
//    @Test
//    public void testDeleteConfig03() {
//        int id = -1;
//        int expResult = 1;
//        int result = Configservice.deleteConfig(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail. 
//    }
//
//    /**
//     * Test of getListConfig method, of class Configservice.
//     */
//    @Test
//    public void testGetListConfig() {
//        System.out.println("get list ");
//        ArrayList<Config> expResult = new ArrayList<>();
//        expResult.add(new Config(4008, "Junit test 01", (float) 1.75));
//        expResult.add(new Config(5008, "Junit test 02", (float) 0.75));
//        expResult.add(new Config(7008, "Junit test 03", (float) 1.35));
//        System.out.println("Expected Results:");
//        for (Config config : expResult) {
//            System.out.println("ID: " + config.getId()+", name: "+ config.getName()+", he so: " + config.getHeso());
//        }
//        System.out.println("\n \nResults:");
//        ArrayList<Config> result = Configservice.getListConfig();
//        for (Config config : result) {
//            System.out.println("ID: " + config.getId()+", name: "+ config.getName()+", he so: " + config.getHeso());
//        }
//        for (int i = 0; i < 3; i++) {
//            assertEquals(expResult.get(i).getId(), result.get(i).getId());
//            assertEquals(expResult.get(i).getName(), result.get(i).getName());
//            assertEquals(expResult.get(i).getHeso(), result.get(i).getHeso(),0.00f);
//        }
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    /**
//     * Test of getConfigByID method, of class Configservice.
//     */
//    @Test
//    public void testGetConfigByID01() {
//        System.out.println("getConfigByID_01");
//        int id = 5008;
//        Config expResult = new Config(5008, "Junit after test", 3.14f);
//        Config result = Configservice.getConfigByID(id);
//        System.out.println("Expected Result: ");
//        String testExpRes = expResult.getId()+", "+expResult.getName()+", "+expResult.getHeso();
//        System.out.println(testExpRes);
//        System.out.println("Actual Result: ");
//        String testRes = result.getId()+", "+result.getName()+", "+result.getHeso();
//        System.out.println(testRes);
//        assertEquals(testExpRes, testRes); 
//    }
//    @Test
//    public void testGetConfigByID02() {
//        System.out.println("getConfigByID_02");
//        int id = 7008;
//        Config expResult = new Config(7008, "Junit after test", 10.2f);
//        Config result = Configservice.getConfigByID(id);
//        System.out.println("Expected Result: ");
//        String testExpRes = expResult.getId()+", "+expResult.getName()+", "+expResult.getHeso();
//        System.out.println(testExpRes);
//        System.out.println("Actual Result: ");
//        String testRes = result.getId()+", "+result.getName()+", "+result.getHeso();
//        System.out.println(testRes);
//        assertEquals(testExpRes, testRes); 
//    }
//    @Test
//    public void testGetConfigByID03() {
//        System.out.println("getConfigByID_03");
//        int id = -1;
//        Config expResult = new Config(5008, "Junit after test", 3.14f);
//        Config result = Configservice.getConfigByID(id);
//        System.out.println("Expected Result: ");
//        String testExpRes = expResult.getId()+", "+expResult.getName()+", "+expResult.getHeso();
//        System.out.println(testExpRes);
//        System.out.println("Actual Result: ");
//        String testRes = result.getId()+", "+result.getName()+", "+result.getHeso();
//        System.out.println(testRes);
//        assertEquals(testExpRes, testRes); 
//    }
//    @Test
//    public void testGetConfigByID04() {
//        System.out.println("getConfigByID_04");
//        int id = 0;
//        Config expResult = new Config(5008, "Junit after test", 3.14f);
//        Config result = Configservice.getConfigByID(id);
//        System.out.println("Expected Result: ");
//        String testExpRes = expResult.getId()+", "+expResult.getName()+", "+expResult.getHeso();
//        System.out.println(testExpRes);
//        System.out.println("Actual Result: ");
//        String testRes = result.getId()+", "+result.getName()+", "+result.getHeso();
//        System.out.println(testRes);
//        assertEquals(testExpRes, testRes); 
//    }
//
//    
//    
//    
//}
