#include <iostream>
using namespace std;
//1.���캯������͵���
//����
//���ղ�������  �޲ι�����вι���
//�������ͷ���  ��ͨ����Ϳ�������
class person {
public:
	person() {
		cout << "���캯��" << endl;
	}
	person(int a) {
		age = a;
		cout << "person���вι��캯���ĵ���" << endl;
	}
	~person() {
		cout << "person����������" << endl;
	}
	//�������캯��
	person(const person &p) {
		age = p.age;
	}
	int age;
};
//����
void test1(){
	//1.���ŷ�
	person p;//Ĭ��
	person p2(10);//�в�
	//�������캯��
	person p3(p2);
	//ע��
	//����Ĭ�Ϲ����ʱ�򣬲�Ҫ�ӣ���
	//��person p1���������Ĵ��룬����������Ϊ�Ǻ���������
	cout << "p2 age" << p2.age << endl;
	cout << "p3 age" << p3.age << endl;
	//2.��ʾ��
	person p1;
	person p2 = person(10);//�вι���
	person p3 = person(p2);//��������
	person(10);//�������� �ص� ִ�н������Զ�����
	//ע��
	//��Ҫ���ÿ����͹��캯����ʼ����������
	//��person ��p3���ڱ�������������person p3��
	
	//4.��ʽת����
	person p4 = 10;//�൱��person p4=person��10��
}

int main() {
	test1();
	system("pause");
	return 0;
}