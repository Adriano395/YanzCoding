package Model;
import java.sql.Date;
import java.sql.Time;



public class User {
    private String fname,mname,lname;   
  
    int ID;
    private Time time;
    private Date date;
    private Time login;
    private Time logout;
    public void setLogin(Time login) {
        this.login = login;
    }
    

    public void setLogout(Time logout) {
        this.logout = logout;
    }

    public Time getLogin() {
        return login;
    }

    public Time getLogout() {
        return logout;
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

    public void setTime(Time time) {
       time = time;
   }

    public Time getTime() {
        return time;
    }
   
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
}
