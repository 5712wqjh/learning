#include<iostream>
using namespace std;
#include<string>
struct student {
	int age;
	string name2;
	int score;
};
struct teacher {
	string name1;
	struct student stu[5];
};
void a(teacher d[], int len) {
	string seed = "abcdef";
	for (int i = 0; i < len; i++) {
		d[i].name1 = "teacher_";
		d[i].name1 += seed[i];
		for (int j = 0; j < 5; j++) {
			d[i].stu[j].name2 = "student_";
			d[i].stu[j].name2 += seed[j];
			d[i].stu[j].score = 60;
			d[i].stu[j].age = 20;
		}
	}
}
void c(teacher d[], int len) {
	for (int i = 0; i < len; i++) {
		cout << d[i].name1 << endl;
		for (int j = 0; j < 5; j++) {
			cout << d[i].stu[j].name2  << " " << d[i].stu[j].age << " " << d[i].stu[j].score <<  endl;
		}
	}
}
int main() {
	teacher d[3];
	int len;
	len = sizeof(d) / sizeof(d[0]);
	a(d,len);
	c(d, len);
	system("pause");
	return 0;
}