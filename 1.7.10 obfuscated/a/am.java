import java.util.List;
import net.minecraft.server.MinecraftServer;

public class am extends y {

   public String c() {
      return "effect";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.effect.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 2) {
         throw new ci("commands.effect.usage", new Object[0]);
      } else {
         mw var3 = d(var1, var2[0]);
         if(var2[1].equals("clear")) {
            if(var3.aQ().isEmpty()) {
               throw new cd("commands.effect.failure.notActive.all", new Object[]{var3.b_()});
            }

            var3.aP();
            a(var1, this, "commands.effect.success.removed.all", new Object[]{var3.b_()});
         } else {
            int var4 = a(var1, var2[1], 1);
            int var5 = 600;
            int var6 = 30;
            int var7 = 0;
            if(var4 < 0 || var4 >= rv.a.length || rv.a[var4] == null) {
               throw new ce("commands.effect.notFound", new Object[]{Integer.valueOf(var4)});
            }

            if(var2.length >= 3) {
               var6 = a(var1, var2[2], 0, 1000000);
               if(rv.a[var4].b()) {
                  var5 = var6;
               } else {
                  var5 = var6 * 20;
               }
            } else if(rv.a[var4].b()) {
               var5 = 1;
            }

            if(var2.length >= 4) {
               var7 = a(var1, var2[3], 0, 255);
            }

            if(var6 == 0) {
               if(!var3.k(var4)) {
                  throw new cd("commands.effect.failure.notActive", new Object[]{new fr(rv.a[var4].a(), new Object[0]), var3.b_()});
               }

               var3.m(var4);
               a(var1, this, "commands.effect.success.removed", new Object[]{new fr(rv.a[var4].a(), new Object[0]), var3.b_()});
            } else {
               rw var8 = new rw(var4, var5, var7);
               var3.c(var8);
               a(var1, this, "commands.effect.success", new Object[]{new fr(var8.f(), new Object[0]), Integer.valueOf(var4), Integer.valueOf(var7), var3.b_(), Integer.valueOf(var6)});
            }
         }

      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, this.d()):null;
   }

   protected String[] d() {
      return MinecraftServer.I().E();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
