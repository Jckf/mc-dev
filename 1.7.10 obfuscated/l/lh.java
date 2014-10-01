import net.minecraft.server.MinecraftServer;

public class lh implements qk {

   private long b;
   // $FF: synthetic field
   final MinecraftServer a;


   public lh(MinecraftServer var1) {
      this.a = var1;
      this.b = MinecraftServer.ar();
   }

   public void a(String var1) {}

   public void a(int var1) {
      if(MinecraftServer.ar() - this.b >= 1000L) {
         this.b = MinecraftServer.ar();
         MinecraftServer.aA().info("Converting... " + var1 + "%");
      }

   }

   public void c(String var1) {}
}
