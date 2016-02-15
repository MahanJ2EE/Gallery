package main.resources.aero.mahan.biz;

/**
 * Created by zohre.moradi on 10/14/2015.
 */
public class User {

    private int ID;
    private String name;
    private String family;
    private String email;
    private String password;
    private String salt;
    private String profilePicPath;
    private Role role;
    private String birthdate;

    public User(int ID ,String name, String family , String email, String password,  String birthdate, String profilePicPath,Role role) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.role = role;
        this.birthdate = birthdate;
        this.profilePicPath = profilePicPath;
        this.password = password;
        this.family = family;
    }

    public User() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getProfilePicPath() {
        return profilePicPath;
    }

    public void setProfilePicPath(String profilePicPath) {
        this.profilePicPath = profilePicPath;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return (this.getName().equals(user.getName()) && this.getFamily().equals(user.getFamily()) && this.getProfilePicPath().equals(user.getProfilePicPath()) && this.getBirthdate().equals((user.getBirthdate())) );
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
