#include<iostream>
using namespace std;
int main() {
	int a, b;
	a = 10;
	b = 20;
	//����ָ����Ը�ָ�򣬵����ܸ�ֵ��p=&b�ǶԵģ���*p=20���Ǵ�ġ�
	cout << &a << "\n" << &b << endl;
	const int* p = &a;
	cout << p << endl;
	p = &b;
	cout << p << endl;
	//ָ�볣�����Ը�ֵ���ǲ��ܸ�ָ��
	int* const c = &a;
	*c = 20;
	cout << c << endl;
	cout << a << endl;
	system("pause");
	return 0;
}