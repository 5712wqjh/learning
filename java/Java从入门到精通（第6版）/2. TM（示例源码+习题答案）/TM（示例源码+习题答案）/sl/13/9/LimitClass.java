
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LimitClass<T extends List> { // 限制泛型的类型
	public static void main(String[] args) {
		// 可以实例化已经实现List接口的类
		LimitClass<ArrayList> l1 = new LimitClass<ArrayList>();
		LimitClass<LinkedList> l2 = new LimitClass<LinkedList>();
		// 这句是错误的，因为HashMap没有实现List()接口
		LimitClass<HashMap> l3 = new LimitClass<HashMap>();
	}
}
