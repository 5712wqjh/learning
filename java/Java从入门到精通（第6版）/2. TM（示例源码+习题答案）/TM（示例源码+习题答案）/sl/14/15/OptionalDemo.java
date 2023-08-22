import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Optional<String> strValue = Optional.of("Hello"); // ������ֵ����
		boolean haveValueFlag = strValue.isPresent(); // �ж϶����е�ֵ�ǲ��ǿյ�
		System.out.println("strValue�����Ƿ���ֵ��" + haveValueFlag);
		if (haveValueFlag) { // ������ǿյ�
			String str = strValue.get(); // ��ȡ������ֵ
			System.out.println("strValue�����ֵ�ǣ�" + str);
		}

		Optional<String> noValue = Optional.empty(); // ������ֵ����
		boolean noValueFlag = noValue.isPresent(); // �ж϶����е�ֵ�ǲ��ǿյ�
		System.out.println("noValue�����Ƿ���ֵ��" + noValueFlag);
		if (noValueFlag) { // ������ǿյ�
			String str = noValue.get(); // ��ȡ������ֵ
			System.out.println("noValue�����ֵ�ǣ�" + str);
		} else { // ����ǿյ�
			String str = noValue.orElse("ʹ��Ĭ��ֵ"); // ʹ��Ĭ��ֵ
			System.out.println("noValue�����ֵ�ǣ�" + str);
		}
	}
}
