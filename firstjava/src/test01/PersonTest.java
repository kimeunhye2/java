package test01;

public class PersonTest {
    public static void main(String[] args) {
        Person 사람1 = new Person();
        System.out.println(사람1);
        Person 사람2 = new Person("김원빈",30);
        System.out.println(사람2.toString());
        System.out.println(사람2.getName());
        System.out.println(사람2.getAge());
        Person 사람3 = new Person("이순신",33);
        System.out.println(사람3.toString());
        System.out.println(사람3.getName());
        System.out.println(사람3.getAge());

        Hero hero=new Hero("수퍼맨");
        Hero hero2=new Hero("배트맨");
        hero.attack(hero2); //hero가 hero2를 공격해보자.

    }
}
