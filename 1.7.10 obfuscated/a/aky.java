import java.util.Random;

public class aky extends aji {

   protected aky() {
      super(awt.c);
      this.a(true);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.g(255);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return azt.a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 0), (double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1));
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!this.m(var1, var2, var3, var4) && !var1.y(var2, var3 + 1, var4)) {
         int var6 = var1.e(var2, var3, var4);
         if(var6 > 0) {
            var1.a(var2, var3, var4, var6 - 1, 2);
         } else if(!this.e(var1, var2, var3, var4)) {
            var1.b(var2, var3, var4, ajn.d);
         }
      } else {
         var1.a(var2, var3, var4, 7, 2);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5, float var6) {
      if(!var1.E && var1.s.nextFloat() < var6 - 0.5F) {
         if(!(var5 instanceof yz) && !var1.O().b("mobGriefing")) {
            return;
         }

         var1.b(var2, var3, var4, ajn.d);
      }

   }

   private boolean e(ahb var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var4 - var5; var7 <= var4 + var5; ++var7) {
            aji var8 = var1.a(var6, var3 + 1, var7);
            if(var8 == ajn.aj || var8 == ajn.bc || var8 == ajn.bb || var8 == ajn.bN || var8 == ajn.bM) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean m(ahb var1, int var2, int var3, int var4) {
      for(int var5 = var2 - 4; var5 <= var2 + 4; ++var5) {
         for(int var6 = var3; var6 <= var3 + 1; ++var6) {
            for(int var7 = var4 - 4; var7 <= var4 + 4; ++var7) {
               if(var1.a(var5, var6, var7).o() == awt.h) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      super.a(var1, var2, var3, var4, var5);
      awt var6 = var1.a(var2, var3 + 1, var4).o();
      if(var6.a()) {
         var1.b(var2, var3, var4, ajn.d);
      }

   }

   public adb a(int var1, Random var2, int var3) {
      return ajn.d.a(0, var2, var3);
   }
}
