package dao;

import entity.Category;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class CategoryDao extends DBConnection {
    
    public void create(Category c){
        try{
            Statement st= this.connect().createStatement();
            st.executeUpdate("insert into category (name) values ('" + c.getCategory_name() + "')");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Category> read(){
        List<Category> list = new ArrayList<>();
        try{
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from category order by category_id asc");
            
            while(rs.next()){
                Category tmp = new Category(rs.getInt("category_id"), rs.getString("name"), rs.getDate("last_update"));
                list.add(tmp);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public void update(Category c){
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("update category set name= '" + c.getCategory_name() + "' where category_id= " + c.getCategory_id());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void delete(Category c) {
        try{
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from category where category_id" + c.getCategory_id());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
