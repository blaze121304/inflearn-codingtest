import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q_F1_SelectionSort {
    public static void main(String[] args) {

        String sol;
        Scanner in=new Scanner(System.in);
        String str= in.nextLine();
        System.out.println("str: " + str);

        sol = String.valueOf(solution(str));

        System.out.println("solution : " + sol);

    }

    private static ArrayList<String> solution(String str) {
        int swapInt = 0;
        int swapInd;
//        ArrayList<String> arrList = new ArrayList<>();
//
//        StringBuilder sb = new StringBuilder();
//        for(char ch : str.toCharArray()){
//            arrList.add(String.valueOf(ch));
//        }

        String[] arr = str.split(" ");
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));

        //10 2 4 5 3 6 8 1
        //1. arrList의 length만큼 순회
        for (int i = 0; i < arrList.size() -1; i++) {
            //2. arrList의 각 index의 숫자와 나머지 값의 가장 낮은 값을 swap
            swapInd = i;
            for (int j = i+1; j < arrList.size(); j++) { //3. 오름차순으로 index+1 형태로 진행
                if (Integer.parseInt(arrList.get(j)) < Integer.parseInt(arrList.get(swapInd))) {
                    swapInd = j; // 최소값 인덱스 수정하면서 검색
                }
            }
            System.out.println("swapInt : " + swapInt);
            System.out.println("swapInd : " + swapInd);
            if (i != swapInd) { //최소값이 자기 자신이 아닌경우
                String temp = arrList.get(i);
                arrList.set(i, arrList.get(swapInd));
                arrList.set(swapInd, temp);
            }

        }

        return arrList;

    }
}
