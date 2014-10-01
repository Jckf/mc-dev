import net.minecraft.server.MinecraftServer;

public class bt extends y {

   public String c() {
      return "stop";
   }

   public String c(ac var1) {
      return "commands.stop.usage";
   }

   public void b(ac var1, String[] var2) {
      if(MinecraftServer.I().c != null) {
         a(var1, this, "commands.stop.start", new Object[0]);
      }

      MinecraftServer.I().r();
   }
}
