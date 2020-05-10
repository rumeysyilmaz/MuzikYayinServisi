/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author SAMSUNG
 */
public class Singer {

    private int singer_id;
    private String first_name;
    private String last_name;
    private String singer_foto;

    public Singer() {
    }

    public Singer(int singer_id, String first_name, String last_name, String singer_foto) {
        this.singer_id = singer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.singer_foto = singer_foto;
    }

    public int getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(int singer_id) {
        this.singer_id = singer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSinger_foto() {
        return singer_foto;
    }

    public void setSinger_foto(String singer_foto) {
        this.singer_foto = singer_foto;
    }

}
