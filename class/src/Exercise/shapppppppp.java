package Exercise;


public class shapppppppp {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Triangle1221212  t = new Triangle1221212(20,30,40,50);
        Rectangle121222 r = new Rectangle121222(10,20);
        c.show();
        t.show();
        r.show();

    }
}
interface Measure1{
    public abstract int area();
    public abstract int perimeter();

}
 abstract class shape123333{
    shape123333(){
     }
     public abstract void show();
}
class Circleeee extends shape123333{
    public int r;
    public  int area;
    public int perimeter;
    Circleeee(int r1){
        super();
        r = r1;
    }

    public int getR() {
        return r;
    }

    public void setR(int r1) {
        this.r = r1;
    }


    public void show(){
        System.out.println("面積:"+(r*r)*Math.PI);
        System.out.println("周長:"+(r+r)*Math.PI);
    }
}
class Rectangle121222{
    public int longgggg;
    public int fi;
    public int area;
    public int perimeter;
    Rectangle121222(int longgggg1,int fi1){
        super();
        longgggg = longgggg1;
        fi = fi1;
    }

    public int getLonggggg() {
        return longgggg;
    }

    public void setLonggggg(int longgggg1) {
        this.longgggg = longgggg1;
    }

    public int getFi() {
        return fi;
    }

    public void setFi(int fi1) {
        this.fi = fi1;
    }


    public  void show(){
        System.out.println("面積"+longgggg*fi);
        System.out.println("周長:"+(longgggg+fi)*2);
    }
}

class  Triangle1221212 extends shape123333{
    public int under;
    public int high;
    public int a;
    public int b;
    public int area;
    public int perimeter;
    Triangle1221212(int under1,int high1,int a1,int b1){
        super();
        under=under1;
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

    public int getHigh() {
        return high;
    }

    public void setHigh(int high1) {
        this.high = high1;
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

    public void setB(int b1) {
        this.b = b1;

    }


    public  void show(){
        System.out.println("面積:"+(under*high)/2);
        System.out.println("周長:"+under+high+a+b);
    }
}
