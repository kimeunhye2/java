package test01;

public class Person {
    private String name;
    private int age;

    //오버라이드 -메소드 재정의 ,어노테이션
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //기본생성자(디폴트 생성자)
    public Person(){

    }
    //생성자함수는 리턴값이 없다.
    //오버로딩 생성자
    public Person(String name, int age) {
        this.name = name; //내가가진 name 변수 = 매개변수 name
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
