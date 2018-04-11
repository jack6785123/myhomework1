public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(4);
        Triangle triangle1 = new Triangle(6,6,30);
        System.out.println(Circle.count);
        System.out.println(Rectangle.count);
        System.out.println(triangle1.area());

        System.out.println(Shape.count());
    }
}
abstract class Shape{

    Shape(){

    }
    public static int count(){
        return Circle.count + Triangle.count+Trapezoipal.count+Rectangle.count;
    }
    public abstract int area();
    public abstract int perimeter();
}
class Circle extends Shape{
    public static int count=0;
    public int r;

    private Circle(){
        super();
        count++;
    }

    Circle(int r){
        this();
        setR(r);
    }

    public int getR() {
        return r;
    }

    public void setR(int r1) {
        this.r = r1;
    }

    @Override
    public int area() {
        return (int)(r*r*Math.PI);
    }

    @Override
    public int perimeter() {
        return (int)((r+r)*Math.PI);
    }

}
class Triangle extends Shape{
    public static int count=0;
    public int under;
    public int b;
    public int angle;
    Triangle(int under1,int b1,int angle1){
        setUnder(under1);
        setB(b1);
        setAngle(angle1);
        count++;
    }

    public int getUnder() {
        return under;
    }

    public void setUnder(int under1) {
        this.under = under1;
    }

    public int getB() {
        return b;
    }

    public void setB(int b1) {
        this.b = b1;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle1) {
        this.angle = angle1;
    }

    @Override
    public int area() {
        return (int)(under*Math.sin(Math.toRadians(angle)*b)/2);
    }

    @Override
    public int perimeter() {
        return under+b+b;
    }
}
class Rectangle extends  Shape{
    public static int count=0;
    public  int l;
    public  int x;
    Rectangle(int l1,int x1){
        setL(l1);
        setX(x1);
        count++;
    }

    public int getL() {
        return l;
    }

    public void setL(int l1) {
        this.l = l1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x1) {
        this.x = x1;
    }

    @Override
    public int area() {
        return (l*x);
    }

    @Override
    public int perimeter() {
        return (l+x)*2;
    }
}
class Trapezoipal extends Shape{
    public static int count=0;
    public int on;
    public int under;
    public int high;
    public int angle;
    Trapezoipal(int on,int under,int high,int angle){
        setOn(on);
        setUnder(under);
        setHigh(high);
        setAngle(angle);
        count++;
    }

    public int getOn() {
        return on;
    }

    public void setOn(int on) {
        this.on = on;
    }

    public int getUnder() {
        return under;
    }

    public void setUnder(int under) {
        this.under = under;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public int area() {
        return ((under+on)*high)/2;
    }

    @Override
    public int perimeter() {
        return (int)(under+on+Math.sin(Math.toRadians(angle)/high *2));
    }
}