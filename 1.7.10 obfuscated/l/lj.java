import net.minecraft.server.MinecraftServer;

public class lj extends Thread {

   // $FF: synthetic field
   final MinecraftServer a;


   public lj(MinecraftServer var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      this.a.run();
   }
}
