/*
变量概念
对应存储区域，区域数据可以在同一类型范围内变化，变量是程序中最基本的存储单元。包括变量类型，变量名和存储的值（类C）
变量使用
1.java定义变量格式：数据类型 变量名=变量值

2.说明：
	①变量必须先声明后使用（声明包括定义赋值，可一步进行也可两步进行）
	②变量都都定义在其作用域(就是{}内)内，在作用域内，它是有效的。换句话说，出了作用域（变量在一个{}内定
	义的在另一个{}中使用是不行的），它便失效
	③同一个作用域内，不可以声明两个同名的变量


*/
	class BianLiang {   //类名接口名每个单词首字母大写
	public static void main(String[] args) {
		int myAge=20;  //变量名方法名首单词小写后面单词首字母大写,变量定义赋值一起的
		System.out.println("myAge");  
		System.out.println(myAge);//变量的使用，没有双引号
		//System.out.println(myNumber);该位置编译不通过，原因：使用myNumber之前未定义过它
		int myNumber;//该处采用先声明后赋值
		//System.out.println(myNumber);该位置编译不通过。原因：在这里没有默认值，使用myNumber之前未赋值过myNumber
		myNumber=1001;
		System.out.println(myNumber);
		//System.out.println(myClass);编译不通过，出了作用域（变量在一个{}内定义的在另一个{}中使用是不行的）
		//int myAge=22；编译不通过，不可以在同一个作用域内定义同名变量
		myAge=22;//可以通过变量名=另一个变量值，这样改变值，但是不能用格式：数据类型 变量名=变量值定义同一个变量名
		System.out.println(myAge);

	}
	public void method(){
		
		int myClass=1;
		
	}
}