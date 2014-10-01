import java.util.Iterator;
import java.util.Random;

public class ajx extends ajc {

   private final Random b = new Random();
   public final int a;


   protected ajx(int var1) {
      super(awt.d);
      this.a = var1;
      this.a(abt.c);
      this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 22;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4 - 1) == this) {
         this.a(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
      } else if(var1.a(var2, var3, var4 + 1) == this) {
         this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
      } else if(var1.a(var2 - 1, var3, var4) == this) {
         this.a(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
      } else if(var1.a(var2 + 1, var3, var4) == this) {
         this.a(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
      } else {
         this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
      }

   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      this.e(var1, var2, var3, var4);
      aji var5 = var1.a(var2, var3, var4 - 1);
      aji var6 = var1.a(var2, var3, var4 + 1);
      aji var7 = var1.a(var2 - 1, var3, var4);
      aji var8 = var1.a(var2 + 1, var3, var4);
      if(var5 == this) {
         this.e(var1, var2, var3, var4 - 1);
      }

      if(var6 == this) {
         this.e(var1, var2, var3, var4 + 1);
      }

      if(var7 == this) {
         this.e(var1, var2 - 1, var3, var4);
      }

      if(var8 == this) {
         this.e(var1, var2 + 1, var3, var4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      aji var7 = var1.a(var2, var3, var4 - 1);
      aji var8 = var1.a(var2, var3, var4 + 1);
      aji var9 = var1.a(var2 - 1, var3, var4);
      aji var10 = var1.a(var2 + 1, var3, var4);
      byte var11 = 0;
      int var12 = qh.c((double)(var5.y * 4.0F / 360.0F) + 0.5D) & 3;
      if(var12 == 0) {
         var11 = 2;
      }

      if(var12 == 1) {
         var11 = 5;
      }

      if(var12 == 2) {
         var11 = 3;
      }

      if(var12 == 3) {
         var11 = 4;
      }

      if(var7 != this && var8 != this && var9 != this && var10 != this) {
         var1.a(var2, var3, var4, var11, 3);
      } else {
         if((var7 == this || var8 == this) && (var11 == 4 || var11 == 5)) {
            if(var7 == this) {
               var1.a(var2, var3, var4 - 1, var11, 3);
            } else {
               var1.a(var2, var3, var4 + 1, var11, 3);
            }

            var1.a(var2, var3, var4, var11, 3);
         }

         if((var9 == this || var10 == this) && (var11 == 2 || var11 == 3)) {
            if(var9 == this) {
               var1.a(var2 - 1, var3, var4, var11, 3);
            } else {
               var1.a(var2 + 1, var3, var4, var11, 3);
            }

            var1.a(var2, var3, var4, var11, 3);
         }
      }

      if(var6.u()) {
         ((aow)var1.o(var2, var3, var4)).a(var6.s());
      }

   }

   public void e(ahb var1, int var2, int var3, int var4) {
      if(!var1.E) {
         aji var5 = var1.a(var2, var3, var4 - 1);
         aji var6 = var1.a(var2, var3, var4 + 1);
         aji var7 = var1.a(var2 - 1, var3, var4);
         aji var8 = var1.a(var2 + 1, var3, var4);
         boolean var9 = true;
         int var10;
         aji var11;
         int var12;
         aji var13;
         boolean var14;
         byte var15;
         int var16;
         if(var5 != this && var6 != this) {
            if(var7 != this && var8 != this) {
               var15 = 3;
               if(var5.j() && !var6.j()) {
                  var15 = 3;
               }

               if(var6.j() && !var5.j()) {
                  var15 = 2;
               }

               if(var7.j() && !var8.j()) {
                  var15 = 5;
               }

               if(var8.j() && !var7.j()) {
                  var15 = 4;
               }
            } else {
               var10 = var7 == this?var2 - 1:var2 + 1;
               var11 = var1.a(var10, var3, var4 - 1);
               var12 = var7 == this?var2 - 1:var2 + 1;
               var13 = var1.a(var12, var3, var4 + 1);
               var15 = 3;
               var14 = true;
               if(var7 == this) {
                  var16 = var1.e(var2 - 1, var3, var4);
               } else {
                  var16 = var1.e(var2 + 1, var3, var4);
               }

               if(var16 == 2) {
                  var15 = 2;
               }

               if((var5.j() || var11.j()) && !var6.j() && !var13.j()) {
                  var15 = 3;
               }

               if((var6.j() || var13.j()) && !var5.j() && !var11.j()) {
                  var15 = 2;
               }
            }
         } else {
            var10 = var5 == this?var4 - 1:var4 + 1;
            var11 = var1.a(var2 - 1, var3, var10);
            var12 = var5 == this?var4 - 1:var4 + 1;
            var13 = var1.a(var2 + 1, var3, var12);
            var15 = 5;
            var14 = true;
            if(var5 == this) {
               var16 = var1.e(var2, var3, var4 - 1);
            } else {
               var16 = var1.e(var2, var3, var4 + 1);
            }

            if(var16 == 4) {
               var15 = 4;
            }

            if((var7.j() || var11.j()) && !var8.j() && !var13.j()) {
               var15 = 5;
            }

            if((var8.j() || var13.j()) && !var7.j() && !var11.j()) {
               var15 = 4;
            }
         }

         var1.a(var2, var3, var4, var15, 3);
      }
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      int var5 = 0;
      if(var1.a(var2 - 1, var3, var4) == this) {
         ++var5;
      }

      if(var1.a(var2 + 1, var3, var4) == this) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 - 1) == this) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 + 1) == this) {
         ++var5;
      }

      return var5 > 1?false:(this.n(var1, var2 - 1, var3, var4)?false:(this.n(var1, var2 + 1, var3, var4)?false:(this.n(var1, var2, var3, var4 - 1)?false:!this.n(var1, var2, var3, var4 + 1))));
   }

   private boolean n(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4) != this?false:(var1.a(var2 - 1, var3, var4) == this?true:(var1.a(var2 + 1, var3, var4) == this?true:(var1.a(var2, var3, var4 - 1) == this?true:var1.a(var2, var3, var4 + 1) == this)));
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      super.a(var1, var2, var3, var4, var5);
      aow var6 = (aow)var1.o(var2, var3, var4);
      if(var6 != null) {
         var6.u();
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      aow var7 = (aow)var1.o(var2, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.a(); ++var8) {
            add var9 = var7.a(var8);
            if(var9 != null) {
               float var10 = this.b.nextFloat() * 0.8F + 0.1F;
               float var11 = this.b.nextFloat() * 0.8F + 0.1F;

               xk var14;
               for(float var12 = this.b.nextFloat() * 0.8F + 0.1F; var9.b > 0; var1.d((sa)var14)) {
                  int var13 = this.b.nextInt(21) + 10;
                  if(var13 > var9.b) {
                     var13 = var9.b;
                  }

                  var9.b -= var13;
                  var14 = new xk(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new add(var9.b(), var13, var9.k()));
                  float var15 = 0.05F;
                  var14.v = (double)((float)this.b.nextGaussian() * var15);
                  var14.w = (double)((float)this.b.nextGaussian() * var15 + 0.2F);
                  var14.x = (double)((float)this.b.nextGaussian() * var15);
                  if(var9.p()) {
                     var14.f().d((dh)var9.q().b());
                  }
               }
            }
         }

         var1.f(var2, var3, var4, var5);
      }

      super.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         rb var10 = this.m(var1, var2, var3, var4);
         if(var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public rb m(ahb var1, int var2, int var3, int var4) {
      Object var5 = (aow)var1.o(var2, var3, var4);
      if(var5 == null) {
         return null;
      } else if(var1.a(var2, var3 + 1, var4).r()) {
         return null;
      } else if(o(var1, var2, var3, var4)) {
         return null;
      } else if(var1.a(var2 - 1, var3, var4) == this && (var1.a(var2 - 1, var3 + 1, var4).r() || o(var1, var2 - 1, var3, var4))) {
         return null;
      } else if(var1.a(var2 + 1, var3, var4) == this && (var1.a(var2 + 1, var3 + 1, var4).r() || o(var1, var2 + 1, var3, var4))) {
         return null;
      } else if(var1.a(var2, var3, var4 - 1) == this && (var1.a(var2, var3 + 1, var4 - 1).r() || o(var1, var2, var3, var4 - 1))) {
         return null;
      } else if(var1.a(var2, var3, var4 + 1) == this && (var1.a(var2, var3 + 1, var4 + 1).r() || o(var1, var2, var3, var4 + 1))) {
         return null;
      } else {
         if(var1.a(var2 - 1, var3, var4) == this) {
            var5 = new ra("container.chestDouble", (aow)var1.o(var2 - 1, var3, var4), (rb)var5);
         }

         if(var1.a(var2 + 1, var3, var4) == this) {
            var5 = new ra("container.chestDouble", (rb)var5, (aow)var1.o(var2 + 1, var3, var4));
         }

         if(var1.a(var2, var3, var4 - 1) == this) {
            var5 = new ra("container.chestDouble", (aow)var1.o(var2, var3, var4 - 1), (rb)var5);
         }

         if(var1.a(var2, var3, var4 + 1) == this) {
            var5 = new ra("container.chestDouble", (rb)var5, (aow)var1.o(var2, var3, var4 + 1));
         }

         return (rb)var5;
      }
   }

   public aor a(ahb var1, int var2) {
      aow var3 = new aow();
      return var3;
   }

   public boolean f() {
      return this.a == 1;
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      if(!this.f()) {
         return 0;
      } else {
         int var6 = ((aow)var1.o(var2, var3, var4)).o;
         return qh.a(var6, 0, 15);
      }
   }

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      return var5 == 1?this.b(var1, var2, var3, var4, var5):0;
   }

   private static boolean o(ahb var0, int var1, int var2, int var3) {
      Iterator var4 = var0.a(wn.class, azt.a((double)var1, (double)(var2 + 1), (double)var3, (double)(var1 + 1), (double)(var2 + 2), (double)(var3 + 1))).iterator();

      wn var6;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         sa var5 = (sa)var4.next();
         var6 = (wn)var5;
      } while(!var6.ca());

      return true;
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      return zs.b(this.m(var1, var2, var3, var4));
   }
}
