/*
基本数据类型之间的运算

前提：七种基本数据类型变量间运算，bool类型不参与运算

1.自动类型提升
	当容量小的数据类型与容量大的数据类型作运算时，结果自动提升为容量大的数据类型
	byte、char、short-->int-->long-->float-->double   连接-->String

	特别的，当byte、char、short三种类型变量做运算时，结果为int型
	



2.强制类型转换：见BianLiangOperation1.java

说明：此时容量大小指的是，表述数的范围大小，而不是存储空间，比如float容量大于long容量


*/



class BianLiangOperation {
	public static void main(String[] args) {


		byte b1=2;
		int i1=12;
		//byte b2=b1+i1;编译错误： 从int转换到byte可能会有损失
		int b2=b1+i1;
		long l1=b1+i1;
		System.out.println(b2);

		float f=b1+i1; //可以转换为float
		System.out.println(f);

		short s1=123;
		double d1=s1;
		System.out.println(d1);//123.0

		//***********特别的byte、char、short相互作运算包含自身运算结果都为int型***************
		char c1='a';
		int i3=10;
		int i4=c1+i3;
		System.out.println(i4);//107
		System.out.println("Hello World!");

		short s2=10;
		//short s3=c1+s2;//从int转换到short可能会有损失（char型+short型）
		//char s3=c1+s2;编译错误：从int转换到char可能会有损失

		byte c2=10;
		//char c3=c1+c2;编译错误：从int转换到char可能会有损失（char型+byte型）

		//short k3=c2+s2;//编译错误：不兼容的类型: 从int转换到short可能会有损失(byte+short)
		//short k4=b1+c2; //编译错误：不兼容的类型: 从int转换到short可能会有损失(byte+byte)




	}
}
