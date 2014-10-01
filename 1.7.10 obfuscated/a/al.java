import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

public class al extends ar {

   public String c() {
      return "defaultgamemode";
   }

   public String c(ac var1) {
      return "commands.defaultgamemode.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length > 0) {
         ahk var3 = this.h(var1, var2[0]);
         this.a(var3);
         a(var1, this, "commands.defaultgamemode.success", new Object[]{new fr("gameMode." + var3.b(), new Object[0])});
      } else {
         throw new ci("commands.defaultgamemode.usage", new Object[0]);
      }
   }

   protected void a(ahk var1) {
      MinecraftServer var2 = MinecraftServer.I();
      var2.a(var1);
      mw var4;
      if(var2.ap()) {
         for(Iterator var3 = MinecraftServer.I().ah().e.iterator(); var3.hasNext(); var4.R = 0.0F) {
            var4 = (mw)var3.next();
            var4.a(var1);
         }
      }

   }
}
