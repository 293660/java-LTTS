import java.util.Scanner;
class Company
{
      private String name,employees,teamlead;
      public void setname(String name)
      {
            this.name=name;
      }
      public void setemployees(String employees)
      {
            this.employees=employees;
      }
      public void setteamlead(String teamlead)
      {
            this.teamlead=teamlead;    
      }
      public String getname()
      {
            return this.name;
      }
      public String getemployees()
      {
            return this.employees;
      }
      public String getteamlead()
      {
            return this.teamlead;
      }      
}

public class CompanyMain 
{
      public static void main(String[] args)
      {
            String name="",employees="",teamlead="";
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the Company name : ");
            name=sc.nextLine();
            System.out.println("Enter Employees : ");
            employees=sc.nextLine();
            System.out.println("Enter TeamLead : ");
            teamlead=sc.nextLine();
            Company comp=new Company();
            comp.setname(name);
            comp.setemployees(employees);
            String[] s1 = employees.split(",");
            int c=0;
            for(int i=0;i<s1.length;i++)
            {
                        if(s1[i].equals(teamlead))
                        {
                                    c=1;
                                    break;
                        }
            }
            if(c==1)
            {
                        comp.setteamlead(teamlead);
            }
            else
            {
                        comp.setteamlead("InvalidInput");
            }
            System.out.println("Name : "+comp.getname());
            System.out.println("Employees : "+comp.getemployees());
            System.out.println("Lead : "+comp.getteamlead());
      }
}