import net.minecraft.server.MinecraftServer;

public class bg extends y {

   public String c() {
      return "publish";
   }

   public String c(ac var1) {
      return "commands.publish.usage";
   }

   public void b(ac var1, String[] var2) {
      String var3 = MinecraftServer.I().a(ahk.b, false);
      if(var3 != null) {
         a(var1, this, "commands.publish.started", new Object[]{var3});
      } else {
         a(var1, this, "commands.publish.failed", new Object[0]);
      }

   }
}
