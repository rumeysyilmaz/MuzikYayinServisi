package controller;

import dao.CategoryDao;
import entity.Category;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class CategoryBean implements Serializable {

    private CategoryDao dao;
    private Category entity;

   public void create() {

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }

    public CategoryBean() {

    }

    public CategoryDao getDao() {
        return dao;
    }

    public void setDao(CategoryDao dao) {
        this.dao = dao;
    }

    public Category getEntity() {
        return entity;
    }

    public void setEntity(Category entity) {
        this.entity = entity;
    }
}
