/**
 * Created by kaito on 20/6/16.
 */

import java.util.Scanner;

public class Employee {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int satu = s.nextInt();
        System.out.print("Enter your next value: ");
        int dua = s.nextInt();
        System.out.print(total(getSalary(satu,dua)));

    }

    private static int getSalary(int satu, int dua){
        return satu+dua;
    }
    private static int total(int t){
        return t+1;
    }


}
