import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public class ll implements Callable {

   // $FF: synthetic field
   final MinecraftServer a;


   public ll(MinecraftServer var1) {
      this.a = var1;
   }

   public String a() {
      byte var1 = 0;
      int var2 = 56 * var1;
      int var3 = var2 / 1024 / 1024;
      byte var4 = 0;
      int var5 = 56 * var4;
      int var6 = var5 / 1024 / 1024;
      return var1 + " (" + var2 + " bytes; " + var3 + " MB) allocated, " + var4 + " (" + var5 + " bytes; " + var6 + " MB) used";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
