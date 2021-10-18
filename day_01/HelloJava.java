/*
1.java规范三种注释
单行注释  //
多行注释  
文档注释（Java特有）  格式：/**


							  *斜线
2.
单行注释和多行注释作用：
①对所写程序解释说明，增强可读性，方便自己方便别人
②调试所写代码（某行出问题，把错误某一行前加//，如果可以通过即该语句有问题）

3.特点
单行注释和多行注释，注释内容不参与编译，编译生成的class结尾的字节码文件中不包含注释掉的信息

4.文档注释作用，可被JDK提供工具javadoc解析，生成一套以网页文件形式体现的该程序说明文档,项目常用的说明文档

5.多行注释不可以嵌套使用
*/

/**
文档注释
@author wangxiyuan
@version v1.8
这是一个Java程序！
*/

public class HelloJava{

	/**
		如下的方式是main(),作用：程序的入口。
	*/
	
	public static void main (String[] args) {         
		//1.单行注释：System.out.println("")；表示输出到控制台
		/*
		多行注释：
		main方法是程序的入口
		*/
		
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}
}
