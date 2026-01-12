package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Loops {

    public Loops(){
        //Generic constructor
    }

    //Example printing out prime numbers
    public void forLoopExample(int num){
        for(int i = 0; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    //Example of multiple variables
    public void reverseArray(int[] numberArray){
        for(int i = 0, j = numberArray.length -1 ; i < j; i++, j--){
            int temp = numberArray[i];
            numberArray[i] = numberArray[j];
            numberArray[j] = temp;
        }
        System.out.println(Arrays.toString(numberArray));
    }

}
