package test01;

import java.util.Random;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        System.out.println(Math.max(10,30));
        System.out.println(Math.min(10,30));
        System.out.println(Math.abs(-30));
        System.out.println(Math.PI)  ;

        String str="100";
        int i = Integer.parseInt(str);
        long l = Long.parseLong(str);

        System.out.println(i);
        System.out.println(l);

        String str2= String.valueOf(i);

        System.out.println(str2);

        Random  random = new Random();
        System.out.println(random); //java.Random
        int rand = random.nextInt(10); // 0~9까지의 랜덤한 숫자
        System.out.println(rand);
        //5~14까지 구할 경우에
        //0~4를 먼저 구하고 거기서 5를 더한다.
        int rand2 = random.nextInt(4)+5;
        System.out.println(rand2);

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        String str3=scanner.next(); // 문자열 입력
        System.out.println("입력한 값:"+str3);
        int num2=scanner.nextInt(); //정수값 입력
        System.out.println(num2);
        long long2=scanner.nextLong(); //long형 정수값 입력
        System.out.println(long2);

       }
}
