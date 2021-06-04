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

public class EmployeeMain1 
{
      public static void main(String[] args)
      {
            String name,address,mobile,s;
            int n;
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
            do
            {
                        System.out.println("\n1.Update Employee name");
                        System.out.println("2.Update Employee Address");
                        System.out.println("3.Update Employee mobile");
                        System.out.println("4.All information correct/Exit");
                        n=sc.nextInt();
	      sc.nextLine();
                        if(n==1)
                        {
	           System.out.println("\nCurrent Name is : "+emp.getname());
                              System.out.println("Enter the name : ");
                              s=sc.nextLine();
                              emp.setname(s);
	      }
                        else if(n==2)
                        {
	           System.out.println("\nCurrent Address is : "+emp.getaddress());
                              System.out.println("Enter the address : ");
                              address=sc.nextLine();
                              emp.setaddress(address);
	      }
                        else if(n==3)
                        {
	           System.out.println("\nCurrent mobile is : "+emp.getmobile());
                              System.out.println("Enter mobile : ");
                              s=sc.nextLine();
                              emp.setmobile(s);
	      }
                        else if(n==4)
                        {
                              System.out.println("\nEmployee Details");
                              System.out.println("Name : "+emp.getname());
                              System.out.println("Address : "+emp.getaddress());
                              System.out.println("Mobile : "+emp.getmobile());
	      }
	      else
	      {
	      System.out.println("Invalid Input");
	      }
            }while(n!=4);
      }
}