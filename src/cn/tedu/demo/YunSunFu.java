package cn.tedu.demo;

public class YunSunFu {

	public static void main(String[] args) {
		//1.��������� + ��-��*�� / �� % ��++�� --
		int a=10;int b=20;
		System.out.println(a+b);//30
		System.out.println(a-b);//-10
		System.out.println(a*b);//200
		//int/int=>int,ֱ��ĨȥС������
		System.out.println(a/b);//0  int/int=>int 10/20=0
		System.out.println(a%b);//10/20=0....10;
		//��ϰ1 ��һ����98������ֱ��ȡ����ʮλ����λ�����˱��� c d
		int c=98/10;//98/10=9....8;
		int d=98%10;
		System.out.println("c:"+c+"d:"+d);
		//++ -- ����ʹ�õ�ʱ��ǰ++�ͺ�++Ч��һ��
		int e=1;
		e++;//��++ ��e=e+1;
		System.out.println(e);//2
		++e;//ǰ++ e=e+1;
		System.out.println(e);//3
		//8 ���ʹ�õ�ʱ��ǰ++������1���ڲ������� 
		//��++�Ȳ������㣬������1
		System.out.println(e++ + ++e);//3+5=8; e=3;e++; 3+ 5
		System.out.println(e);//5
		
		System.out.println("===================================");
		//2.�Ƚ������ == ����=
		//�ڻ������������У�==�Ƚϵ�����ֵ�Ĵ�С��ϵ
		System.out.println(3==5);
		System.out.println(3!=5);
		//3.�߼������ &��| �ַ���ƴ��
		//3.1 &������  ȫ��Ϊ�棬һ��Ϊ��
		System.out.println(3>5&4<10);//false&true=>false
		int x=10;int y=20;int z=30;
		if(x>y&x>z) {
			//syso Alt+/:���벹ȫ
			System.out.println("�����ֵ�ǣ�"+x);
			
			
		}
		//3.2| ������ һ��Ϊ�棬ȫ��Ϊ��
		System.out.println(3>2|3>10);//true|false=>true
		System.out.println(3>7|3>10);//false|false=>false
		int i=10,j=15;
		System.out.println(++i>3&j--<10);//i=i+1;11>3&15<10;j=j-1; true&false=>false
		System.out.println(i);//11
		System.out.println(j);//14
		//&&��·��  ������Ѿ�ȷ���𰸵�ʱ����ô�ұ߽����ڽ����жϣ��𵽶�·Ч����
		System.out.println(i++<3&&++j>10);//false  11<3;i++;
		System.out.println(i);//12
		System.out.println(j);//14
		System.out.println("=====================");
		//������
		System.out.println(++i>10|j++<20);//true ++i;true|true=>true;j++;
		System.out.println(i);//13
		System.out.println(j);//15
		// ||��·�� ������Ѿ�ȷ���𰸵�ʱ����ô�ұ߽����ڽ����жϣ��𵽶�·Ч����
		System.out.println(++i>10||j++<20);//true  ++i;true;
		System.out.println(i);//14
		System.out.println(j);//15
		//3.3�ַ���ƴ��+  һ��" "+�������ͱ���=>һ���µ��ַ�����
		System.out.println("��ϲ��"+"ѧϰ");//"��ϲ��"+"ѧϰ"=>"��ϲ��ѧϰ"
		System.out.println("��ǰi��ֵ��"+i);//"��ǰi��ֵ��"+����i=>"��ǰi��ֵ��14"
		System.out.println("123"+i+j);//1231415  "123"+14=>"12314"+15=>"1231415"
		System.out.println("123"+(i+j));//12329  "123"+29=>"12329"
		//4.��Ԫ����� ���ʽ1�����ʽ2�����ʽ3��
		int a1=3<2?19:20;
		System.out.println(a1);
		//5.��ֵ����� =��+=��-=��*=��/=��
		int a2=10;
		//+=
		a2+=10;//a2=a2+10;
		System.out.println(a2);//20
		a2*=10;//a2=a2*10=200;
		System.out.println(a2);
		//
				
		
	}

}
