import java.util.Random;

public class alb extends aji {

   private int[] a = new int[256];
   private int[] b = new int[256];


   protected alb() {
      super(awt.o);
      this.a(true);
   }

   public static void e() {
      ajn.ab.a(b(ajn.f), 5, 20);
      ajn.ab.a(b(ajn.bw), 5, 20);
      ajn.ab.a(b(ajn.bx), 5, 20);
      ajn.ab.a(b(ajn.aJ), 5, 20);
      ajn.ab.a(b(ajn.ad), 5, 20);
      ajn.ab.a(b(ajn.bG), 5, 20);
      ajn.ab.a(b(ajn.bF), 5, 20);
      ajn.ab.a(b(ajn.bH), 5, 20);
      ajn.ab.a(b(ajn.r), 5, 5);
      ajn.ab.a(b(ajn.s), 5, 5);
      ajn.ab.a(b(ajn.t), 30, 60);
      ajn.ab.a(b(ajn.u), 30, 60);
      ajn.ab.a(b(ajn.X), 30, 20);
      ajn.ab.a(b(ajn.W), 15, 100);
      ajn.ab.a(b(ajn.H), 60, 100);
      ajn.ab.a(b(ajn.cm), 60, 100);
      ajn.ab.a(b(ajn.N), 60, 100);
      ajn.ab.a(b(ajn.O), 60, 100);
      ajn.ab.a(b(ajn.L), 30, 60);
      ajn.ab.a(b(ajn.bd), 15, 100);
      ajn.ab.a(b(ajn.ci), 5, 5);
      ajn.ab.a(b(ajn.cf), 60, 20);
      ajn.ab.a(b(ajn.cg), 60, 20);
   }

   public void a(int var1, int var2, int var3) {
      this.a[var1] = var2;
      this.b[var1] = var3;
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 3;
   }

   public int a(Random var1) {
      return 0;
   }

