
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LimitClass<T extends List> { // ���Ʒ��͵�����
	public static void main(String[] args) {
		// ����ʵ�����Ѿ�ʵ��List�ӿڵ���
		LimitClass<ArrayList> l1 = new LimitClass<ArrayList>();
		LimitClass<LinkedList> l2 = new LimitClass<LinkedList>();
		// ����Ǵ���ģ���ΪHashMapû��ʵ��List()�ӿ�
		LimitClass<HashMap> l3 = new LimitClass<HashMap>();
	}
}
