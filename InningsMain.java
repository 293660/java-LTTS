import java.util.Scanner;
class Innings
{
      private String teamname,inningsname;
      private int runs;
      public void setteamname(String teamname)
      {
            this.teamname=teamname;
      }
      public void setinningsname(String inningsname)
      {
            this.inningsname=inningsname;
      }
      public void setruns(int runs)
      {
            this.runs=runs;    
      }
      public String getteamname()
      {
            return this.teamname;
      }
      public String getinningsname()
      {
            return this.inningsname;
      }
      public int getruns()
      {
            return this.runs;
      }      
      public void DisplayInningsDetails()
      {
            String o=getinningsname();
            if(o.equals("Second"))
           {
                       System.out.println("\nName : "+getteamname());
                       System.out.println("Scored : "+getruns());
                       System.out.println("Match Ended");
           }
           else if(o.equals("First"))
           {
                       System.out.println("\nName : "+getteamname());
                       System.out.println("Scored : "+getruns());
                       System.out.println("Need "+(getruns()+1)+" to win");
           }
           else
           {
                      System.out.println("Invalid Input");
           }
      }
}

public class InningsMain 
{
      public static void main(String[] args)
      {
            String teamname,inningsname;
            int runs;
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the team name : ");
            teamname=sc.nextLine();
            System.out.println("Enter session : ");
            inningsname=sc.nextLine();
            System.out.println("Enter runs : ");
            runs=sc.nextInt();
            if(runs<0)
            {
                        System.out.println("Invalid  Input");
                        System.exit(0);
            }
            Innings inn=new Innings();
            inn.setteamname(teamname);
            inn.setinningsname(inningsname);
            inn.setruns(runs);
            inn.DisplayInningsDetails();
      }
}