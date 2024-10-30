import java.util.Scanner;

public class Q_A1_FindString {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ind = 0;

        System.out.print("문자열을 입력하세요: ");
        String input = in.nextLine();
        System.out.print("찾을 문자열을 입력하세요: ");
        String input2 = in.nextLine();

        System.out.println("입력받은 문자열: " + input);
        System.out.println("찾을 문자열: " + input2);


        for (int i = 0; i < input.length(); i++) {

           if(String.valueOf(input.charAt(i)).toLowerCase().contains(input2.toLowerCase())){
               System.out.println(input.charAt(i));
               ind ++;
           }
        }

        System.out.println("개수 : " + ind);

    }


}
