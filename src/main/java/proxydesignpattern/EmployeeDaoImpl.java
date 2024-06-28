package proxydesignpattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo employeeDo) {
        System.out.println("Created new item in Employee Table.");
    }

    @Override
    public void delete(String client, int empId) {
        System.out.println("Deleted row with employee-id : "+empId);
    }

    @Override
    public EmployeeDo get(String client, int empId) {
        System.out.println("Fetching data from Database.");
        return new EmployeeDo();
    }
}
