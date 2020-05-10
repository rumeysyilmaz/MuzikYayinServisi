/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SingerDao;
import entity.Singer;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author SAMSUNG
 */
@Named
@SessionScoped
public class SingerBean implements Serializable {

    private SingerDao dao;
    private Singer entity;

    public void create() {

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }

    public SingerBean() {

    }

    public SingerDao getDao() {
        return dao;
    }

    public void setDao(SingerDao dao) {
        this.dao = dao;
    }

    public Singer getEntity() {
        return entity;
    }

    public void setEntity(Singer entity) {
        this.entity = entity;
    }

}
