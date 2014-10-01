import net.minecraft.server.MinecraftServer;

public class ay extends y {

   public String c() {
      return "list";
   }

   public int a() {
      return 0;
   }

   public String c(ac var1) {
      return "commands.players.usage";
   }

   public void b(ac var1, String[] var2) {
      var1.a(new fr("commands.players.list", new Object[]{Integer.valueOf(MinecraftServer.I().C()), Integer.valueOf(MinecraftServer.I().D())}));
      var1.a(new fq(MinecraftServer.I().ah().b(var2.length > 0 && "uuids".equalsIgnoreCase(var2[0]))));
   }
}
