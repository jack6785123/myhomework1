package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class rem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Woman woman = new Woman("Y", "女","火",10000);
        Man  man= new Man("b","男","水",100);
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(woman);
        arrayList.add(man);
        String name1,sex1,attribute1;
        int attack1;
        boolean bool = true;
        while(bool){
            System.out.println("---------------");
            System.out.println("功能列表");
            System.out.println("1.新增角色");
            System.out.println("2.修改角色");
            System.out.println("3.結束");
            System.out.println("---------------");
            int function = scn.nextInt();
            switch (function){
                case 1:
                    System.out.print("名稱:");
                    name1 = scn.next();
                    System.out.print("性別:");
                    sex1 = scn.next();
                    System.out.print("屬性:");
                    attribute1 = scn.next();
                    System.out.println("攻擊:");
                    attack1 = scn.nextInt();
                    Person person = new Person(name1,sex1,attribute1,attack1);
                    arrayList.add(person);
                    break;
                case 2:
                    System.out.println("要修改誰");
                    System.out.println("請問要修改什麼");
                    System.out.println("要修改姓名嗎?");
                    int a = scn.nextInt();
                   boolean have = false;
                    name1 = scn.nextLine();
                    for(int i =0;i<arrayList.size();i++){
                        if(arrayList.get(i).getName().equals(name1)){
                           a = i;
                           have = true;
                          break;
                        }
                        }
                    System.out.println("修改姓名");
                    System.out.println("修改性別");
                    System.out.println("修改學號");
                    System.out.println("修改屬性");
                    System.out.println("修改攻擊力");
                    int function1 = scn.nextInt();
                    switch (function1){
                        case 1:
                            System.out.println("輸入新名稱");
                            name1 = scn.next();
                            arrayList.get(a).setName(name1);
                            break;
                        case 2:
                            System.out.println("輸入新性別");
                           sex1 = scn.next();
                            arrayList.get(a).setSex(sex1);
                            break;
                        case 3:
                            System.out.println("輸入新屬性");
                            attribute1 = scn.next();
                            arrayList.get(a).setAttributes(attribute1);
                            break;
                        case 4:
                            System.out.println("輸入新的攻擊力");
                            attack1 = scn.nextInt();
                         arrayList.get(a).setAttack(attack1);
                            break;
                    }
                case 3:
                    System.out.println("請輸入想刪除角色");
                    name1 = scn.next();
                    boolean have1 = false;
                    for(int i = 0 ; i<arrayList.size();i++){
                        if(arrayList.get(i).getName().equals(name1)){
                            a = i;
                            have1 = true;
                            break;
                        }
                        if(!have1){
                            System.out.println("找不到角色");
                        }
                        arrayList.remove(name1);
                        System.out.println("已刪除角色");
                        break;
                    }
                    bool = false;
break;
                }



            }

        }

    }


class Person{
    public String name;
    public String sex;
    public String attributes;
    public int attack;
    Person(String name1 ,String sex1 ,String attributes1,int attack1){
        name = name1;
        sex = sex1;
        attributes = attributes1;
        attack = attack1;

    }
    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex1) {
        this.sex = sex1;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes1) {
        this.attributes = attributes1;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack1) {
        this.attack = attack1;
        if(attack1<0){
            System.out.println("攻擊力不足");
        }else {
            System.out.println("輸入錯誤");
        }
    }
}

class Woman extends Person {
    Woman(String name1, String sex1, String attributes1, int attack1) {
        super(name1, sex1, attributes1,attack1 );
    }
}
class Man extends Person {

    Man(String name1, String sex1,String attributes1, int attack1 ) {
        super(name1, sex1, attributes1,attack1);

    }


    }
