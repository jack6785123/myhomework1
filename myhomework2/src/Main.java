public class Main {

    public static void main(String[] args) {
        luffy luffy = new luffy("luffy","100000","male",10);
        luffy.skill();
        robin robin = new robin("robin","1000","female");
        robin.skill();
        zoro zoro = new zoro("zore","100000000","male");
        zoro.skill();
    }
}
class person{
    public String name;
    public String attack;
    public String sex;
    person(String name1,String attack1,String sex1){
        name = name1;
        attack = attack1;
        sex = sex1;
    }

    public String getName(String name1){
        return name1;
    }

    public void setName(String name1) {
        name = name1;
    }

    public String getAttack(String attack1) {
        return attack1;
    }

    public void setAttack(String attack1) {
        attack = attack1;
    }

    public String getSex(String sex1) {
        return sex1;
    }

    public void setSex(String sex1) {
        sex = sex1;
    }

    public  void  skill(){

    }
}
class luffy extends person{
    int hatsize;
    luffy (String name1,String attack1,String sex1,int hatsize){
        super(name1,attack1,sex1);
        setHatsize(hatsize);
    }
    public void skill(){
        System.out.println("手身長");
    }
    public  int getHatsize(int hatsize1){
        return hatsize1;
    }
    public  void setHatsize(int hatsize1){
        hatsize = hatsize1;

    }
}
class robin extends person{
    robin(String name1, String attack1,String sex1){
        super(name1,attack1,sex1);
    }
    public void skill(){
        System.out.println("好多手");
    }
}
class zoro extends person {
    zoro(String name1, String attack1, String sex1) {
        super(name1,attack1,sex1);
    }
    public void skill(){
        System.out.println("36煩惱鳳");
    }
}

