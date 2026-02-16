import java.util.Random;

public class Main{
    public static void main (String[] args) {
        int[] car = new int[50];
        Random random = new Random();
        for (int i=0; i<50; i++){
            car[i]= 2000 + random.nextInt(26);
        }
        System.out.println("Средний возраст авто");
        int Sum = 0;
        int CurrentYear = 2026;
        for (int i = 0; i <50; i++){
            int age = CurrentYear - car[i];
            Sum = Sum +age;
        }
        double AverageAge = (double) Sum/50;
        System.out.print(AverageAge);
    }
}
