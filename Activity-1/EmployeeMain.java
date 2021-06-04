import java.util.Scanner;
class Employee
{
      private String name,address,mobile;
      public void setname(String name)
      {
            this.name=name;
      }
      public void setaddress(String address)
      {
            this.address=address;
      }
      public void setmobile(String mobile)
      {
            this.mobile=mobile;    
      }
      public String getname()
      {
            return this.name;
      }
      public String getaddress()
      {
            return this.address;
      }
      public String getmobile()
      {
            return this.mobile;
      }      
}

public class EmployeeMain 
{
      public static void main(String[] args)
      {
            String name,address,mobile;
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the name : ");
            name=sc.nextLine();
            System.out.println("Enter Address : ");
            address=sc.nextLine();
            System.out.println("Enter Mobile : ");
            mobile=sc.nextLine();
            Employee emp=new Employee();
            emp.setname(name);
            emp.setaddress(address);
            emp.setmobile(mobile);
            System.out.println("\nEmployee Details");
            System.out.println("Name : "+emp.getname());
            System.out.println("Address : "+emp.getaddress());
            System.out.println("Mobile : "+emp.getmobile());
      }
}