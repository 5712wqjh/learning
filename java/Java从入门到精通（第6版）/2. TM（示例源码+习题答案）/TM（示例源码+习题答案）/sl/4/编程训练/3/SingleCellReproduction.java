
public class SingleCellReproduction {
	public static void main(String[] args) {
		int cellNum =1,time = 1 ;
		while(time < 10){
			cellNum *= 2;
			time++;
		}
		System.out.println("��" + time + "�������е�ϸ������:" + cellNum + "����");
	}
}
