package Model;
import java.util.Date;


public class User {
       
    int ID,Age;
    private String fname,mname,lname,gender;
    private Object college;
    private Date date;
    private Date time;

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }
    
    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }
    public String getFname() {
        return fname;
    }

    public String getMname() {
        return mname;
    }

    public String getLname() {
        return lname;
    }

    public Object getCollege(){
        return college;
    }
    public void setCollege(Object college) {
        this.college = college;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
 
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

//    public User() {
//    }
//
//    public User(int ID, String fname, String mname, String lname, String gender, Object college, Date date) {
//        this.ID = ID;
//        this.fname = fname;
//        this.mname = mname;
//        this.lname = lname;
//        this.gender = gender;
//        this.college = college;
//        this.date = date;
//    }

  

    
}
