import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_A3_WoldsInSentence {

    public static void main(String[] args) {

        String sol;
        Scanner in=new Scanner(System.in);
        String str= in.nextLine();
        System.out.println("str: " + str);

        sol = solution(str);

        System.out.println("solution : " + sol);

    }

    private static String solution(String str) {

        StringTokenizer st = new StringTokenizer(str," ");
        String temp;
        String sol = "";
        int length = 0;

        //문장을 띄어쓰기 별로 토큰 분리
        while(st.hasMoreTokens()){
            temp = st.nextToken();  //다음 토큰 세기
            System.out.println("token : " + temp + " length : " + temp.length());
                // 이전에 분리한 단어의 길이가 새 토큰의 길이보다 짧다면
                if(length < temp.length()){
                    length = temp.length();
                    sol = temp; //정답군의 단어를 교체
                    System.out.println("sol is : " + sol);
                }
        }

        System.out.println("final sol is : " + sol);
        return str;
    }
}
