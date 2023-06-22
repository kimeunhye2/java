package test01;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] aa =new int[4];
        int hap = 0;
//        System.out.printf("첫번째숫자입력=>");
//        aa[0]=s.nextInt();
//        System.out.printf("두번째숫자입력=>");
//        aa[1]=s.nextInt();
//        System.out.printf("세번째숫자입력=>");
//       aa[2]=s.nextInt();
//        System.out.printf("네번째숫자입력=>");
//       aa[3]=s.nextInt();
        for(int i=0;i<=3;i++){
            System.out.printf("%d번째숫자입력=>", i+1);
            aa[i]=s.nextInt();
        }
        int k=0;
        while(k<=3){
            hap+=aa[k];
            k++;
        }
//        hap=aa[0]+ aa[1]+aa[2]+aa[3];
        System.out.printf("합계=> %d \n",hap);
        s.close();

        int dan;
        int times;

        for(dan =2; dan <=9; dan++){
            if(dan %2 !=0)continue;

            for(times = 1; times <=9; times++){
                System.out.println(dan + "x" + times + "=" + dan + times);
            }
            System.out.println();

       }



    }
}
