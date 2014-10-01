import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bz extends y {

   public String c() {
      return "time";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.time.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length > 1) {
         int var3;
         if(var2[0].equals("set")) {
            if(var2[1].equals("day")) {
               var3 = 1000;
            } else if(var2[1].equals("night")) {
               var3 = 13000;
            } else {
               var3 = a(var1, var2[1], 0);
            }

            this.a(var1, var3);
            a(var1, this, "commands.time.set", new Object[]{Integer.valueOf(var3)});
            return;
         }

         if(var2[0].equals("add")) {
            var3 = a(var1, var2[1], 0);
            this.b(var1, var3);
            a(var1, this, "commands.time.added", new Object[]{Integer.valueOf(var3)});
            return;
         }
      }

      throw new ci("commands.time.usage", new Object[0]);
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, new String[]{"set", "add"}):(var2.length == 2 && var2[0].equals("set")?a(var2, new String[]{"day", "night"}):null);
   }

   protected void a(ac var1, int var2) {
      for(int var3 = 0; var3 < MinecraftServer.I().c.length; ++var3) {
         MinecraftServer.I().c[var3].b((long)var2);
      }

   }

   protected void b(ac var1, int var2) {
      for(int var3 = 0; var3 < MinecraftServer.I().c.length; ++var3) {
         mt var4 = MinecraftServer.I().c[var3];
         var4.b(var4.J() + (long)var2);
      }

   }
}
