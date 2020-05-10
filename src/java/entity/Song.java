/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author SAMSUNG
 */
public class Song {

    private int song_id;
    private String song_name;
    private Date song_year;
    private String song_path;
    private int singer_id;
    private int category_id;
    private int language_id;

    public Song() {
    }

    public Song(int song_id, String song_name, Date song_year, String song_path, int singer_id, int category_id, int language_id) {
        this.song_id = song_id;
        this.song_name = song_name;
        this.song_year = song_year;
        this.song_path = song_path;
        this.singer_id = singer_id;
        this.category_id = category_id;
        this.language_id = language_id;
    }

    public int getSong_id() {
        return song_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public Date getSong_year() {
        return song_year;
    }

    public void setSong_year(Date song_year) {
        this.song_year = song_year;
    }

    public String getSong_path() {
        return song_path;
    }

    public void setSong_path(String song_path) {
        this.song_path = song_path;
    }

    public int getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(int singer_id) {
        this.singer_id = singer_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

}
