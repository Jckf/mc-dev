import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ar extends y {

   public String c() {
      return "gamemode";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.gamemode.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length > 0) {
         ahk var3 = this.h(var1, var2[0]);
         mw var4 = var2.length >= 2?d(var1, var2[1]):b(var1);
         var4.a(var3);
         var4.R = 0.0F;
         fr var5 = new fr("gameMode." + var3.b(), new Object[0]);
         if(var4 != var1) {
            a(var1, this, 1, "commands.gamemode.success.other", new Object[]{var4.b_(), var5});
         } else {
            a(var1, this, 1, "commands.gamemode.success.self", new Object[]{var5});
         }

      } else {
         throw new ci("commands.gamemode.usage", new Object[0]);
      }
   }

   protected ahk h(ac var1, String var2) {
      return !var2.equalsIgnoreCase(ahk.b.b()) && !var2.equalsIgnoreCase("s")?(!var2.equalsIgnoreCase(ahk.c.b()) && !var2.equalsIgnoreCase("c")?(!var2.equalsIgnoreCase(ahk.d.b()) && !var2.equalsIgnoreCase("a")?ahj.a(a(var1, var2, 0, ahk.values().length - 2)):ahk.d):ahk.c):ahk.b;
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, new String[]{"survival", "creative", "adventure"}):(var2.length == 2?a(var2, this.d()):null);
   }

   protected String[] d() {
      return MinecraftServer.I().E();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 1;
   }
}
