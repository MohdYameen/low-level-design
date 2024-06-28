package proxydesignpattern;

public class ProxyDesignPattern {

    public static void main(String[] args) {
        try{
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.get("USER", 121);
            empTableObj.create("ADMIN", new EmployeeDo());
            System.out.println("Operation Successful. ");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

//        try{
//            EmployeeDao empTableObj = new EmployeeDaoProxy();
//            empTableObj.get("USER", 123);
//            System.out.println("Operation Successful. ");
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}
