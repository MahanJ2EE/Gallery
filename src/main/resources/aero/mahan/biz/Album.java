package main.resources.aero.mahan.biz;

import java.util.ArrayList;

/**
 * Created by 941028 on 12/15/2015.
 */
public class Album {

    private int id ;
    private String title;
    private ArrayList<Picture> topPictures ;
    private String description;
    private String creationDate;

    public Album(){

    }

    public Album(int id, String title, ArrayList<Picture> topPictures, String description, String creationDate) {
        this.id = id;
        this.title = title;
        this.topPictures = topPictures;
        this.description = description;
        this.creationDate = creationDate;
    }

    public ArrayList<Picture> getTopPictures() {
        return topPictures;
    }

    public void setTopPictures(ArrayList<Picture> topPictures) {
        this.topPictures = topPictures;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
