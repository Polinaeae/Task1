import java.util.Random;

public class Main{
    public static void main (String[] args) {
        int[] car = new int[50];
        Random random = new Random();
        for (int i=0; i<50; i++){
            car[i]= 2000 + random.nextInt(26);
        }
        System.out.println("Годы выпуска авто");
        for (int i =0; i<50; i++){
            System.out.println(car[i] + " ");
        }
    }
}
