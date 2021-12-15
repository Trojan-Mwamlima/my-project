import java.util.Scanner;
//create a class
public class calculation{
    //main method
    public static void main( String[] args){
        System.out.println("the area will be shown here");

        Scanner input = new Scanner(System.in);

       //prompt the user to enter length
        System.out.println("enter length");
        int length = input.nextInt();
         
         //prompt the user to enter breadth
           System.out.println("enter breadth");
        int breadth = input.nextInt();

        //create object
    Area area1 = new Area();

area1.setArea(length, breadth);
//returns area
  System.out.println("the area is "+ area1.getArea());
    }
}