import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bk extends z {

   public String c() {
      return "execute";
   }

   public int a() {
      return 2;
   }

   public String c(ae var1) {
      return "commands.execute.usage";
   }

   public void a(ae var1, String[] var2) {
      if(var2.length < 5) {
         throw new dp("commands.execute.usage", new Object[0]);
      } else {
         wv var3 = a(var1, var2[0], wv.class);
         double var4 = b(var3.s, var2[1], false);
         double var6 = b(var3.t, var2[2], false);
         double var8 = b(var3.u, var2[3], false);
         dt var10 = new dt(var4, var6, var8);
         byte var11 = 4;
         if("detect".equals(var2[4]) && var2.length > 10) {
            aqu var12 = var1.e();
            double var13 = b(var4, var2[5], false);
            double var15 = b(var6, var2[6], false);
            double var17 = b(var8, var2[7], false);
            atr var19 = g(var1, var2[8]);
            int var20 = a(var2[9], -1, 15);
            dt var21 = new dt(var13, var15, var17);
            bec var22 = var12.p(var21);
            if(var22.c() != var19 || var20 >= 0 && var22.c().c(var22) != var20) {
               throw new di("commands.execute.failed", new Object[]{"detect", var3.d_()});
            }

            var11 = 10;
         }

         String var24 = a(var2, var11);
         bl var14 = new bl(this, var3, var1, var10, var4, var6, var8);
         ad var25 = MinecraftServer.M().O();

         try {
            int var16 = var25.a(var14, var24);
            if(var16 < 1) {
               throw new di("commands.execute.allInvocationsFailed", new Object[]{var24});
            }
         } catch (Throwable var23) {
            throw new di("commands.execute.failed", new Object[]{var24, var3.d_()});
         }
      }
   }

   public List a(ae var1, String[] var2, dt var3) {
      return var2.length == 1?a(var2, MinecraftServer.M().I()):(var2.length > 1 && var2.length <= 4?a(var2, 1, var3):(var2.length > 5 && var2.length <= 8 && "detect".equals(var2[4])?a(var2, 5, var3):(var2.length == 9 && "detect".equals(var2[4])?a(var2, atr.c.c()):null)));
   }

   public boolean b(String[] var1, int var2) {
      return var2 == 0;
   }
}
