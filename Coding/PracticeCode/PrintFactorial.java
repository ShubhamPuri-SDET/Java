

public class PrintFactorial {

    public static void main(String[] args) {

        //factorial == n*n-1
        
        int a = 5;
        int factorial = 1;
        int i =1;

        while(i<=a){

          factorial = factorial*i;
          i++;
        }   System.out.println(factorial);
    }
    
}
