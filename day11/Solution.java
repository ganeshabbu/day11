package day11;

import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int rem,sum =0 ;
        int temp =x;
        while(x!=0){
            rem = x%10;
            sum = sum*10+rem;
            x = x/10;
        }
        if(sum < Math.pow(-2,31) || sum > Math.pow(2,31)-1){
            return 0;
        }else {
            return sum;
        }
    }
    public static void main(String[] args) {
    	Solution s = new Solution();
    	Scanner sc =new Scanner(System.in);
    	int x = sc.nextInt();
    	System.out.println("Reversed number is:"+s.reverse(x));
    	sc.close();
    }
}