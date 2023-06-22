package test01;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        int a,b,c,d,hap;
        Scanner s=new Scanner(System.in);
        System.out.printf("첫번째숫자입력");
        a=s.nextInt();
        System.out.printf("두번째숫자입력");
        b=s.nextInt();
        System.out.printf("세번째숫자입력");
        c=s.nextInt();
        System.out.printf("네번째숫자입력");
        d=s.nextInt();
        hap=a+b+c+d;
        System.out.printf("합계=> %d \n",hap);
        s.close();
    }
}
