package Models;

public class Staff {
    private int staffId;
    private String fullname;
    private String email;


    public Staff() {
        fullname = "";
        email = "";
    }

    public Staff(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }
    public Staff(int staffId, String fullname, String email) {
        this.staffId = staffId;
        this.fullname = fullname;
        this.email = email;
    }


    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}