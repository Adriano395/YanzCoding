package Model;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class User {
    private String name;
    private int ID;
    private Time time;
    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
}
