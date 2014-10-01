
public class bf extends y {

   public String c() {
      return "playsound";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.playsound.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 2) {
         throw new ci(this.c(var1), new Object[0]);
      } else {
         byte var3 = 0;
         int var36 = var3 + 1;
         String var4 = var2[var3];
         mw var5 = d(var1, var2[var36++]);
         double var6 = (double)var5.f_().a;
         double var8 = (double)var5.f_().b;
         double var10 = (double)var5.f_().c;
         double var12 = 1.0D;
         double var14 = 1.0D;
         double var16 = 0.0D;
         if(var2.length > var36) {
            var6 = a(var1, var6, var2[var36++]);
         }

         if(var2.length > var36) {
            var8 = a(var1, var8, var2[var36++], 0, 0);
         }

         if(var2.length > var36) {
            var10 = a(var1, var10, var2[var36++]);
         }

         if(var2.length > var36) {
            var12 = a(var1, var2[var36++], 0.0D, 3.4028234663852886E38D);
         }

         if(var2.length > var36) {
            var14 = a(var1, var2[var36++], 0.0D, 2.0D);
         }

         if(var2.length > var36) {
            var16 = a(var1, var2[var36++], 0.0D, 1.0D);
         }

         double var18 = var12 > 1.0D?var12 * 16.0D:16.0D;
         double var20 = var5.f(var6, var8, var10);
         if(var20 > var18) {
            if(var16 <= 0.0D) {
               throw new cd("commands.playsound.playerTooFar", new Object[]{var5.b_()});
            }

            double var22 = var6 - var5.s;
            double var24 = var8 - var5.t;
            double var26 = var10 - var5.u;
            double var28 = Math.sqrt(var22 * var22 + var24 * var24 + var26 * var26);
            double var30 = var5.s;
            double var32 = var5.t;
            double var34 = var5.u;
            if(var28 > 0.0D) {
               var30 += var22 / var28 * 2.0D;
               var32 += var24 / var28 * 2.0D;
               var34 += var26 / var28 * 2.0D;
            }

            var5.a.a((ft)(new hc(var4, var30, var32, var34, (float)var16, (float)var14)));
         } else {
            var5.a.a((ft)(new hc(var4, var6, var8, var10, (float)var12, (float)var14)));
         }

         a(var1, this, "commands.playsound.success", new Object[]{var4, var5.b_()});
      }
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 1;
   }
}
