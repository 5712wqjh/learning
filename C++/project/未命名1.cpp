#include<iostream>
using namespace std;
#include<string>
struct student {
	int age;
	string name;
	int score;
};
struct teacher {
	int age;
	int id;
	string name;
	struct student stu;
};
int main() {
	teacher d = { 18,01,"01",18,"02",100 };
	cout << d.stu.name << endl;
	system("pause");
	return 0;
}