//A�಻ȷ���ȼ����� 
#include<iostream>
using namespace std;
int n;
double a[20], sum;
int main()
{
	puts("��������������");
	cin >> n;
	for (int i = 1; i <= n; i++)
	{
		cin >> a[i];
		sum += a[i];
	}
	double avg = sum / n;
	double sum2 = 0;
	for (int i = 1; i <= n; i++)
	{
		sum2 += (a[i] - avg) * (a[i] - avg);
	}
	double ans = sqrt(sum2 / (n - 1));
	printf("%.3f", ans);
	return 0;
}