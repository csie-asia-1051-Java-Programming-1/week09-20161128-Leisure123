package ex;

import java.util.ArrayList;
public class Student {
	
	private String id , name;
	private ArrayList <Course> courList = new ArrayList<Course>();
	public Student(String name1 , String id1){
		name = name1;
		id = id1;
	}
	public void show(){
		System.out.println("name:" + name);
		System.out.println("id:" + id);
	}

}
