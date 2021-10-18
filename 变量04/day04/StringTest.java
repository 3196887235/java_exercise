/*
String类型变量(字符串)的使用
1.String属于引用数据类型
2.声明String类型变量时，使用一对""
3.String可以和8种数据类型做运算，且运算只能做连接运算



*/
class StringTest {
	public static void main(String[] args) {
		String s1="Hello World!";
		System.out.println(s1);
		String s2="a";
		String s3="";

		//char c='11 ';编译错误：char单引号内只能有一个字符

		//******************************************************
		int number=1001;
		String numberStr="学号：";
		String info=numberStr+number;//+:连接运算，String与八种基本数据类型做连接运算，运算结果仍为String类型
		System.out.println(info);
		boolean b1=true;
		String info1=info+b1;
		System.out.println(info1);//+:连接运算

		//练习1
		char c='a';
		int num=10;
		String str="Hello";
		System.out.println(c+num+str); //107Hello,第一个加号表示数值运算，第二个加号表示连接运算
		System.out.println(c+str+num);//aHello10,没有括号从前向后计算，与字符串运算即为连接运算，两者都不为字符串即为数值运算
		System.out.println(c+(num+str));//a10Hello
		System.out.println((c+num)+str);//107Hello
		System.out.println(str+num+c);//Hello10a

		//练习2
		//* *
		System.out.println("*  *");
		System.out.println("*"+'\t'+"*");//从前往后，连接+连接
		System.out.println('*'+'\t'+'*');//从前往后，char+char对应运算+运算
		System.out.println('*'+"\t"+"*");
		System.out.println('*'+'\t'+"*");//从前往后，char+char对应
		String str2=3.5f+"";
		System.out.println(str2);

		//*********************************
		//String str1=123;//不兼容的类型: int无法转换为String
		String str1=123+"";
		System.out.println(str1);
		//int num1=str1;//错误: 不兼容的类型: String无法转换为int
		//int num1=(int)str1;//错误: 不兼容的类型: String无法转换为int,只表连接，由String转换为别的类型需要调封装类
		int num1=Integer.parseInt(str1);
		System.out.println(str1);
		


	}
}
