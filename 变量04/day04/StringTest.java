/*
String���ͱ���(�ַ���)��ʹ��
1.String����������������
2.����String���ͱ���ʱ��ʹ��һ��""
3.String���Ժ�8���������������㣬������ֻ������������



*/
class StringTest {
	public static void main(String[] args) {
		String s1="Hello World!";
		System.out.println(s1);
		String s2="a";
		String s3="";

		//char c='11 ';�������char��������ֻ����һ���ַ�

		//******************************************************
		int number=1001;
		String numberStr="ѧ�ţ�";
		String info=numberStr+number;//+:�������㣬String����ֻ��������������������㣬��������ΪString����
		System.out.println(info);
		boolean b1=true;
		String info1=info+b1;
		System.out.println(info1);//+:��������

		//��ϰ1
		char c='a';
		int num=10;
		String str="Hello";
		System.out.println(c+num+str); //107Hello,��һ���Ӻű�ʾ��ֵ���㣬�ڶ����Ӻű�ʾ��������
		System.out.println(c+str+num);//aHello10,û�����Ŵ�ǰ�����㣬���ַ������㼴Ϊ�������㣬���߶���Ϊ�ַ�����Ϊ��ֵ����
		System.out.println(c+(num+str));//a10Hello
		System.out.println((c+num)+str);//107Hello
		System.out.println(str+num+c);//Hello10a

		//��ϰ2
		//* *
		System.out.println("*  *");
		System.out.println("*"+'\t'+"*");//��ǰ��������+����
		System.out.println('*'+'\t'+'*');//��ǰ����char+char��Ӧ����+����
		System.out.println('*'+"\t"+"*");
		System.out.println('*'+'\t'+"*");//��ǰ����char+char��Ӧ
		String str2=3.5f+"";
		System.out.println(str2);

		//*********************************
		//String str1=123;//�����ݵ�����: int�޷�ת��ΪString
		String str1=123+"";
		System.out.println(str1);
		//int num1=str1;//����: �����ݵ�����: String�޷�ת��Ϊint
		//int num1=(int)str1;//����: �����ݵ�����: String�޷�ת��Ϊint,ֻ�����ӣ���Stringת��Ϊ���������Ҫ����װ��
		int num1=Integer.parseInt(str1);
		System.out.println(str1);
		


	}
}
