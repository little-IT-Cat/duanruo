package cn.tedu.demo;
/*
 * ��ϰ3:��ӡ�·�һ��������
 * ******  ��5�����ǣ��л�һ��
 * ******
 * ******
 * ******
 * 
 */
public class Test3 {

	public static void main(String[] args) {
		int a=4;
		int b=6;
		//����һ
		for(int i=1;i<=a*b;i++) {
			if(i%b==0) {
				System.out.println("*");
			}else {
				System.out.print("*");
			}
		}
		System.out.println("=================");
		//������ ˫��for()ѭ��ʵ��
		for(int i=1;i<=a;i++) {//��������
			for(int j=1;j<=b;j++) {//�ڲ������
				System.out.print("*");
			}
			//���з�����
			System.out.println();
		}
		
		
		
	}

}
