import java.util.List;
import net.minecraft.server.MinecraftServer;

public class cp extends z {

   public String c() {
      return "spawnpoint";
   }

   public int a() {
      return 2;
   }

   public String c(ae var1) {
      return "commands.spawnpoint.usage";
   }

   public void a(ae var1, String[] var2) {
      if(var2.length > 0 && var2.length < 4) {
         throw new dp("commands.spawnpoint.usage", new Object[0]);
      } else {
         qw var3 = var2.length > 0?a(var1, var2[0]):b(var1);
         dt var4 = var2.length > 3?a(var1, var2, 1, true):var3.c();
         if(var3.o != null) {
            var3.a(var4, true);
            a(var1, this, "commands.spawnpoint.success", new Object[]{var3.d_(), Integer.valueOf(var4.n()), Integer.valueOf(var4.o()), Integer.valueOf(var4.p())});
         }

      }
   }

   public List a(ae var1, String[] var2, dt var3) {
      return var2.length == 1?a(var2, MinecraftServer.M().I()):(var2.length > 1 && var2.length <= 4?a(var2, 1, var3):null);
   }

   public boolean b(String[] var1, int var2) {
      return var2 == 0;
   }
}
