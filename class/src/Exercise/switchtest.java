package Exercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class switchtest {
    public static void main(String[] args) {
        System.out.println("優甲乙丙");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        switch (str) {
            case "優":
                System.out.println("出去玩");
                break;
            case "甲"://沒有
            case "乙":
                System.out.println("加油");
                break;
            case "丙":
                System.out.println("找工作");
                break;
                default:{
                    System.out.println("出現錯誤");
                }
        }

    }
}

