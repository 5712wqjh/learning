interface CheckGrade {
	String check(int grade); // ��ѯ�ɼ����
}

public class GradeDemo {
	public static void main(String[] args) {
		CheckGrade g = (n) -> { // lambdaʵ�ִ����
			if (n >= 90 && n <= 100) { // ����ɼ���90-100
				return "�ɼ�Ϊ��"; // ����ɼ�Ϊ��
			} else if (n >= 80 && n < 90) { // ����ɼ���80-89
				return "�ɼ�Ϊ��"; // ����ɼ�Ϊ��
			} else if (n >= 60 && n < 80) { // ����ɼ���60-79
				return "�ɼ�Ϊ��"; // ����ɼ�Ϊ��
			} else if (n >= 0 && n < 60) { // ����ɼ�С��60
				return "�ɼ�Ϊ��"; // ����ɼ�Ϊ��
			} else { // �������ֲ�����Ч�ɼ�
				return "�ɼ���Ч"; // ����ɼ���Ч
			}
		}; // ��Ҫ����lambda����ķֺ�
		System.out.println(g.check(89)); // �����ѯ���
	}
}
