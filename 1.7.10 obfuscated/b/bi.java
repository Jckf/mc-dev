import net.minecraft.server.MinecraftServer;

public class bi extends y {

   public String c() {
      return "save-off";
   }

   public String c(ac var1) {
      return "commands.save-off.usage";
   }

   public void b(ac var1, String[] var2) {
      MinecraftServer var3 = MinecraftServer.I();
      boolean var4 = false;

      for(int var5 = 0; var5 < var3.c.length; ++var5) {
         if(var3.c[var5] != null) {
            mt var6 = var3.c[var5];
            if(!var6.c) {
               var6.c = true;
               var4 = true;
            }
         }
      }

      if(var4) {
         a(var1, this, "commands.save.disabled", new Object[0]);
      } else {
         throw new cd("commands.save-off.alreadyOff", new Object[0]);
      }
   }
}
