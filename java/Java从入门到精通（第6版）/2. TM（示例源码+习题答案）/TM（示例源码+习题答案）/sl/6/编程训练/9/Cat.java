
public class Cat {
    String color;
	
    public Cat(String color) {
        this.color = color;
    }
	
    public void catchMice() {
    	System.out.println(color + "èȥץ�����ˡ���");
    }

    public static void main(String[] args) {
        Cat black = new Cat("��");
        black.catchMice();
        Cat white = new Cat("��");
        white.catchMice();
        Cat yellow = new Cat("��");
        yellow.catchMice();
    }
}
