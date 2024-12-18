public class Patterns_Stars {

    public static void main(String[] args) {

        star.pattern1();
        
    }

}

class star{
    
    static void pattern1(){

        int a =4;

        for(int i = a; i>0; i--){
            
            for(int j =0; j<i; j++){
            System.out.print("*");
        }
        System.out.print("\n");
    } 
}
}