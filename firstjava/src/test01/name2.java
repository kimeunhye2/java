package test01;

import javax.management.timer.TimerMBean;
import java.util.ArrayList;

public class name2 {
    public static void main(String[] args) {
        // 조건문
        int i= 10;
        if(i>5){
            System.out.println("참이다");
        }else{
            System.out.println("거짓이다");
        }
        if(i>5){
            System.out.println("참이다");
        }else if(i<5){
            System.out.println("거짓이다");
        }else{
            System.out.println(("나머지입니다."));
        }
        //삼항연산자
        boolean isMarried=true;
        String str;
        str=isMarried ? "결혼했다" : "미혼";
        System.out.println(str);

        if(isMarried){  // OR조건
            str="welcome to..";
        }else {
            str="NONE";
        }
        System.out.println(str);

        boolean isMan=false;
        if(isMarried && isMan){   // AND
            str="hi happy day";
        }else{
            str="blue day";
        }
        System.out.println(str);


        str="결혼했다";
        switch (str){
            case "결혼했다":
                System.out.println("0000");
                break;
            case "미혼":
                System.out.println("XXXX");
            default:
                System.out.println("????");
        }
        //반복문
        for(int a=0;a<10;a++){
            System.out.println(a);
        }
        int j =0;
        while (j<10){
            System.out.println(j+" ");
            j++;
        }
        int k=0;
        do{
            System.out.println(k+ " ");
            k++;
        }while(k<10);
        //break, continue
        for(int b=0;b<10;b++){
            System.out.println(b+"-");
            if(b==6) break;
        }
        for(int cc=0;cc<10;cc++){
            if(cc % 2 == 0) continue; //건너뛰기.
            System.out.println(cc+" : ");
        }
        //배열
        int[] score =new int[5];
        System.out.println(score);
        int count=score.length;
        System.out.println(count);
        System.out.println(score[0]);
        score[2]=10;
        for(int a=0;a<count;a++){
            System.out.println(score[a]+ " ");
        }
        int[] score2=new int[]{10,20,30,40,50};
        for(int a=0;a<count;a++){
            System.out.println(score2[a]+ " ");
        }
        int[] score3={100,200,300,400,500};
        for(int a=0;a<count;a++){
            System.out.println(score3[a]+ " ");
        }
        String[] name={"홍길동","강김찬","을지문덕"};
        System.out.println(name[1]);
        String[] name2=new String[2];
        System.out.println(name2.length);
        System.out.println(name2[0]);
        System.out.println(name2[1]);
//        System.out.println(name2[0].length());  // Null point Exception
        System.out.println(name[1].length());
        System.out.println(name[2].length());

        // wrapper 클래스 ->자료형, Integer,String
        ArrayList<Integer> scoreList=new ArrayList<>();
        scoreList.add(10);
        scoreList.add(50);
        scoreList.add(30);
        scoreList.add(40);
        System.out.println(scoreList.get(1));
        scoreList.add(2,200);
        System.out.println(scoreList);
        scoreList.remove(1);
        System.out.println(scoreList);


        add(10,20);
        add(100,200);
        add(100,200 ,300);
        mul(10,4);
        System.out.println(add(1,2,3,4,5,6,7,8));



    } //Main
    public static int add(int...num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];  //sum=sum+i
        }
        return sum;
    }
    private static void mul(int a, int b) {
        System.out.println(a*b);
    }

    //멤버함수/멤버 메소드
    public static void add(int x, int y) {
        System.out.println(x+y);
    }
    //메소드 오버로딩 :함수명은 같고,매개변수가 다른함수
    public static void add(int x, int y,int z) {
        System.out.println(x+y+z);
    }
    //static이 붙어있으면 메모리에 프로그램이 실행될때
    //처음으로 로드가 되는 부분이다.
    //별도의 영역에 메모리를 차지한다. static 메모리영역
} //Main class
