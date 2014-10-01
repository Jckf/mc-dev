import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.server.MinecraftServer;

public class af extends y {

   public static final Pattern a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");


   public String c() {
      return "ban-ip";
   }

   public int a() {
      return 3;
   }

   public boolean a(ac var1) {
      return MinecraftServer.I().ah().i().b() && super.a(var1);
   }

   public String c(ac var1) {
      return "commands.banip.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 1 && var2[0].length() > 1) {
         Matcher var3 = a.matcher(var2[0]);
         fj var4 = null;
         if(var2.length >= 2) {
            var4 = a(var1, var2, 1);
         }

         if(var3.matches()) {
            this.a(var1, var2[0], var4 == null?null:var4.c());
         } else {
            mw var5 = MinecraftServer.I().ah().a(var2[0]);
            if(var5 == null) {
               throw new cg("commands.banip.invalid", new Object[0]);
            }

            this.a(var1, var5.s(), var4 == null?null:var4.c());
         }

      } else {
         throw new ci("commands.banip.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, MinecraftServer.I().E()):null;
   }

   protected void a(ac var1, String var2, String var3) {
      ny var4 = new ny(var2, (Date)null, var1.b_(), (Date)null, var3);
      MinecraftServer.I().ah().i().a((ol)var4);
      List var5 = MinecraftServer.I().ah().b(var2);
      String[] var6 = new String[var5.size()];
      int var7 = 0;

      mw var9;
      for(Iterator var8 = var5.iterator(); var8.hasNext(); var6[var7++] = var9.b_()) {
         var9 = (mw)var8.next();
         var9.a.c("You have been IP banned.");
      }

      if(var5.isEmpty()) {
         a(var1, this, "commands.banip.success", new Object[]{var2});
      } else {
         a(var1, this, "commands.banip.success.players", new Object[]{var2, a(var6)});
      }

   }

}
