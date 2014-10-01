import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public class lm implements Callable {

   // $FF: synthetic field
   final MinecraftServer a;


   public lm(MinecraftServer var1) {
      this.a = var1;
   }

   public String a() {
      return MinecraftServer.a(this.a).o() + " / " + MinecraftServer.a(this.a).p() + "; " + MinecraftServer.a(this.a).e;
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
