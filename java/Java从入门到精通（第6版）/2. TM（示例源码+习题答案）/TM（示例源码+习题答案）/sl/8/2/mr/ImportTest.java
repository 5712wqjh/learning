package com.mr;

import static java.lang.Math.max; //导入静态成员方法
import static java.lang.System.out; //导入静态成员变量

public class ImportTest {
	public static void main(String[] args) {
		// 在主方法中可以直接使用这些静态成员
		out.println("1和4的较大值为：" + max(1, 4));
	}
}
