public class VarArgs {  

    public static void main(String[] args) {
        
        fun(4,7,8,8,8,65,56,79,424,5,4,456,456,8,7);
        multiple(10, "apple", "banana", "cherry");
    }

    static void fun(int ...a){
        System.out.println("Integer VarArgs: " + java.util.Arrays.toString(a));
    }
    
    static void multiple (int d, String ... c){
        System.out.println("Multiple VarArgs: " + d + " " + java.util.Arrays.toString(c));
    }
}


//Here you can store multiple values which is store in the form of arrays. This is called as VarArgs.