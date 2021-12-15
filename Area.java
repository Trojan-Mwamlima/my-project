//create a public class
class Area{
  private  int length;
    private int breadth;

//create  constructor with no paramiters
  public Area(){

    }
    //create  constructor with  paramiters
    public Area(int newlength, int newbreadth){
        this.length = newlength;
        this.breadth = newbreadth;
    }
    //create get area for returning area 
    public double getArea(){
        double Area = length*breadth;
        return Area;
    }
    //create set area
    public void setArea(int newlength, int newbreadth){
        this.length = newlength;
        this.breadth = newbreadth;
    }
}