import java.util.Arrays;

public class PackagedEggs {
	public static void main(String[] args) {
		int[] boxes = new int[10];
		Arrays.fill(boxes, 60);
		for (int i = 0; i < boxes.length; i++) {
			if (i < 4) {
				System.out.println("��" + (i + 1) + "��װ��" + boxes[i] + "ö����");
			} else {
				continue;
			}
		}
		Arrays.fill(boxes, 58);
		for (int i = 4; i < boxes.length; i++) {
			System.out.println("��" + (i + 1) + "��װ��" + boxes[i] + "ö����");
		}
	}
}
