import java.util.List;
import net.minecraft.server.MinecraftServer;

public class at extends y {

   public String c() {
      return "give";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.give.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 2) {
         throw new ci("commands.give.usage", new Object[0]);
      } else {
         mw var3 = d(var1, var2[0]);
         adb var4 = f(var1, var2[1]);
         int var5 = 1;
         int var6 = 0;
         if(var2.length >= 3) {
            var5 = a(var1, var2[2], 1, 64);
         }

         if(var2.length >= 4) {
            var6 = a(var1, var2[3]);
         }

         add var7 = new add(var4, var5, var6);
         if(var2.length >= 5) {
            String var8 = a(var1, var2, 4).c();

            try {
               dy var9 = eb.a(var8);
               if(!(var9 instanceof dh)) {
                  a(var1, this, "commands.give.tagError", new Object[]{"Not a valid tag"});
                  return;
               }

               var7.d((dh)var9);
            } catch (ea var10) {
               a(var1, this, "commands.give.tagError", new Object[]{var10.getMessage()});
               return;
            }
         }

         xk var11 = var3.a(var7, false);
         var11.b = 0;
         var11.a(var3.b_());
         a(var1, this, "commands.give.success", new Object[]{var7.E(), Integer.valueOf(var5), var3.b_()});
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, this.d()):(var2.length == 2?a(var2, adb.e.b()):null);
   }

   protected String[] d() {
      return MinecraftServer.I().E();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
