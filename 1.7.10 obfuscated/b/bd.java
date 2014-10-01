import java.util.List;
import java.util.regex.Matcher;
import net.minecraft.server.MinecraftServer;

public class bd extends y {

   public String c() {
      return "pardon-ip";
   }

   public int a() {
      return 3;
   }

   public boolean a(ac var1) {
      return MinecraftServer.I().ah().i().b() && super.a(var1);
   }

   public String c(ac var1) {
      return "commands.unbanip.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length == 1 && var2[0].length() > 1) {
         Matcher var3 = af.a.matcher(var2[0]);
         if(var3.matches()) {
            MinecraftServer.I().ah().i().c(var2[0]);
            a(var1, this, "commands.unbanip.success", new Object[]{var2[0]});
         } else {
            throw new cf("commands.unbanip.invalid", new Object[0]);
         }
      } else {
         throw new ci("commands.unbanip.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, MinecraftServer.I().ah().i().a()):null;
   }
}
