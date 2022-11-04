/*
Programme16
You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters x and y of type int and it needs to initialize the
fields.
Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance
between this Point and another Point as double.
*/


package week8_java_hw_reshma;

public class Point_16 {
    int x;
    int y;

    public Point_16() {

    }
    public Point_16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(){
        this.x=x;
    }
    public void setY(){
        this.y=y;
    }
    public double distance(){
        return distance(0, 0);
    }
    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public double distance(Point_16 secondPoint){
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Point_16 first = new Point_16(6,5);
        Point_16 second = new Point_16(3,1);

        System.out.println("Distance (0,0) = " +first.distance());
        System.out.println("Distance (second) = "+first.distance(second));
        System.out.println("Distance (2,2) = "+first.distance(2,2));

        Point_16 point = new Point_16();
        System.out.println("Distance() = "+point.distance());
    }
}
