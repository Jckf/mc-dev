import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class be extends y {

   public String c() {
      return "pardon";
   }

   public int a() {
      return 3;
   }

   public String c(ac var1) {
      return "commands.unban.usage";
   }

   public boolean a(ac var1) {
      return MinecraftServer.I().ah().h().b() && super.a(var1);
   }

   public void b(ac var1, String[] var2) {
      if(var2.length == 1 && var2[0].length() > 0) {
         MinecraftServer var3 = MinecraftServer.I();
         GameProfile var4 = var3.ah().h().a(var2[0]);
         if(var4 == null) {
            throw new cd("commands.unban.failed", new Object[]{var2[0]});
         } else {
            var3.ah().h().c(var4);
            a(var1, this, "commands.unban.success", new Object[]{var2[0]});
         }
      } else {
         throw new ci("commands.unban.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, MinecraftServer.I().ah().h().a()):null;
   }
}
