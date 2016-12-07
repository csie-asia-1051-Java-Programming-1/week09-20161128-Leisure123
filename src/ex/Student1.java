package ex;

import java.util.Scanner;
public class Student1 {
	private String id , name;
	private float chinese , english , math , avr;
	public Student1(String id1,String name1,float c ,float e ,float m,float avg){
		id = id1 ;
		name = name1;
		chinese = c;
		english = e;
		math = m;
		avr = avg;
	}
	public float fun(){
		return avr;
	}
	public void show(){
		System.out.print(id + "\t" + name +"\t" + chinese +
						"\t" + english +"\t" + math +"\t" + avr);
	}

}
