package com.example.liberarymvp.model;

/**
 * Created By Mohamed A. Dahab on 4/5/2021
 **/
public class BookModel {
    private int id;
    private String title;
    private String discriptions;

    public BookModel(int id, String title, String discriptions) {
        this.id = id;
        this.title = title;
        this.discriptions = discriptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscriptions() {
        return discriptions;
    }

    public void setDiscriptions(String discriptions) {
        this.discriptions = discriptions;
    }
}
