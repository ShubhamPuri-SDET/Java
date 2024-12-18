// Source code is decompiled from a .class file using FernFlower decompiler.



public class Singelton {
   private static Singelton instance;
   private int num;

   private Singelton(int var1) {
      this.num = var1;
      System.out.println(var1);
      ++this.num;
   }

   public static Singelton getInstance(int var0) {
      if (instance == null) {
         instance = new Singelton(var0);
      }

      return instance;
   }

   public static void main(String[] var0) {
      Singelton var1 = getInstance(10);
   }
}
