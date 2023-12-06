public class Shape{
    public double getArea(){
        return 0.0;

    }
}
class Rectangle extends Shape{
    double width;
    double length;
    public double getArea(){
        return width*length;
    }

}



