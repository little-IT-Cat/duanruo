package cn.tedu.demo;
/*
 * ��ϰ1��ƽ������
 *�ж��Ƿ������ꡣ����������
* 1���ܱ�4���������Ҳ��ܱ�100���� year%4==0&year%100!=0;
* 2�������ܱ�400���� year%400==0
 *
 */
public class Test1 {

	public static void main(String[] args) {
		int year=2021;
		if((year%4==0&year%100!=0)|year%400==0) {
			System.out.println("����");
		}else {
			System.out.println("ƽ��");
		}
		

	}

}
