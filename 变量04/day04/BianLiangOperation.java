/*
������������֮�������

ǰ�᣺���ֻ����������ͱ��������㣬bool���Ͳ���������

1.�Զ���������
	������С���������������������������������ʱ������Զ�����Ϊ���������������
	byte��char��short-->int-->long-->float-->double   ����-->String

	�ر�ģ���byte��char��short�������ͱ���������ʱ�����Ϊint��
	



2.ǿ������ת������BianLiangOperation1.java

˵������ʱ������Сָ���ǣ��������ķ�Χ��С�������Ǵ洢�ռ䣬����float��������long����


*/



class BianLiangOperation {
	public static void main(String[] args) {


		byte b1=2;
		int i1=12;
		//byte b2=b1+i1;������� ��intת����byte���ܻ�����ʧ
		int b2=b1+i1;
		long l1=b1+i1;
		System.out.println(b2);

		float f=b1+i1; //����ת��Ϊfloat
		System.out.println(f);

		short s1=123;
		double d1=s1;
		System.out.println(d1);//123.0

		//***********�ر��byte��char��short�໥���������������������Ϊint��***************
		char c1='a';
		int i3=10;
		int i4=c1+i3;
		System.out.println(i4);//107
		System.out.println("Hello World!");

		short s2=10;
		//short s3=c1+s2;//��intת����short���ܻ�����ʧ��char��+short�ͣ�
		//char s3=c1+s2;������󣺴�intת����char���ܻ�����ʧ

		byte c2=10;
		//char c3=c1+c2;������󣺴�intת����char���ܻ�����ʧ��char��+byte�ͣ�

		//short k3=c2+s2;//������󣺲����ݵ�����: ��intת����short���ܻ�����ʧ(byte+short)
		//short k4=b1+c2; //������󣺲����ݵ�����: ��intת����short���ܻ�����ʧ(byte+byte)




	}
}
