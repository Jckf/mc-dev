import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class apx {

   private static final Logger t = LogManager.getLogger();
   public static boolean a;
   private apz[] u;
   private byte[] v;
   public int[] b;
   public boolean[] c;
   public boolean d;
   public ahb e;
   public int[] f;
   public final int g;
   public final int h;
   private boolean w;
   public Map i;
   public List[] j;
   public boolean k;
   public boolean l;
   public boolean m;
   public boolean n;
   public boolean o;
   public long p;
   public boolean q;
   public int r;
   public long s;
   private int x;


   public apx(ahb var1, int var2, int var3) {
      this.u = new apz[16];
      this.v = new byte[256];
      this.b = new int[256];
      this.c = new boolean[256];
      this.i = new HashMap();
      this.x = 4096;
      this.j = new List[16];
      this.e = var1;
      this.g = var2;
      this.h = var3;
      this.f = new int[256];

      for(int var4 = 0; var4 < this.j.length; ++var4) {
         this.j[var4] = new ArrayList();
      }

      Arrays.fill(this.b, -999);
      Arrays.fill(this.v, (byte)-1);
   }

   public apx(ahb var1, aji[] var2, int var3, int var4) {
      this(var1, var3, var4);
      int var5 = var2.length / 256;
      boolean var6 = !var1.t.g;

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            for(int var9 = 0; var9 < var5; ++var9) {
               aji var10 = var2[var7 << 11 | var8 << 7 | var9];
               if(var10 != null && var10.o() != awt.a) {
                  int var11 = var9 >> 4;
                  if(this.u[var11] == null) {
                     this.u[var11] = new apz(var11 << 4, var6);
                  }

                  this.u[var11].a(var7, var9 & 15, var8, var10);
               }
            }
         }
      }

   }

   public apx(ahb var1, aji[] var2, byte[] var3, int var4, int var5) {
      this(var1, var4, var5);
      int var6 = var2.length / 256;
      boolean var7 = !var1.t.g;

      for(int var8 = 0; var8 < 16; ++var8) {
         for(int var9 = 0; var9 < 16; ++var9) {
            for(int var10 = 0; var10 < var6; ++var10) {
               int var11 = var8 * var6 * 16 | var9 * var6 | var10;
               aji var12 = var2[var11];
               if(var12 != null && var12 != ajn.a) {
                  int var13 = var10 >> 4;
                  if(this.u[var13] == null) {
                     this.u[var13] = new apz(var13 << 4, var7);
                  }

                  this.u[var13].a(var8, var10 & 15, var9, var12);
                  this.u[var13].a(var8, var10 & 15, var9, var3[var11]);
               }
            }
         }
      }

   }

   public boolean a(int var1, int var2) {
      return var1 == this.g && var2 == this.h;
   }

   public int b(int var1, int var2) {
      return this.f[var2 << 4 | var1];
   }

   public int h() {
      for(int var1 = this.u.length - 1; var1 >= 0; --var1) {
         if(this.u[var1] != null) {
            return this.u[var1].d();
         }
      }

      return 0;
   }

   public apz[] i() {
      return this.u;
   }

   public void b() {
      int var1 = this.h();
      this.r = Integer.MAX_VALUE;

      for(int var2 = 0; var2 < 16; ++var2) {
         int var3 = 0;

         while(var3 < 16) {
            this.b[var2 + (var3 << 4)] = -999;
            int var4 = var1 + 16 - 1;

            while(true) {
               if(var4 > 0) {
                  if(this.b(var2, var4 - 1, var3) == 0) {
                     --var4;
                     continue;
                  }

                  this.f[var3 << 4 | var2] = var4;
                  if(var4 < this.r) {
                     this.r = var4;
                  }
               }

               if(!this.e.t.g) {
                  var4 = 15;
                  int var5 = var1 + 16 - 1;

                  do {
                     int var6 = this.b(var2, var5, var3);
                     if(var6 == 0 && var4 != 15) {
                        var6 = 1;
                     }

                     var4 -= var6;
                     if(var4 > 0) {
                        apz var7 = this.u[var5 >> 4];
                        if(var7 != null) {
                           var7.b(var2, var5 & 15, var3, var4);
                           this.e.m((this.g << 4) + var2, var5, (this.h << 4) + var3);
                        }
                     }

                     --var5;
                  } while(var5 > 0 && var4 > 0);
               }

               ++var3;
               break;
            }
         }
      }

      this.n = true;
   }

   private void e(int var1, int var2) {
      this.c[var1 + var2 * 16] = true;
      this.w = true;
   }

   private void c(boolean var1) {
      this.e.C.a("recheckGaps");
      if(this.e.a(this.g * 16 + 8, 0, this.h * 16 + 8, 16)) {
         for(int var2 = 0; var2 < 16; ++var2) {
            for(int var3 = 0; var3 < 16; ++var3) {
               if(this.c[var2 + var3 * 16]) {
                  this.c[var2 + var3 * 16] = false;
                  int var4 = this.b(var2, var3);
                  int var5 = this.g * 16 + var2;
                  int var6 = this.h * 16 + var3;
                  int var7 = this.e.g(var5 - 1, var6);
                  int var8 = this.e.g(var5 + 1, var6);
                  int var9 = this.e.g(var5, var6 - 1);
                  int var10 = this.e.g(var5, var6 + 1);
                  if(var8 < var7) {
                     var7 = var8;
                  }

                  if(var9 < var7) {
                     var7 = var9;
                  }

                  if(var10 < var7) {
                     var7 = var10;
                  }

                  this.g(var5, var6, var7);
                  this.g(var5 - 1, var6, var4);
                  this.g(var5 + 1, var6, var4);
                  this.g(var5, var6 - 1, var4);
                  this.g(var5, var6 + 1, var4);
                  if(var1) {
                     this.e.C.b();
                     return;
                  }
               }
            }
         }

         this.w = false;
      }

      this.e.C.b();
   }

   private void g(int var1, int var2, int var3) {
      int var4 = this.e.f(var1, var2);
      if(var4 > var3) {
         this.c(var1, var2, var3, var4 + 1);
      } else if(var4 < var3) {
         this.c(var1, var2, var4, var3 + 1);
      }

   }

   private void c(int var1, int var2, int var3, int var4) {
      if(var4 > var3 && this.e.a(var1, 0, var2, 16)) {
         for(int var5 = var3; var5 < var4; ++var5) {
            this.e.c(ahn.a, var1, var5, var2);
         }

         this.n = true;
      }

   }

   private void h(int var1, int var2, int var3) {
      int var4 = this.f[var3 << 4 | var1] & 255;
      int var5 = var4;
      if(var2 > var4) {
         var5 = var2;
      }

      while(var5 > 0 && this.b(var1, var5 - 1, var3) == 0) {
         --var5;
      }

      if(var5 != var4) {
         this.e.b(var1 + this.g * 16, var3 + this.h * 16, var5, var4);
         this.f[var3 << 4 | var1] = var5;
         int var6 = this.g * 16 + var1;
         int var7 = this.h * 16 + var3;
         int var8;
         int var12;
         if(!this.e.t.g) {
            apz var9;
            if(var5 < var4) {
               for(var8 = var5; var8 < var4; ++var8) {
                  var9 = this.u[var8 >> 4];
                  if(var9 != null) {
                     var9.b(var1, var8 & 15, var3, 15);
                     this.e.m((this.g << 4) + var1, var8, (this.h << 4) + var3);
                  }
               }
            } else {
               for(var8 = var4; var8 < var5; ++var8) {
                  var9 = this.u[var8 >> 4];
                  if(var9 != null) {
                     var9.b(var1, var8 & 15, var3, 0);
                     this.e.m((this.g << 4) + var1, var8, (this.h << 4) + var3);
                  }
               }
            }

            var8 = 15;

            while(var5 > 0 && var8 > 0) {
               --var5;
               var12 = this.b(var1, var5, var3);
               if(var12 == 0) {
                  var12 = 1;
               }

               var8 -= var12;
               if(var8 < 0) {
                  var8 = 0;
               }

               apz var10 = this.u[var5 >> 4];
               if(var10 != null) {
                  var10.b(var1, var5 & 15, var3, var8);
               }
            }
         }

         var8 = this.f[var3 << 4 | var1];
         var12 = var4;
         int var13 = var8;
         if(var8 < var4) {
            var12 = var8;
            var13 = var4;
         }

         if(var8 < this.r) {
            this.r = var8;
         }

         if(!this.e.t.g) {
            this.c(var6 - 1, var7, var12, var13);
            this.c(var6 + 1, var7, var12, var13);
            this.c(var6, var7 - 1, var12, var13);
            this.c(var6, var7 + 1, var12, var13);
            this.c(var6, var7, var12, var13);
         }

         this.n = true;
      }
   }

   public int b(int var1, int var2, int var3) {
      return this.a(var1, var2, var3).k();
   }

   public aji a(int var1, int var2, int var3) {
      aji var4 = ajn.a;
      if(var2 >> 4 < this.u.length) {
         apz var5 = this.u[var2 >> 4];
         if(var5 != null) {
            try {
               var4 = var5.a(var1, var2 & 15, var3);
            } catch (Throwable var9) {
               b var7 = b.a(var9, "Getting block");
               k var8 = var7.a("Block being got");
               var8.a("Location", (Callable)(new apy(this, var1, var2, var3)));
               throw new s(var7);
            }
         }
      }

      return var4;
   }

   public int c(int var1, int var2, int var3) {
      if(var2 >> 4 >= this.u.length) {
         return 0;
      } else {
         apz var4 = this.u[var2 >> 4];
         return var4 != null?var4.b(var1, var2 & 15, var3):0;
      }
   }

   public boolean a(int var1, int var2, int var3, aji var4, int var5) {
      int var6 = var3 << 4 | var1;
      if(var2 >= this.b[var6] - 1) {
         this.b[var6] = -999;
      }

      int var7 = this.f[var6];
      aji var8 = this.a(var1, var2, var3);
      int var9 = this.c(var1, var2, var3);
      if(var8 == var4 && var9 == var5) {
         return false;
      } else {
         apz var10 = this.u[var2 >> 4];
         boolean var11 = false;
         if(var10 == null) {
            if(var4 == ajn.a) {
               return false;
            }

            var10 = this.u[var2 >> 4] = new apz(var2 >> 4 << 4, !this.e.t.g);
            var11 = var2 >= var7;
         }

         int var12 = this.g * 16 + var1;
         int var13 = this.h * 16 + var3;
         if(!this.e.E) {
            var8.f(this.e, var12, var2, var13, var9);
         }

         var10.a(var1, var2 & 15, var3, var4);
         if(!this.e.E) {
            var8.a(this.e, var12, var2, var13, var8, var9);
         } else if(var8 instanceof akw && var8 != var4) {
            this.e.p(var12, var2, var13);
         }

         if(var10.a(var1, var2 & 15, var3) != var4) {
            return false;
         } else {
            var10.a(var1, var2 & 15, var3, var5);
            if(var11) {
               this.b();
            } else {
               int var14 = var4.k();
               int var15 = var8.k();
               if(var14 > 0) {
                  if(var2 >= var7) {
                     this.h(var1, var2 + 1, var3);
                  }
               } else if(var2 == var7 - 1) {
                  this.h(var1, var2, var3);
               }

               if(var14 != var15 && (var14 < var15 || this.a(ahn.a, var1, var2, var3) > 0 || this.a(ahn.b, var1, var2, var3) > 0)) {
                  this.e(var1, var3);
               }
            }

            aor var16;
            if(var8 instanceof akw) {
               var16 = this.e(var1, var2, var3);
               if(var16 != null) {
                  var16.u();
               }
            }

            if(!this.e.E) {
               var4.b(this.e, var12, var2, var13);
            }

            if(var4 instanceof akw) {
               var16 = this.e(var1, var2, var3);
               if(var16 == null) {
                  var16 = ((akw)var4).a(this.e, var5);
                  this.e.a(var12, var2, var13, var16);
               }

               if(var16 != null) {
                  var16.u();
               }
            }

            this.n = true;
            return true;
         }
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      apz var5 = this.u[var2 >> 4];
      if(var5 == null) {
         return false;
      } else {
         int var6 = var5.b(var1, var2 & 15, var3);
         if(var6 == var4) {
            return false;
         } else {
            this.n = true;
            var5.a(var1, var2 & 15, var3, var4);
            if(var5.a(var1, var2 & 15, var3) instanceof akw) {
               aor var7 = this.e(var1, var2, var3);
               if(var7 != null) {
                  var7.u();
                  var7.g = var4;
               }
            }

            return true;
         }
      }
   }

   public int a(ahn var1, int var2, int var3, int var4) {
      apz var5 = this.u[var3 >> 4];
      return var5 == null?(this.d(var2, var3, var4)?var1.c:0):(var1 == ahn.a?(this.e.t.g?0:var5.c(var2, var3 & 15, var4)):(var1 == ahn.b?var5.d(var2, var3 & 15, var4):var1.c));
   }

   public void a(ahn var1, int var2, int var3, int var4, int var5) {
      apz var6 = this.u[var3 >> 4];
      if(var6 == null) {
         var6 = this.u[var3 >> 4] = new apz(var3 >> 4 << 4, !this.e.t.g);
         this.b();
      }

      this.n = true;
      if(var1 == ahn.a) {
         if(!this.e.t.g) {
            var6.b(var2, var3 & 15, var4, var5);
         }
      } else if(var1 == ahn.b) {
         var6.c(var2, var3 & 15, var4, var5);
      }

   }

   public int b(int var1, int var2, int var3, int var4) {
      apz var5 = this.u[var2 >> 4];
      if(var5 == null) {
         return !this.e.t.g && var4 < ahn.a.c?ahn.a.c - var4:0;
      } else {
         int var6 = this.e.t.g?0:var5.c(var1, var2 & 15, var3);
         if(var6 > 0) {
            a = true;
         }

         var6 -= var4;
         int var7 = var5.d(var1, var2 & 15, var3);
         if(var7 > var6) {
            var6 = var7;
         }

         return var6;
      }
   }

   public void a(sa var1) {
      this.o = true;
      int var2 = qh.c(var1.s / 16.0D);
      int var3 = qh.c(var1.u / 16.0D);
      if(var2 != this.g || var3 != this.h) {
         t.warn("Wrong location! " + var1 + " (at " + var2 + ", " + var3 + " instead of " + this.g + ", " + this.h + ")");
         Thread.dumpStack();
      }

      int var4 = qh.c(var1.t / 16.0D);
      if(var4 < 0) {
         var4 = 0;
      }

      if(var4 >= this.j.length) {
         var4 = this.j.length - 1;
      }

      var1.ag = true;
      var1.ah = this.g;
      var1.ai = var4;
      var1.aj = this.h;
      this.j[var4].add(var1);
   }

   public void b(sa var1) {
      this.a(var1, var1.ai);
   }

   public void a(sa var1, int var2) {
      if(var2 < 0) {
         var2 = 0;
      }

      if(var2 >= this.j.length) {
         var2 = this.j.length - 1;
      }

      this.j[var2].remove(var1);
   }

   public boolean d(int var1, int var2, int var3) {
      return var2 >= this.f[var3 << 4 | var1];
   }

   public aor e(int var1, int var2, int var3) {
      agt var4 = new agt(var1, var2, var3);
      aor var5 = (aor)this.i.get(var4);
      if(var5 == null) {
         aji var6 = this.a(var1, var2, var3);
         if(!var6.u()) {
            return null;
         }

         var5 = ((akw)var6).a(this.e, this.c(var1, var2, var3));
         this.e.a(this.g * 16 + var1, var2, this.h * 16 + var3, var5);
      }

      if(var5 != null && var5.r()) {
         this.i.remove(var4);
         return null;
      } else {
         return var5;
      }
   }

   public void a(aor var1) {
      int var2 = var1.c - this.g * 16;
      int var3 = var1.d;
      int var4 = var1.e - this.h * 16;
      this.a(var2, var3, var4, var1);
      if(this.d) {
         this.e.g.add(var1);
      }

   }

   public void a(int var1, int var2, int var3, aor var4) {
      agt var5 = new agt(var1, var2, var3);
      var4.a(this.e);
      var4.c = this.g * 16 + var1;
      var4.d = var2;
      var4.e = this.h * 16 + var3;
      if(this.a(var1, var2, var3) instanceof akw) {
         if(this.i.containsKey(var5)) {
            ((aor)this.i.get(var5)).s();
         }

         var4.t();
         this.i.put(var5, var4);
      }
   }

   public void f(int var1, int var2, int var3) {
      agt var4 = new agt(var1, var2, var3);
      if(this.d) {
         aor var5 = (aor)this.i.remove(var4);
         if(var5 != null) {
            var5.s();
         }
      }

   }

   public void c() {
      this.d = true;
      this.e.a(this.i.values());

      for(int var1 = 0; var1 < this.j.length; ++var1) {
         Iterator var2 = this.j[var1].iterator();

         while(var2.hasNext()) {
            sa var3 = (sa)var2.next();
            var3.X();
         }

         this.e.a(this.j[var1]);
      }

   }

   public void d() {
      this.d = false;
      Iterator var1 = this.i.values().iterator();

      while(var1.hasNext()) {
         aor var2 = (aor)var1.next();
         this.e.a(var2);
      }

      for(int var3 = 0; var3 < this.j.length; ++var3) {
         this.e.b(this.j[var3]);
      }

   }

   public void e() {
      this.n = true;
   }

   public void a(sa var1, azt var2, List var3, sj var4) {
      int var5 = qh.c((var2.b - 2.0D) / 16.0D);
      int var6 = qh.c((var2.e + 2.0D) / 16.0D);
      var5 = qh.a(var5, 0, this.j.length - 1);
      var6 = qh.a(var6, 0, this.j.length - 1);

      for(int var7 = var5; var7 <= var6; ++var7) {
         List var8 = this.j[var7];

         for(int var9 = 0; var9 < var8.size(); ++var9) {
            sa var10 = (sa)var8.get(var9);
            if(var10 != var1 && var10.C.b(var2) && (var4 == null || var4.a(var10))) {
               var3.add(var10);
               sa[] var11 = var10.at();
               if(var11 != null) {
                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     var10 = var11[var12];
                     if(var10 != var1 && var10.C.b(var2) && (var4 == null || var4.a(var10))) {
                        var3.add(var10);
                     }
                  }
               }
            }
         }
      }

   }

   public void a(Class var1, azt var2, List var3, sj var4) {
      int var5 = qh.c((var2.b - 2.0D) / 16.0D);
      int var6 = qh.c((var2.e + 2.0D) / 16.0D);
      var5 = qh.a(var5, 0, this.j.length - 1);
      var6 = qh.a(var6, 0, this.j.length - 1);

      for(int var7 = var5; var7 <= var6; ++var7) {
         List var8 = this.j[var7];

         for(int var9 = 0; var9 < var8.size(); ++var9) {
            sa var10 = (sa)var8.get(var9);
            if(var1.isAssignableFrom(var10.getClass()) && var10.C.b(var2) && (var4 == null || var4.a(var10))) {
               var3.add(var10);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      if(var1) {
         if(this.o && this.e.I() != this.p || this.n) {
            return true;
         }
      } else if(this.o && this.e.I() >= this.p + 600L) {
         return true;
      }

      return this.n;
   }

   public Random a(long var1) {
      return new Random(this.e.H() + (long)(this.g * this.g * 4987142) + (long)(this.g * 5947611) + (long)(this.h * this.h) * 4392871L + (long)(this.h * 389711) ^ var1);
   }

   public boolean g() {
      return false;
   }

   public void a(apu var1, apu var2, int var3, int var4) {
      if(!this.k && var1.a(var3 + 1, var4 + 1) && var1.a(var3, var4 + 1) && var1.a(var3 + 1, var4)) {
         var1.a(var2, var3, var4);
      }

      if(var1.a(var3 - 1, var4) && !var1.d(var3 - 1, var4).k && var1.a(var3 - 1, var4 + 1) && var1.a(var3, var4 + 1) && var1.a(var3 - 1, var4 + 1)) {
         var1.a(var2, var3 - 1, var4);
      }

      if(var1.a(var3, var4 - 1) && !var1.d(var3, var4 - 1).k && var1.a(var3 + 1, var4 - 1) && var1.a(var3 + 1, var4 - 1) && var1.a(var3 + 1, var4)) {
         var1.a(var2, var3, var4 - 1);
      }

      if(var1.a(var3 - 1, var4 - 1) && !var1.d(var3 - 1, var4 - 1).k && var1.a(var3, var4 - 1) && var1.a(var3 - 1, var4)) {
         var1.a(var2, var3 - 1, var4 - 1);
      }

   }

   public int d(int var1, int var2) {
      int var3 = var1 | var2 << 4;
      int var4 = this.b[var3];
      if(var4 == -999) {
         int var5 = this.h() + 15;
         var4 = -1;

         while(var5 > 0 && var4 == -1) {
            aji var6 = this.a(var1, var5, var2);
            awt var7 = var6.o();
            if(!var7.c() && !var7.d()) {
               --var5;
            } else {
               var4 = var5 + 1;
            }
         }

         this.b[var3] = var4;
      }

      return var4;
   }

   public void b(boolean var1) {
      if(this.w && !this.e.t.g && !var1) {
         this.c(this.e.E);
      }

      this.m = true;
      if(!this.l && this.k) {
         this.p();
      }

   }

   public boolean k() {
      return this.m && this.k && this.l;
   }

   public agu l() {
      return new agu(this.g, this.h);
   }

   public boolean c(int var1, int var2) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 >= 256) {
         var2 = 255;
      }

      for(int var3 = var1; var3 <= var2; var3 += 16) {
         apz var4 = this.u[var3 >> 4];
         if(var4 != null && !var4.a()) {
            return false;
         }
      }

      return true;
   }

   public void a(apz[] var1) {
      this.u = var1;
   }

   public ahu a(int var1, int var2, aib var3) {
      int var4 = this.v[var2 << 4 | var1] & 255;
      if(var4 == 255) {
         ahu var5 = var3.a((this.g << 4) + var1, (this.h << 4) + var2);
         var4 = var5.ay;
         this.v[var2 << 4 | var1] = (byte)(var4 & 255);
      }

      return ahu.d(var4) == null?ahu.p:ahu.d(var4);
   }

   public byte[] m() {
      return this.v;
   }

   public void a(byte[] var1) {
      this.v = var1;
   }

   public void n() {
      this.x = 0;
   }

   public void o() {
      for(int var1 = 0; var1 < 8; ++var1) {
         if(this.x >= 4096) {
            return;
         }

         int var2 = this.x % 16;
         int var3 = this.x / 16 % 16;
         int var4 = this.x / 256;
         ++this.x;
         int var5 = (this.g << 4) + var3;
         int var6 = (this.h << 4) + var4;

         for(int var7 = 0; var7 < 16; ++var7) {
            int var8 = (var2 << 4) + var7;
            if(this.u[var2] == null && (var7 == 0 || var7 == 15 || var3 == 0 || var3 == 15 || var4 == 0 || var4 == 15) || this.u[var2] != null && this.u[var2].a(var3, var7, var4).o() == awt.a) {
               if(this.e.a(var5, var8 - 1, var6).m() > 0) {
                  this.e.t(var5, var8 - 1, var6);
               }

               if(this.e.a(var5, var8 + 1, var6).m() > 0) {
                  this.e.t(var5, var8 + 1, var6);
               }

               if(this.e.a(var5 - 1, var8, var6).m() > 0) {
                  this.e.t(var5 - 1, var8, var6);
               }

               if(this.e.a(var5 + 1, var8, var6).m() > 0) {
                  this.e.t(var5 + 1, var8, var6);
               }

               if(this.e.a(var5, var8, var6 - 1).m() > 0) {
                  this.e.t(var5, var8, var6 - 1);
               }

               if(this.e.a(var5, var8, var6 + 1).m() > 0) {
                  this.e.t(var5, var8, var6 + 1);
               }

               this.e.t(var5, var8, var6);
            }
         }
      }

   }

   public void p() {
      this.k = true;
      this.l = true;
      if(!this.e.t.g) {
         if(this.e.b(this.g * 16 - 1, 0, this.h * 16 - 1, this.g * 16 + 1, 63, this.h * 16 + 1)) {
            for(int var1 = 0; var1 < 16; ++var1) {
               for(int var2 = 0; var2 < 16; ++var2) {
                  if(!this.f(var1, var2)) {
                     this.l = false;
                     break;
                  }
               }
            }

            if(this.l) {
               apx var3 = this.e.d(this.g * 16 - 1, this.h * 16);
               var3.a(3);
               var3 = this.e.d(this.g * 16 + 16, this.h * 16);
               var3.a(1);
               var3 = this.e.d(this.g * 16, this.h * 16 - 1);
               var3.a(0);
               var3 = this.e.d(this.g * 16, this.h * 16 + 16);
               var3.a(2);
            }
         } else {
            this.l = false;
         }
      }

   }

   private void a(int var1) {
      if(this.k) {
         int var2;
         if(var1 == 3) {
            for(var2 = 0; var2 < 16; ++var2) {
               this.f(15, var2);
            }
         } else if(var1 == 1) {
            for(var2 = 0; var2 < 16; ++var2) {
               this.f(0, var2);
            }
         } else if(var1 == 0) {
            for(var2 = 0; var2 < 16; ++var2) {
               this.f(var2, 15);
            }
         } else if(var1 == 2) {
            for(var2 = 0; var2 < 16; ++var2) {
               this.f(var2, 0);
            }
         }

      }
   }

   private boolean f(int var1, int var2) {
      int var3 = this.h();
      boolean var4 = false;
      boolean var5 = false;

      int var6;
      for(var6 = var3 + 16 - 1; var6 > 63 || var6 > 0 && !var5; --var6) {
         int var7 = this.b(var1, var6, var2);
         if(var7 == 255 && var6 < 63) {
            var5 = true;
         }

         if(!var4 && var7 > 0) {
            var4 = true;
         } else if(var4 && var7 == 0 && !this.e.t(this.g * 16 + var1, var6, this.h * 16 + var2)) {
            return false;
         }
      }

      for(; var6 > 0; --var6) {
         if(this.a(var1, var6, var2).m() > 0) {
            this.e.t(this.g * 16 + var1, var6, this.h * 16 + var2);
         }
      }

      return true;
   }

}
