import java.util.Random;

public class Array{
public static void main(String[] arg){
    Random dice = new Random();
    int x = 0;
    int y;
    while(x < 5){
        y = dice.nextInt(6);
        System.out.println(y+1+"\t");
        ++x;
    }

}  

}