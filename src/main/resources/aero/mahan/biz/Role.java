package main.resources.aero.mahan.biz;

/**
 * Created by Maryam.Kamali on 2/15/2016.
 */
public enum Role {

    Admin("Admin",0),User("User",1);

    private String title;
    private Integer id;

    Role(String title, Integer id) {
        this.title=title;
        this.id=id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

