package main.resources.aero.mahan.biz;

import java.util.ArrayList;
import java.sql.Date;

/**
 * Created by zohre.moradi on 10/18/2015.
 */
public class Picture {

    private int picID;
    private User creator;
    private float rate;
    private String path;
    private String creationTime;
    private int rateCount;
    private String title;
    private String description;
    private int albumID;
    private ArrayList<Comment> comments ;

    public Picture(User creator, float rate, String path, String creationTime, int rateCount, String title, String description , int albumID) {
        this.creator = creator;
        this.rate = rate;
        this.path = path;
        this.creationTime = creationTime;
        this.rateCount = rateCount;
        this.title = title;
        this.description = description;
        this.albumID=albumID;
    }
    public Picture(){

    }

    public void setPicID(int picID) {
        this.picID = picID;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setCreationTime(String dateTime) {
        this.creationTime = dateTime;
    }

    public int getPicID() {
        return picID;
    }

    public float getRate() {
        return rate;
    }

    public String getPath() {
        return path;
    }

    public String getCreationTime() {
        return creationTime;
    }


    public int getRateCount() {
        return rateCount;
    }

    public void setRateCount(int rateCount) {
        this.rateCount = rateCount;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }
}
