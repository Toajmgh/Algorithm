package org.acm.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * ����
 ���ڣ���һ���������У����������������Ƿ���ԡ�
����
��һ������һ����N��0<N<=100��,��ʾ��N��������ݡ������N����������������ݣ�ÿ���������ݶ���һ���ַ���S(S�ĳ���С��10000����S���ǿմ���������������������5�顣���ݱ�֤S��ֻ����"[","]","(",")"�����ַ�
���
ÿ���������ݵ����ռһ�У�������ַ�������������������Եģ������Yes,�������������No
 * @author ITOAJMER
 *
 */
public class Algorithm2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		List<String> ss=new ArrayList<String>();
		for(int i=0;i<num;i++){
			ss.add(s1.next());
		}
		//list
		for(String s:ss){
			//ת��Ϊ�ַ�����
			char[] c=s.toCharArray();
			if(isMatch(c))System.out.println("Yes");
			else System.out.println("No");
		}
		
	}
	
	public static boolean isMatch(char[] c){
		//�ж������Ƿ�ƥ�䣬Ҳ���Ƕ��ַ�����Ĳ���
		Stack<Character> statck=new Stack<Character>();
		//�����������ַ�����:[{{[]}}]
		char temp;
		boolean b=true;
		for(int i=0;i<c.length;i++){
			temp=c[i];
			if(temp=='{'||temp=='[')
				statck.push(temp);
			//��������պϽ��з��������
			if(temp=='}'||temp==']'){
				if(statck.isEmpty()){
					b=false;
					break;
				}else{
					if((temp=='}'&&statck.peek()=='{')||(temp==']'&&statck.peek()=='[')){
						statck.pop();
					}else{
						b=false;
						break;//������ǰforѭ���Ĳ���
					}
				}
			}
			
		}
		if(!statck.isEmpty()){
			return false;
		}
		return b;
	}
	
}