import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personlist= new ArrayList<>();
        String name,sex,type;
        int attack;
        boolean bool = true;
        while(bool){
            System.out.println("功能列表\n==============");
            System.out.println("1.新增角色");
            System.out.println("2.修改角色");
            System.out.println("3.刪除角色");
            System.out.println("4.結束");
            int function = sc.nextInt();
            switch (function){
                case 1:
                    System.out.print("名稱 : ");
                    name = sc.next();
                    System.out.print("性別 : ");
                    sex = sc.next();
                    System.out.print("攻擊力 : ");
                    attack = sc.nextInt();
                    System.out.print("屬性 : ");
                    type = sc.next();
                    Person person = new Person(name,sex,attack,type);
                    personlist.add(person);
                    break;
                case 2:
                    System.out.print("輸入想修改的角色名稱");
                    int index = 0;
                    name = sc.next();
                    boolean have = false;
                    for (int i = 0;i < personlist.size(); i++){
                        if (personlist.get(i).getName().equals(name)){
                            index = i;
                            have = true;
                            break;
                        }
                    }
                    System.out.println("1.修改名稱");
                    System.out.println("2.修改性別");
                    System.out.println("3.修改攻擊力");
                    System.out.println("4.修改屬性");
                    int function1 = sc.nextInt();
                    switch (function1) {
                        case 1:
                            System.out.print("輸入新的名稱 : ");
                            name = sc.next();
                            personlist.get(index).setName(name);
                            break;
                        case 2:
                            System.out.print("輸入新的性別 : ");
                            sex = sc.next();
                            personlist.get(index).setSex(sex);
                            break;
                        case 3:
                            System.out.print("輸入新的攻擊力 : ");
                            attack = sc.nextInt();
                            personlist.get(index).setAttack(attack);
                            break;
                        case 4:
                            System.out.print("輸入新的屬性 : ");
                            type = sc.next();
                            personlist.get(index).setType(type);
                            break;
                    }
                    break;
                case 3:
                    System.out.print("請輸入想刪除的角色名稱 : ");
                    name = sc.next();
                    int index1 = 0;
                    boolean have1 = false;
                    for (int i = 0;i < personlist.size(); i++){
                        if (personlist.get(i).getName().equals(name)){
                            index1 = i;
                            have1 = true;
                            break;
                        }
                    }
                    if (!have1){
                        System.out.println("找不到這角色!!");
                    }
                    personlist.remove(index1);
                    System.out.println("刪除完成");
                    break;
                case 4:
                    bool = false;
                    break;
            }
            System.out.println("================");
        }

    }

}

class Person{
    private String name,sex,type;
    private int attack;
    Person(String name,String sex,int attack,String type){
        setName(name);
        setSex(sex);
        setAttack(attack);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("male") || sex.equals("男性")){
            this.sex = "male";
        }else if (sex.equals("female") || sex.equals("女性")){
            this.sex = "female";
        }else {
            this.sex = "";
            System.out.println("sex只能為男性或女性");
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack < 0){
            this.attack = 0;
            System.out.println("攻擊力不能為負");
        }else {
            this.attack = attack;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}