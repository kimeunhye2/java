package test01;

public class Hero extends Person {

    public Hero(String name) {
        this.setName(name);
    }

    public void attack(Hero hero2) {
        System.out.println(hero2.getName()+"과"+this.getName()+"이 싸움을 했다.");
    }
}
