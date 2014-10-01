import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class cc extends y {

   public String c() {
      return "whitelist";
   }

   public int a() {
      return 3;
   }

   public String c(ac var1) {
      return "commands.whitelist.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 1) {
         MinecraftServer var3 = MinecraftServer.I();
         if(var2[0].equals("on")) {
            var3.ah().a(true);
            a(var1, this, "commands.whitelist.enabled", new Object[0]);
            return;
         }

         if(var2[0].equals("off")) {
            var3.ah().a(false);
            a(var1, this, "commands.whitelist.disabled", new Object[0]);
            return;
         }

         if(var2[0].equals("list")) {
            var1.a(new fr("commands.whitelist.list", new Object[]{Integer.valueOf(var3.ah().l().length), Integer.valueOf(var3.ah().q().length)}));
            String[] var5 = var3.ah().l();
            var1.a(new fq(a(var5)));
            return;
         }

         GameProfile var4;
         if(var2[0].equals("add")) {
            if(var2.length < 2) {
               throw new ci("commands.whitelist.add.usage", new Object[0]);
            }

            var4 = var3.ax().a(var2[1]);
            if(var4 == null) {
               throw new cd("commands.whitelist.add.failed", new Object[]{var2[1]});
            }

            var3.ah().d(var4);
            a(var1, this, "commands.whitelist.add.success", new Object[]{var2[1]});
            return;
         }

         if(var2[0].equals("remove")) {
            if(var2.length < 2) {
               throw new ci("commands.whitelist.remove.usage", new Object[0]);
            }

            var4 = var3.ah().k().a(var2[1]);
            if(var4 == null) {
               throw new cd("commands.whitelist.remove.failed", new Object[]{var2[1]});
            }

            var3.ah().c(var4);
            a(var1, this, "commands.whitelist.remove.success", new Object[]{var2[1]});
            return;
         }

         if(var2[0].equals("reload")) {
            var3.ah().a();
            a(var1, this, "commands.whitelist.reloaded", new Object[0]);
            return;
         }
      }

      throw new ci("commands.whitelist.usage", new Object[0]);
   }

   public List a(ac var1, String[] var2) {
      if(var2.length == 1) {
         return a(var2, new String[]{"on", "off", "list", "add", "remove", "reload"});
      } else {
         if(var2.length == 2) {
            if(var2[0].equals("remove")) {
               return a(var2, MinecraftServer.I().ah().l());
            }

            if(var2[0].equals("add")) {
               return a(var2, MinecraftServer.I().ax().a());
            }
         }

         return null;
      }
   }
}
