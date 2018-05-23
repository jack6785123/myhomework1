import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i<n;i++){
            a[i] = scn.nextInt();
        }
        for(int i= 0;i<n;i++){
            for(int j = 1 ;j<n;j++){
                if(a[i]*a[j]<a[i]*a[j]){
                    n = a[i]*a[j];
                }
                System.out.println(a[i]*a[j]);
            }
            }
        }
    }

