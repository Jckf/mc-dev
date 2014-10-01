import java.util.Random;

public class alo extends aji {

   private static final String[] a = new String[]{"skin_brown", "skin_red"};
   private final int b;


   public alo(awt var1, int var2) {
      super(var1);
      this.b = var2;
   }

   public int a(Random var1) {
      int var2 = var1.nextInt(10) - 7;
      if(var2 < 0) {
         var2 = 0;
      }

      return var2;
   }

   public adb a(int var1, Random var2, int var3) {
      return adb.d(aji.b((aji)ajn.P) + this.b);
   }

}
