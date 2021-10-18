/*
1.JDK=JRE+Java开发工具（javac.exe,java.exe,javadoc.exe）
JRE=JVM+Java核心类库
2.cd  进入
md创建
rd删除
del 删文件
cd..退回上一层
cd/退回盘
3.编译：javac Chairman.java  （文件名）
编译之后根据类个数出来多个字节码文件（class），但是public定义类只能有一个
  运行的是java public类名

*/
class Chairman 
{
	public static void main(String[] args) 
	{
		System.out.println("姓名：xg\n");
		System.out.println("性别：男");
		System.out.println("家庭地址：湖北某地");

	}
}
