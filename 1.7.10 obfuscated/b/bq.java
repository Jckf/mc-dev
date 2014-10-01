import net.minecraft.server.MinecraftServer;

public class bq extends y {

   public boolean a(ac var1) {
      return MinecraftServer.I().N() || super.a(var1);
   }

   public String c() {
      return "seed";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.seed.usage";
   }

   public void b(ac var1, String[] var2) {
      Object var3 = var1 instanceof yz?((yz)var1).o:MinecraftServer.I().a(0);
      var1.a(new fr("commands.seed.success", new Object[]{Long.valueOf(((ahb)var3).H())}));
   }
}
