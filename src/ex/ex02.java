package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 	並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
	ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021011 丁紹剛
 */
import java.util.ArrayList;
import java.util.Scanner;

import hw.Student;
public class ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <Student1> studList = new ArrayList <Student1>();
		boolean check = true;
		while(check){
			System.out.print("請輸入學號:");
			String id = scn.next();
			System.out.print("請輸入名字:");
			String name = scn.next();
			System.out.print("請輸入國文分數:");
			float c = scn.nextFloat();
			System.out.print("請輸入英文分數:");
			float e = scn.nextFloat();
			System.out.print("請輸入數學分數:");
			float m = scn.nextFloat();
			float avg = (c+e+m)/3;
			if(studList.size() == 0){
				studList.add(new Student1(id,name,c,e,m,avg));
			}else if(studList.size() == 1){
				if(studList.get(0).fun() > avg){
					studList.add(new Student1(id,name,c,e,m,avg));
				}else{
					studList.add(0,new Student1(id,name,c,e,m,avg));
				}
			}else{
				boolean flag = true ;
				int i = 0;
				while(flag && i < studList.size()-1){
					if(i == 0 && studList.get(0).fun() < avg){
						studList.add(0,new Student1(id,name,c,e,m,avg));
						flag = false;
					}else{
						if(studList.get(i).fun() > avg && studList.get(i+1).fun() <=avg){
							flag = false;
							studList.add(i+1,new Student1(id,name,c,e,m,avg));
						}else{
							i++;
						}
					}
				}
			}
//			studList.add(new Student1(id,name,c,e,m,avg));
			System.out.print("是否繼續輸入(Y/N)");
			char a = scn.next().charAt(0);
			if(a == 'n' || a == 'N'){
				check = false;
			}
		}
		for(int i = 0 ; i < studList.size() ; i++){
			studList.get(i).show();
			System.out.println();
		}
	}

}
