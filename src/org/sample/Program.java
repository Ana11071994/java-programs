package org.sample;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
// Q.1	the given number is odd or even
   /*		int num = 5468;
		if (num%2==0) {
			System.out.println("the given number is even"); // %=remainder;/=quotient
		}
		else {
			System.out.println("the given num is odd");
		}*/
// Q.2 print odd number from 1 to 100
	 // remainder is 1(odd)& 0(even)
	/*	for (int i = 1; i <= 100; i++) {
			if (i%2==1) {
				System.out.println(i);
				
			}
			
		}*/
		// count of even number 1 to 100
	/*	int count = 0;
		for (int i = 1; i <=100; i++) {
			if (i%2==0) {
				count++;
				}
			}
		System.out.println(count);*/
// Q.3 reverse the given number
/*		int givennum = 123;
		int revsnum = 0;
		while (givennum!=0) {
			revsnum = revsnum*10;
			revsnum =revsnum+givennum%10;
			givennum =givennum/10;
		}
		System.out.println(revsnum);*/
		
//Q .4 given number is palindrome or not
	/*	int num =151;
		int a =num;
		int b = 0;
		while (num!=0) {
			b = b*10+num%10;
			
			 num = num/10;
		}
		if (a==b) {
			System.out.println("the number is palindrome");
		}
		else {
			System.out.println("the number is not palindrome");
		}*/
// Q.5 given number is amstrong or not		
	/*	int num =371;
		int a =0;
       int b = 0;
       int c=num;
		while (num!=0) {
			a = num%10;
			b=b+(a*a*a);
			num = num/10;
		}
		if (b==c) {
			System.out.println("the number is amstrong");
		}
		else {
			System.out.println("the number is not amstrong");
		}	*/
//Q.6 find sum of the given digit number
	/*	int num =371;
		int a =0;
       int b = 0;
       while (num!=0) {
			a = num%10;
			b=a+b;
			num = num/10;
		}	
		System.out.println(b);*/
//Q.7 // find the count of given digit number		
	/*	int num =37117;
         int count=0;
		while (num!=0) {
		num = num/10;	
		count++;
		}
		System.out.println(count);*/
// Q.8 factorial of a given number
	/*	int num=5;
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact= fact*i;
		}
		System.out.println(fact);*/
// Q.9 find the fibonacci series of given number
		/*int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <=5; i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}*/
//Q.10 the given string is palindrome or not
	/*String s = "madam";
	String revs ="";
	for (int i =s.length()-1;i>=0; i--) {
		char c = s.charAt(i);
		revs=revs+c;
		
	}
	if (revs.equals(s)) {
		System.out.println("the given string is palindrome");
		
	}	
	else {
		System.out.println("the given string is not palindrome");
	}*/
		
//Q.11 remove the duplicate character from the string
	/*	String s = "raining here severely";
		Set<Character> s1 = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			s1.add(c);
		}
		
		for (Character x : s1) {
			System.out.println(x);
		}*/
		
// Q.12 remove duplicate word from the string
	/*	String s = "java sql oracle python selenium java sql";
		Set<String> s1 = new LinkedHashSet<>();
		String[] s2 = s.split(" ");
		for (String s3 : s2) {
			s1.add(s3);
		}
		
		for (String s4 : s1) {
			System.out.println(s4+" ");
		}*/
		
// Q.13 remove duplicate number from array and sort it in ascending order
	/*	int a[]= {10,40,50,20,30,10,60,20,50,40};
		Set<Integer> s = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			int v = a[i];
			s.add(v);
		}
		
		System.out.println(s);*/
		
// Q.14 sort the elements in descending order and ascending order
	/*	int a[]= {10,40,50,20,30,10,60,20,50,40};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {  //asc (a[i]>a[j])
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		for (int x : a) {
			System.out.println(x);
		}*/
		
// Q.15 occurence of character
	/*	String s = "automation";
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int j = 0; j <s.length(); j++) {
			char c = s.charAt(j);
			if (m.containsKey(c)) {
				Integer count = m.get(c);
				m.put(c, count+1);
			}
			else {
				m.put(c, 1);
			}
		}
		
		System.out.println(m);*/
		
// Q.16 to print triangle pattern
	/*	Scanner s = new Scanner(System.in);
		System.out.println("enter the no of lines...");
		int nooflines = s.nextInt();
		int row,column=0;
		for (row= 0; row < nooflines; row++) {
			for (column = 0; column <=row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
// Q.17 vowels and consonant 
	/*	String s = "automation testing";
		String s1 = s.replace(" ", "");
		String vow ="";
		int vowcount=0;
		String cons="";
		int conscount=0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vow=vow+c;
				vowcount++;
			}
			else {
				cons=cons+c;
				conscount++;
			}
			
			
			
		}
		System.out.println("vowels are : "+vow);
		System.out.println("vowels count: "+vowcount);
		System.out.println("consonants are: "+cons);
		System.out.println("consonants count: "+conscount);*/
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
