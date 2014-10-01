
public class ayg {

   private ahl a;
   private ayd b = new ayd();
   private pz c = new pz();
   private aye[] d = new aye[32];
   private boolean e;
   private boolean f;
   private boolean g;
   private boolean h;


   public ayg(ahl var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.a = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
      this.h = var5;
   }

   public ayf a(sa var1, sa var2, float var3) {
      return this.a(var1, var2.s, var2.C.b, var2.u, var3);
   }

   public ayf a(sa var1, int var2, int var3, int var4, float var5) {
      return this.a(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), var5);
   }

   private ayf a(sa var1, double var2, double var4, double var6, float var8) {
      this.b.a();
      this.c.c();
      boolean var9 = this.g;
      int var10 = qh.c(var1.C.b + 0.5D);
      if(this.h && var1.M()) {
         var10 = (int)var1.C.b;

         for(aji var11 = this.a.a(qh.c(var1.s), var10, qh.c(var1.u)); var11 == ajn.i || var11 == ajn.j; var11 = this.a.a(qh.c(var1.s), var10, qh.c(var1.u))) {
            ++var10;
         }

         var9 = this.g;
         this.g = false;
      } else {
         var10 = qh.c(var1.C.b + 0.5D);
      }

      aye var15 = this.a(qh.c(var1.C.a), var10, qh.c(var1.C.c));
      aye var12 = this.a(qh.c(var2 - (double)(var1.M / 2.0F)), qh.c(var4), qh.c(var6 - (double)(var1.M / 2.0F)));
      aye var13 = new aye(qh.d(var1.M + 1.0F), qh.d(var1.N + 1.0F), qh.d(var1.M + 1.0F));
      ayf var14 = this.a(var1, var15, var12, var13, var8);
      this.g = var9;
      return var14;
   }

   private ayf a(sa var1, aye var2, aye var3, aye var4, float var5) {
      var2.e = 0.0F;
      var2.f = var2.b(var3);
      var2.g = var2.f;
      this.b.a();
      this.b.a(var2);
      aye var6 = var2;

      while(!this.b.e()) {
         aye var7 = this.b.c();
         if(var7.equals(var3)) {
            return this.a(var2, var3);
         }

         if(var7.b(var3) < var6.b(var3)) {
            var6 = var7;
         }

         var7.i = true;
         int var8 = this.b(var1, var7, var4, var3, var5);

         for(int var9 = 0; var9 < var8; ++var9) {
            aye var10 = this.d[var9];
            float var11 = var7.e + var7.b(var10);
            if(!var10.a() || var11 < var10.e) {
               var10.h = var7;
               var10.e = var11;
               var10.f = var10.b(var3);
               if(var10.a()) {
                  this.b.a(var10, var10.e + var10.f);
               } else {
                  var10.g = var10.e + var10.f;
                  this.b.a(var10);
               }
            }
         }
      }

      if(var6 == var2) {
         return null;
      } else {
         return this.a(var2, var6);
      }
   }

   private int b(sa var1, aye var2, aye var3, aye var4, float var5) {
      int var6 = 0;
      byte var7 = 0;
      if(this.a(var1, var2.a, var2.b + 1, var2.c, var3) == 1) {
         var7 = 1;
      }

      aye var8 = this.a(var1, var2.a, var2.b, var2.c + 1, var3, var7);
      aye var9 = this.a(var1, var2.a - 1, var2.b, var2.c, var3, var7);
      aye var10 = this.a(var1, var2.a + 1, var2.b, var2.c, var3, var7);
      aye var11 = this.a(var1, var2.a, var2.b, var2.c - 1, var3, var7);
      if(var8 != null && !var8.i && var8.a(var4) < var5) {
         this.d[var6++] = var8;
      }

      if(var9 != null && !var9.i && var9.a(var4) < var5) {
         this.d[var6++] = var9;
      }

      if(var10 != null && !var10.i && var10.a(var4) < var5) {
         this.d[var6++] = var10;
      }

      if(var11 != null && !var11.i && var11.a(var4) < var5) {
         this.d[var6++] = var11;
      }

      return var6;
   }

   private aye a(sa var1, int var2, int var3, int var4, aye var5, int var6) {
      aye var7 = null;
      int var8 = this.a(var1, var2, var3, var4, var5);
      if(var8 == 2) {
         return this.a(var2, var3, var4);
      } else {
         if(var8 == 1) {
            var7 = this.a(var2, var3, var4);
         }

         if(var7 == null && var6 > 0 && var8 != -3 && var8 != -4 && this.a(var1, var2, var3 + var6, var4, var5) == 1) {
            var7 = this.a(var2, var3 + var6, var4);
            var3 += var6;
         }

         if(var7 != null) {
            int var9 = 0;
            int var10 = 0;

            while(var3 > 0) {
               var10 = this.a(var1, var2, var3 - 1, var4, var5);
               if(this.g && var10 == -1) {
                  return null;
               }

               if(var10 != 1) {
                  break;
               }

               if(var9++ >= var1.ax()) {
                  return null;
               }

               --var3;
               if(var3 > 0) {
                  var7 = this.a(var2, var3, var4);
               }
            }

            if(var10 == -2) {
               return null;
            }
         }

         return var7;
      }
   }

   private final aye a(int var1, int var2, int var3) {
      int var4 = aye.a(var1, var2, var3);
      aye var5 = (aye)this.c.a(var4);
      if(var5 == null) {
         var5 = new aye(var1, var2, var3);
         this.c.a(var4, var5);
      }

      return var5;
   }

   public int a(sa var1, int var2, int var3, int var4, aye var5) {
      return a(var1, var2, var3, var4, var5, this.g, this.f, this.e);
   }

   public static int a(sa var0, int var1, int var2, int var3, aye var4, boolean var5, boolean var6, boolean var7) {
      boolean var8 = false;

      for(int var9 = var1; var9 < var1 + var4.a; ++var9) {
         for(int var10 = var2; var10 < var2 + var4.b; ++var10) {
            for(int var11 = var3; var11 < var3 + var4.c; ++var11) {
               aji var12 = var0.o.a(var9, var10, var11);
               if(var12.o() != awt.a) {
                  if(var12 == ajn.aT) {
                     var8 = true;
                  } else if(var12 != ajn.i && var12 != ajn.j) {
                     if(!var7 && var12 == ajn.ao) {
                        return 0;
                     }
                  } else {
                     if(var5) {
                        return -1;
                     }

                     var8 = true;
                  }

                  int var13 = var12.b();
                  if(var0.o.a(var9, var10, var11).b() == 9) {
                     int var17 = qh.c(var0.s);
                     int var15 = qh.c(var0.t);
                     int var16 = qh.c(var0.u);
                     if(var0.o.a(var17, var15, var16).b() != 9 && var0.o.a(var17, var15 - 1, var16).b() != 9) {
                        return -3;
                     }
                  } else if(!var12.b((ahl)var0.o, var9, var10, var11) && (!var6 || var12 != ajn.ao)) {
                     if(var13 == 11 || var12 == ajn.be || var13 == 32) {
                        return -3;
                     }

                     if(var12 == ajn.aT) {
                        return -4;
                     }

                     awt var14 = var12.o();
                     if(var14 != awt.i) {
                        return 0;
                     }

                     if(!var0.P()) {
                        return -2;
                     }
                  }
               }
            }
         }
      }

      return var8?2:1;
   }

   private ayf a(aye var1, aye var2) {
      int var3 = 1;

      aye var4;
      for(var4 = var2; var4.h != null; var4 = var4.h) {
         ++var3;
      }

      aye[] var5 = new aye[var3];
      var4 = var2;
      --var3;

      for(var5[var3] = var2; var4.h != null; var5[var3] = var4) {
         var4 = var4.h;
         --var3;
      }

      return new ayf(var5);
   }
}
