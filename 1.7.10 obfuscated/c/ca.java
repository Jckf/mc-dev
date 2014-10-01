import net.minecraft.server.MinecraftServer;

public class ca extends y {

   public String c() {
      return "toggledownfall";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.downfall.usage";
   }

   public void b(ac var1, String[] var2) {
      this.d();
      a(var1, this, "commands.downfall.success", new Object[0]);
   }

   protected void d() {
      ays var1 = MinecraftServer.I().c[0].N();
      var1.b(!var1.p());
   }
}
