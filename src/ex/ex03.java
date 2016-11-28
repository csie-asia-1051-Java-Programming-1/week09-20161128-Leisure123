package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個數字:");
		int n = scn.nextInt();
		int sum = 0;
		System.out.print("此數的因數有:");
		for(int j = 1 ; j <= n ; j++){
			if(n % j == 0){
				System.out.print(j+" ");
				sum++;
			}
		}
		System.out.println();
		if(sum == 2){
			System.out.println("此數為質數!");
		}else{
			System.out.println("此數非質數!");
		}
	}
}
