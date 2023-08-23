package ReviewQuestions;
import java.util.Scanner;
public class LoopPractice2 {
    public static void main(String[] args) {
        //2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        while(number > 0){
            sum += number;

        }
        System.out.println(sum);

    }

}
