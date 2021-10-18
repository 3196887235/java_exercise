/*
强制类型转换：自动类型提升运算的逆运算(容量大类型变为容量小类型)
1.需要使用强转符：（目标强转为容量小类型）   eg  （int）d1
2.注意点;强制类型转换，截除整数部分，可能导致精度损失


*/
class BianLiangOperation1 {
	public static void main(String[] args) {
		double d1=12.3;

		//int i1=d1;//编译错误: 不兼容的类型: 从double转换到int可能会有损失
		int i1=(int)d1;//实现的强转换，截除整数部分（损失精度）
		System.out.println(i1);

		//没有精度损失
		long l1=123L;
		short s2=(short)l1;
		System.out.println(s2);

		//
		int i2=128;
		byte b=(byte)i2;
		System.out.println(b);//变为-128

		//编码情况1
		long l=12312;//编译通过，因为12312默认为int，没有超出int就自动转换
		System.out.println(l);
		//long l1=1233333333333333333; // 过大的整数: 1233333333333333333
		long l2=1233333333333333333L;

		//float f1=12.3;//错误: 不兼容的类型: 从double转换到float可能会有损失,不同于long不加L，这里默认double无法自转到float
		float f2=12.3F;//或者float f1=(float)12.3;都行

		//编码情况2
		//整型常量默认为int型，eg：b1+2.3只能用int来进行自动类型转换
		//浮点型常量默认为double型，eg:f1+2.3只能用double来进行自动类型转换，即向两种数据容量中容量大的及以上数据类型转换
		byte b1=12;
		//byte b2=b+1;//编译错误: 不兼容的类型: 从int转换到byte可能会有损失,此处的1为常量


		
	}
}
