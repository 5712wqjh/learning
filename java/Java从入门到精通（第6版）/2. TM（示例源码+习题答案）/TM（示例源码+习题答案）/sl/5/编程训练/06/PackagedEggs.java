import java.util.Arrays;

public class PackagedEggs {
	public static void main(String[] args) {
		int[] boxes = new int[10];
		Arrays.fill(boxes, 60);
		for (int i = 0; i < boxes.length; i++) {
			if (i < 4) {
				System.out.println("第" + (i + 1) + "箱装了" + boxes[i] + "枚鸡蛋");
			} else {
				continue;
			}
		}
		Arrays.fill(boxes, 58);
		for (int i = 4; i < boxes.length; i++) {
			System.out.println("第" + (i + 1) + "箱装了" + boxes[i] + "枚鸡蛋");
		}
	}
}
