import net.minecraft.server.MinecraftServer;

public class bh extends y {

   public String c() {
      return "save-all";
   }

   public String c(ac var1) {
      return "commands.save.usage";
   }

   public void b(ac var1, String[] var2) {
      MinecraftServer var3 = MinecraftServer.I();
      var1.a(new fr("commands.save.start", new Object[0]));
      if(var3.ah() != null) {
         var3.ah().j();
      }

      try {
         int var4;
         mt var5;
         boolean var6;
         for(var4 = 0; var4 < var3.c.length; ++var4) {
            if(var3.c[var4] != null) {
               var5 = var3.c[var4];
               var6 = var5.c;
               var5.c = false;
               var5.a(true, (qk)null);
               var5.c = var6;
            }
         }

         if(var2.length > 0 && "flush".equals(var2[0])) {
            var1.a(new fr("commands.save.flushStart", new Object[0]));

            for(var4 = 0; var4 < var3.c.length; ++var4) {
               if(var3.c[var4] != null) {
                  var5 = var3.c[var4];
                  var6 = var5.c;
                  var5.c = false;
                  var5.m();
                  var5.c = var6;
               }
            }

            var1.a(new fr("commands.save.flushEnd", new Object[0]));
         }
      } catch (ahg var7) {
         a(var1, this, "commands.save.failed", new Object[]{var7.getMessage()});
         return;
      }

      a(var1, this, "commands.save.success", new Object[0]);
   }
}
