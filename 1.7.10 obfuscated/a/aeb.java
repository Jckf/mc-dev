import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class aeb extends adb {

   private static final String[] b = new String[]{"skeleton", "wither", "zombie", "char", "creeper"};
   public static final String[] a = new String[]{"skeleton", "wither", "zombie", "steve", "creeper"};


   public aeb() {
      this.a(abt.c);
      this.f(0);
      this.a(true);
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 == 0) {
         return false;
      } else if(!var3.a(var4, var5, var6).o().a()) {
         return false;
      } else {
         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }

         if(!var3.E) {
            var3.d(var4, var5, var6, ajn.bP, var7, 2);
            int var11 = 0;
            if(var7 == 1) {
               var11 = qh.c((double)(var2.y * 16.0F / 360.0F) + 0.5D) & 15;
            }

            aor var12 = var3.o(var4, var5, var6);
            if(var12 != null && var12 instanceof apn) {
               if(var1.k() == 3) {
                  GameProfile var13 = null;
                  if(var1.p()) {
                     dh var14 = var1.q();
                     if(var14.b("SkullOwner", 10)) {
                        var13 = dv.a(var14.m("SkullOwner"));
                     } else if(var14.b("SkullOwner", 8) && var14.j("SkullOwner").length() > 0) {
                        var13 = new GameProfile((UUID)null, var14.j("SkullOwner"));
                     }
                  }

                  ((apn)var12).a(var13);
               } else {
                  ((apn)var12).a(var1.k());
               }

               ((apn)var12).b(var11);
               ((anl)ajn.bP).a(var3, var4, var5, var6, (apn)var12);
            }

            --var1.b;
         }

         return true;
      }
   }

   public int a(int var1) {
      return var1;
   }

   public String a(add var1) {
      int var2 = var1.k();
      if(var2 < 0 || var2 >= b.length) {
         var2 = 0;
      }

      return super.a() + "." + b[var2];
   }

   public String n(add var1) {
      if(var1.k() == 3 && var1.p()) {
         if(var1.q().b("SkullOwner", 10)) {
            return dd.a("item.skull.player.name", new Object[]{dv.a(var1.q().m("SkullOwner")).getName()});
         }

         if(var1.q().b("SkullOwner", 8)) {
            return dd.a("item.skull.player.name", new Object[]{var1.q().j("SkullOwner")});
         }
      }

      return super.n(var1);
   }

}
