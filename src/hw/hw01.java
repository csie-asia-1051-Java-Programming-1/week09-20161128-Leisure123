package hw;
/*
 * Topic: 讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，
有些正整數並不能找出連續整數，若找不到時，請印出「No」。
 例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fun(n);
	}
	public static void fun(int n){
		int sum = 0; 
        boolean check = false; 
        for(int j = 1 ; j < (n/2)+1 ; j++){
            for (int i = j; i <= n; i++) {  
                sum += i;  
                if (n == sum) {  
                    check = true; 
                    for (int k = j; k <= i; k++) {  
                        System.out.print(k + " ");  
                    }  
                    System.out.println();
                }  
            }  
            sum = 0;  //歸零用~
        }  
        if (check == false) {  
            System.out.println("NONE");  
        }  
	}

}