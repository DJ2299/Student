public class Array1{
    public static void main(String[] arg){
 
         int x[] = {1,2,3,4};
         change(x);
         for(int j: x)
             System.out.println(j);
         
                 }
public static void change(int d[]){
    for(int counter =0;counter<d.length;counter++){
        d[counter]=d[counter]+1;
    }
}
}