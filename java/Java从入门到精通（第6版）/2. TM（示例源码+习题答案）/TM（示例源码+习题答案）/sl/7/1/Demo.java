class Parent {
    public Parent() {
        System.out.println("���ø��๹�췽��");
    }
}
class Child extends Parent {
    public Child() {
        System.out.println("�������๹�췽��");
    }
}
public class Demo {
    public static void main(String[] args) {
        new Child();
    }
}
