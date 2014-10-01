import java.util.List;
import net.minecraft.server.MinecraftServer;

public class an extends y {

   public String c() {
      return "me";
   }

   public int a() {
      return 0;
   }

   public String c(ac var1) {
      return "commands.me.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length > 0) {
         fj var3 = a(var1, var2, 0, var1.a(1, "me"));
         MinecraftServer.I().ah().a((fj)(new fr("chat.type.emote", new Object[]{var1.c_(), var3})));
      } else {
         throw new ci("commands.me.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return a(var2, MinecraftServer.I().E());
   }
}
