package cn.tedu.demo;
/*
 *��ϰ2��������������������ǵ����ֵ����Сֵ
 */
public class Test2 {

	public static void main(String[] args) {
		//˼·�������Ƚϣ������������������бȽ�
		int a=10,b=10,c=10;
		int max=0,min=0;
//		if(a>b){
//            max=a;
//            min=b;              
//        }else{
//            max=b;
//            min=a;
//        }
//        if(c>max){
//            max=c;
//        }else{
//            
//        }
//        if(c<min){
//            min=c;
//        }else{
//            
//        } 
		//��Ԫ����� ���ʽ1�����ʽ2�����ʽ3��
		max=a>b?a:b;
		max=max>c?max:c;
		min=a<b?a:b;
		min=min<c?min:c;
        System.out.println("���ֵΪ��"+max);
        System.out.println("��СֵΪ��"+min);
	}

}
