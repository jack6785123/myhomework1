
public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(10);
        Circle c1 = new Circle(20);
        Circle c2 = new Circle(30);
        Triangle t = new Triangle(10,5,15);
        Triangle t1 = new Triangle(30,20,30);
        Triangle t2 = new Triangle(40,50,60);
        Rectangle r = new Rectangle(5,20);
        Rectangle r1 = new Rectangle(10,30);
        Rectangle r2 = new Rectangle(35,40);
        c1.show();
        c2.show();
        c.show();
        t.show();
        t1.show();
        t2.show();
        r.show();
        r1.show();
        r2.show();

    }
}

interface Measure{
    public abstract int area();
    public abstract int perimeter();
}

abstract class shape implements Measure {
    shape() {
    }
    public abstract void show();
}
class  Circle extends shape{
    public int r;
    Circle(int r1){
        super();
        r = r1;
    }

    public int getR() {
        return r;
    }

    public void setR(int r1) {
        r = r1;
    }
    @Override
    public int area(){
        return (int)(r*r*Math.PI);
    }
    @Override
     public int perimeter(){
        return (int)((r+r)*Math.PI);
    }
    public void show(){
        System.out.println("面積:"+area());
        System.out.println("週長:"+perimeter());
    }

}


class Rectangle extends  shape {
       public int l;
       public int x;

    Rectangle(int l1, int x1) {
        setL(l1);
        setX(x1);
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

    @Override
    public void show() {
        System.out.println("面積:"+ area());
        System.out.println("週長:"+perimeter());

    }
}


class Triangle extends shape {
    public int under;
    public int b;
    public int angle;

    Triangle(int under1, int b1, int angle1) {
        under = under1;
        b = b1;
        angle = angle1;
    }

    public int getUnder() {
        return under;
    }

    public void setUnder(int under1) {
        under = under1;
    }

    public int getB() {
        return b;
    }

    public void setB(int b1) {
        b = b1;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle1) {
        angle = angle1;
    }
    @Override
    public int area() {
        return (int)(under*Math.sin(Math.toRadians(angle)*b)/2);
    }

    @Override
    public int perimeter() {
        return under+b+b;
    }

    @Override
    public void show() {
        System.out.println("面積:" + area());
        System.out.println("週長:"+perimeter());
    }
}


