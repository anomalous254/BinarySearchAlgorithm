// SOEN 305

import java.util.Scanner;

// Main class
public class Main{
    public static void main(String[] args){

        int count = 0;

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter Max Num to iterate: ");
            int max = scanner.nextInt();


            while(count <= max){
                System.out.println("Testing " + count);
                count ++;
            }
        }
    }
}