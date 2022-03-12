package utils;

import java.util.ArrayList;
import java.util.List;

public class Temp {

    public static void main(String[] args) {
        //first example
        int i = 1;
        while(Math.pow(5, i) < 10000){
            System.out.println(Math.pow(5, i));
            i ++;
        }

        //second example

        for(int j = 1; j < 100; j++){
            if(Math.pow(5, j) < 10000){
                System.out.println(Math.pow(5, j));
            }
        }
        //third example
        List<Double> result = new ArrayList<>();
        for(int k = 1;; k++){
            if(Math.pow(5, k) < 10000){
                result.add(Math.pow(5, k));
            }
            else break;
        }
        result.forEach(System.out::println);

        //firth example
        int res = 5;
        for(;;){
            if (res < 10000){
                System.out.println(res);
                res *= 5;
            }
            else break;

        }

        for (int h = 40; h <=60; h+= 4){
            if(h % 4 == 0){
                System.out.println(h);
            }
        }
    }
}
