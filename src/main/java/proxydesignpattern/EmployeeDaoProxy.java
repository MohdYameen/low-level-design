package proxydesignpattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDaoObj;
    EmployeeDaoProxy(){
        employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo employeeDo) throws Exception{
        if(client.equals("ADMIN")){
            employeeDaoObj.create(client, employeeDo);
            return;
        }
        throw new Exception("Cannot create object, Access Denied.");
    }

    @Override
    public void delete(String client, int empId) throws Exception{
        if(client.equals("ADMIN")){
            employeeDaoObj.delete(client, empId);
            return;
        }
        throw new Exception("Cannot delete object, Access Denied.");
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception{
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDaoObj.get(client, empId);
        }
        throw new Exception("Only Admin and user can fetch the information, Access Denied.");
    }
}
