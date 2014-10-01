import java.util.List;

public class app extends aji {

   private final boolean a;


   public app(boolean var1) {
      super(awt.H);
      this.a = var1;
      this.a(i);
      this.c(0.5F);
      this.a(abt.d);
   }

   public int b() {
      return 16;
   }

   public boolean c() {
      return false;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      return false;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = a(var1, var2, var3, var4, var5);
      var1.a(var2, var3, var4, var7, 2);
      if(!var1.E) {
         this.e(var1, var2, var3, var4);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E) {
         this.e(var1, var2, var3, var4);
      }

   }

   public void b(ahb var1, int var2, int var3, int var4) {
      if(!var1.E && var1.o(var2, var3, var4) == null) {
         this.e(var1, var2, var3, var4);
      }

   }

   private void e(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      int var6 = b(var5);
      if(var6 != 7) {
         boolean var7 = this.a(var1, var2, var3, var4, var6);
         if(var7 && !c(var5)) {
            if(h(var1, var2, var3, var4, var6)) {
               var1.c(var2, var3, var4, this, 0, var6);
            }
         } else if(!var7 && c(var5)) {
            var1.a(var2, var3, var4, var6, 2);
            var1.c(var2, var3, var4, this, 1, var6);
         }

      }
   }

   private boolean a(ahb var1, int var2, int var3, int var4, int var5) {
      return var5 != 0 && var1.f(var2, var3 - 1, var4, 0)?true:(var5 != 1 && var1.f(var2, var3 + 1, var4, 1)?true:(var5 != 2 && var1.f(var2, var3, var4 - 1, 2)?true:(var5 != 3 && var1.f(var2, var3, var4 + 1, 3)?true:(var5 != 5 && var1.f(var2 + 1, var3, var4, 5)?true:(var5 != 4 && var1.f(var2 - 1, var3, var4, 4)?true:(var1.f(var2, var3, var4, 0)?true:(var1.f(var2, var3 + 2, var4, 1)?true:(var1.f(var2, var3 + 1, var4 - 1, 2)?true:(var1.f(var2, var3 + 1, var4 + 1, 3)?true:(var1.f(var2 - 1, var3 + 1, var4, 4)?true:var1.f(var2 + 1, var3 + 1, var4, 5)))))))))));
   }

   public boolean a(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      if(!var1.E) {
         boolean var7 = this.a(var1, var2, var3, var4, var6);
         if(var7 && var5 == 1) {
            var1.a(var2, var3, var4, var6 | 8, 2);
            return false;
         }

         if(!var7 && var5 == 0) {
            return false;
         }
      }

      if(var5 == 0) {
         if(!this.i(var1, var2, var3, var4, var6)) {
            return false;
         }

         var1.a(var2, var3, var4, var6 | 8, 2);
         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.out", 0.5F, var1.s.nextFloat() * 0.25F + 0.6F);
      } else if(var5 == 1) {
         aor var16 = var1.o(var2 + q.b[var6], var3 + q.c[var6], var4 + q.d[var6]);
         if(var16 instanceof aps) {
            ((aps)var16).f();
         }

         var1.d(var2, var3, var4, ajn.M, var6, 3);
         var1.a(var2, var3, var4, apr.a(this, var6, var6, false, true));
         if(this.a) {
            int var8 = var2 + q.b[var6] * 2;
            int var9 = var3 + q.c[var6] * 2;
            int var10 = var4 + q.d[var6] * 2;
            aji var11 = var1.a(var8, var9, var10);
            int var12 = var1.e(var8, var9, var10);
            boolean var13 = false;
            if(var11 == ajn.M) {
               aor var14 = var1.o(var8, var9, var10);
               if(var14 instanceof aps) {
                  aps var15 = (aps)var14;
                  if(var15.c() == var6 && var15.b()) {
                     var15.f();
                     var11 = var15.a();
                     var12 = var15.p();
                     var13 = true;
                  }
               }
            }

            if(!var13 && var11.o() != awt.a && a(var11, var1, var8, var9, var10, false) && (var11.h() == 0 || var11 == ajn.J || var11 == ajn.F)) {
               var2 += q.b[var6];
               var3 += q.c[var6];
               var4 += q.d[var6];
               var1.d(var2, var3, var4, ajn.M, var12, 3);
               var1.a(var2, var3, var4, apr.a(var11, var12, var6, false, false));
               var1.f(var8, var9, var10);
            } else if(!var13) {
               var1.f(var2 + q.b[var6], var3 + q.c[var6], var4 + q.d[var6]);
            }
         } else {
            var1.f(var2 + q.b[var6], var3 + q.c[var6], var4 + q.d[var6]);
         }

         var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "tile.piston.in", 0.5F, var1.s.nextFloat() * 0.15F + 0.6F);
      }

