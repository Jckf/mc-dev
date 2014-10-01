import java.util.List;
import java.util.Random;

public class aku extends aji {

   public aku() {
      super(awt.e);
   }

   public boolean c() {
      return false;
   }

   public int b() {
      return 26;
   }

   public void g() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      int var8 = var1.e(var2, var3, var4);
      if(b(var8)) {
         this.a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.g();
   }

   public static boolean b(int var0) {
      return (var0 & 4) != 0;
   }

   public adb a(int var1, Random var2, int var3) {
      return null;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = ((qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.a(var2, var3, var4, var7, 2);
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      return b(var6)?15:0;
   }
}
