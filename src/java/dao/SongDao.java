/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Song;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author SAMSUNG
 */
public class SongDao extends DBConnection {

    public void create(Song s) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into song (song_name, song_year, song_path, singer_id, category_id, language_id) values ('" + s.getSong_name() + "','" + s.getSong_year() + "' ,'" + s.getSong_path() + "' ,'" + s.getSinger_id() + "', '" + s.getCategory_id() + "', '" + s.getLanguage_id() + "' )");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Song> read() {
        List<Song> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from song");
            while (rs.next()) {
                Song tmp = new Song(rs.getInt("song_id"), rs.getString("song_name"), rs.getDate("song_year"), rs.getString("song_path"), rs.getInt("singer_id"), rs.getInt("category_id"), rs.getInt("language_id"));
                list.add(tmp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}
