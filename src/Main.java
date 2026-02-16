import java.util.Random;

public class Main{
    public static void main (String[] args) {
        int[] car = new int[50];
        Random random = new Random();
        for (int i=0; i<50; i++){
            car[i]= 2000 + random.nextInt(26);
        }
        System.out.println("Авто выпущены после 2015");
            int auto2015 = 0;
            for (int i=0; i<50; i++){
                if(car[i]>2015){
                    System.out.print(car[i] + " ");
                    auto2015++;
                }
            }
        }
}