   public int a(ahb var1) {
      return 30;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(var1.O().b("doFireTick")) {
         boolean var6 = var1.a(var2, var3 - 1, var4) == ajn.aL;
         if(var1.t instanceof aqr && var1.a(var2, var3 - 1, var4) == ajn.h) {
            var6 = true;
         }

         if(!this.c(var1, var2, var3, var4)) {
            var1.f(var2, var3, var4);
         }

         if(!var6 && var1.Q() && (var1.y(var2, var3, var4) || var1.y(var2 - 1, var3, var4) || var1.y(var2 + 1, var3, var4) || var1.y(var2, var3, var4 - 1) || var1.y(var2, var3, var4 + 1))) {
            var1.f(var2, var3, var4);
         } else {
            int var7 = var1.e(var2, var3, var4);
            if(var7 < 15) {
               var1.a(var2, var3, var4, var7 + var5.nextInt(3) / 2, 4);
            }

            var1.a(var2, var3, var4, this, this.a(var1) + var5.nextInt(10));
            if(!var6 && !this.e(var1, var2, var3, var4)) {
               if(!ahb.a((ahl)var1, var2, var3 - 1, var4) || var7 > 3) {
                  var1.f(var2, var3, var4);
               }

            } else if(!var6 && !this.e((ahl)var1, var2, var3 - 1, var4) && var7 == 15 && var5.nextInt(4) == 0) {
               var1.f(var2, var3, var4);
            } else {
               boolean var8 = var1.z(var2, var3, var4);
               byte var9 = 0;
               if(var8) {
                  var9 = -50;
               }

               this.a(var1, var2 + 1, var3, var4, 300 + var9, var5, var7);
               this.a(var1, var2 - 1, var3, var4, 300 + var9, var5, var7);
               this.a(var1, var2, var3 - 1, var4, 250 + var9, var5, var7);
               this.a(var1, var2, var3 + 1, var4, 250 + var9, var5, var7);
               this.a(var1, var2, var3, var4 - 1, 300 + var9, var5, var7);
               this.a(var1, var2, var3, var4 + 1, 300 + var9, var5, var7);

               for(int var10 = var2 - 1; var10 <= var2 + 1; ++var10) {
                  for(int var11 = var4 - 1; var11 <= var4 + 1; ++var11) {
                     for(int var12 = var3 - 1; var12 <= var3 + 4; ++var12) {
                        if(var10 != var2 || var12 != var3 || var11 != var4) {
                           int var13 = 100;
                           if(var12 > var3 + 1) {
                              var13 += (var12 - (var3 + 1)) * 100;
                           }

                           int var14 = this.m(var1, var10, var12, var11);
                           if(var14 > 0) {
                              int var15 = (var14 + 40 + var1.r.a() * 7) / (var7 + 30);
                              if(var8) {
                                 var15 /= 2;
                              }

                              if(var15 > 0 && var5.nextInt(var13) <= var15 && (!var1.Q() || !var1.y(var10, var12, var11)) && !var1.y(var10 - 1, var12, var4) && !var1.y(var10 + 1, var12, var11) && !var1.y(var10, var12, var11 - 1) && !var1.y(var10, var12, var11 + 1)) {
                                 int var16 = var7 + var5.nextInt(5) / 4;
                                 if(var16 > 15) {
                                    var16 = 15;
                                 }

                                 var1.d(var10, var12, var11, this, var16, 3);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }

   public boolean L() {
      return false;
   }

   private void a(ahb var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
      int var8 = this.b[aji.b(var1.a(var2, var3, var4))];
      if(var6.nextInt(var5) < var8) {
         boolean var9 = var1.a(var2, var3, var4) == ajn.W;
         if(var6.nextInt(var7 + 10) < 5 && !var1.y(var2, var3, var4)) {
            int var10 = var7 + var6.nextInt(5) / 4;
            if(var10 > 15) {
               var10 = 15;
            }

            var1.d(var2, var3, var4, this, var10, 3);
         } else {
            var1.f(var2, var3, var4);
         }

         if(var9) {
            ajn.W.b(var1, var2, var3, var4, 1);
         }
      }

   }

   private boolean e(ahb var1, int var2, int var3, int var4) {
      return this.e((ahl)var1, var2 + 1, var3, var4)?true:(this.e((ahl)var1, var2 - 1, var3, var4)?true:(this.e((ahl)var1, var2, var3 - 1, var4)?true:(this.e((ahl)var1, var2, var3 + 1, var4)?true:(this.e((ahl)var1, var2, var3, var4 - 1)?true:this.e((ahl)var1, var2, var3, var4 + 1)))));
   }

   private int m(ahb var1, int var2, int var3, int var4) {
      byte var5 = 0;
      if(!var1.c(var2, var3, var4)) {
         return 0;
      } else {
         int var6 = this.a(var1, var2 + 1, var3, var4, var5);
         var6 = this.a(var1, var2 - 1, var3, var4, var6);
         var6 = this.a(var1, var2, var3 - 1, var4, var6);
         var6 = this.a(var1, var2, var3 + 1, var4, var6);
         var6 = this.a(var1, var2, var3, var4 - 1, var6);
         var6 = this.a(var1, var2, var3, var4 + 1, var6);
         return var6;
      }
   }

   public boolean v() {
      return false;
   }

   public boolean e(ahl var1, int var2, int var3, int var4) {
      return this.a[aji.b(var1.a(var2, var3, var4))] > 0;
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a[aji.b(var1.a(var2, var3, var4))];
      return var6 > var5?var6:var5;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return ahb.a((ahl)var1, var2, var3 - 1, var4) || this.e(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!ahb.a((ahl)var1, var2, var3 - 1, var4) && !this.e(var1, var2, var3, var4)) {
         var1.f(var2, var3, var4);
      }

   }

   public void b(ahb var1, int var2, int var3, int var4) {
      if(var1.t.i > 0 || !ajn.aO.e(var1, var2, var3, var4)) {
         if(!ahb.a((ahl)var1, var2, var3 - 1, var4) && !this.e(var1, var2, var3, var4)) {
            var1.f(var2, var3, var4);
         } else {
            var1.a(var2, var3, var4, this, this.a(var1) + var1.s.nextInt(10));
         }
      }
   }

   public awv f(int var1) {
      return awv.f;
   }
}
