package stack;

import java.util.Arrays;

public class customFilledArray {
    public  static  void main(String[] args){

        String arr[] = new String[5];
        Arrays.fill(arr, "Arvind");
        arr[0] = "1";
        arr[1] = "3";
        arr[2] = "4";



        System.out.println(Arrays.toString(arr));
    }
}
