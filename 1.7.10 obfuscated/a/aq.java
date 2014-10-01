import java.util.List;
import net.minecraft.server.MinecraftServer;

public class aq extends y {

   public String c() {
      return "difficulty";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.difficulty.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length > 0) {
         rd var3 = this.h(var1, var2[0]);
         MinecraftServer.I().a(var3);
         a(var1, this, "commands.difficulty.success", new Object[]{new fr(var3.b(), new Object[0])});
      } else {
         throw new ci("commands.difficulty.usage", new Object[0]);
      }
   }

   protected rd h(ac var1, String var2) {
      return !var2.equalsIgnoreCase("peaceful") && !var2.equalsIgnoreCase("p")?(!var2.equalsIgnoreCase("easy") && !var2.equalsIgnoreCase("e")?(!var2.equalsIgnoreCase("normal") && !var2.equalsIgnoreCase("n")?(!var2.equalsIgnoreCase("hard") && !var2.equalsIgnoreCase("h")?rd.a(a(var1, var2, 0, 3)):rd.d):rd.c):rd.b):rd.a;
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, new String[]{"peaceful", "easy", "normal", "hard"}):null;
   }
}
