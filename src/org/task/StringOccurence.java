package org.task;

import java.util.Iterator;

public class StringOccurence {
public static void main(String[] args) {
	String s=" ";
	String s1=" ";
	int a[]= {1,2,1,4,5,5,6,3,7,8,9,8,5,6,3,2,4};
	for (int i : a) {
		if (s.contains("Key= "+i+" count= ")) {
			int n= s.indexOf("Key= "+i+" count= ")+16;
			if (i>10||i==10) {
				n=n+i;
			}
			int val= s.charAt(n)-'0';
			String e= "Key= "+i+" count= "+val;
			String e1="Key= "+i+" count= "+(val+1);
			s1=s.replaceAll(e, e1);
			s=s1;
			
		}else {
			s=s+"Key= "+i+" count= "+1+"@@";
			}
	}System.out.println(s);
	String[] sp=s.split("@@");
	for (String string : sp) {
		System.out.println(string);
	}
	
}
}
