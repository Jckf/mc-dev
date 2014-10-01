import java.util.Random;

public class akm extends ajc {

   public static final cz a = new co(new cm());
   protected Random b = new Random();


   protected akm() {
      super(awt.e);
      this.a(abt.d);
   }

   public int a(ahb var1) {
      return 4;
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      this.m(var1, var2, var3, var4);
   }

   private void m(ahb var1, int var2, int var3, int var4) {
      if(!var1.E) {
         aji var5 = var1.a(var2, var3, var4 - 1);
         aji var6 = var1.a(var2, var3, var4 + 1);
         aji var7 = var1.a(var2 - 1, var3, var4);
         aji var8 = var1.a(var2 + 1, var3, var4);
         byte var9 = 3;
         if(var5.j() && !var6.j()) {
            var9 = 3;
         }

         if(var6.j() && !var5.j()) {
            var9 = 2;
         }

         if(var7.j() && !var8.j()) {
            var9 = 5;
         }

         if(var8.j() && !var7.j()) {
            var9 = 4;
         }

         var1.a(var2, var3, var4, var9, 2);
      }
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         apb var10 = (apb)var1.o(var2, var3, var4);
         if(var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   protected void e(ahb var1, int var2, int var3, int var4) {
      cl var5 = new cl(var1, var2, var3, var4);
      apb var6 = (apb)var5.j();
      if(var6 != null) {
         int var7 = var6.i();
         if(var7 < 0) {
            var1.c(1001, var2, var3, var4, 0);
         } else {
            add var8 = var6.a(var7);
            cp var9 = this.a(var8);
            if(var9 != cp.a) {
               add var10 = var9.a(var5, var8);
               var6.a(var7, var10.b == 0?null:var10);
            }
         }

      }
   }

   protected cp a(add var1) {
      return (cp)a.a(var1.b());
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      boolean var6 = var1.v(var2, var3, var4) || var1.v(var2, var3 + 1, var4);
      int var7 = var1.e(var2, var3, var4);
      boolean var8 = (var7 & 8) != 0;
      if(var6 && !var8) {
         var1.a(var2, var3, var4, this, this.a(var1));
         var1.a(var2, var3, var4, var7 | 8, 4);
      } else if(!var6 && var8) {
         var1.a(var2, var3, var4, var7 & -9, 4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         this.e(var1, var2, var3, var4);
      }

   }

   public aor a(ahb var1, int var2) {
      return new apb();
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = app.a(var1, var2, var3, var4, var5);
      var1.a(var2, var3, var4, var7, 2);
      if(var6.u()) {
         ((apb)var1.o(var2, var3, var4)).a(var6.s());
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      apb var7 = (apb)var1.o(var2, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.a(); ++var8) {
            add var9 = var7.a(var8);
            if(var9 != null) {
               float var10 = this.b.nextFloat() * 0.8F + 0.1F;
               float var11 = this.b.nextFloat() * 0.8F + 0.1F;
               float var12 = this.b.nextFloat() * 0.8F + 0.1F;

               while(var9.b > 0) {
                  int var13 = this.b.nextInt(21) + 10;
                  if(var13 > var9.b) {
                     var13 = var9.b;
                  }

                  var9.b -= var13;
                  xk var14 = new xk(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new add(var9.b(), var13, var9.k()));
                  if(var9.p()) {
                     var14.f().d((dh)var9.q().b());
                  }

                  float var15 = 0.05F;
                  var14.v = (double)((float)this.b.nextGaussian() * var15);
                  var14.w = (double)((float)this.b.nextGaussian() * var15 + 0.2F);
                  var14.x = (double)((float)this.b.nextGaussian() * var15);
                  var1.d((sa)var14);
               }
            }
         }

         var1.f(var2, var3, var4, var5);
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public static cx a(ck var0) {
      cr var1 = b(var0.h());
      double var2 = var0.a() + 0.7D * (double)var1.c();
      double var4 = var0.b() + 0.7D * (double)var1.d();
      double var6 = var0.c() + 0.7D * (double)var1.e();
      return new cy(var2, var4, var6);
   }

   public static cr b(int var0) {
      return cr.a(var0 & 7);
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      return zs.b((rb)var1.o(var2, var3, var4));
   }

}
