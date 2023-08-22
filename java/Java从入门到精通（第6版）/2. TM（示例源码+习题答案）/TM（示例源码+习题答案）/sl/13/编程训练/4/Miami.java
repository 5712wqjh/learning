
public class Miami<T> {
	private T name; // �������
	private T championTimes; // ��ڴ���
	private T championYears; // ������

	// ��Getters����ȡ˽������ֵ��/Setters������˽������ֵ����װ�������ܡ����е�˽������
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getChampionTimes() {
		return championTimes;
	}

	public void setChampionTimes(T championTimes) {
		this.championTimes = championTimes;
	}

	public T getChampionYears() {
		return championYears;
	}

	public void setChampionYears(T championYears) {
		this.championYears = championYears;
	}

	public static void main(String[] args) {
		Miami<String> miami1 = new Miami<String>(); // ����ʵ������ΪString��Miami����
		miami1.setName("�������ȶ�"); // ���á�������ơ�
		miami1.setChampionYears("2006��2012��2013"); // ���á������ݡ�
		Miami<Integer> miami2 = new Miami<Integer>(); // ����ʵ������ΪInteger��Miami����
		miami2.setChampionTimes(3); // ���á���ڴ�����
		System.out.println("��ڴ���Ϊ " + miami2.getChampionTimes() + " �ε���Ӽ���ݣ�\n"); // ��ȡ��ڴ���
		System.out.println("������ƣ�" + miami1.getName() + "\n�����ݣ�" + miami1.getChampionYears() + "\n"); // �����������ơ����������ݡ�������ڴ�����
		Detroit detroit = new Detroit(); // ����Detroit����
		System.out.println("������ƣ�" + detroit.getName() + "\n�����ݣ�" + detroit.getChampionYears() + "\n"); // �����������ơ����������ݡ�������ڴ�����
		Philadelphia phi = new Philadelphia(); // ����Philadelphia����
		System.out.println("������ƣ�" + phi.getName() + "\n�����ݣ�" + phi.getChampionYears()); // �����������ơ����������ݡ�������ڴ�����
	}
}

class Detroit extends Miami<String> {// ����һ���������ɡ���̳�ʵ������ΪString�ġ������ܡ���
	@Override
	public String getName() {// ��д��ȡ��������ơ��ķ�����������"�����ɻ�����"
		return "�����ɻ�����";
	}

	@Override
	public String getChampionYears() {// ��д��ȡ�������ݡ��ķ�����������"1989��1990��2004"
		return "1989��1990��2004";
	}
}

class Philadelphia extends Miami<String> {// ����һ���������ɡ���̳�ʵ������ΪString�ġ������ܡ���
	@Override
	public String getName() {// ��д��ȡ��������ơ��ķ�����������"�ѳ�76�˶�"
		return "�ѳ�76�˶�";
	}

	@Override
	public String getChampionYears() {// ��д��ȡ�������ݡ��ķ�����������"1955��1967��1983"
		return "1955��1967��1983";
	}
}
