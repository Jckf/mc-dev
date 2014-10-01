import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

public class au extends y {

   public String c() {
      return "help";
   }

   public int a() {
      return 0;
   }

   public String c(ac var1) {
      return "commands.help.usage";
   }

   public List b() {
      return Arrays.asList(new String[]{"?"});
   }

   public void b(ac var1, String[] var2) {
      List var3 = this.d(var1);
      byte var4 = 7;
      int var5 = (var3.size() - 1) / var4;
      boolean var6 = false;

      int var13;
      try {
         var13 = var2.length == 0?0:a(var1, var2[0], 1, var5 + 1) - 1;
      } catch (ce var12) {
         Map var8 = this.d();
         aa var9 = (aa)var8.get(var2[0]);
         if(var9 != null) {
            throw new ci(var9.c(var1), new Object[0]);
         }

         if(qh.a(var2[0], -1) != -1) {
            throw var12;
         }

         throw new ch();
      }

      int var7 = Math.min((var13 + 1) * var4, var3.size());
      fr var14 = new fr("commands.help.header", new Object[]{Integer.valueOf(var13 + 1), Integer.valueOf(var5 + 1)});
      var14.b().a(a.c);
      var1.a(var14);

      for(int var15 = var13 * var4; var15 < var7; ++var15) {
         aa var10 = (aa)var3.get(var15);
         fr var11 = new fr(var10.c(var1), new Object[0]);
         var11.b().a(new fh(fi.e, "/" + var10.c() + " "));
         var1.a(var11);
      }

      if(var13 == 0 && var1 instanceof yz) {
         fr var16 = new fr("commands.help.footer", new Object[0]);
         var16.b().a(a.k);
         var1.a(var16);
      }

   }

   protected List d(ac var1) {
      List var2 = MinecraftServer.I().J().a(var1);
      Collections.sort(var2);
      return var2;
   }

   protected Map d() {
      return MinecraftServer.I().J().a();
   }
}
