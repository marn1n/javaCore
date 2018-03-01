package Snail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] mas = randomArray(5,5,500);
//        for (int i = 0; i < mas.length; i++){
//            for (int j = 0; j < mas.length; j++){
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas.length; j++){
                Arrays.sort(mas[j]);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }


    }
    public static int[][] randomArray(int a, int b, int bound){
        int[][] array = new int[a][b];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = new Random().nextInt(bound);
            }
        }
        return array;
    }
//    public static int[] twoDToOne(int a, int b){
//        int[] tempArray = {}
//    }
}
