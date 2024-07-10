package Loops.java;

public class EvenOddNumberFrom1to100 {
    public static void main(String[] args) {
        System.out.println("Even Numbers from 1 to 100");
        for (int i = 1; i <= 100; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("Odd Numbers from 1 to 100");
        for (int i = 1; i <= 100; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
