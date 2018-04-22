package Exercise;

public class extendtest {
    public static void main(String[] args) {
        Asia asia = new Asia("照男","噁");
        Ch ch = new Ch("周老","噁新");
        asia.show();
        ch.show();


    }

}
class Un{
    public  String name;
    public String sex ;
    Un(String name1,String sex1){
        name = name1;
        sex = sex1;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex1) {
        this.sex = sex1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }
}


class  Asia extends Un{
    Asia(String name1,String sex1) {
    super(name1,sex1);
    }
    public void show(){
        System.out.println(name);
        System.out.println(sex);
    }
}
class Ch extends  Un{

    Ch(String name1,String sex1){
        super(name1,sex1);

    }
    public void show(){
        System.out.println(name);
        System.out.println(sex);


    }


}




