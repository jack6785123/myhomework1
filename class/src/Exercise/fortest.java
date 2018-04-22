package Exercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class fortest {
    public static void main(String[] args) {
        int sum = 0;
        int range;
        int i;
        Scanner scn = new Scanner(System.in);
        range= scn.nextInt();
        System.out.println("請輸入計數的奇數範圍(結尾數值):");
        for(i = 1;i<=range;i+=2){
            sum+=i;
        }
        System.out.println("1到"+range+"奇數總和"+sum);
    }


}
