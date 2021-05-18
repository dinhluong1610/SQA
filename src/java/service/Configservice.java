/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DAO.CauHinhDAO;
import java.util.ArrayList;
import model.Config;

/**
 *
 * @author Admin
 */
public class Configservice {
    static CauHinhDAO dao = new CauHinhDAO();
    
    public static int AddConfig(String name, float hso) {
        int record = 0;
        Config config = new Config();
        config.setName(name);
        config.setHeso(hso);
        record = dao.AddConfig(config);
        
        return record;
    }
    public static int EditConfig (int id, String name, float hso) {
        int record=0;
        Config c= new Config();
        c.setId(id);
        c.setName(name);
        c.setHeso(hso);
        record = dao.UpdateConfig(c);
        return record;
    }
    public static int deleteConfig (int id) {
        int record = 0 ;
        
        record = dao.DeleteConfig(id);
        
        return record;
    }
    public static ArrayList<Config> getListConfig()
    {
        return dao.getConfigs();
    }
    
    public static Config getConfigByID (int id) {
        return dao.getConfigById(id);
    }
    
    public static void main(String[] args) {
        
    }
}
