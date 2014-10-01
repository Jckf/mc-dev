import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ag extends y {

   public String c() {
      return "ban";
   }

   public int a() {
      return 3;
   }

   public String c(ac var1) {
      return "commands.ban.usage";
   }

   public boolean a(ac var1) {
      return MinecraftServer.I().ah().h().b() && super.a(var1);
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 1 && var2[0].length() > 0) {
         MinecraftServer var3 = MinecraftServer.I();
         GameProfile var4 = var3.ax().a(var2[0]);
         if(var4 == null) {
            throw new cd("commands.ban.failed", new Object[]{var2[0]});
         } else {
            String var5 = null;
            if(var2.length >= 2) {
               var5 = a(var1, var2, 1).c();
            }

            oq var6 = new oq(var4, (Date)null, var1.b_(), (Date)null, var5);
            var3.ah().h().a((ol)var6);
            mw var7 = var3.ah().a(var2[0]);
            if(var7 != null) {
               var7.a.c("You are banned from this server.");
            }

            a(var1, this, "commands.ban.success", new Object[]{var2[0]});
         }
      } else {
         throw new ci("commands.ban.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length >= 1?a(var2, MinecraftServer.I().E()):null;
   }
}
