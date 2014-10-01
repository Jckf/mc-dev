import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class aj extends y {

   public String c() {
      return "deop";
   }

   public int a() {
      return 3;
   }

   public String c(ac var1) {
      return "commands.deop.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length == 1 && var2[0].length() > 0) {
         MinecraftServer var3 = MinecraftServer.I();
         GameProfile var4 = var3.ah().m().a(var2[0]);
         if(var4 == null) {
            throw new cd("commands.deop.failed", new Object[]{var2[0]});
         } else {
            var3.ah().b(var4);
            a(var1, this, "commands.deop.success", new Object[]{var2[0]});
         }
      } else {
         throw new ci("commands.deop.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, MinecraftServer.I().ah().n()):null;
   }
}