      return true;
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if(c(var5)) {
         float var6 = 0.25F;
         switch(b(var5)) {
         case 0:
            this.a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 1:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
            break;
         case 2:
            this.a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
            break;
         case 3:
            this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
            break;
         case 4:
            this.a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
         case 5:
            this.a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
         }
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void g() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      this.a((ahl)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4);
   }

   public boolean d() {
      return false;
   }

   public static int b(int var0) {
      return var0 & 7;
   }

   public static boolean c(int var0) {
      return (var0 & 8) != 0;
   }

   public static int a(ahb var0, int var1, int var2, int var3, sv var4) {
      if(qh.e((float)var4.s - (float)var1) < 2.0F && qh.e((float)var4.u - (float)var3) < 2.0F) {
         double var5 = var4.t + 1.82D - (double)var4.L;
         if(var5 - (double)var2 > 2.0D) {
            return 1;
         }

         if((double)var2 - var5 > 0.0D) {
            return 0;
         }
      }

      int var7 = qh.c((double)(var4.y * 4.0F / 360.0F) + 0.5D) & 3;
      return var7 == 0?2:(var7 == 1?5:(var7 == 2?3:(var7 == 3?4:0)));
   }

   private static boolean a(aji var0, ahb var1, int var2, int var3, int var4, boolean var5) {
      if(var0 == ajn.Z) {
         return false;
      } else {
         if(var0 != ajn.J && var0 != ajn.F) {
            if(var0.f(var1, var2, var3, var4) == -1.0F) {
               return false;
            }

            if(var0.h() == 2) {
               return false;
            }

            if(var0.h() == 1) {
               if(!var5) {
                  return false;
               }

               return true;
            }
         } else if(c(var1.e(var2, var3, var4))) {
            return false;
         }

         return !(var0 instanceof akw);
      }
   }

   private static boolean h(ahb var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 + q.b[var4];
      int var6 = var2 + q.c[var4];
      int var7 = var3 + q.d[var4];
      int var8 = 0;

      while(true) {
         if(var8 < 13) {
            if(var6 <= 0 || var6 >= 255) {
               return false;
            }

            aji var9 = var0.a(var5, var6, var7);
            if(var9.o() != awt.a) {
               if(!a(var9, var0, var5, var6, var7, true)) {
                  return false;
               }

               if(var9.h() != 1) {
                  if(var8 == 12) {
                     return false;
                  }

                  var5 += q.b[var4];
                  var6 += q.c[var4];
                  var7 += q.d[var4];
                  ++var8;
                  continue;
               }
            }
         }

         return true;
      }
   }

   private boolean i(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 + q.b[var5];
      int var7 = var3 + q.c[var5];
      int var8 = var4 + q.d[var5];
      int var9 = 0;

      while(true) {
         if(var9 < 13) {
            if(var7 <= 0 || var7 >= 255) {
               return false;
            }

            aji var10 = var1.a(var6, var7, var8);
            if(var10.o() != awt.a) {
               if(!a(var10, var1, var6, var7, var8, true)) {
                  return false;
               }

               if(var10.h() != 1) {
                  if(var9 == 12) {
                     return false;
                  }

                  var6 += q.b[var5];
                  var7 += q.c[var5];
                  var8 += q.d[var5];
                  ++var9;
                  continue;
               }

               var10.b(var1, var6, var7, var8, var1.e(var6, var7, var8), 0);
               var1.f(var6, var7, var8);
            }
         }

         var9 = var6;
         int var19 = var7;
         int var11 = var8;
         int var12 = 0;

         aji[] var13;
         int var14;
         int var15;
         int var16;
         for(var13 = new aji[13]; var6 != var2 || var7 != var3 || var8 != var4; var8 = var16) {
            var14 = var6 - q.b[var5];
            var15 = var7 - q.c[var5];
            var16 = var8 - q.d[var5];
            aji var17 = var1.a(var14, var15, var16);
            int var18 = var1.e(var14, var15, var16);
            if(var17 == this && var14 == var2 && var15 == var3 && var16 == var4) {
               var1.d(var6, var7, var8, ajn.M, var5 | (this.a?8:0), 4);
               var1.a(var6, var7, var8, apr.a(ajn.K, var5 | (this.a?8:0), var5, true, false));
            } else {
               var1.d(var6, var7, var8, ajn.M, var18, 4);
               var1.a(var6, var7, var8, apr.a(var17, var18, var5, true, false));
            }

            var13[var12++] = var17;
            var6 = var14;
            var7 = var15;
         }

         var6 = var9;
         var7 = var19;
         var8 = var11;

         for(var12 = 0; var6 != var2 || var7 != var3 || var8 != var4; var8 = var16) {
            var14 = var6 - q.b[var5];
            var15 = var7 - q.c[var5];
            var16 = var8 - q.d[var5];
            var1.d(var14, var15, var16, var13[var12++]);
            var6 = var14;
            var7 = var15;
         }

         return true;
      }
   }
}
