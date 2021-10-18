/*
三元运算符
1.结构：（条件表达式）?表达式1：表达式2
2.说明：
①条件表达式的结果为boolean类型
②条件表达式为ture选择执行表达式1，为假执行表达式2
③表达式1和表达式2要求是一致的，至少可以向上可以用数据类型进行接收
④三元运算符可以嵌套

3.





*/
class SanYuanTest {
	public static void main(String[] args) {
		//获取两个整数的较大值
		int m=12;
		int n=5;

		int max=(m>n)?m:n;  //表达式1：表达式2，应能统一格式
		System.out.println(max);
		//(m>n)?2:"n大";编译错误
		n=12;
		String maxStr=(m>n)?"m大":((m==n)?"m=n":"n大");   //嵌套三元运算符
		System.out.println(maxStr);
		//************************************************
		//获取三个数最大值
		int n1=12;
		int n2=30;
		int n3=-43;
		int maxInThree=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
		System.out.println("三者中最大值为："+maxInThree);
		//可用 printf("%d",整型变量)System.out.printf("三者中最大值为：%d in three number",maxInThree);



	}
}
