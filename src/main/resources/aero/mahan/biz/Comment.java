package main.resources.aero.mahan.biz;


import java.sql.Date;

/**
 * Created by zohre.moradi on 11/17/2015.
 */
public class Comment {

    private User creator;
    private String comment;
    private String date;
    private Integer picID;


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPicID() {
        return picID;
    }

    public void setPicID(Integer picID) {
        this.picID = picID;
    }
}
