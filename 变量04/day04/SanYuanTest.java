/*
��Ԫ�����
1.�ṹ�����������ʽ��?���ʽ1�����ʽ2
2.˵����
���������ʽ�Ľ��Ϊboolean����
���������ʽΪtureѡ��ִ�б��ʽ1��Ϊ��ִ�б��ʽ2
�۱��ʽ1�ͱ��ʽ2Ҫ����һ�µģ����ٿ������Ͽ������������ͽ��н���
����Ԫ���������Ƕ��

3.





*/
class SanYuanTest {
	public static void main(String[] args) {
		//��ȡ���������Ľϴ�ֵ
		int m=12;
		int n=5;

		int max=(m>n)?m:n;  //���ʽ1�����ʽ2��Ӧ��ͳһ��ʽ
		System.out.println(max);
		//(m>n)?2:"n��";�������
		n=12;
		String maxStr=(m>n)?"m��":((m==n)?"m=n":"n��");   //Ƕ����Ԫ�����
		System.out.println(maxStr);
		//************************************************
		//��ȡ���������ֵ
		int n1=12;
		int n2=30;
		int n3=-43;
		int maxInThree=(n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
		System.out.println("���������ֵΪ��"+maxInThree);
		//���� printf("%d",���ͱ���)System.out.printf("���������ֵΪ��%d in three number",maxInThree);



	}
}
