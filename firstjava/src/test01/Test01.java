package test01;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("welcome to my world");
        System.out.println(100);
        System.out.println(100+200);
        int x=30;
        System.out.println(x);
        System.out.println(x+20);
        x=300;
        System.out.println(x);
        final int y=500; //상수 선언
        System.out.println(y);
//        y=600;
        System.out.println(y);

        //자료형, 정수, long,double,float
        int num=30;
        long 롱=30L; //정수계열에서 가장 큰 수
        short s=100;
        byte 바이트=127; //8비트

        double dd=3000.00;
        float ff=30.0f;

        System.out.println(num);
        System.out.println(롱);

        boolean isMaried=true;
        isMaried=false;
        System.out.println(isMaried);

        char c='A'; //거의 사용안함, 훗따옴표
        char cc='한';

        System.out.printf("%c,%c\n" ,c,cc);

        String str="welcome 여러 글자";
        System.out.println(str);

        int 정수1=(int)30L; //type casting 강제형변환
        long 롱2=30; //작은값->큰값으로 자동형변환

        double ddd=30.00;
        float fff=30.0f;

        //boolean - 1바이트
        //char - 2바이트
        //byte - 1바이트 short -2바이트
        //int- 4바이트 long(정수) - 8 바이트 L
        //float (실수)- 4바이트  , double (실수) - 8 바이트

        byte 바이트1=127; //정수

        //c 언어에서 나온 명령어
        System.out.printf("저는 %s입니다. 나이는 %d이고, 키는 %.2fcm입니다.", "이순신", 20, 190.5f);
        System.out.println("\n");
        String str2=String.format("저는 %s입니다. 나이는 %d이고, 키는 %.2fcm입니다.", "이순신", 20, 190.5f);
        System.out.println(str2);
    }
}
