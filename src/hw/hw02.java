package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 1;
		for(int i = 1 ; sum <= n ; i++){
			System.out.print(sum+ " ");
			sum = sum + i;
		}
		System.out.print("\n");
		for(int i = 1 ; i <= n ; i++){
			for(int j = i ; j > 0 ; j--){
				System.out.print(i + " ");
			}
		}

	}

}
