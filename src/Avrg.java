public class Avrg{
        public static void main(String[] arg){
                avg(87,97,6,97,99,234,5,76,976);

        }
        
        public static void avg(int...numbers){
           int j=0;
           for(int i=0;i<numbers.length;i++){
           j+=numbers[i];
         }System.out.println("YOUR TOTAL IS : "+j);

                   System.out.println("THIS IS YOUR AVERAGE : ");
        System.out.println(j/numbers.length);

        }
}