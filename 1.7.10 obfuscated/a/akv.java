import java.util.Random;

public class akv extends ajc {

   protected akv() {
      super(awt.e);
      this.a(abt.c);
      this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 22;
   }

   public adb a(int var1, Random var2, int var3) {
      return adb.a(ajn.Z);
   }

   public int a(Random var1) {
      return 8;
   }

   protected boolean E() {
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      byte var7 = 0;
      int var8 = qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3;
      if(var8 == 0) {
         var7 = 2;
      }

      if(var8 == 1) {
         var7 = 5;
      }

      if(var8 == 2) {
         var7 = 3;
      }

      if(var8 == 3) {
         var7 = 4;
      }

      var1.a(var2, var3, var4, var7, 2);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      aav var10 = var5.bS();
      ape var11 = (ape)var1.o(var2, var3, var4);
      if(var10 != null && var11 != null) {
         if(var1.a(var2, var3 + 1, var4).r()) {
            return true;
         } else if(var1.E) {
            return true;
         } else {
            var10.a(var11);
            var5.a((rb)var10);
            return true;
         }
      } else {
         return true;
      }
   }

   public aor a(ahb var1, int var2) {
      return new ape();
   }
}
