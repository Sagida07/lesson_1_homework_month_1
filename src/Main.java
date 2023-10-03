import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String mySchoolNumber;

        //can use year of birth
        final int NUM = 29;

        String word = " school";

        mySchoolNumber = NUM + word;
        System.out.println(mySchoolNumber);


        if (NUM > 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM < 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили 0");
        }

        System.out.println("Введите ваше имя: ");
        Scanner run = new Scanner(System.in);
        String name = run.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
