import java.util.List;
import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class cb extends y {

   public String c() {
      return "weather";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.weather.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 1 && var2.length <= 2) {
         int var3 = (300 + (new Random()).nextInt(600)) * 20;
         if(var2.length >= 2) {
            var3 = a(var1, var2[1], 1, 1000000) * 20;
         }

         mt var4 = MinecraftServer.I().c[0];
         ays var5 = var4.N();
         if("clear".equalsIgnoreCase(var2[0])) {
            var5.g(0);
            var5.f(0);
            var5.b(false);
            var5.a(false);
            a(var1, this, "commands.weather.clear", new Object[0]);
         } else if("rain".equalsIgnoreCase(var2[0])) {
            var5.g(var3);
            var5.b(true);
            var5.a(false);
            a(var1, this, "commands.weather.rain", new Object[0]);
         } else {
            if(!"thunder".equalsIgnoreCase(var2[0])) {
               throw new ci("commands.weather.usage", new Object[0]);
            }

            var5.g(var3);
            var5.f(var3);
            var5.b(true);
            var5.a(true);
            a(var1, this, "commands.weather.thunder", new Object[0]);
         }

      } else {
         throw new ci("commands.weather.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, new String[]{"clear", "rain", "thunder"}):null;
   }
}
