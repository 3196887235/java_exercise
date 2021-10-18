/*
字符集起源AS11到unicode到现在普遍使用的UTF-8
在保存文件时，默认的是Encoding方式为ANSI（GBK），在本例中采用的是UTF-8的编码，对应命令行输出乱码，命令行对应
输出乱码，原因是命令行用的是GBK进行解析，两个字符集不一样导致，所以乱码可以修改encoding的方式
*/


class CharacterTest {
	public static void main(String[] args) {
		System.out.println("Hello World!你好，中国！");
	}
}
