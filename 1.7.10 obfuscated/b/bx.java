import java.util.Iterator;
import java.util.List;

public class bx extends y {

   public String c() {
      return "testforblock";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.testforblock.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 4) {
         int var3 = var1.f_().a;
         int var4 = var1.f_().b;
         int var5 = var1.f_().c;
         var3 = qh.c(a(var1, (double)var3, var2[0]));
         var4 = qh.c(a(var1, (double)var4, var2[1]));
         var5 = qh.c(a(var1, (double)var5, var2[2]));
         aji var6 = aji.b(var2[3]);
         if(var6 == null) {
            throw new ce("commands.setblock.notFound", new Object[]{var2[3]});
         } else {
            int var7 = -1;
            if(var2.length >= 5) {
               var7 = a(var1, var2[4], -1, 15);
            }

            ahb var8 = var1.d();
            if(!var8.d(var3, var4, var5)) {
               throw new cd("commands.testforblock.outOfWorld", new Object[0]);
            } else {
               dh var9 = new dh();
               boolean var10 = false;
               if(var2.length >= 6 && var6.u()) {
                  String var11 = a(var1, var2, 5).c();

                  try {
                     dy var12 = eb.a(var11);
                     if(!(var12 instanceof dh)) {
                        throw new cd("commands.setblock.tagError", new Object[]{"Not a valid tag"});
                     }

                     var9 = (dh)var12;
                     var10 = true;
                  } catch (ea var14) {
                     throw new cd("commands.setblock.tagError", new Object[]{var14.getMessage()});
                  }
               }

               aji var15 = var8.a(var3, var4, var5);
               if(var15 != var6) {
                  throw new cd("commands.testforblock.failed.tile", new Object[]{Integer.valueOf(var3), Integer.valueOf(var4), Integer.valueOf(var5), var15.F(), var6.F()});
               } else {
                  if(var7 > -1) {
                     int var16 = var8.e(var3, var4, var5);
                     if(var16 != var7) {
                        throw new cd("commands.testforblock.failed.data", new Object[]{Integer.valueOf(var3), Integer.valueOf(var4), Integer.valueOf(var5), Integer.valueOf(var16), Integer.valueOf(var7)});
                     }
                  }

                  if(var10) {
                     aor var17 = var8.o(var3, var4, var5);
                     if(var17 == null) {
                        throw new cd("commands.testforblock.failed.tileEntity", new Object[]{Integer.valueOf(var3), Integer.valueOf(var4), Integer.valueOf(var5)});
                     }

                     dh var13 = new dh();
                     var17.b(var13);
                     if(!this.a((dy)var9, (dy)var13)) {
                        throw new cd("commands.testforblock.failed.nbt", new Object[]{Integer.valueOf(var3), Integer.valueOf(var4), Integer.valueOf(var5)});
                     }
                  }

                  var1.a(new fr("commands.testforblock.success", new Object[]{Integer.valueOf(var3), Integer.valueOf(var4), Integer.valueOf(var5)}));
               }
            }
         }
      } else {
         throw new ci("commands.testforblock.usage", new Object[0]);
      }
   }

   public boolean a(dy var1, dy var2) {
      if(var1 == var2) {
         return true;
      } else if(var1 == null) {
         return true;
      } else if(var2 == null) {
         return false;
      } else if(!var1.getClass().equals(var2.getClass())) {
         return false;
      } else if(var1 instanceof dh) {
         dh var3 = (dh)var1;
         dh var4 = (dh)var2;
         Iterator var5 = var3.c().iterator();

         String var6;
         dy var7;
         do {
            if(!var5.hasNext()) {
               return true;
            }

            var6 = (String)var5.next();
            var7 = var3.a(var6);
         } while(this.a(var7, var4.a(var6)));

         return false;
      } else {
         return var1.equals(var2);
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 4?a(var2, (Iterable)aji.c.b()):null;
   }
}
