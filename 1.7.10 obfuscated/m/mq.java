import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mq {

   private static final Logger a = LogManager.getLogger();
   private final mt b;
   private final List c = new ArrayList();
   private final qd d = new qd();
   private final List e = new ArrayList();
   private final List f = new ArrayList();
   private int g;
   private long h;
   private final int[][] i = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};


   public mq(mt var1) {
      this.b = var1;
      this.a(var1.q().ah().s());
   }

   public mt a() {
      return this.b;
   }

   public void b() {
      long var1 = this.b.I();
      int var3;
      mr var4;
      if(var1 - this.h > 8000L) {
         this.h = var1;

         for(var3 = 0; var3 < this.f.size(); ++var3) {
            var4 = (mr)this.f.get(var3);
            var4.b();
            var4.a();
         }
      } else {
         for(var3 = 0; var3 < this.e.size(); ++var3) {
            var4 = (mr)this.e.get(var3);
            var4.b();
         }
      }

      this.e.clear();
      if(this.c.isEmpty()) {
         aqo var5 = this.b.t;
         if(!var5.e()) {
            this.b.b.b();
         }
      }

   }

   public boolean a(int var1, int var2) {
      long var3 = (long)var1 + 2147483647L | (long)var2 + 2147483647L << 32;
      return this.d.a(var3) != null;
   }

   private mr a(int var1, int var2, boolean var3) {
      long var4 = (long)var1 + 2147483647L | (long)var2 + 2147483647L << 32;
      mr var6 = (mr)this.d.a(var4);
      if(var6 == null && var3) {
         var6 = new mr(this, var1, var2);
         this.d.a(var4, var6);
         this.f.add(var6);
      }

      return var6;
   }

   public void a(int var1, int var2, int var3) {
      int var4 = var1 >> 4;
      int var5 = var3 >> 4;
      mr var6 = this.a(var4, var5, false);
      if(var6 != null) {
         var6.a(var1 & 15, var2, var3 & 15);
      }

   }

   public void a(mw var1) {
      int var2 = (int)var1.s >> 4;
      int var3 = (int)var1.u >> 4;
      var1.d = var1.s;
      var1.e = var1.u;

      for(int var4 = var2 - this.g; var4 <= var2 + this.g; ++var4) {
         for(int var5 = var3 - this.g; var5 <= var3 + this.g; ++var5) {
            this.a(var4, var5, true).a(var1);
         }
      }

      this.c.add(var1);
      this.b(var1);
   }

   public void b(mw var1) {
      ArrayList var2 = new ArrayList(var1.f);
      int var3 = 0;
      int var4 = this.g;
      int var5 = (int)var1.s >> 4;
      int var6 = (int)var1.u >> 4;
      int var7 = 0;
      int var8 = 0;
      agu var9 = mr.a(this.a(var5, var6, true));
      var1.f.clear();
      if(var2.contains(var9)) {
         var1.f.add(var9);
      }

      int var10;
      for(var10 = 1; var10 <= var4 * 2; ++var10) {
         for(int var11 = 0; var11 < 2; ++var11) {
            int[] var12 = this.i[var3++ % 4];

            for(int var13 = 0; var13 < var10; ++var13) {
               var7 += var12[0];
               var8 += var12[1];
               var9 = mr.a(this.a(var5 + var7, var6 + var8, true));
               if(var2.contains(var9)) {
                  var1.f.add(var9);
               }
            }
         }
      }

      var3 %= 4;

      for(var10 = 0; var10 < var4 * 2; ++var10) {
         var7 += this.i[var3][0];
         var8 += this.i[var3][1];
         var9 = mr.a(this.a(var5 + var7, var6 + var8, true));
         if(var2.contains(var9)) {
            var1.f.add(var9);
         }
      }

   }

   public void c(mw var1) {
      int var2 = (int)var1.d >> 4;
      int var3 = (int)var1.e >> 4;

      for(int var4 = var2 - this.g; var4 <= var2 + this.g; ++var4) {
         for(int var5 = var3 - this.g; var5 <= var3 + this.g; ++var5) {
            mr var6 = this.a(var4, var5, false);
            if(var6 != null) {
               var6.b(var1);
            }
         }
      }

      this.c.remove(var1);
   }

   private boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 - var3;
      int var7 = var2 - var4;
      return var6 >= -var5 && var6 <= var5?var7 >= -var5 && var7 <= var5:false;
   }

   public void d(mw var1) {
      int var2 = (int)var1.s >> 4;
      int var3 = (int)var1.u >> 4;
      double var4 = var1.d - var1.s;
      double var6 = var1.e - var1.u;
      double var8 = var4 * var4 + var6 * var6;
      if(var8 >= 64.0D) {
         int var10 = (int)var1.d >> 4;
         int var11 = (int)var1.e >> 4;
         int var12 = this.g;
         int var13 = var2 - var10;
         int var14 = var3 - var11;
         if(var13 != 0 || var14 != 0) {
            for(int var15 = var2 - var12; var15 <= var2 + var12; ++var15) {
               for(int var16 = var3 - var12; var16 <= var3 + var12; ++var16) {
                  if(!this.a(var15, var16, var10, var11, var12)) {
                     this.a(var15, var16, true).a(var1);
                  }

                  if(!this.a(var15 - var13, var16 - var14, var2, var3, var12)) {
                     mr var17 = this.a(var15 - var13, var16 - var14, false);
                     if(var17 != null) {
                        var17.b(var1);
                     }
                  }
               }
            }

            this.b(var1);
            var1.d = var1.s;
            var1.e = var1.u;
         }
      }
   }

   public boolean a(mw var1, int var2, int var3) {
      mr var4 = this.a(var2, var3, false);
      return var4 != null && mr.b(var4).contains(var1) && !var1.f.contains(mr.a(var4));
   }

   public void a(int var1) {
      var1 = qh.a(var1, 3, 20);
      if(var1 != this.g) {
         int var2 = var1 - this.g;
         Iterator var3 = this.c.iterator();

         while(var3.hasNext()) {
            mw var4 = (mw)var3.next();
            int var5 = (int)var4.s >> 4;
            int var6 = (int)var4.u >> 4;
            int var7;
            int var8;
            if(var2 > 0) {
               for(var7 = var5 - var1; var7 <= var5 + var1; ++var7) {
                  for(var8 = var6 - var1; var8 <= var6 + var1; ++var8) {
                     mr var9 = this.a(var7, var8, true);
                     if(!mr.b(var9).contains(var4)) {
                        var9.a(var4);
                     }
                  }
               }
            } else {
               for(var7 = var5 - this.g; var7 <= var5 + this.g; ++var7) {
                  for(var8 = var6 - this.g; var8 <= var6 + this.g; ++var8) {
                     if(!this.a(var7, var8, var5, var6, var1)) {
                        this.a(var7, var8, true).b(var4);
                     }
                  }
               }
            }
         }

         this.g = var1;
      }
   }

   public static int b(int var0) {
      return var0 * 16 - 16;
   }

   // $FF: synthetic method
   static Logger c() {
      return a;
   }

   // $FF: synthetic method
   static mt a(mq var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static qd b(mq var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static List c(mq var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static List d(mq var0) {
      return var0.e;
   }

}
