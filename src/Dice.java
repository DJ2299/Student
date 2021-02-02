import java.util.Random;

public class Dice{
    public static void main(String[] arg){
        Random x = new Random();
        int[] dice = new int[6];
        for(int i=1;i<10;i++){
            ++dice[1+x.nextInt(6)];

        }
        System.out.println("TRIAL"+"\t"+"OUTCOME");
        for(int j=0;j<dice.length;j++){
            System.out.println(j+"\t"+dice[3]);
        }
    }
}