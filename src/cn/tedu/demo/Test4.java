package cn.tedu.demo;
//��ǰ�����Ĵ�ŵ�λ��
import java.util.Scanner;

//������ ����һ��������ȥ�����³�����
public class Test4 {
	public static void main(String[] args) {
		int temp=50;//δ֪��һ������
		System.out.println("�뿪ʼ�����֣���Χ��1��100");
		//����scan����
		Scanner scan=new Scanner(System.in);
		//����һ������
		boolean flag=true;
		//����һ��������ͳ�Ʋ����ֵĴ���
		int count=0;
		//������һ����ѭ��
		while(flag) {
			int guess=scan.nextInt();//��������������ݻ�ȡ�����Ҹ���guess
			count++;
			if(guess>temp) {
				System.out.println("�´���");
			}else if(guess<temp) {
				System.out.println("��С��");
			}else {
				System.out.println("�¶���");
				System.out.println("һ������"+count+"����");
				flag=false;
			}
		}
		//��Ϣ10���ӣ�17��15����
		
		
		
	}

}
