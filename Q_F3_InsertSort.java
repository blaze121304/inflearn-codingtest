import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q_F3_InsertSort {
    public static void main(String[] args) {
        String sol;
        Scanner in=new Scanner(System.in);

        String str= in.nextLine();
        System.out.println("str: " + str);

        sol = String.valueOf(solution(str));

        System.out.println("solution : " + sol);
    }

    private static ArrayList<String> solution(String str) {
        int swapInt;
        int swapInd = 0;

        String[] arr = str.split(" ");
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));

        System.out.println(arrList);


        while (true){
            
            if(swapInd == str.length()){break;}
            else{
                for (int i = 1; i < arrList.size(); i--) {

                    System.out.println(arrList.get(i));

                }

            }
            
        }

        System.out.println(arrList);

        return arrList;

    }
}
