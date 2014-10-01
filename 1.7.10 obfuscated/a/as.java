import java.util.List;
import net.minecraft.server.MinecraftServer;

public class as extends y {

   public String c() {
      return "gamerule";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.gamerule.usage";
   }

   public void b(ac var1, String[] var2) {
      String var6;
      if(var2.length == 2) {
         var6 = var2[0];
         String var7 = var2[1];
         agy var8 = this.d();
         if(var8.e(var6)) {
            var8.b(var6, var7);
            a(var1, this, "commands.gamerule.success", new Object[0]);
         } else {
            a(var1, this, "commands.gamerule.norule", new Object[]{var6});
         }

      } else if(var2.length == 1) {
         var6 = var2[0];
         agy var4 = this.d();
         if(var4.e(var6)) {
            String var5 = var4.a(var6);
            var1.a((new fq(var6)).a(" = ").a(var5));
         } else {
            a(var1, this, "commands.gamerule.norule", new Object[]{var6});
         }

      } else if(var2.length == 0) {
         agy var3 = this.d();
         var1.a(new fq(a(var3.b())));
      } else {
         throw new ci("commands.gamerule.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, this.d().b()):(var2.length == 2?a(var2, new String[]{"true", "false"}):null);
   }

   private agy d() {
      return MinecraftServer.I().a(0).O();
   }
}
