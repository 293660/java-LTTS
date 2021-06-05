import java.util.*;


abstract class shape{
    int value;

    abstract void calculateArea(int value);
}

class circle extends shape {
    void calculateArea(int value){
        System.out.println("Area of Circle is :" + 3.14*(value)*(value));
    }
}

class square extends shape {
    void calculateArea(int value){
        System.out.println("Area of square is :" +value*value);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        System.out.println("Enter the shape:\n1.Circle\n2.Square\nEnter the shape");
        Scanner sc = new Scanner(System.in);
        int chooice = sc.nextInt();
        if(chooice == 1 ){
            System.out.println("Enter the radius");
            int rad = sc.nextInt();
            shape sobj = new circle();
            sobj.calculateArea(rad);
        }else{
            System.out.println("Enter the side");
            int rad = sc.nextInt();
            shape sobj = new square();
            sobj.calculateArea(rad);
            sc.close();
        }
    }
}
