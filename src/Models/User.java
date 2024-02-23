package Models;

import java.util.Date;

public class User {
    private int userIdCard;
    private String fullname;
    private String address;
    private String email;
    private String phone;
    private Date birthDay;


    public User() {
        this.fullname = "";
        this.address = "";
        this.email = "";
        this.phone = "";
        this.birthDay = new Date();
    }
    public User(User obj)
    {
        this(obj.userIdCard, obj.fullname, obj.address, obj.email, obj.phone, obj.birthDay);
    }

    public User(String fullname, String address, String email, String phone, Date birthDay) {
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.birthDay = (Date)birthDay.clone();
    }
    public User(int userIdCard, String fullname, String address, String email, String phone, Date birthDay) {
        this.userIdCard = userIdCard;
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.birthDay = (Date)birthDay.clone();
    }


    public int getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(int userIdCard) {
        this.userIdCard = userIdCard;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return (Date)birthDay.clone();
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = (Date)birthDay.clone();
    }
}
