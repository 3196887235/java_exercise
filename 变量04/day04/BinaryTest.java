/*
计算机不同进制的使用说明
对于整数，有四种表示方式
>二进制：0，1，满2进1，以Ob或0B开头。
>十进制：0~9，满10进1
>八进制：0~7，满8进1，数字0开头
>十六进制，0~F，以0x或0X开头，此处A~F不区分大小写

计算机以补码形式存储：整数的补码为自身，负数补码为（2^8-负数值的模)对应正数的二进制
，此处举例以一字节（byte）为例，已知补码求原值同理，看符号位：为0，不变；为1，读出真值，用真值-2^所在位数对应的负数






*/
class BinaryTest {
	public static void main(String[] args) {
		int num1=0b110;//整数：0b开头代表2进制
		int num2=110;
		//int num3=0128;编译不通过，0开头代表8进制，后面最多出现7
		int num4=0127;//整数：0开头代表8进制，计算机呈现的是十进制
		int num5=0x110A;//整数：0x或者0X开头代表16进制


		System.out.println
			("num1= "+
			num1);  //回车不代表结束，可以把一条语句写在多行上
		System.out.println("num2= "+num2);
		System.out.println("num4= "+num4);
		System.out.println("num5= "+num5);

	}
}
