import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ai extends y {

   public String c() {
      return "clear";
   }

   public String c(ac var1) {
      return "commands.clear.usage";
   }

   public int a() {
      return 2;
   }

   public void b(ac var1, String[] var2) {
      mw var3 = var2.length == 0?b(var1):d(var1, var2[0]);
      adb var4 = var2.length >= 2?f(var1, var2[1]):null;
      int var5 = var2.length >= 3?a(var1, var2[2], 0):-1;
      if(var2.length >= 2 && var4 == null) {
         throw new cd("commands.clear.failure", new Object[]{var3.b_()});
      } else {
         int var6 = var3.bm.a(var4, var5);
         var3.bn.b();
         if(!var3.bE.d) {
            var3.l();
         }

         if(var6 == 0) {
            throw new cd("commands.clear.failure", new Object[]{var3.b_()});
         } else {
            a(var1, this, "commands.clear.success", new Object[]{var3.b_(), Integer.valueOf(var6)});
         }
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, this.d()):(var2.length == 2?a(var2, adb.e.b()):null);
   }

   protected String[] d() {
      return MinecraftServer.I().E();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
