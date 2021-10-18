/*
关键字都是小写的 eg：class public 
标识符的使用
1.标识符：凡是自己可以起名字的地方都叫标识符
比如：类名，变量名，方法名，接口名，包名...

2.重点掌握：标识符命名规则      如果不遵守，编译不通过
①由26个英文字母大小写，0到9，或_或$
②数字不可以开头
③不可以使用关键字和保留字，但能包含关键字和保留字，关键字和保留字都是小写
，可以组合，可以对首字母大写这样都可以成为标识符
④Java中严格区分大小写（Static可用作标识符），长度无限制
⑤标识符不能包含空格

3.Java中命名规范：   -----如果不遵守如下规范，编译可以通过，建议遵守 
包名： 多单词组成所有字母都小写;xxyyzz
类名、接口名：多单词组成，所有单词首字母大写;XxYyZz
变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写:xxxYyyZzz
常量名：所有字母都大写，多单词每个单词用下划线连接:XXX_YYY_ZZZ

4.注意1起名字时，尽量有意义，见名知意
  注意2，java使用的unicode编码，所以可以用中文当作变量名等等，但不建议

*/
class  IdentifierTest{
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int myNumber=1001;
		System.out.println(myNumber);

	}
}
class Hello1_${
}
/*class 1jkk{      
} 标识符规则数字开头不行
*/
class static1{//非关键字可以
}
class Static{   //编译能通过，因为关键字是小写的，这个大写不是关键字
}
class staticpublic{ //合一起不是关键字即可
}
 

