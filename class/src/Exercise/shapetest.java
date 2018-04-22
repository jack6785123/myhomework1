package Exercise;



public class shapetest {
    public static void main(String[] args) {
        Circle c = new Circle (10);
        Circle c1 = new Circle(20);
        Circle c2 = new Circle(30);
        Rectangle1 r = new Rectangle1(40,50);
        Rectangle1 r1 = new Rectangle1(60,70);
        Rectangle1 r2 = new Rectangle1(80,90);
        Triangle t = new Triangle(15,25,35,40);
        Triangle t1 = new Triangle(45,55,65,70);
        Triangle t2 = new Triangle(75,35,15,90);
        c.show();
        c1.show();
        c2.show();
        r.show();
        r1.show();
        r2.show();
        t.show();
        t1.show();
        t2.show();
    }
}
interface Measure{
    public abstract  int area();
    public abstract  int perimeter();

}

 abstract class shape{
    shape(){
    }
    public abstract void show();

}
class Circle extends shape{
    public int r;
    public int area;
    public int perimeter;
    Circle(int r1){
        super();
        r = r1;
    }
    public int getR() {
        return r;
    }
    public void setR(int r1) {
        this.r = r1;
    }

    public int getArea() {
        return area;
    }
    public void setArea(int area1) {
        this.area = area1;
    }
    public int getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(int perimeter1) {
        this.perimeter = perimeter1;
    }
    public void show(){
        System.out.println("面積:"+(r*r)*Math.PI);
        System.out.println("周長:"+(r+r)*Math.PI);
    }
}
class Triangle extends shape{
    public int under;
    public int high;
    public int a;
    public int b;
    public int area;
    public int perimeter;
    Triangle(int under1,int high1,int a1,int b1){
        super();
        under = under1;
        high = high1;
        a = a1;
        b = b1;
    }

    public int getUnder() {
        return under;
    }

    public void setUnder(int under1) {
        this.under = under1;
    }

    public int getA() {
        return a;
    }
    public void setA(int a1) {
        this.a = a1;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area1) {
        this.area = area1;
    }
    public int getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(int perimeter1) {
        this.perimeter = perimeter1;
    }
    public void show(){
        System.out.println("面積:"+under*high);
        System.out.println("周長:"+under+a+b);
    }
}
class Rectangle1 extends shape{
    public  int lon;
    public  int hi;
    public int area;
    public int perimeter;
    Rectangle1(int lon1,int hi1){
        super();
        lon = lon1;
        hi =hi1;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area1) {
        this.area = area1;
    }
    public int getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(int perimeter1) {
        this.perimeter = perimeter1;
    }
    public void show(){
        System.out.println("面積:"+lon*hi);
        System.out.println("周長:"+(lon+hi)*2);
    }

}



