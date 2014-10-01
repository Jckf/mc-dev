import java.util.Random;

public class aly extends aji {

   protected aly() {
      super(awt.C);
      this.a(abt.b);
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.ba;
   }

   public int a(Random var1) {
      return 3 + var1.nextInt(5);
   }

   public int a(int var1, Random var2) {
      int var3 = this.a(var2) + var2.nextInt(1 + var1);
      if(var3 > 9) {
         var3 = 9;
      }

      return var3;
   }
}
