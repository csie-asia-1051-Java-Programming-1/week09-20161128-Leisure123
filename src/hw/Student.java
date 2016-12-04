package hw;

import java.util.ArrayList;
public class Student {
	private String id , name;
	private ArrayList<Course>courList = new ArrayList<Course>();
	public Student(String name1 , String id1){
		name = name1 ; id = id1;
	}
	public void showInfo(){
		System.out.println("name:" + name);
		System.out.println("id:" + id);
		System.out.println("#of course:" + courList.size());
		for(int i = 0; i < courList.size(); i++){
			System.out.println("course name:" + courList.get(i).getName());
		}
	}
	public void addCourse(String name1 ,String id1){
		courList.add(new Course(name1,id1));
	}

}
