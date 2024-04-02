package model;


public class UserDAO {
    private String Fname, Mname, Lname, civilstatus, gender, address;
    private int age;

//    public UserDAO(String Fname, String Mname, String Lname, int Age) {
////        this.Fname = Fname;
////        this.Mname = Mname;
////        this.Lname = Lname;
////        this.Age = Age;
//    }

    

    public String getFname() {
        return Fname;
    }
    
    public String getMname() {
        return Mname;
    }

    public String getLname() {
        return Lname;
    }

    public int getAge() {
        return age;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setMname(String Mname) {
        this.Mname = Mname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCivilstatus() {
        return civilstatus;
    }

    public String getGender() {
        return gender;
    }

    public void setCivilstatus(String civilstatus) {
        this.civilstatus = civilstatus;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     
}    
    
