/*
对第一个Java程序进行总结
1.java程序编写-编译-运行过程
编写：将编写的java代码存在以”.java“结尾的源文件
编译：使用javac.exe命令编译我们的java源文件。格式：javac  源文件名.java
运行：使用java.exe命令解释运行我们的字节码文件。格式：java 类名

2.
在一个Java源文件中可以声明多个class(类)，但是，只能最多有一个类声明为public(封装性)
而且必须声明为public的类名必须与源文件名相同

3.程序的入口是main()方法。格式是固定的，可变化的为①arguments:参数  可变为a ②括号内可变为String a[]

4.输出语句可变化：
System.out.println();  换行（先输出数据后换行）
变为System.out.print(); 不换行（只输出数据）

5.每一行执行语句都以";"结束，要紧么是大括号{，要么是；

6.编译的过程：编译以后会生成一个或多个字节码文件（与class数目有关），其文件名与java源文件中类名相同。




*/
public class  Hello   {      //声明为public的类名必须与源文件名相同
	public static void main(String[] a) {  //①arguments:参数  可变为a ②括号内可变为String a[]
		System.out.println("Hello World!");
		System.out.println();//仅换行
		System.out.print("Hello World!");
	}
}
 class person  //
{
 
}
class Animal
{
}
