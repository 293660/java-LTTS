import java.util.Scanner;
abstract class Match {
    private int currentscore,target, currentover;
     public void setcurrentscore(int currentscore)
    {
        this.currentscore=currentscore;
    }
    public void settarget(int target)
    {
        this.target=target;
    }
    public void setcurrentover(int currentover)
    {
        this.currentover=currentover;
    }
    public int getcurrentscore()
    {
        return this.currentscore;
    }
    public int gettarget()
    {
        return this.target;
    }
    public int getcurrentover()
    {
        return this.currentover;
    }
    abstract  public int calculateRunRate(int target,int currentscore);
    abstract public int calculateBalls(int currentover);
    abstract public void display(int reqRunrate,int balls);
}
class ODIMatch extends Match{
    public int calculateRunRate(int target,int currentscore)
    {
        return (target-currentscore);
    }
    public int calculateBalls(int currentover)
    {
       return (50-currentover); 
    }
    public void display(int reqRunrate,int balls)
    {
        System.out.println("Requirements:");
        System.out.println("Need "+reqRunrate+" runs in "+balls*6+" balls");
        System.out.println("Required Runrate:"+((float)reqRunrate)/balls);
        
    }
    
}
class TestMatch extends Match{
    public int calculateRunRate(int target,int currentscore)
    {
        return (target-currentscore);
    }
    public int calculateBalls(int currentover)
    {
       return (90-currentover); 
    }
    public void display(int reqRunrate,int balls)
    {
        System.out.println("Requirements:");
        
        System.out.println("Need "+reqRunrate+" runs in "+balls*6+" balls");
        System.out.println("Required Runrate:"+((float)reqRunrate)/balls);
        
    }
    
    
}
class T20Match extends Match{
    public int calculateRunRate(int target,int currentscore)
    {
        return (target-currentscore);
    }
    public int calculateBalls(int currentover)
    {
       return (20-currentover); 
    }
    public void display(int reqRunrate,int balls)
    {
        System.out.println("Requirements:");
        
        System.out.println("Need "+reqRunrate+" runs in "+balls*6+" balls");
        System.out.println("Required Runrate:"+((float)reqRunrate)/balls);
        
    }
    
    
}
class Main{
    public static void main(String args[])
    {
    int cs,t,co;
    int c;
    System.out.println("Enter the match format");
    System.out.println("1. ODI");
    System.out.println("2. T20");
    System.out.println("3. Test");
    Scanner sc=new Scanner(System.in);
    c=sc.nextInt();
    System.out.println("Enter the Current score");
    cs=sc.nextInt();
    System.out.println("Enter the current Over");
    co=sc.nextInt();
    System.out.println("enter the Target Score");
    t=sc.nextInt();
    switch(c)
    {
        case 1:
            ODIMatch odi=new ODIMatch();
            odi.setcurrentover(co);
            odi.settarget(t);
            odi.setcurrentscore(cs);
            int cr=odi.calculateRunRate(t,cs);
            int b=odi.calculateBalls(co);
            odi.display(cr,b);
            break;
        case 2:
            T20Match t20=new T20Match();
            t20.setcurrentover(co);
            t20.settarget(t);
            t20.setcurrentscore(cs);
            int ar=t20.calculateRunRate(t,cs);
            int b1=t20.calculateBalls(co);
            t20.display(ar,b1);
            break;
        case 3:
            TestMatch tm=new TestMatch();
            tm.setcurrentover(co);
            tm.settarget(t);
            tm.setcurrentscore(cs);
            int br=tm.calculateRunRate(t,cs);
            int b2=tm.calculateBalls(co);
            tm.display(br,b2);
            break;
        default:System.out.println();
    }
    }

}