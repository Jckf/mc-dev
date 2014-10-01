import java.util.List;
import java.util.Random;

public class aag extends zs {

   public rb a = new aah(this, "Enchant", true, 1);
   private ahb h;
   private int i;
   private int j;
   private int k;
   private Random l = new Random();
   public long f;
   public int[] g = new int[3];


   public aag(yx var1, ahb var2, int var3, int var4, int var5) {
      this.h = var2;
      this.i = var3;
      this.j = var4;
      this.k = var5;
      this.a((aay)(new aai(this, this.a, 0, 25, 47)));

      int var6;
      for(var6 = 0; var6 < 3; ++var6) {
         for(int var7 = 0; var7 < 9; ++var7) {
            this.a(new aay(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.a(new aay(var1, var6, 8 + var6 * 18, 142));
      }

   }

   public void a(aac var1) {
      super.a(var1);
      var1.a(this, 0, this.g[0]);
      var1.a(this, 1, this.g[1]);
      var1.a(this, 2, this.g[2]);
   }

   public void b() {
      super.b();

      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         aac var2 = (aac)this.e.get(var1);
         var2.a(this, 0, this.g[0]);
         var2.a(this, 1, this.g[1]);
         var2.a(this, 2, this.g[2]);
      }

   }

   public void a(rb var1) {
      if(var1 == this.a) {
         add var2 = var1.a(0);
         int var3;
         if(var2 != null && var2.x()) {
            this.f = this.l.nextLong();
            if(!this.h.E) {
               var3 = 0;

               int var4;
               for(var4 = -1; var4 <= 1; ++var4) {
                  for(int var5 = -1; var5 <= 1; ++var5) {
                     if((var4 != 0 || var5 != 0) && this.h.c(this.i + var5, this.j, this.k + var4) && this.h.c(this.i + var5, this.j + 1, this.k + var4)) {
                        if(this.h.a(this.i + var5 * 2, this.j, this.k + var4 * 2) == ajn.X) {
                           ++var3;
                        }

                        if(this.h.a(this.i + var5 * 2, this.j + 1, this.k + var4 * 2) == ajn.X) {
                           ++var3;
                        }

                        if(var5 != 0 && var4 != 0) {
                           if(this.h.a(this.i + var5 * 2, this.j, this.k + var4) == ajn.X) {
                              ++var3;
                           }

                           if(this.h.a(this.i + var5 * 2, this.j + 1, this.k + var4) == ajn.X) {
                              ++var3;
                           }

                           if(this.h.a(this.i + var5, this.j, this.k + var4 * 2) == ajn.X) {
                              ++var3;
                           }

                           if(this.h.a(this.i + var5, this.j + 1, this.k + var4 * 2) == ajn.X) {
                              ++var3;
                           }
                        }
                     }
                  }
               }

               for(var4 = 0; var4 < 3; ++var4) {
                  this.g[var4] = afv.a(this.l, var4, var3, var2);
               }

               this.b();
            }
         } else {
            for(var3 = 0; var3 < 3; ++var3) {
               this.g[var3] = 0;
            }
         }
      }

   }

   public boolean a(yz var1, int var2) {
      add var3 = this.a.a(0);
      if(this.g[var2] > 0 && var3 != null && (var1.bF >= this.g[var2] || var1.bE.d)) {
         if(!this.h.E) {
            List var4 = afv.b(this.l, var3, this.g[var2]);
            boolean var5 = var3.b() == ade.aG;
            if(var4 != null) {
               var1.a(-this.g[var2]);
               if(var5) {
                  var3.a((adb)ade.bR);
               }

               int var6 = var5 && var4.size() > 1?this.l.nextInt(var4.size()):-1;

               for(int var7 = 0; var7 < var4.size(); ++var7) {
                  agc var8 = (agc)var4.get(var7);
                  if(!var5 || var7 != var6) {
                     if(var5) {
                        ade.bR.a(var3, var8);
                     } else {
                        var3.a(var8.b, var8.c);
                     }
                  }
               }

               this.a(this.a);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(yz var1) {
      super.b(var1);
      if(!this.h.E) {
         add var2 = this.a.a_(0);
         if(var2 != null) {
            var1.a(var2, false);
         }

      }
   }

   public boolean a(yz var1) {
      return this.h.a(this.i, this.j, this.k) != ajn.bn?false:var1.e((double)this.i + 0.5D, (double)this.j + 0.5D, (double)this.k + 0.5D) <= 64.0D;
   }

   public add b(yz var1, int var2) {
      add var3 = null;
      aay var4 = (aay)this.c.get(var2);
      if(var4 != null && var4.e()) {
         add var5 = var4.d();
         var3 = var5.m();
         if(var2 == 0) {
            if(!this.a(var5, 1, 37, true)) {
               return null;
            }
         } else {
            if(((aay)this.c.get(0)).e() || !((aay)this.c.get(0)).a(var5)) {
               return null;
            }

            if(var5.p() && var5.b == 1) {
               ((aay)this.c.get(0)).c(var5.m());
               var5.b = 0;
            } else if(var5.b >= 1) {
               ((aay)this.c.get(0)).c(new add(var5.b(), 1, var5.k()));
               --var5.b;
            }
         }

         if(var5.b == 0) {
            var4.c((add)null);
         } else {
            var4.f();
         }

         if(var5.b == var3.b) {
            return null;
         }

         var4.a(var1, var5);
      }

      return var3;
   }
}
