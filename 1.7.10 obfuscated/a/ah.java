import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ah extends y {

   public String c() {
      return "say";
   }

   public int a() {
      return 1;
   }

   public String c(ac var1) {
      return "commands.say.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length > 0 && var2[0].length() > 0) {
         fj var3 = a(var1, var2, 0, true);
         MinecraftServer.I().ah().a((fj)(new fr("chat.type.announcement", new Object[]{var1.b_(), var3})));
      } else {
         throw new ci("commands.say.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length >= 1?a(var2, MinecraftServer.I().E()):null;
   }
}
