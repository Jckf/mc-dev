import net.minecraft.server.MinecraftServer;

public class bo extends y {

   public String c() {
      return "setidletimeout";
   }

   public int a() {
      return 3;
   }

   public String c(ac var1) {
      return "commands.setidletimeout.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length == 1) {
         int var3 = a(var1, var2[0], 0);
         MinecraftServer.I().d(var3);
         a(var1, this, "commands.setidletimeout.success", new Object[]{Integer.valueOf(var3)});
      } else {
         throw new ci("commands.setidletimeout.usage", new Object[0]);
      }
   }
}
