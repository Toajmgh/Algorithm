package org.acm.oct;

import java.util.Scanner;

public class Algorithm3 {
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		char temp;
		String[] str=new String[num];
		for(int i=0;i<num;i++){
			str[i]=s1.next();
		}
		char[] cs=new char[3];
		for(int i=0;i<num;i++){
			//得到输入的字符串
			for(int j=0;j<3;j++)
				cs[j]=str[i].charAt(j);
				//进行排序
				for(int k=0;k<3;k++){
					for(int j=0;j<2;j++){
						if(cs[j]>cs[j+1]){
							temp=cs[j];
							cs[j]=cs[j+1];
							cs[j+1]=temp;
						}
						
					}
				}
			for(int j=0;j<2;j++)
				System.out.print(cs[j]+" ");
				System.out.println(cs[2]);
		}
		//外层for
	}
}
