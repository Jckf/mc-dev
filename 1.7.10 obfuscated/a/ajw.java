import java.util.List;
import java.util.Random;

public class ajw extends aji {

   public ajw() {
      super(awt.f);
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      float var8 = 0.125F;
      this.a(0.0F, 0.0F, 0.0F, var8, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(1.0F - var8, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a(0.0F, 0.0F, 1.0F - var8, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.g();
   }

   public void g() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean c() {
      return false;
   }

   public int b() {
      return 24;
   }

   public boolean d() {
      return false;
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {
      int var6 = b(var1.e(var2, var3, var4));
      float var7 = (float)var3 + (6.0F + (float)(3 * var6)) / 16.0F;
      if(!var1.E && var5.al() && var6 > 0 && var5.C.b <= (double)var7) {
         var5.F();
         this.a(var1, var2, var3, var4, var6 - 1);
      }

   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         add var10 = var5.bm.h();
         if(var10 == null) {
            return true;
         } else {
            int var11 = var1.e(var2, var3, var4);
            int var12 = b(var11);
            if(var10.b() == ade.as) {
               if(var12 < 3) {
                  if(!var5.bE.d) {
                     var5.bm.a(var5.bm.c, new add(ade.ar));
                  }

                  this.a(var1, var2, var3, var4, 3);
               }

               return true;
            } else {
               if(var10.b() == ade.bo) {
                  if(var12 > 0) {
                     if(!var5.bE.d) {
                        add var13 = new add(ade.bn, 1, 0);
                        if(!var5.bm.a(var13)) {
                           var1.d((sa)(new xk(var1, (double)var2 + 0.5D, (double)var3 + 1.5D, (double)var4 + 0.5D, var13)));
                        } else if(var5 instanceof mw) {
                           ((mw)var5).a(var5.bn);
                        }

                        --var10.b;
                        if(var10.b <= 0) {
                           var5.bm.a(var5.bm.c, (add)null);
                        }
                     }

                     this.a(var1, var2, var3, var4, var12 - 1);
                  }
               } else if(var12 > 0 && var10.b() instanceof abb && ((abb)var10.b()).m_() == abd.a) {
                  abb var14 = (abb)var10.b();
                  var14.c(var10);
                  this.a(var1, var2, var3, var4, var12 - 1);
                  return true;
               }

               return false;
            }
         }
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5) {
      var1.a(var2, var3, var4, qh.a(var5, 0, 3), 2);
      var1.f(var2, var3, var4, this);
   }

   public void l(ahb var1, int var2, int var3, int var4) {
      if(var1.s.nextInt(20) == 1) {
         int var5 = var1.e(var2, var3, var4);
         if(var5 < 3) {
            var1.a(var2, var3, var4, var5 + 1, 2);
         }

      }
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.bu;
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      return b(var6);
   }

   public static int b(int var0) {
      return var0;
   }
}
