public class Break_Continue {
    public static void main(String[] args) {
        
        //int i = 1;
        
        // for (int i =0; i<=100; i++){

        //     System.out.println(i);

        //     if(i==34){

        //         System.out.println("Breaking  the loop");
        //         continue;
        //     }
        //     else{
        //         System.out.println("ytest000");
                
        //     }

        // }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;        /// Here it will break when i values matched with defined
            }
            System.out.println(i);
          }



          for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;     /// Here it will skip the value of i== which is 4 and print the rest values
            }
            System.out.println(i);
          }


        int i = 0;
        while (i < 10) {       
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
        }
    }


        while (i < 10) {
        System.out.println(i);
        i++;
        if (i == 4) {
            break;
        }
        }
    }        
}
