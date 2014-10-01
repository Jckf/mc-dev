import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bp extends y {

   public String c() {
      return "spawnpoint";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.spawnpoint.usage";
   }

   public void b(ac var1, String[] var2) {
      mw var3 = var2.length == 0?b(var1):d(var1, var2[0]);
      if(var2.length == 4) {
         if(var3.o != null) {
            byte var4 = 1;
            int var5 = 30000000;
            int var9 = var4 + 1;
            int var6 = a(var1, var2[var4], -var5, var5);
            int var7 = a(var1, var2[var9++], 0, 256);
            int var8 = a(var1, var2[var9++], -var5, var5);
            var3.a(new r(var6, var7, var8), true);
            a(var1, this, "commands.spawnpoint.success", new Object[]{var3.b_(), Integer.valueOf(var6), Integer.valueOf(var7), Integer.valueOf(var8)});
         }
      } else {
         if(var2.length > 1) {
            throw new ci("commands.spawnpoint.usage", new Object[0]);
         }

         r var10 = var3.f_();
         var3.a(var10, true);
         a(var1, this, "commands.spawnpoint.success", new Object[]{var3.b_(), Integer.valueOf(var10.a), Integer.valueOf(var10.b), Integer.valueOf(var10.c)});
      }

   }

   public List a(ac var1, String[] var2) {
      return var2.length != 1 && var2.length != 2?null:a(var2, MinecraftServer.I().E());
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
