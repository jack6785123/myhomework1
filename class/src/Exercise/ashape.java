package Exercise;

public class ashape {
    public static void main(String[] args) {
     aacircle a = new aacircle(10);
     aacircle a1 = new aacircle(12);
     aacircle a2 = new aacircle(16);
     aTriangle t = new aTriangle(20,24,26,28);
     aTriangle t1 = new aTriangle(30,34,36,38);
     aTriangle t2 = new aTriangle(40,44,46,48);
     aRectangle r= new aRectangle(50,55);
     aRectangle r1= new aRectangle(60,65);
     aRectangle r2= new aRectangle(70,75);
     a.show();
     a1.show();
     a2.show();
     r1.show();
     r2.show();
     r.show();
     t.show();
     t1.show();
     t2.show();


    }
}
interface aMeasure{
    public abstract int area();
    public abstract int perimeter();

        }
abstract class aashape{
    aashape(){
    }
    public abstract void show();
}
class  aacircle extends aashape {
    public int r;
    public int aarea;
    public int aperimeter;

    aacircle(int r1) {
        super();
        r = r1;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getAarea() {
        return aarea;
    }

    public void setAarea(int aarea1) {
        this.aarea = aarea1;
    }

    public int getAperimeter() {
        return aperimeter;
    }

    public void setAperimeter(int aperimeter1) {
        this.aperimeter = aperimeter1;
    }

    public void show() {
        System.out.println("面積:" + (r * r) * Math.PI);
        System.out.println("周長:" + (r + r) * Math.PI);
    }
}
    class aRectangle extends aashape{
        public int along;
        public int afi;
        public int area;
        public int aperimeter;
        aRectangle(int along1,int afi1){
            super();
            along = along1;
            afi = afi1;
        }

        public int getAlong() {
            return along;
        }

        public void setAlong(int along1) {
            this.along = along1;
        }

        public int getArea() {
            return area;
        }

        public void setArea(int area1) {
            this.area = area1;
        }

        public int getAperimeter() {
            return aperimeter;
        }

        public void setAperimeter(int aperimeter1) {
            this.aperimeter = aperimeter1;
        }
        public void show(){
            System.out.println("面積:"+along*afi);
            System.out.println("周長:"+(along+afi)*2);
        }
    }

class aTriangle extends aashape{
    public int under;
    public int high;
    public int a;
    public int b;
    public int area;
    public int perimeter;
    aTriangle(int under1,int high1,int a1,int b1){
        super();
        under =under1;
        high = high1;
        a=a1;
        b=b1;
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
    public  void show(){
        System.out.println("面積:"+(under*high)/2);
        System.out.println("周長:"+under+a+b);
    }
}
