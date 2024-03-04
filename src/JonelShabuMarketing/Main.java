package JonelShabuMarketing;


public class Main {
    public static void main(String[]args){
        Employee employee = new Employee();
        HRManager hrm = new HRManager();
        
        hrm.work();
        employee.work();
        employee.getSalary();
        hrm.Data();
        hrm.addEmployee();
        
    }
}
