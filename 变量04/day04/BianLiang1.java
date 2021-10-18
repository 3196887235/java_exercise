/*
Java定义数据类型

一、按照数据类型来分
	基本数据类型（8种）
		整形：byte\short\int\long(存储空间从小到大)
			1byte=1字节=8bit，表示数：-128~127（8位含一个符号位，数值位仅7位-2^7~2^7-1）
			short：2字节=16位，表示数：含一个符号位，数值位仅15位-2^15~2^15-1
			int：4字节=32位，表示数：
			long：8字节
		浮点型(带小数点)：float（4字节，单精度7位）\double（8字节，双精度）
		其中float4字节，但存储范围比int大，因为是以底数指数形式存储


		字符型：char(2字节)(对应字符集相关概念见CharacterTest.java文件)
		布尔型：boolean(仅对应true,false)
		
	引用数据类型（3种）  （三四五章讲）
		类（class）：字符型在这里				   
		接口（iinterface）
		数组（[]）

二、按照变量在类中声明的位置   （面向对象时候讲）
		成员变量  vs  局部变量

三、输出多变量
 System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s", f, d, str);


*/
class BianLiang1 {
	public static void main(String[] args) {
		//整形：byte(1字节=8bit)\short(2字节)\int(4字节)\long(8字节)
		//①byte范围：-128~127
		byte b1=12;
		byte b2=-128;
		//b2=128;//编译不通过，超出范围，byte较小，需要记忆为-128~127
		System.out.println(b1);
	    System.out.println(b2);
		//②声明Long型变量时，必须以"l"或"L"结尾
		//③通常定义整形变量使用int型
		short s1=128;
		int i1=1234;
		//long l1=341233565985158624;编译错误: 过大的整数: 341233565985158624
		long l1=341233565985158624L;//加上"l"或"L"是万无一失确保为Long类型的
		System.out.println(l1);

		//2.浮点型：float（4字节单精度）\double（8字节双精度）
		//①表示带小数点的数值
		//②float表示数值范围比long还大

		double d1=123.3;
		System.out.println(d1+1);
		//③定义float类型变量时，变量要以"f"或"F"结尾
		float f1=12.3F;
		System.out.println(f1);
		//④通常定义浮点型·使用doule类型

		//3.字符型：char(2字节)
		//通常使用单引号''，内部只能写一个字符
		char c1='a';
		//c1='AB';编译错误：char型变量只能写一个字符（数字可看作AS11码，并非是指单个字母类似的意思）
		System.out.println(c1);
		char c2='中';
		char c3='1';
		System.out.println(c2);
		System.out.println(c3);

		//②表示方式：声明一个字符 2.转义字符 3.直接用unicode值表示的字符型常量（用的少）
		char c4='\n';//换行
		c4='\t';//制表符即table键
		System.out.print("Hello"+c4);
		System.out.println("World");

		char c5='H\n'; //对应unicode编码中的A,斜线u后为16进制的Unicode码形式
		System.out.printf("C5 is:%s\n",c5);  //“”内为字符串，变量直接不加双引号直接输出


		//4.布尔型：boolean
		//①只能取两个值之一：true、false(与c语言不同)
		//②常常用在条件判断，循环结构中使用
		boolean bb1=true;
		System.out.println(bb1);
		boolean isMarried=true;//判断结构if(条件){满足if条件后执行内容}else{情况属于else执行内容}
		if(isMarried){
			System.out.println("你就不能参加单身Party了！\n很遗憾"); //""(英文下)内内容为字符串，包括\n为转义字符
			System.out.println("你就不能参加单身Party了！\\n很遗憾");//转义字符前加\，这时候转义字符作为普通字母输出
			System.out.println("你就不能参加\"单身Party了！\n很遗憾");//对某符号前加\可以让它失去原来包含意思
            System.out.println("你就不能参加\"单身\"Party了！\n\'很遗憾\'");//:不是转义字符，不需要前加\s
			/*由于是"",想让他们两个仅输出双引号（平常
			不加\是输出""内内容而不输出该双引号），则分别在","加一个\              */
	}
		else{
			System.out.println("你可以谈谈女朋友！");
		}
}
}