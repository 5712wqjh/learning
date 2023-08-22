#include <iostream>
using namespace std;
//1.构造函数分类和调用
//分类
//按照参数分类  无参构造和有参构造
//按照类型分类  普通构造和拷贝构造
class person {
public:
	person() {
		cout << "构造函数" << endl;
	}
	person(int a) {
		age = a;
		cout << "person的有参构造函数的调用" << endl;
	}
	~person() {
		cout << "person的析构函数" << endl;
	}
	//拷贝构造函数
	person(const person &p) {
		age = p.age;
	}
	int age;
};
//调用
void test1(){
	//1.括号法
	person p;//默认
	person p2(10);//有参
	//拷贝构造函数
	person p3(p2);
	//注意
	//调用默认构造的时候，不要加（）
	//像person p1（）这样的代码，编译器会认为是函数的声明
	cout << "p2 age" << p2.age << endl;
	cout << "p3 age" << p3.age << endl;
	//2.显示法
	person p1;
	person p2 = person(10);//有参构造
	person p3 = person(p2);//拷贝后构造
	person(10);//匿名对象 特点 执行结束是自动回收
	//注意
	//不要利用拷贝和构造函数初始化匿名对象
	//像person （p3）在编译器看来等于person p3；
	
	//4.隐式转换法
	person p4 = 10;//相当于person p4=person（10）
}

int main() {
	test1();
	system("pause");
	return 0;
}