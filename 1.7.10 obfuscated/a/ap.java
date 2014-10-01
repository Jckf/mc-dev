import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ap extends y {

   public String c() {
      return "xp";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.xp.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length <= 0) {
         throw new ci("commands.xp.usage", new Object[0]);
      } else {
         String var4 = var2[0];
         boolean var5 = var4.endsWith("l") || var4.endsWith("L");
         if(var5 && var4.length() > 1) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         int var6 = a(var1, var4);
         boolean var7 = var6 < 0;
         if(var7) {
            var6 *= -1;
         }

         mw var3;
         if(var2.length > 1) {
            var3 = d(var1, var2[1]);
         } else {
            var3 = b(var1);
         }

         if(var5) {
            if(var7) {
               var3.a(-var6);
               a(var1, this, "commands.xp.success.negative.levels", new Object[]{Integer.valueOf(var6), var3.b_()});
            } else {
               var3.a(var6);
               a(var1, this, "commands.xp.success.levels", new Object[]{Integer.valueOf(var6), var3.b_()});
            }
         } else {
            if(var7) {
               throw new ci("commands.xp.failure.widthdrawXp", new Object[0]);
            }

            var3.v(var6);
            a(var1, this, "commands.xp.success", new Object[]{Integer.valueOf(var6), var3.b_()});
         }

      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 2?a(var2, this.d()):null;
   }

   protected String[] d() {
      return MinecraftServer.I().E();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 1;
   }
}
