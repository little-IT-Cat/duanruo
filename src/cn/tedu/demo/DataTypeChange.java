package cn.tedu.demo;

public class DataTypeChange {

	public static void main(String[] args) {
		byte a=10;
		int b=20;
		//�������͵��Զ�ת����Сת��
		b=a+10;//byte=byte+int=>int+int=>int
		//�������͵�ǿ��ת������תС��
		a=(byte)(a+10);//byte=byte+int=>int+int=>int=>byte
		double c=2.9;
		//ȱ�� 1.����ȱʧ
		b=(int)c;
		System.out.println(b);
		byte d;//-128~127;
		//ȱ�� 2.�������
		d=(byte)-129;
		System.out.println(d);
		
		//��������  �������ֽ����true false
		boolean e=true;
		e=3<0;
		System.out.println(e);
		
		
		
		

	}

}
