import java.util.List;

public class bm extends y {

   public String c() {
      return "setblock";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.setblock.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 4) {
         int var3 = var1.f_().a;
         int var4 = var1.f_().b;
         int var5 = var1.f_().c;
         var3 = qh.c(a(var1, (double)var3, var2[0]));
         var4 = qh.c(a(var1, (double)var4, var2[1]));
         var5 = qh.c(a(var1, (double)var5, var2[2]));
         aji var6 = y.g(var1, var2[3]);
         int var7 = 0;
         if(var2.length >= 5) {
            var7 = a(var1, var2[4], 0, 15);
         }

         ahb var8 = var1.d();
         if(!var8.d(var3, var4, var5)) {
            throw new cd("commands.setblock.outOfWorld", new Object[0]);
         } else {
            dh var9 = new dh();
            boolean var10 = false;
            if(var2.length >= 7 && var6.u()) {
               String var11 = a(var1, var2, 6).c();

               try {
                  dy var12 = eb.a(var11);
                  if(!(var12 instanceof dh)) {
                     throw new cd("commands.setblock.tagError", new Object[]{"Not a valid tag"});
                  }

                  var9 = (dh)var12;
                  var10 = true;
               } catch (ea var13) {
                  throw new cd("commands.setblock.tagError", new Object[]{var13.getMessage()});
               }
            }

            if(var2.length >= 6) {
               if(var2[5].equals("destroy")) {
                  var8.a(var3, var4, var5, true);
               } else if(var2[5].equals("keep") && !var8.c(var3, var4, var5)) {
                  throw new cd("commands.setblock.noChange", new Object[0]);
               }
            }

            if(!var8.d(var3, var4, var5, var6, var7, 3)) {
               throw new cd("commands.setblock.noChange", new Object[0]);
            } else {
               if(var10) {
                  aor var14 = var8.o(var3, var4, var5);
                  if(var14 != null) {
                     var9.a("x", var3);
                     var9.a("y", var4);
                     var9.a("z", var5);
                     var14.a(var9);
                  }
               }

               a(var1, this, "commands.setblock.success", new Object[0]);
            }
         }
      } else {
         throw new ci("commands.setblock.usage", new Object[0]);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 4?a(var2, aji.c.b()):(var2.length == 6?a(var2, new String[]{"replace", "destroy", "keep"}):null);
   }
}
