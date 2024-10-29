import java.util.Scanner;

public class Q2_ConvertCase {
    public static void main(String[] args) {
        String sol;
        Scanner in=new Scanner(System.in);
        String str= in.nextLine();
        System.out.println("STR: " + str);

        sol = solution(str);

        System.out.println("solution : " + sol);

    }

    public static String solution(String input1) {
//        String answer = "";
//        for (int i = 0; i < input1.length(); i++) {
//            if(Character.isLowerCase(input1.charAt(i))){
//               answer += Character.toUpperCase(input1.charAt(i));
//            }else {
//                answer += Character.toLowerCase(input1.charAt(i));
//            }
//        }

        StringBuilder answer = new StringBuilder(); //for each
        for(char ch : input1.toCharArray() ){
            if(Character.isLowerCase(ch)){
                answer.append(Character.toUpperCase(ch));
            }else {
                answer.append(Character.toLowerCase(ch));
            }
        }
        return answer.toString();
    }
}
