import java.util.List;
import net.minecraft.server.MinecraftServer;

public class cd extends z {

   public String c() {
      return "playsound";
   }

   public int a() {
      return 2;
   }

   public String c(ae var1) {
      return "commands.playsound.usage";
   }

   public void a(ae var1, String[] var2) {
      if(var2.length < 2) {
         throw new dp(this.c(var1), new Object[0]);
      } else {
         byte var3 = 0;
         int var31 = var3 + 1;
         String var4 = var2[var3];
         qw var5 = a(var1, var2[var31++]);
         brw var6 = var1.d();
         double var7 = var6.a;
         if(var2.length > var31) {
            var7 = b(var7, var2[var31++], true);
         }

         double var9 = var6.b;
         if(var2.length > var31) {
            var9 = b(var9, var2[var31++], 0, 0, false);
         }

         double var11 = var6.c;
         if(var2.length > var31) {
            var11 = b(var11, var2[var31++], true);
         }

         double var13 = 1.0D;
         if(var2.length > var31) {
            var13 = a(var2[var31++], 0.0D, 3.4028234663852886E38D);
         }

         double var15 = 1.0D;
         if(var2.length > var31) {
            var15 = a(var2[var31++], 0.0D, 2.0D);
         }

         double var17 = 0.0D;
         if(var2.length > var31) {
            var17 = a(var2[var31], 0.0D, 1.0D);
         }

         double var19 = var13 > 1.0D?var13 * 16.0D:16.0D;
         double var21 = var5.f(var7, var9, var11);
         if(var21 > var19) {
            if(var17 <= 0.0D) {
               throw new di("commands.playsound.playerTooFar", new Object[]{var5.d_()});
            }

            double var23 = var7 - var5.s;
            double var25 = var9 - var5.t;
            double var27 = var11 - var5.u;
            double var29 = Math.sqrt(var23 * var23 + var25 * var25 + var27 * var27);
            if(var29 > 0.0D) {
               var7 = var5.s + var23 / var29 * 2.0D;
               var9 = var5.t + var25 / var29 * 2.0D;
               var11 = var5.u + var27 / var29 * 2.0D;
            }

            var13 = var17;
         }

         var5.a.a((id)(new jv(var4, var7, var9, var11, (float)var13, (float)var15)));
         a(var1, this, "commands.playsound.success", new Object[]{var4, var5.d_()});
      }
   }

   public List a(ae var1, String[] var2, dt var3) {
      return var2.length == 2?a(var2, MinecraftServer.M().I()):(var2.length > 2 && var2.length <= 5?a(var2, 2, var3):null);
   }

   public boolean b(String[] var1, int var2) {
      return var2 == 1;
   }
}
