/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Singer;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SAMSUNG
 */
public class SingerDao extends DBConnection {
    
    public void create(Singer singer) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into singer (first_name,last_name,singer_foto) values ('" + singer.getFirst_name() + "', '"+singer.getLast_name()+"', '"+singer.getSinger_foto()+"')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<Singer> read() {
        List<Singer> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from singer");
            while (rs.next()) {
                Singer tmp = new Singer(rs.getInt("singer_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("singer_foto"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
