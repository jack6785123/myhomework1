package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class 練習 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Student> arrayList1 = new ArrayList();
        Student S = new Student("A", "男", 106021155, 60, 50, 30);
        Student S2 = new Student("B", "男", 106021355, 70, 60, 40);
        Student S3 = new Student("C", "女", 106021455, 40, 80, 50);
        Student S4 = new Student("D", "女", 106021475, 20, 30, 60);
        Student S5 = new Student("E", "男", 106021465, 10, 20, 90);
        arrayList1.add(S);
        arrayList1.add(S2);
        arrayList1.add(S3);
        arrayList1.add(S4);
        arrayList1.add(S5);
        boolean bool = true;
        while (bool) {
            String str = scn.nextLine();
            System.out.println("功能表");
            System.out.println("1查某位同學");
            System.out.println("2.查全部同學");
            System.out.println("3.查一科目平均");
            System.out.println("4.查某位同學總分");
            //          if(str == "1"){

            //          }
            switch (str) {
                case "1":
                    System.out.println("請輸入同學姓名");
                    String tem = scn.next();
                    for(int i = 0 ;i<arrayList1.size();i++){
                        if(tem == arrayList1.get(i).name){
                            System.out.println("姓名:"+arrayList1.get(i).name);
                        }

                }
                    break;
            }
        }

    }
}



    class Student {
        public String name;
        public String sex;
        public int id;
        public int chinese;
        public int engilsh;
        public int math;
        public int always;
        public int average;

        Student(String name1, String sex1, int id1, int chinese1, int engilsh1, int math1) {
            name = name1;
            sex = sex1;
            id = id1;
            chinese = chinese1;
            engilsh = engilsh1;
            math = math1;

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

        public int getId() {
            return id;
        }

        public void setId(int id1) {
            this.id = id1;
        }

        public int getChinese() {
            return chinese;
        }

        public void setChinese(int chinese1) {
            this.chinese = chinese1;
        }

        public int getEngilsh() {
            return engilsh;
        }

        public void setEngilsh(int engilsh1) {
            this.engilsh = engilsh1;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math1) {
            this.math = math1;
        }

        public int getAlways() {
            return always;
        }

        public void setAlways(int always1) {
            this.always = always1;
            System.out.println("總分:" + (chinese + engilsh + math));
        }

        public int getAverage() {
            return average;
        }

        public void setAverage(int average1) {
            this.average = average1;
            System.out.println("平均:" + ((chinese + engilsh + math) / 3));
        }
    }

