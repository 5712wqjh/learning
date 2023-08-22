#include<iostream>
using namespace std;
int main() {
	int a, b;
	a = 10;
	b = 20;
	//常量指针可以改指向，但不能改值。p=&b是对的，但*p=20；是错的。
	cout << &a << "\n" << &b << endl;
	const int* p = &a;
	cout << p << endl;
	p = &b;
	cout << p << endl;
	//指针常量可以改值但是不能改指向。
	int* const c = &a;
	*c = 20;
	cout << c << endl;
	cout << a << endl;
	system("pause");
	return 0;
}