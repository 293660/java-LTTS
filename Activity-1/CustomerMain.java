import java.util.Scanner;
class Customer
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

public class CustomerMain 
{
      public static void main(String[] args)
      {
            String name="",address="",mobile,s;
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the details : ");
            s=sc.nextLine();
            String[] s1 = s.split(",");
            Customer cust=new Customer();
            cust.setname(s1[0]);
            cust.setaddress(s1[1]);
            cust.setmobile(s1[2]);
            System.out.println("\nCustomer Details");
            System.out.println("Name : "+cust.getname());
            System.out.println("Address : "+cust.getaddress());
            System.out.println("Mobile : "+cust.getmobile());
      }
}