import java.util.Random;

public class awn extends atr implements atz {

   public static final bet a = bet.a("snowy");


   protected awn() {
      super(bof.b);
      this.j(this.L.b().a(a, Boolean.valueOf(false)));
      this.a(true);
      this.a(akf.b);
   }

   public bec a(bec var1, ard var2, dt var3) {
      atr var4 = var2.p(var3.a()).c();
      return var1.a(a, Boolean.valueOf(var4 == aty.aJ || var4 == aty.aH));
   }

   public void b(aqu var1, dt var2, bec var3, Random var4) {
      if(!var1.D) {
         if(var1.l(var2.a()) < 4 && var1.p(var2.a()).c().n() > 2) {
            var1.a(var2, aty.d.P());
         } else {
            if(var1.l(var2.a()) >= 9) {
               for(int var5 = 0; var5 < 4; ++var5) {
                  dt var6 = var2.a(var4.nextInt(3) - 1, var4.nextInt(5) - 3, var4.nextInt(3) - 1);
                  atr var7 = var1.p(var6.a()).c();
                  bec var8 = var1.p(var6);
                  if(var8.c() == aty.d && var8.b(avc.a) == avd.a && var1.l(var6.a()) >= 4 && var7.n() <= 2) {
                     var1.a(var6, aty.c.P());
                  }
               }
            }

         }
      }
   }

   public alq a(bec var1, Random var2, int var3) {
      return aty.d.a(aty.d.P().a(avc.a, avd.a), var2, var3);
   }

   public boolean a(aqu var1, dt var2, bec var3, boolean var4) {
      return true;
   }

   public boolean a(aqu var1, Random var2, dt var3, bec var4) {
      return true;
   }

   public void b(aqu var1, Random var2, dt var3, bec var4) {
      dt var5 = var3.a();
      int var6 = 0;

      while(var6 < 128) {
         dt var7 = var5;
         int var8 = 0;

         while(true) {
            if(var8 < var6 / 16) {
               var7 = var7.a(var2.nextInt(3) - 1, (var2.nextInt(3) - 1) * var2.nextInt(3) / 2, var2.nextInt(3) - 1);
               if(var1.p(var7.b()).c() == aty.c && !var1.p(var7).c().t()) {
                  ++var8;
                  continue;
               }
            } else if(var1.p(var7).c().J == bof.a) {
               if(var2.nextInt(8) == 0) {
                  awa var11 = var1.b(var7).a(var2, var7);
                  avy var9 = var11.a().a();
                  bec var10 = var9.P().a(var9.l(), var11);
                  if(var9.f(var1, var7, var10)) {
                     var1.a(var7, var10, 3);
                  }
               } else {
                  bec var12 = aty.H.P().a(bbh.a, bbi.b);
                  if(aty.H.f(var1, var7, var12)) {
                     var1.a(var7, var12, 3);
                  }
               }
            }

            ++var6;
            break;
         }
      }

   }

   public int c(bec var1) {
      return 0;
   }

   protected bed e() {
      return new bed(this, new bex[]{a});
   }

}
