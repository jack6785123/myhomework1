package Exercise;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.server.provider.SyncProviderInvokerTube;

import java.util.ArrayList;

public class repert {
    public static void main(String[] args) {
    Circlea circle = new Circlea(2);
    Trianglea trianglea = new Trianglea(10,20,2,3,4);
    Rectangle rectangle = new Rectangle(20,30);
        ArrayList<Shape> arrayList = new ArrayList();
        System.out.println(Circlea.count);
        System.out.println(Trianglea.count);
        System.out.println(Rectangle.count);
    System.out.println(Shape.count());


    }

}
 abstract class Shape{

   Shape(){

}
   public static  int count(){ return (Circlea.count+Trianglea.count+Rectangle.count); }
    public abstract   int area();
   public  abstract  int perimeter();
}
class Circlea extends Shape {
    public static int count = 0;
    public int r;
    public int area;
    public int perimeter;
   private Circlea(){
       super();
       count++;
   }
 Circlea(int r1){
     this();
     r = r1;
 }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    @Override
    public int area(){
     return ((int)((r+r)*Math.PI));
    }
    @Override
    public  int perimeter(){
        return (int)((r*r)*Math.PI);
    }


    public void show(){
        System.out.println("面積:"+(r+r)*Math.PI);
        System.out.println("周長:"+(r*r)*Math.PI);

    }
}
class Trianglea extends  Shape{
    public  static  int count=0;
    public  int under;
    public int high;
    public int area;
    public int perimeter;
    public  int a;
    public  int b;
    public int c;
    Trianglea(int under1,int high1 ,int a1, int b1 , int c1){
        super();
        under = under1;
        high = high1;
        a = a1;
        b = b1;
        c = c1;
        count ++;
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

    public int getC() {
        return c;
    }

    public void setC(int c1) {
        this.c = c1;
    }
    @Override
    public int area(){
        return (int)((under*high)/2);
    }
    @Override
    public int perimeter(){
        return (int)(a+b+c);
    }

    public  void show(){
        System.out.println("面積:"+(under*high)/2);
        System.out.println("周長:"+a+b+c);
    }
}
class Rectangle  extends Shape{
    public static  int count= 0 ;
    public  int long1;
    public int a ;
    public int area;
    public int perimeter;

    Rectangle(int long11 ,int a1){
        super();
        long1 = long11;
        a = a1;
        count++;
    }

    public int getLong1() {
        return long1;
    }

    public void setLong1(int long11) {
        this.long1 = long11;
    }

    public int getA() {
        return a;
    }

    public void setA(int a1) {
        this.a = a1;
    }
    @Override
    public  int area(){
        return (int)(long1*a);
    }
    @Override
    public int perimeter(){
        return (int)((long1+a)*2);
    }
    public void show(){
        System.out.println("面積:"+long1*a);
        System.out.println("周長"+(long1+a)*2);
    }
}

