package cn.tedu.demo;

public class LiuChengDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.˳�����
		System.out.println("�Ұ�ѧϰ����ϲ��ѧϰjava");
		System.out.println("�Ұ�ѧϰ");
		System.out.println("��ϲ��ѧϰjava");
		//2.��֧��� (1)if(���ʽ){}
		//(2)if(){}else{}  ��ѡһ
		//(3)if(���ʽ1){�����1}else if(���ʽ2){�����2}else{�����3} ��ѡһ
		
//		if(count>90) {
//			System.out.println("����");
//		}
//		if(count>90) {
//			System.out.println("����");
//		}else {
//			System.out.println("����");
//		}
//		int count=100;
//		if(count>80&count<90) {
//			System.out.println("����");
//		}else if(count>90) {
//			System.out.println("����");
//		}else if(count>60&count<80){
//			System.out.println("һ��");
//		}else {
//			System.out.println("������");
//		}
		//3.ѭ�����  ����ظ�������
		//��ϰ1������ �����ӡ���飺�Ұ�ѧϰ����ϲ��ѧϰjava
		//��������
		System.out.println("�Ұ�ѧϰ����ϲ��ѧϰjava");
		System.out.println("�Ұ�ѧϰ����ϲ��ѧϰjava");
		System.out.println("�Ұ�ѧϰ����ϲ��ѧϰjava");
		//(1)for(���ʽ1;���ʽ2;���ʽ3){ѭ����}
		for(int i=1;i<=30;i++) {
			//���ʽ1->���ʽ2->ѭ����->���ʽ3->���ʽ2->ѭ����->���ʽ3.....
			//i++:i=i+1; ����1
			System.out.println("�Ұ�ѧϰ����ϲ��ѧϰjava");
		}
//		//��ϰ2 ��ӡ1��100
//		for(int i=1;i<=100;i++) {
//			//""�ַ���������ߵ�����ԭ�����
//			System.out.println(i);
//		}
		//(2)while(�ж�����){ѭ����}
		int i=1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		//(3)do...while();
		//break; 
		//continue
		//��ӡ1��10  �Ҳ�ϣ��4����ӡ���� 1235678910
		for(int i1=1;i1<=10;i1++) {
			if(i1==4) {
				continue;//������ǰѭ����������һ��ѭ��
			}
			System.out.print(i1);
		}
		System.out.println("=====================");
		//��ӡ1��10,��i��������8ʱ�򣬲��ڽ��д�ӡ��
		for(int i1=1;i1<=10;i1++) {
			if(i1==8) {
				break;//����ѭ��
			}
			System.out.print(i1);
		}
	}

}





