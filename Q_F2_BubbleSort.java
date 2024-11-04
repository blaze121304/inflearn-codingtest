import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q_F2_BubbleSort {
    public static void main(String[] args) {

        String sol;
        Scanner in=new Scanner(System.in);

        int len = Integer.parseInt(in.nextLine());
        System.out.println("length: " + len);

        String str= in.nextLine();
        System.out.println("str: " + str);

        sol = String.valueOf(solution(str,len));

        System.out.println("solution : " + sol);

    }

    private static ArrayList<String> solution(String str, int len) {
        int swapInt;
        //int swapInd;

        String[] arr = str.split(" ");
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));

        while (true){

            swapInt = 0;
            for (int i = 0; i < len-1; i++) {

                if(Integer.parseInt(arrList.get(i)) > Integer.parseInt(arrList.get(i+1))){
                    String temp = arrList.get(i);
                    String temp2 = arrList.get(i+1);
                    arrList.set(i+1,temp);
                    arrList.set(i,temp2);
                    swapInt++;
                }
            }
            if(swapInt == 0){break;}

        }

        System.out.println(arrList);

        return arrList;

    }
}
