package org.acm.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * 描述
 现在，有一行括号序列，请你检查这行括号是否配对。
输入
第一行输入一个数N（0<N<=100）,表示有N组测试数据。后面的N行输入多组输入数据，每组输入数据都是一个字符串S(S的长度小于10000，且S不是空串），测试数据组数少于5组。数据保证S中只含有"[","]","(",")"四种字符
输出
每组输入数据的输出占一行，如果该字符串中所含的括号是配对的，则输出Yes,如果不配对则输出No
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
			//转换为字符数组
			char[] c=s.toCharArray();
			if(isMatch(c))System.out.println("Yes");
			else System.out.println("No");
		}
		
	}
	
	public static boolean isMatch(char[] c){
		//判断括号是否匹配，也就是对字符数组的操作
		Stack<Character> statck=new Stack<Character>();
		//比如这样的字符数组:[{{[]}}]
		char temp;
		boolean b=true;
		for(int i=0;i<c.length;i++){
			temp=c[i];
			if(temp=='{'||temp=='[')
				statck.push(temp);
			//如果遇到闭合进行分情况讨论
			if(temp=='}'||temp==']'){
				if(statck.isEmpty()){
					b=false;
					break;
				}else{
					if((temp=='}'&&statck.peek()=='{')||(temp==']'&&statck.peek()=='[')){
						statck.pop();
					}else{
						b=false;
						break;//结束当前for循环的操作
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