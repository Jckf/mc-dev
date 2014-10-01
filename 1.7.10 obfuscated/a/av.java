import java.util.List;
import net.minecraft.server.MinecraftServer;

public class av extends y {

   public String c() {
      return "kick";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.kick.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length > 0 && var2[0].length() > 1) {
         mw var3 = MinecraftServer.I().ah().a(var2[0]);
         String var4 = "Kicked by an operator.";
         boolean var5 = false;
         if(var3 == null) {
            throw new cg();
         } else {
            if(var2.length >= 2) {
               var4 = a(var1, var2, 1).c();
               var5 = true;
            }

            var3.a.c(var4);
            if(var5) {
               a(var1, this, "commands.kick.success.reason", new Object[]{var3.b_(), var4});
            } else {
               a(var1, this, "commands.kick.success", new Object[]{var3.b_()});
            }

         }
      } else {
         throw new ci("commands.kick.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length >= 1?a(var2, MinecraftServer.I().E()):null;
   }
}
