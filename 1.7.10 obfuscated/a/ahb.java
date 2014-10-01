import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public abstract class ahb implements ahl {

   public boolean d;
   public List e = new ArrayList();
   protected List f = new ArrayList();
   public List g = new ArrayList();
   private List a = new ArrayList();
   private List b = new ArrayList();
   public List h = new ArrayList();
   public List i = new ArrayList();
   private long c = 16777215L;
   public int j;
   protected int k = (new Random()).nextInt();
   protected final int l = 1013904223;
   protected float m;
   protected float n;
   protected float o;
   protected float p;
   public int q;
   public rd r;
   public Random s = new Random();
   public final aqo t;
   protected List u = new ArrayList();
   protected apu v;
   protected final azc w;
   protected ays x;
   public boolean y;
   public azq z;
   public final wc A;
   protected final wb B = new wb(this);
   public final qi C;
   private final Calendar J = Calendar.getInstance();
   protected bac D = new bac();
   public boolean E;
   protected Set F = new HashSet();
   private int K;
   protected boolean G;
   protected boolean H;
   private ArrayList L;
   private boolean M;
   int[] I;


   public ahu a(int var1, int var2) {
      if(this.d(var1, 0, var2)) {
         apx var3 = this.d(var1, var2);

         try {
            return var3.a(var1 & 15, var2 & 15, this.t.e);
         } catch (Throwable var7) {
            b var5 = b.a(var7, "Getting biome");
            k var6 = var5.a("Coordinates of biome request");
            var6.a("Location", (Callable)(new ahc(this, var1, var2)));
            throw new s(var5);
         }
      } else {
         return this.t.e.a(var1, var2);
      }
   }

   public aib v() {
      return this.t.e;
   }

   public ahb(azc var1, String var2, ahj var3, aqo var4, qi var5) {
      this.K = this.s.nextInt(12000);
      this.G = true;
      this.H = true;
      this.L = new ArrayList();
      this.I = new int['\u8000'];
      this.w = var1;
      this.C = var5;
      this.z = new azq(var1);
      this.x = var1.d();
      if(var4 != null) {
         this.t = var4;
      } else if(this.x != null && this.x.j() != 0) {
         this.t = aqo.a(this.x.j());
      } else {
         this.t = aqo.a(0);
      }

      if(this.x == null) {
         this.x = new ays(var3, var2);
      } else {
         this.x.a(var2);
      }

      this.t.a(this);
      this.v = this.j();
      if(!this.x.w()) {
         try {
            this.a(var3);
         } catch (Throwable var10) {
            b var7 = b.a(var10, "Exception initializing level");

            try {
               this.a(var7);
            } catch (Throwable var9) {
               ;
            }

            throw new s(var7);
         }

         this.x.d(true);
      }

      wc var6 = (wc)this.z.a(wc.class, "villages");
      if(var6 == null) {
         this.A = new wc(this);
         this.z.a("villages", (ayl)this.A);
      } else {
         this.A = var6;
         this.A.a(this);
      }

      this.B();
      this.a();
   }

   protected abstract apu j();

   protected void a(ahj var1) {
      this.x.d(true);
   }

   public aji b(int var1, int var2) {
      int var3;
      for(var3 = 63; !this.c(var1, var3 + 1, var2); ++var3) {
         ;
      }

      return this.a(var1, var3, var2);
   }

   public aji a(int var1, int var2, int var3) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000 && var2 >= 0 && var2 < 256) {
         apx var4 = null;

         try {
            var4 = this.e(var1 >> 4, var3 >> 4);
            return var4.a(var1 & 15, var2, var3 & 15);
         } catch (Throwable var8) {
            b var6 = b.a(var8, "Exception getting block type in world");
            k var7 = var6.a("Requested block coordinates");
            var7.a("Found chunk", (Object)Boolean.valueOf(var4 == null));
            var7.a("Location", (Object)k.a(var1, var2, var3));
            throw new s(var6);
         }
      } else {
         return ajn.a;
      }
   }

   public boolean c(int var1, int var2, int var3) {
      return this.a(var1, var2, var3).o() == awt.a;
   }

   public boolean d(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 256?this.c(var1 >> 4, var3 >> 4):false;
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      return this.b(var1 - var4, var2 - var4, var3 - var4, var1 + var4, var2 + var4, var3 + var4);
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var3; var8 <= var6; ++var8) {
               if(!this.c(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean c(int var1, int var2) {
      return this.v.a(var1, var2);
   }

   public apx d(int var1, int var2) {
      return this.e(var1 >> 4, var2 >> 4);
   }

   public apx e(int var1, int var2) {
      return this.v.d(var1, var2);
   }

   public boolean d(int var1, int var2, int var3, aji var4, int var5, int var6) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 256) {
            return false;
         } else {
            apx var7 = this.e(var1 >> 4, var3 >> 4);
            aji var8 = null;
            if((var6 & 1) != 0) {
               var8 = var7.a(var1 & 15, var2, var3 & 15);
            }

            boolean var9 = var7.a(var1 & 15, var2, var3 & 15, var4, var5);
            this.C.a("checkLight");
            this.t(var1, var2, var3);
            this.C.b();
            if(var9) {
               if((var6 & 2) != 0 && (!this.E || (var6 & 4) == 0) && var7.k()) {
                  this.g(var1, var2, var3);
               }

               if(!this.E && (var6 & 1) != 0) {
                  this.c(var1, var2, var3, var8);
                  if(var4.M()) {
                     this.f(var1, var2, var3, var4);
                  }
               }
            }

            return var9;
         }
      } else {
         return false;
      }
   }

   public int e(int var1, int var2, int var3) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return 0;
         } else if(var2 >= 256) {
            return 0;
         } else {
            apx var4 = this.e(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.c(var1, var2, var3);
         }
      } else {
         return 0;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 256) {
            return false;
         } else {
            apx var6 = this.e(var1 >> 4, var3 >> 4);
            int var7 = var1 & 15;
            int var8 = var3 & 15;
            boolean var9 = var6.a(var7, var2, var8, var4);
            if(var9) {
               aji var10 = var6.a(var7, var2, var8);
               if((var5 & 2) != 0 && (!this.E || (var5 & 4) == 0) && var6.k()) {
                  this.g(var1, var2, var3);
               }

               if(!this.E && (var5 & 1) != 0) {
                  this.c(var1, var2, var3, var10);
                  if(var10.M()) {
                     this.f(var1, var2, var3, var10);
                  }
               }
            }

            return var9;
         }
      } else {
         return false;
      }
   }

   public boolean f(int var1, int var2, int var3) {
      return this.d(var1, var2, var3, ajn.a, 0, 3);
   }

   public boolean a(int var1, int var2, int var3, boolean var4) {
      aji var5 = this.a(var1, var2, var3);
      if(var5.o() == awt.a) {
         return false;
      } else {
         int var6 = this.e(var1, var2, var3);
         this.c(2001, var1, var2, var3, aji.b(var5) + (var6 << 12));
         if(var4) {
            var5.b(this, var1, var2, var3, var6, 0);
         }

         return this.d(var1, var2, var3, ajn.a, 0, 3);
      }
   }

   public boolean b(int var1, int var2, int var3, aji var4) {
      return this.d(var1, var2, var3, var4, 0, 3);
   }

   public void g(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.u.size(); ++var4) {
         ((ahh)this.u.get(var4)).a(var1, var2, var3);
      }

   }

   public void c(int var1, int var2, int var3, aji var4) {
      this.d(var1, var2, var3, var4);
   }

   public void b(int var1, int var2, int var3, int var4) {
      int var5;
      if(var3 > var4) {
         var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      if(!this.t.g) {
         for(var5 = var3; var5 <= var4; ++var5) {
            this.c(ahn.a, var1, var5, var2);
         }
      }

      this.c(var1, var3, var2, var1, var4, var2);
   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.u.size(); ++var7) {
         ((ahh)this.u.get(var7)).a(var1, var2, var3, var4, var5, var6);
      }

   }

   public void d(int var1, int var2, int var3, aji var4) {
      this.e(var1 - 1, var2, var3, var4);
      this.e(var1 + 1, var2, var3, var4);
      this.e(var1, var2 - 1, var3, var4);
      this.e(var1, var2 + 1, var3, var4);
      this.e(var1, var2, var3 - 1, var4);
      this.e(var1, var2, var3 + 1, var4);
   }

   public void b(int var1, int var2, int var3, aji var4, int var5) {
      if(var5 != 4) {
         this.e(var1 - 1, var2, var3, var4);
      }

      if(var5 != 5) {
         this.e(var1 + 1, var2, var3, var4);
      }

      if(var5 != 0) {
         this.e(var1, var2 - 1, var3, var4);
      }

      if(var5 != 1) {
         this.e(var1, var2 + 1, var3, var4);
      }

      if(var5 != 2) {
         this.e(var1, var2, var3 - 1, var4);
      }

      if(var5 != 3) {
         this.e(var1, var2, var3 + 1, var4);
      }

   }

   public void e(int var1, int var2, int var3, aji var4) {
      if(!this.E) {
         aji var5 = this.a(var1, var2, var3);

         try {
            var5.a(this, var1, var2, var3, var4);
         } catch (Throwable var12) {
            b var7 = b.a(var12, "Exception while updating neighbours");
            k var8 = var7.a("Block being updated");

            int var9;
            try {
               var9 = this.e(var1, var2, var3);
            } catch (Throwable var11) {
               var9 = -1;
            }

            var8.a("Source block type", (Callable)(new ahd(this, var4)));
            k.a(var8, var1, var2, var3, var5, var9);
            throw new s(var7);
         }
      }
   }

   public boolean a(int var1, int var2, int var3, aji var4) {
      return false;
   }

   public boolean i(int var1, int var2, int var3) {
      return this.e(var1 >> 4, var3 >> 4).d(var1 & 15, var2, var3 & 15);
   }

   public int j(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else {
         if(var2 >= 256) {
            var2 = 255;
         }

         return this.e(var1 >> 4, var3 >> 4).b(var1 & 15, var2, var3 & 15, 0);
      }
   }

   public int k(int var1, int var2, int var3) {
      return this.b(var1, var2, var3, true);
   }

   public int b(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var4 && this.a(var1, var2, var3).n()) {
            int var10 = this.b(var1, var2 + 1, var3, false);
            int var6 = this.b(var1 + 1, var2, var3, false);
            int var7 = this.b(var1 - 1, var2, var3, false);
            int var8 = this.b(var1, var2, var3 + 1, false);
            int var9 = this.b(var1, var2, var3 - 1, false);
            if(var6 > var10) {
               var10 = var6;
            }

            if(var7 > var10) {
               var10 = var7;
            }

            if(var8 > var10) {
               var10 = var8;
            }

            if(var9 > var10) {
               var10 = var9;
            }

            return var10;
         } else if(var2 < 0) {
            return 0;
         } else {
            if(var2 >= 256) {
               var2 = 255;
            }

            apx var5 = this.e(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var5.b(var1, var2, var3, this.j);
         }
      } else {
         return 15;
      }
   }

   public int f(int var1, int var2) {
      if(var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if(!this.c(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            apx var3 = this.e(var1 >> 4, var2 >> 4);
            return var3.b(var1 & 15, var2 & 15);
         }
      } else {
         return 64;
      }
   }

   public int g(int var1, int var2) {
      if(var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if(!this.c(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            apx var3 = this.e(var1 >> 4, var2 >> 4);
            return var3.r;
         }
      } else {
         return 64;
      }
   }

   public int b(ahn var1, int var2, int var3, int var4) {
      if(var3 < 0) {
         var3 = 0;
      }

      if(var3 >= 256) {
         var3 = 255;
      }

      if(var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if(!this.c(var5, var6)) {
            return var1.c;
         } else {
            apx var7 = this.e(var5, var6);
            return var7.a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.c;
      }
   }

   public void b(ahn var1, int var2, int var3, int var4, int var5) {
      if(var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         if(var3 >= 0) {
            if(var3 < 256) {
               if(this.c(var2 >> 4, var4 >> 4)) {
                  apx var6 = this.e(var2 >> 4, var4 >> 4);
                  var6.a(var1, var2 & 15, var3, var4 & 15, var5);

                  for(int var7 = 0; var7 < this.u.size(); ++var7) {
                     ((ahh)this.u.get(var7)).b(var2, var3, var4);
                  }

               }
            }
         }
      }
   }

   public void m(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.u.size(); ++var4) {
         ((ahh)this.u.get(var4)).b(var1, var2, var3);
      }

   }

   public float n(int var1, int var2, int var3) {
      return this.t.h[this.k(var1, var2, var3)];
   }

   public boolean w() {
      return this.j < 4;
   }

   public azu a(azw var1, azw var2) {
      return this.a(var1, var2, false, false, false);
   }

   public azu a(azw var1, azw var2, boolean var3) {
      return this.a(var1, var2, var3, false, false);
   }

   public azu a(azw var1, azw var2, boolean var3, boolean var4, boolean var5) {
      if(!Double.isNaN(var1.a) && !Double.isNaN(var1.b) && !Double.isNaN(var1.c)) {
         if(!Double.isNaN(var2.a) && !Double.isNaN(var2.b) && !Double.isNaN(var2.c)) {
            int var6 = qh.c(var2.a);
            int var7 = qh.c(var2.b);
            int var8 = qh.c(var2.c);
            int var9 = qh.c(var1.a);
            int var10 = qh.c(var1.b);
            int var11 = qh.c(var1.c);
            aji var12 = this.a(var9, var10, var11);
            int var13 = this.e(var9, var10, var11);
            if((!var4 || var12.a(this, var9, var10, var11) != null) && var12.a(var13, var3)) {
               azu var14 = var12.a(this, var9, var10, var11, var1, var2);
               if(var14 != null) {
                  return var14;
               }
            }

            azu var40 = null;
            var13 = 200;

            while(var13-- >= 0) {
               if(Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
                  return null;
               }

               if(var9 == var6 && var10 == var7 && var11 == var8) {
                  return var5?var40:null;
               }

               boolean var41 = true;
               boolean var15 = true;
               boolean var16 = true;
               double var17 = 999.0D;
               double var19 = 999.0D;
               double var21 = 999.0D;
               if(var6 > var9) {
                  var17 = (double)var9 + 1.0D;
               } else if(var6 < var9) {
                  var17 = (double)var9 + 0.0D;
               } else {
                  var41 = false;
               }

               if(var7 > var10) {
                  var19 = (double)var10 + 1.0D;
               } else if(var7 < var10) {
                  var19 = (double)var10 + 0.0D;
               } else {
                  var15 = false;
               }

               if(var8 > var11) {
                  var21 = (double)var11 + 1.0D;
               } else if(var8 < var11) {
                  var21 = (double)var11 + 0.0D;
               } else {
                  var16 = false;
               }

               double var23 = 999.0D;
               double var25 = 999.0D;
               double var27 = 999.0D;
               double var29 = var2.a - var1.a;
               double var31 = var2.b - var1.b;
               double var33 = var2.c - var1.c;
               if(var41) {
                  var23 = (var17 - var1.a) / var29;
               }

               if(var15) {
                  var25 = (var19 - var1.b) / var31;
               }

               if(var16) {
                  var27 = (var21 - var1.c) / var33;
               }

               boolean var35 = false;
               byte var42;
               if(var23 < var25 && var23 < var27) {
                  if(var6 > var9) {
                     var42 = 4;
                  } else {
                     var42 = 5;
                  }

                  var1.a = var17;
                  var1.b += var31 * var23;
                  var1.c += var33 * var23;
               } else if(var25 < var27) {
                  if(var7 > var10) {
                     var42 = 0;
                  } else {
                     var42 = 1;
                  }

                  var1.a += var29 * var25;
                  var1.b = var19;
                  var1.c += var33 * var25;
               } else {
                  if(var8 > var11) {
                     var42 = 2;
                  } else {
                     var42 = 3;
                  }

                  var1.a += var29 * var27;
                  var1.b += var31 * var27;
                  var1.c = var21;
               }

               azw var36 = azw.a(var1.a, var1.b, var1.c);
               var9 = (int)(var36.a = (double)qh.c(var1.a));
               if(var42 == 5) {
                  --var9;
                  ++var36.a;
               }

               var10 = (int)(var36.b = (double)qh.c(var1.b));
               if(var42 == 1) {
                  --var10;
                  ++var36.b;
               }

               var11 = (int)(var36.c = (double)qh.c(var1.c));
               if(var42 == 3) {
                  --var11;
                  ++var36.c;
               }

               aji var37 = this.a(var9, var10, var11);
               int var38 = this.e(var9, var10, var11);
               if(!var4 || var37.a(this, var9, var10, var11) != null) {
                  if(var37.a(var38, var3)) {
                     azu var39 = var37.a(this, var9, var10, var11, var1, var2);
                     if(var39 != null) {
                        return var39;
                     }
                  } else {
                     var40 = new azu(var9, var10, var11, var42, var1, false);
                  }
               }
            }

            return var5?var40:null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(sa var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.u.size(); ++var5) {
         ((ahh)this.u.get(var5)).a(var2, var1.s, var1.t - (double)var1.L, var1.u, var3, var4);
      }

   }

   public void a(yz var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.u.size(); ++var5) {
         ((ahh)this.u.get(var5)).a(var1, var2, var1.s, var1.t - (double)var1.L, var1.u, var3, var4);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      for(int var10 = 0; var10 < this.u.size(); ++var10) {
         ((ahh)this.u.get(var10)).a(var7, var1, var3, var5, var8, var9);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {}

   public void a(String var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.u.size(); ++var5) {
         ((ahh)this.u.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for(int var14 = 0; var14 < this.u.size(); ++var14) {
         ((ahh)this.u.get(var14)).a(var1, var2, var4, var6, var8, var10, var12);
      }

   }

   public boolean c(sa var1) {
      this.i.add(var1);
      return true;
   }

   public boolean d(sa var1) {
      int var2 = qh.c(var1.s / 16.0D);
      int var3 = qh.c(var1.u / 16.0D);
      boolean var4 = var1.n;
      if(var1 instanceof yz) {
         var4 = true;
      }

      if(!var4 && !this.c(var2, var3)) {
         return false;
      } else {
         if(var1 instanceof yz) {
            yz var5 = (yz)var1;
            this.h.add(var5);
            this.c();
         }

         this.e(var2, var3).a(var1);
         this.e.add(var1);
         this.a(var1);
         return true;
      }
   }

   protected void a(sa var1) {
      for(int var2 = 0; var2 < this.u.size(); ++var2) {
         ((ahh)this.u.get(var2)).a(var1);
      }

   }

   protected void b(sa var1) {
      for(int var2 = 0; var2 < this.u.size(); ++var2) {
         ((ahh)this.u.get(var2)).b(var1);
      }

   }

   public void e(sa var1) {
      if(var1.l != null) {
         var1.l.a((sa)null);
      }

      if(var1.m != null) {
         var1.a((sa)null);
      }

      var1.B();
      if(var1 instanceof yz) {
         this.h.remove(var1);
         this.c();
         this.b(var1);
      }

   }

   public void f(sa var1) {
      var1.B();
      if(var1 instanceof yz) {
         this.h.remove(var1);
         this.c();
      }

      int var2 = var1.ah;
      int var3 = var1.aj;
      if(var1.ag && this.c(var2, var3)) {
         this.e(var2, var3).b(var1);
      }

      this.e.remove(var1);
      this.b(var1);
   }

   public void a(ahh var1) {
      this.u.add(var1);
   }

   public List a(sa var1, azt var2) {
      this.L.clear();
      int var3 = qh.c(var2.a);
      int var4 = qh.c(var2.d + 1.0D);
      int var5 = qh.c(var2.b);
      int var6 = qh.c(var2.e + 1.0D);
      int var7 = qh.c(var2.c);
      int var8 = qh.c(var2.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if(this.d(var9, 64, var10)) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  aji var12;
                  if(var9 >= -30000000 && var9 < 30000000 && var10 >= -30000000 && var10 < 30000000) {
                     var12 = this.a(var9, var11, var10);
                  } else {
                     var12 = ajn.b;
                  }

                  var12.a(this, var9, var11, var10, var2, this.L, var1);
               }
            }
         }
      }

      double var14 = 0.25D;
      List var15 = this.b(var1, var2.b(var14, var14, var14));

      for(int var16 = 0; var16 < var15.size(); ++var16) {
         azt var13 = ((sa)var15.get(var16)).J();
         if(var13 != null && var13.b(var2)) {
            this.L.add(var13);
         }

         var13 = var1.h((sa)var15.get(var16));
         if(var13 != null && var13.b(var2)) {
            this.L.add(var13);
         }
      }

      return this.L;
   }

   public List a(azt var1) {
      this.L.clear();
      int var2 = qh.c(var1.a);
      int var3 = qh.c(var1.d + 1.0D);
      int var4 = qh.c(var1.b);
      int var5 = qh.c(var1.e + 1.0D);
      int var6 = qh.c(var1.c);
      int var7 = qh.c(var1.f + 1.0D);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var6; var9 < var7; ++var9) {
            if(this.d(var8, 64, var9)) {
               for(int var10 = var4 - 1; var10 < var5; ++var10) {
                  aji var11;
                  if(var8 >= -30000000 && var8 < 30000000 && var9 >= -30000000 && var9 < 30000000) {
                     var11 = this.a(var8, var10, var9);
                  } else {
                     var11 = ajn.h;
                  }

                  var11.a(this, var8, var10, var9, var1, this.L, (sa)null);
               }
            }
         }
      }

      return this.L;
   }

   public int a(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (qh.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.j(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.h(var1) * 5.0F) / 16.0D));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float c(float var1) {
      return this.t.a(this.x.g(), var1);
   }

   public float y() {
      return aqo.a[this.t.a(this.x.g())];
   }

   public float d(float var1) {
      float var2 = this.c(var1);
      return var2 * 3.1415927F * 2.0F;
   }

   public int h(int var1, int var2) {
      return this.d(var1, var2).d(var1 & 15, var2 & 15);
   }

   public int i(int var1, int var2) {
      apx var3 = this.d(var1, var2);
      int var4 = var3.h() + 15;
      var1 &= 15;

      for(var2 &= 15; var4 > 0; --var4) {
         aji var5 = var3.a(var1, var4, var2);
         if(var5.o().c() && var5.o() != awt.j) {
            return var4 + 1;
         }
      }

      return -1;
   }

   public void a(int var1, int var2, int var3, aji var4, int var5) {}

   public void a(int var1, int var2, int var3, aji var4, int var5, int var6) {}

   public void b(int var1, int var2, int var3, aji var4, int var5, int var6) {}

   public void h() {
      this.C.a("entities");
      this.C.a("global");

      int var1;
      sa var2;
      b var4;
      k var5;
      for(var1 = 0; var1 < this.i.size(); ++var1) {
         var2 = (sa)this.i.get(var1);

         try {
            ++var2.aa;
            var2.h();
         } catch (Throwable var8) {
            var4 = b.a(var8, "Ticking entity");
            var5 = var4.a("Entity being ticked");
            if(var2 == null) {
               var5.a("Entity", (Object)"~~NULL~~");
            } else {
               var2.a(var5);
            }

            throw new s(var4);
         }

         if(var2.K) {
            this.i.remove(var1--);
         }
      }

      this.C.c("remove");
      this.e.removeAll(this.f);

      int var3;
      int var14;
      for(var1 = 0; var1 < this.f.size(); ++var1) {
         var2 = (sa)this.f.get(var1);
         var3 = var2.ah;
         var14 = var2.aj;
         if(var2.ag && this.c(var3, var14)) {
            this.e(var3, var14).b(var2);
         }
      }

      for(var1 = 0; var1 < this.f.size(); ++var1) {
         this.b((sa)this.f.get(var1));
      }

      this.f.clear();
      this.C.c("regular");

      for(var1 = 0; var1 < this.e.size(); ++var1) {
         var2 = (sa)this.e.get(var1);
         if(var2.m != null) {
            if(!var2.m.K && var2.m.l == var2) {
               continue;
            }

            var2.m.l = null;
            var2.m = null;
         }

         this.C.a("tick");
         if(!var2.K) {
            try {
               this.g(var2);
            } catch (Throwable var7) {
               var4 = b.a(var7, "Ticking entity");
               var5 = var4.a("Entity being ticked");
               var2.a(var5);
               throw new s(var4);
            }
         }

         this.C.b();
         this.C.a("remove");
         if(var2.K) {
            var3 = var2.ah;
            var14 = var2.aj;
            if(var2.ag && this.c(var3, var14)) {
               this.e(var3, var14).b(var2);
            }

            this.e.remove(var1--);
            this.b(var2);
         }

         this.C.b();
      }

      this.C.c("blockEntities");
      this.M = true;
      Iterator var9 = this.g.iterator();

      while(var9.hasNext()) {
         aor var10 = (aor)var9.next();
         if(!var10.r() && var10.o() && this.d(var10.c, var10.d, var10.e)) {
            try {
               var10.h();
            } catch (Throwable var6) {
               var4 = b.a(var6, "Ticking block entity");
               var5 = var4.a("Block entity being ticked");
               var10.a(var5);
               throw new s(var4);
            }
         }

         if(var10.r()) {
            var9.remove();
            if(this.c(var10.c >> 4, var10.e >> 4)) {
               apx var12 = this.e(var10.c >> 4, var10.e >> 4);
               if(var12 != null) {
                  var12.f(var10.c & 15, var10.d, var10.e & 15);
               }
            }
         }
      }

      this.M = false;
      if(!this.b.isEmpty()) {
         this.g.removeAll(this.b);
         this.b.clear();
      }

      this.C.c("pendingBlockEntities");
      if(!this.a.isEmpty()) {
         for(int var11 = 0; var11 < this.a.size(); ++var11) {
            aor var13 = (aor)this.a.get(var11);
            if(!var13.r()) {
               if(!this.g.contains(var13)) {
                  this.g.add(var13);
               }

               if(this.c(var13.c >> 4, var13.e >> 4)) {
                  apx var15 = this.e(var13.c >> 4, var13.e >> 4);
                  if(var15 != null) {
                     var15.a(var13.c & 15, var13.d, var13.e & 15, var13);
                  }
               }

               this.g(var13.c, var13.d, var13.e);
            }
         }

         this.a.clear();
      }

      this.C.b();
      this.C.b();
   }

   public void a(Collection var1) {
      if(this.M) {
         this.a.addAll(var1);
      } else {
         this.g.addAll(var1);
      }

   }

   public void g(sa var1) {
      this.a(var1, true);
   }

   public void a(sa var1, boolean var2) {
      int var3 = qh.c(var1.s);
      int var4 = qh.c(var1.u);
      byte var5 = 32;
      if(!var2 || this.b(var3 - var5, 0, var4 - var5, var3 + var5, 0, var4 + var5)) {
         var1.S = var1.s;
         var1.T = var1.t;
         var1.U = var1.u;
         var1.A = var1.y;
         var1.B = var1.z;
         if(var2 && var1.ag) {
            ++var1.aa;
            if(var1.m != null) {
               var1.ab();
            } else {
               var1.h();
            }
         }

         this.C.a("chunkCheck");
         if(Double.isNaN(var1.s) || Double.isInfinite(var1.s)) {
            var1.s = var1.S;
         }

         if(Double.isNaN(var1.t) || Double.isInfinite(var1.t)) {
            var1.t = var1.T;
         }

         if(Double.isNaN(var1.u) || Double.isInfinite(var1.u)) {
            var1.u = var1.U;
         }

         if(Double.isNaN((double)var1.z) || Double.isInfinite((double)var1.z)) {
            var1.z = var1.B;
         }

         if(Double.isNaN((double)var1.y) || Double.isInfinite((double)var1.y)) {
            var1.y = var1.A;
         }

         int var6 = qh.c(var1.s / 16.0D);
         int var7 = qh.c(var1.t / 16.0D);
         int var8 = qh.c(var1.u / 16.0D);
         if(!var1.ag || var1.ah != var6 || var1.ai != var7 || var1.aj != var8) {
            if(var1.ag && this.c(var1.ah, var1.aj)) {
               this.e(var1.ah, var1.aj).a(var1, var1.ai);
            }

            if(this.c(var6, var8)) {
               var1.ag = true;
               this.e(var6, var8).a(var1);
            } else {
               var1.ag = false;
            }
         }

         this.C.b();
         if(var2 && var1.ag && var1.l != null) {
            if(!var1.l.K && var1.l.m == var1) {
               this.g(var1.l);
            } else {
               var1.l.m = null;
               var1.l = null;
            }
         }

      }
   }

   public boolean b(azt var1) {
      return this.a(var1, (sa)null);
   }

   public boolean a(azt var1, sa var2) {
      List var3 = this.b((sa)null, var1);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         sa var5 = (sa)var3.get(var4);
         if(!var5.K && var5.k && var5 != var2) {
            return false;
         }
      }

      return true;
   }

   public boolean c(azt var1) {
      int var2 = qh.c(var1.a);
      int var3 = qh.c(var1.d + 1.0D);
      int var4 = qh.c(var1.b);
      int var5 = qh.c(var1.e + 1.0D);
      int var6 = qh.c(var1.c);
      int var7 = qh.c(var1.f + 1.0D);
      if(var1.a < 0.0D) {
         --var2;
      }

      if(var1.b < 0.0D) {
         --var4;
      }

      if(var1.c < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               aji var11 = this.a(var8, var9, var10);
               if(var11.o() != awt.a) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean d(azt var1) {
      int var2 = qh.c(var1.a);
      int var3 = qh.c(var1.d + 1.0D);
      int var4 = qh.c(var1.b);
      int var5 = qh.c(var1.e + 1.0D);
      int var6 = qh.c(var1.c);
      int var7 = qh.c(var1.f + 1.0D);
      if(var1.a < 0.0D) {
         --var2;
      }

      if(var1.b < 0.0D) {
         --var4;
      }

      if(var1.c < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               aji var11 = this.a(var8, var9, var10);
               if(var11.o().d()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean e(azt var1) {
      int var2 = qh.c(var1.a);
      int var3 = qh.c(var1.d + 1.0D);
      int var4 = qh.c(var1.b);
      int var5 = qh.c(var1.e + 1.0D);
      int var6 = qh.c(var1.c);
      int var7 = qh.c(var1.f + 1.0D);
      if(this.b(var2, var4, var6, var3, var5, var7)) {
         for(int var8 = var2; var8 < var3; ++var8) {
            for(int var9 = var4; var9 < var5; ++var9) {
               for(int var10 = var6; var10 < var7; ++var10) {
                  aji var11 = this.a(var8, var9, var10);
                  if(var11 == ajn.ab || var11 == ajn.k || var11 == ajn.l) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public boolean a(azt var1, awt var2, sa var3) {
      int var4 = qh.c(var1.a);
      int var5 = qh.c(var1.d + 1.0D);
      int var6 = qh.c(var1.b);
      int var7 = qh.c(var1.e + 1.0D);
      int var8 = qh.c(var1.c);
      int var9 = qh.c(var1.f + 1.0D);
      if(!this.b(var4, var6, var8, var5, var7, var9)) {
         return false;
      } else {
         boolean var10 = false;
         azw var11 = azw.a(0.0D, 0.0D, 0.0D);

         for(int var12 = var4; var12 < var5; ++var12) {
            for(int var13 = var6; var13 < var7; ++var13) {
               for(int var14 = var8; var14 < var9; ++var14) {
                  aji var15 = this.a(var12, var13, var14);
                  if(var15.o() == var2) {
                     double var16 = (double)((float)(var13 + 1) - alw.b(this.e(var12, var13, var14)));
                     if((double)var7 >= var16) {
                        var10 = true;
                        var15.a(this, var12, var13, var14, var3, var11);
                     }
                  }
               }
            }
         }

         if(var11.b() > 0.0D && var3.aC()) {
            var11 = var11.a();
            double var18 = 0.014D;
            var3.v += var11.a * var18;
            var3.w += var11.b * var18;
            var3.x += var11.c * var18;
         }

         return var10;
      }
   }

   public boolean a(azt var1, awt var2) {
      int var3 = qh.c(var1.a);
      int var4 = qh.c(var1.d + 1.0D);
      int var5 = qh.c(var1.b);
      int var6 = qh.c(var1.e + 1.0D);
      int var7 = qh.c(var1.c);
      int var8 = qh.c(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               if(this.a(var9, var10, var11).o() == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean b(azt var1, awt var2) {
      int var3 = qh.c(var1.a);
      int var4 = qh.c(var1.d + 1.0D);
      int var5 = qh.c(var1.b);
      int var6 = qh.c(var1.e + 1.0D);
      int var7 = qh.c(var1.c);
      int var8 = qh.c(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               aji var12 = this.a(var9, var10, var11);
               if(var12.o() == var2) {
                  int var13 = this.e(var9, var10, var11);
                  double var14 = (double)(var10 + 1);
                  if(var13 < 8) {
                     var14 = (double)(var10 + 1) - (double)var13 / 8.0D;
                  }

                  if(var14 >= var1.b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public agw a(sa var1, double var2, double var4, double var6, float var8, boolean var9) {
      return this.a(var1, var2, var4, var6, var8, false, var9);
   }

   public agw a(sa var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      agw var11 = new agw(this, var1, var2, var4, var6, var8);
      var11.a = var9;
      var11.b = var10;
      var11.a();
      var11.a(true);
      return var11;
   }

   public float a(azw var1, azt var2) {
      double var3 = 1.0D / ((var2.d - var2.a) * 2.0D + 1.0D);
      double var5 = 1.0D / ((var2.e - var2.b) * 2.0D + 1.0D);
      double var7 = 1.0D / ((var2.f - var2.c) * 2.0D + 1.0D);
      if(var3 >= 0.0D && var5 >= 0.0D && var7 >= 0.0D) {
         int var9 = 0;
         int var10 = 0;

         for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
            for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
               for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
                  double var14 = var2.a + (var2.d - var2.a) * (double)var11;
                  double var16 = var2.b + (var2.e - var2.b) * (double)var12;
                  double var18 = var2.c + (var2.f - var2.c) * (double)var13;
                  if(this.a(azw.a(var14, var16, var18), var1) == null) {
                     ++var9;
                  }

                  ++var10;
               }
            }
         }

         return (float)var9 / (float)var10;
      } else {
         return 0.0F;
      }
   }

   public boolean a(yz var1, int var2, int var3, int var4, int var5) {
      if(var5 == 0) {
         --var3;
      }

      if(var5 == 1) {
         ++var3;
      }

      if(var5 == 2) {
         --var4;
      }

      if(var5 == 3) {
         ++var4;
      }

      if(var5 == 4) {
         --var2;
      }

      if(var5 == 5) {
         ++var2;
      }

      if(this.a(var2, var3, var4) == ajn.ab) {
         this.a(var1, 1004, var2, var3, var4, 0);
         this.f(var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public aor o(int var1, int var2, int var3) {
      if(var2 >= 0 && var2 < 256) {
         aor var4 = null;
         int var5;
         aor var6;
         if(this.M) {
            for(var5 = 0; var5 < this.a.size(); ++var5) {
               var6 = (aor)this.a.get(var5);
               if(!var6.r() && var6.c == var1 && var6.d == var2 && var6.e == var3) {
                  var4 = var6;
                  break;
               }
            }
         }

         if(var4 == null) {
            apx var7 = this.e(var1 >> 4, var3 >> 4);
            if(var7 != null) {
               var4 = var7.e(var1 & 15, var2, var3 & 15);
            }
         }

         if(var4 == null) {
            for(var5 = 0; var5 < this.a.size(); ++var5) {
               var6 = (aor)this.a.get(var5);
               if(!var6.r() && var6.c == var1 && var6.d == var2 && var6.e == var3) {
                  var4 = var6;
                  break;
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   public void a(int var1, int var2, int var3, aor var4) {
      if(var4 != null && !var4.r()) {
         if(this.M) {
            var4.c = var1;
            var4.d = var2;
            var4.e = var3;
            Iterator var5 = this.a.iterator();

            while(var5.hasNext()) {
               aor var6 = (aor)var5.next();
               if(var6.c == var1 && var6.d == var2 && var6.e == var3) {
                  var6.s();
                  var5.remove();
               }
            }

            this.a.add(var4);
         } else {
            this.g.add(var4);
            apx var7 = this.e(var1 >> 4, var3 >> 4);
            if(var7 != null) {
               var7.a(var1 & 15, var2, var3 & 15, var4);
            }
         }
      }

   }

   public void p(int var1, int var2, int var3) {
      aor var4 = this.o(var1, var2, var3);
      if(var4 != null && this.M) {
         var4.s();
         this.a.remove(var4);
      } else {
         if(var4 != null) {
            this.a.remove(var4);
            this.g.remove(var4);
         }

         apx var5 = this.e(var1 >> 4, var3 >> 4);
         if(var5 != null) {
            var5.f(var1 & 15, var2, var3 & 15);
         }
      }

   }

   public void a(aor var1) {
      this.b.add(var1);
   }

   public boolean q(int var1, int var2, int var3) {
      azt var4 = this.a(var1, var2, var3).a(this, var1, var2, var3);
      return var4 != null && var4.a() >= 1.0D;
   }

   public static boolean a(ahl var0, int var1, int var2, int var3) {
      aji var4 = var0.a(var1, var2, var3);
      int var5 = var0.e(var1, var2, var3);
      return var4.o().k() && var4.d()?true:(var4 instanceof ans?(var5 & 4) == 4:(var4 instanceof alj?(var5 & 8) == 8:(var4 instanceof aln?true:(var4 instanceof ann?(var5 & 7) == 7:false))));
   }

   public boolean c(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         apx var5 = this.v.d(var1 >> 4, var3 >> 4);
         if(var5 != null && !var5.g()) {
            aji var6 = this.a(var1, var2, var3);
            return var6.o().k() && var6.d();
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public void B() {
      int var1 = this.a(1.0F);
      if(var1 != this.j) {
         this.j = var1;
      }

   }

   public void a(boolean var1, boolean var2) {
      this.G = var1;
      this.H = var2;
   }

   public void b() {
      this.o();
   }

   private void a() {
      if(this.x.p()) {
         this.n = 1.0F;
         if(this.x.n()) {
            this.p = 1.0F;
         }
      }

   }

   protected void o() {
      if(!this.t.g) {
         if(!this.E) {
            int var1 = this.x.o();
            if(var1 <= 0) {
               if(this.x.n()) {
                  this.x.f(this.s.nextInt(12000) + 3600);
               } else {
                  this.x.f(this.s.nextInt(168000) + 12000);
               }
            } else {
               --var1;
               this.x.f(var1);
               if(var1 <= 0) {
                  this.x.a(!this.x.n());
               }
            }

            this.o = this.p;
            if(this.x.n()) {
               this.p = (float)((double)this.p + 0.01D);
            } else {
               this.p = (float)((double)this.p - 0.01D);
            }

            this.p = qh.a(this.p, 0.0F, 1.0F);
            int var2 = this.x.q();
            if(var2 <= 0) {
               if(this.x.p()) {
                  this.x.g(this.s.nextInt(12000) + 12000);
               } else {
                  this.x.g(this.s.nextInt(168000) + 12000);
               }
            } else {
               --var2;
               this.x.g(var2);
               if(var2 <= 0) {
                  this.x.b(!this.x.p());
               }
            }

            this.m = this.n;
            if(this.x.p()) {
               this.n = (float)((double)this.n + 0.01D);
            } else {
               this.n = (float)((double)this.n - 0.01D);
            }

            this.n = qh.a(this.n, 0.0F, 1.0F);
         }
      }
   }

   protected void C() {
      this.F.clear();
      this.C.a("buildList");

      int var1;
      yz var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < this.h.size(); ++var1) {
         var2 = (yz)this.h.get(var1);
         var3 = qh.c(var2.s / 16.0D);
         var4 = qh.c(var2.u / 16.0D);
         var5 = this.p();

         for(int var6 = -var5; var6 <= var5; ++var6) {
            for(int var7 = -var5; var7 <= var5; ++var7) {
               this.F.add(new agu(var6 + var3, var7 + var4));
            }
         }
      }

      this.C.b();
      if(this.K > 0) {
         --this.K;
      }

      this.C.a("playerCheckLight");
      if(!this.h.isEmpty()) {
         var1 = this.s.nextInt(this.h.size());
         var2 = (yz)this.h.get(var1);
         var3 = qh.c(var2.s) + this.s.nextInt(11) - 5;
         var4 = qh.c(var2.t) + this.s.nextInt(11) - 5;
         var5 = qh.c(var2.u) + this.s.nextInt(11) - 5;
         this.t(var3, var4, var5);
      }

      this.C.b();
   }

   protected abstract int p();

   protected void a(int var1, int var2, apx var3) {
      this.C.c("moodSound");
      if(this.K == 0 && !this.E) {
         this.k = this.k * 3 + 1013904223;
         int var4 = this.k >> 2;
         int var5 = var4 & 15;
         int var6 = var4 >> 8 & 15;
         int var7 = var4 >> 16 & 255;
         aji var8 = var3.a(var5, var7, var6);
         var5 += var1;
         var6 += var2;
         if(var8.o() == awt.a && this.j(var5, var7, var6) <= this.s.nextInt(8) && this.b(ahn.a, var5, var7, var6) <= 0) {
            yz var9 = this.a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, 8.0D);
            if(var9 != null && var9.e((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D) > 4.0D) {
               this.a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.s.nextFloat() * 0.2F);
               this.K = this.s.nextInt(12000) + 6000;
            }
         }
      }

      this.C.c("checkLight");
      var3.o();
   }

   protected void g() {
      this.C();
   }

   public boolean r(int var1, int var2, int var3) {
      return this.d(var1, var2, var3, false);
   }

   public boolean s(int var1, int var2, int var3) {
      return this.d(var1, var2, var3, true);
   }

   public boolean d(int var1, int var2, int var3, boolean var4) {
      ahu var5 = this.a(var1, var3);
      float var6 = var5.a(var1, var2, var3);
      if(var6 > 0.15F) {
         return false;
      } else {
         if(var2 >= 0 && var2 < 256 && this.b(ahn.b, var1, var2, var3) < 10) {
            aji var7 = this.a(var1, var2, var3);
            if((var7 == ajn.j || var7 == ajn.i) && this.e(var1, var2, var3) == 0) {
               if(!var4) {
                  return true;
               }

               boolean var8 = true;
               if(var8 && this.a(var1 - 1, var2, var3).o() != awt.h) {
                  var8 = false;
               }

               if(var8 && this.a(var1 + 1, var2, var3).o() != awt.h) {
                  var8 = false;
               }

               if(var8 && this.a(var1, var2, var3 - 1).o() != awt.h) {
                  var8 = false;
               }

               if(var8 && this.a(var1, var2, var3 + 1).o() != awt.h) {
                  var8 = false;
               }

               if(!var8) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean e(int var1, int var2, int var3, boolean var4) {
      ahu var5 = this.a(var1, var3);
      float var6 = var5.a(var1, var2, var3);
      if(var6 > 0.15F) {
         return false;
      } else if(!var4) {
         return true;
      } else {
         if(var2 >= 0 && var2 < 256 && this.b(ahn.b, var1, var2, var3) < 10) {
            aji var7 = this.a(var1, var2, var3);
            if(var7.o() == awt.a && ajn.aC.c(this, var1, var2, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean t(int var1, int var2, int var3) {
      boolean var4 = false;
      if(!this.t.g) {
         var4 |= this.c(ahn.a, var1, var2, var3);
      }

      var4 |= this.c(ahn.b, var1, var2, var3);
      return var4;
   }

   private int a(int var1, int var2, int var3, ahn var4) {
      if(var4 == ahn.a && this.i(var1, var2, var3)) {
         return 15;
      } else {
         aji var5 = this.a(var1, var2, var3);
         int var6 = var4 == ahn.a?0:var5.m();
         int var7 = var5.k();
         if(var7 >= 15 && var5.m() > 0) {
            var7 = 1;
         }

         if(var7 < 1) {
            var7 = 1;
         }

         if(var7 >= 15) {
            return 0;
         } else if(var6 >= 14) {
            return var6;
         } else {
            for(int var8 = 0; var8 < 6; ++var8) {
               int var9 = var1 + q.b[var8];
               int var10 = var2 + q.c[var8];
               int var11 = var3 + q.d[var8];
               int var12 = this.b(var4, var9, var10, var11) - var7;
               if(var12 > var6) {
                  var6 = var12;
               }

               if(var6 >= 14) {
                  return var6;
               }
            }

            return var6;
         }
      }
   }

   public boolean c(ahn var1, int var2, int var3, int var4) {
      if(!this.a(var2, var3, var4, 17)) {
         return false;
      } else {
         int var5 = 0;
         int var6 = 0;
         this.C.a("getBrightness");
         int var7 = this.b(var1, var2, var3, var4);
         int var8 = this.a(var2, var3, var4, var1);
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         if(var8 > var7) {
            this.I[var6++] = 133152;
         } else if(var8 < var7) {
            this.I[var6++] = 133152 | var7 << 18;

            while(var5 < var6) {
               var9 = this.I[var5++];
               var10 = (var9 & 63) - 32 + var2;
               var11 = (var9 >> 6 & 63) - 32 + var3;
               var12 = (var9 >> 12 & 63) - 32 + var4;
               var13 = var9 >> 18 & 15;
               var14 = this.b(var1, var10, var11, var12);
               if(var14 == var13) {
                  this.b(var1, var10, var11, var12, 0);
                  if(var13 > 0) {
                     var15 = qh.a(var10 - var2);
                     var16 = qh.a(var11 - var3);
                     var17 = qh.a(var12 - var4);
                     if(var15 + var16 + var17 < 17) {
                        for(int var18 = 0; var18 < 6; ++var18) {
                           int var19 = var10 + q.b[var18];
                           int var20 = var11 + q.c[var18];
                           int var21 = var12 + q.d[var18];
                           int var22 = Math.max(1, this.a(var19, var20, var21).k());
                           var14 = this.b(var1, var19, var20, var21);
                           if(var14 == var13 - var22 && var6 < this.I.length) {
                              this.I[var6++] = var19 - var2 + 32 | var20 - var3 + 32 << 6 | var21 - var4 + 32 << 12 | var13 - var22 << 18;
                           }
                        }
                     }
                  }
               }
            }

            var5 = 0;
         }

         this.C.b();
         this.C.a("checkedPosition < toCheckCount");

         while(var5 < var6) {
            var9 = this.I[var5++];
            var10 = (var9 & 63) - 32 + var2;
            var11 = (var9 >> 6 & 63) - 32 + var3;
            var12 = (var9 >> 12 & 63) - 32 + var4;
            var13 = this.b(var1, var10, var11, var12);
            var14 = this.a(var10, var11, var12, var1);
            if(var14 != var13) {
               this.b(var1, var10, var11, var12, var14);
               if(var14 > var13) {
                  var15 = Math.abs(var10 - var2);
                  var16 = Math.abs(var11 - var3);
                  var17 = Math.abs(var12 - var4);
                  boolean var23 = var6 < this.I.length - 6;
                  if(var15 + var16 + var17 < 17 && var23) {
                     if(this.b(var1, var10 - 1, var11, var12) < var14) {
                        this.I[var6++] = var10 - 1 - var2 + 32 + (var11 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var10 + 1, var11, var12) < var14) {
                        this.I[var6++] = var10 + 1 - var2 + 32 + (var11 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var10, var11 - 1, var12) < var14) {
                        this.I[var6++] = var10 - var2 + 32 + (var11 - 1 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var10, var11 + 1, var12) < var14) {
                        this.I[var6++] = var10 - var2 + 32 + (var11 + 1 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var10, var11, var12 - 1) < var14) {
                        this.I[var6++] = var10 - var2 + 32 + (var11 - var3 + 32 << 6) + (var12 - 1 - var4 + 32 << 12);
                     }

                     if(this.b(var1, var10, var11, var12 + 1) < var14) {
                        this.I[var6++] = var10 - var2 + 32 + (var11 - var3 + 32 << 6) + (var12 + 1 - var4 + 32 << 12);
                     }
                  }
               }
            }
         }

         this.C.b();
         return true;
      }
   }

   public boolean a(boolean var1) {
      return false;
   }

   public List a(apx var1, boolean var2) {
      return null;
   }

   public List b(sa var1, azt var2) {
      return this.a(var1, var2, (sj)null);
   }

   public List a(sa var1, azt var2, sj var3) {
      ArrayList var4 = new ArrayList();
      int var5 = qh.c((var2.a - 2.0D) / 16.0D);
      int var6 = qh.c((var2.d + 2.0D) / 16.0D);
      int var7 = qh.c((var2.c - 2.0D) / 16.0D);
      int var8 = qh.c((var2.f + 2.0D) / 16.0D);

      for(int var9 = var5; var9 <= var6; ++var9) {
         for(int var10 = var7; var10 <= var8; ++var10) {
            if(this.c(var9, var10)) {
               this.e(var9, var10).a(var1, var2, var4, var3);
            }
         }
      }

      return var4;
   }

   public List a(Class var1, azt var2) {
      return this.a(var1, var2, (sj)null);
   }

   public List a(Class var1, azt var2, sj var3) {
      int var4 = qh.c((var2.a - 2.0D) / 16.0D);
      int var5 = qh.c((var2.d + 2.0D) / 16.0D);
      int var6 = qh.c((var2.c - 2.0D) / 16.0D);
      int var7 = qh.c((var2.f + 2.0D) / 16.0D);
      ArrayList var8 = new ArrayList();

      for(int var9 = var4; var9 <= var5; ++var9) {
         for(int var10 = var6; var10 <= var7; ++var10) {
            if(this.c(var9, var10)) {
               this.e(var9, var10).a(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   public sa a(Class var1, azt var2, sa var3) {
      List var4 = this.a(var1, var2);
      sa var5 = null;
      double var6 = Double.MAX_VALUE;

      for(int var8 = 0; var8 < var4.size(); ++var8) {
         sa var9 = (sa)var4.get(var8);
         if(var9 != var3) {
            double var10 = var3.f(var9);
            if(var10 <= var6) {
               var5 = var9;
               var6 = var10;
            }
         }
      }

      return var5;
   }

   public abstract sa a(int var1);

   public void b(int var1, int var2, int var3, aor var4) {
      if(this.d(var1, var2, var3)) {
         this.d(var1, var3).e();
      }

   }

   public int a(Class var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.e.size(); ++var3) {
         sa var4 = (sa)this.e.get(var3);
         if((!(var4 instanceof sw) || !((sw)var4).bK()) && var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void a(List var1) {
      this.e.addAll(var1);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.a((sa)var1.get(var2));
      }

   }

   public void b(List var1) {
      this.f.addAll(var1);
   }

   public boolean a(aji var1, int var2, int var3, int var4, boolean var5, int var6, sa var7, add var8) {
      aji var9 = this.a(var2, var3, var4);
      azt var10 = var5?null:var1.a(this, var2, var3, var4);
      return var10 != null && !this.a(var10, var7)?false:(var9.o() == awt.q && var1 == ajn.bQ?true:var9.o().j() && var1.a(this, var2, var3, var4, var6, var8));
   }

   public ayf a(sa var1, sa var2, float var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      this.C.a("pathfind");
      int var8 = qh.c(var1.s);
      int var9 = qh.c(var1.t + 1.0D);
      int var10 = qh.c(var1.u);
      int var11 = (int)(var3 + 16.0F);
      int var12 = var8 - var11;
      int var13 = var9 - var11;
      int var14 = var10 - var11;
      int var15 = var8 + var11;
      int var16 = var9 + var11;
      int var17 = var10 + var11;
      ahr var18 = new ahr(this, var12, var13, var14, var15, var16, var17, 0);
      ayf var19 = (new ayg(var18, var4, var5, var6, var7)).a(var1, var2, var3);
      this.C.b();
      return var19;
   }

   public ayf a(sa var1, int var2, int var3, int var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      this.C.a("pathfind");
      int var10 = qh.c(var1.s);
      int var11 = qh.c(var1.t);
      int var12 = qh.c(var1.u);
      int var13 = (int)(var5 + 8.0F);
      int var14 = var10 - var13;
      int var15 = var11 - var13;
      int var16 = var12 - var13;
      int var17 = var10 + var13;
      int var18 = var11 + var13;
      int var19 = var12 + var13;
      ahr var20 = new ahr(this, var14, var15, var16, var17, var18, var19, 0);
      ayf var21 = (new ayg(var20, var6, var7, var8, var9)).a(var1, var2, var3, var4, var5);
      this.C.b();
      return var21;
   }

   public int e(int var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3).c((ahl)this, var1, var2, var3, var4);
   }

   public int u(int var1, int var2, int var3) {
      byte var4 = 0;
      int var5 = Math.max(var4, this.e(var1, var2 - 1, var3, 0));
      if(var5 >= 15) {
         return var5;
      } else {
         var5 = Math.max(var5, this.e(var1, var2 + 1, var3, 1));
         if(var5 >= 15) {
            return var5;
         } else {
            var5 = Math.max(var5, this.e(var1, var2, var3 - 1, 2));
            if(var5 >= 15) {
               return var5;
            } else {
               var5 = Math.max(var5, this.e(var1, var2, var3 + 1, 3));
               if(var5 >= 15) {
                  return var5;
               } else {
                  var5 = Math.max(var5, this.e(var1 - 1, var2, var3, 4));
                  if(var5 >= 15) {
                     return var5;
                  } else {
                     var5 = Math.max(var5, this.e(var1 + 1, var2, var3, 5));
                     return var5 >= 15?var5:var5;
                  }
               }
            }
         }
      }
   }

   public boolean f(int var1, int var2, int var3, int var4) {
      return this.g(var1, var2, var3, var4) > 0;
   }

   public int g(int var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3).r()?this.u(var1, var2, var3):this.a(var1, var2, var3).b((ahl)this, var1, var2, var3, var4);
   }

   public boolean v(int var1, int var2, int var3) {
      return this.g(var1, var2 - 1, var3, 0) > 0?true:(this.g(var1, var2 + 1, var3, 1) > 0?true:(this.g(var1, var2, var3 - 1, 2) > 0?true:(this.g(var1, var2, var3 + 1, 3) > 0?true:(this.g(var1 - 1, var2, var3, 4) > 0?true:this.g(var1 + 1, var2, var3, 5) > 0))));
   }

   public int w(int var1, int var2, int var3) {
      int var4 = 0;

      for(int var5 = 0; var5 < 6; ++var5) {
         int var6 = this.g(var1 + q.b[var5], var2 + q.c[var5], var3 + q.d[var5], var5);
         if(var6 >= 15) {
            return 15;
         }

         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public yz a(sa var1, double var2) {
      return this.a(var1.s, var1.t, var1.u, var2);
   }

   public yz a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      yz var11 = null;

      for(int var12 = 0; var12 < this.h.size(); ++var12) {
         yz var13 = (yz)this.h.get(var12);
         double var14 = var13.e(var1, var3, var5);
         if((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public yz b(sa var1, double var2) {
      return this.b(var1.s, var1.t, var1.u, var2);
   }

   public yz b(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      yz var11 = null;

      for(int var12 = 0; var12 < this.h.size(); ++var12) {
         yz var13 = (yz)this.h.get(var12);
         if(!var13.bE.a && var13.Z()) {
            double var14 = var13.e(var1, var3, var5);
            double var16 = var7;
            if(var13.an()) {
               var16 = var7 * 0.800000011920929D;
            }

            if(var13.ap()) {
               float var18 = var13.bE();
               if(var18 < 0.1F) {
                  var18 = 0.1F;
               }

               var16 *= (double)(0.7F * var18);
            }

            if((var7 < 0.0D || var14 < var16 * var16) && (var9 == -1.0D || var14 < var9)) {
               var9 = var14;
               var11 = var13;
            }
         }
      }

      return var11;
   }

   public yz a(String var1) {
      for(int var2 = 0; var2 < this.h.size(); ++var2) {
         yz var3 = (yz)this.h.get(var2);
         if(var1.equals(var3.b_())) {
            return var3;
         }
      }

      return null;
   }

   public yz a(UUID var1) {
      for(int var2 = 0; var2 < this.h.size(); ++var2) {
         yz var3 = (yz)this.h.get(var2);
         if(var1.equals(var3.aB())) {
            return var3;
         }
      }

      return null;
   }

   public void G() {
      this.w.c();
   }

   public long H() {
      return this.x.b();
   }

   public long I() {
      return this.x.f();
   }

   public long J() {
      return this.x.g();
   }

   public void b(long var1) {
      this.x.c(var1);
   }

   public r K() {
      return new r(this.x.c(), this.x.d(), this.x.e());
   }

   public void x(int var1, int var2, int var3) {
      this.x.a(var1, var2, var3);
   }

   public boolean a(yz var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(sa var1, byte var2) {}

   public apu L() {
      return this.v;
   }

   public void c(int var1, int var2, int var3, aji var4, int var5, int var6) {
      var4.a(this, var1, var2, var3, var5, var6);
   }

   public azc M() {
      return this.w;
   }

   public ays N() {
      return this.x;
   }

   public agy O() {
      return this.x.x();
   }

   public void c() {}

   public float h(float var1) {
      return (this.o + (this.p - this.o) * var1) * this.j(var1);
   }

   public float j(float var1) {
      return this.m + (this.n - this.m) * var1;
   }

   public boolean P() {
      return (double)this.h(1.0F) > 0.9D;
   }

   public boolean Q() {
      return (double)this.j(1.0F) > 0.2D;
   }

   public boolean y(int var1, int var2, int var3) {
      if(!this.Q()) {
         return false;
      } else if(!this.i(var1, var2, var3)) {
         return false;
      } else if(this.h(var1, var3) > var2) {
         return false;
      } else {
         ahu var4 = this.a(var1, var3);
         return var4.d()?false:(this.e(var1, var2, var3, false)?false:var4.e());
      }
   }

   public boolean z(int var1, int var2, int var3) {
      ahu var4 = this.a(var1, var3);
      return var4.f();
   }

   public void a(String var1, ayl var2) {
      this.z.a(var1, var2);
   }

   public ayl a(Class var1, String var2) {
      return this.z.a(var1, var2);
   }

   public int b(String var1) {
      return this.z.a(var1);
   }

   public void b(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.u.size(); ++var6) {
         ((ahh)this.u.get(var6)).a(var1, var2, var3, var4, var5);
      }

   }

   public void c(int var1, int var2, int var3, int var4, int var5) {
      this.a((yz)null, var1, var2, var3, var4, var5);
   }

   public void a(yz var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         for(int var7 = 0; var7 < this.u.size(); ++var7) {
            ((ahh)this.u.get(var7)).a(var1, var2, var3, var4, var5, var6);
         }

      } catch (Throwable var10) {
         b var8 = b.a(var10, "Playing level event");
         k var9 = var8.a("Level event being played");
         var9.a("Block coordinates", (Object)k.a(var3, var4, var5));
         var9.a("Event source", (Object)var1);
         var9.a("Event type", (Object)Integer.valueOf(var2));
         var9.a("Event data", (Object)Integer.valueOf(var6));
         throw new s(var8);
      }
   }

   public int R() {
      return 256;
   }

   public int S() {
      return this.t.g?128:256;
   }

   public Random A(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.N().b() + (long)var3;
      this.s.setSeed(var4);
      return this.s;
   }

   public agt b(String var1, int var2, int var3, int var4) {
      return this.L().a(this, var1, var2, var3, var4);
   }

   public k a(b var1) {
      k var2 = var1.a("Affected level", 1);
      var2.a("Level name", (Object)(this.x == null?"????":this.x.k()));
      var2.a("All players", (Callable)(new ahe(this)));
      var2.a("Chunk stats", (Callable)(new ahf(this)));

      try {
         this.x.a(var2);
      } catch (Throwable var4) {
         var2.a("Level Data Unobtainable", var4);
      }

      return var2;
   }

   public void d(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.u.size(); ++var6) {
         ahh var7 = (ahh)this.u.get(var6);
         var7.b(var1, var2, var3, var4, var5);
      }

   }

   public Calendar V() {
      if(this.I() % 600L == 0L) {
         this.J.setTimeInMillis(MinecraftServer.ar());
      }

      return this.J;
   }

   public bac W() {
      return this.D;
   }

   public void f(int var1, int var2, int var3, aji var4) {
      for(int var5 = 0; var5 < 4; ++var5) {
         int var6 = var1 + p.a[var5];
         int var7 = var3 + p.b[var5];
         aji var8 = this.a(var6, var2, var7);
         if(ajn.bU.e(var8)) {
            var8.a(this, var6, var2, var7, var4);
         } else if(var8.r()) {
            var6 += p.a[var5];
            var7 += p.b[var5];
            aji var9 = this.a(var6, var2, var7);
            if(ajn.bU.e(var9)) {
               var9.a(this, var6, var2, var7, var4);
            }
         }
      }

   }

   public float b(double var1, double var3, double var5) {
      return this.B(qh.c(var1), qh.c(var3), qh.c(var5));
   }

   public float B(int var1, int var2, int var3) {
      float var4 = 0.0F;
      boolean var5 = this.r == rd.d;
      if(this.d(var1, var2, var3)) {
         float var6 = this.y();
         var4 += qh.a((float)this.d(var1, var3).s / 3600000.0F, 0.0F, 1.0F) * (var5?1.0F:0.75F);
         var4 += var6 * 0.25F;
      }

      if(this.r == rd.b || this.r == rd.a) {
         var4 *= (float)this.r.a() / 2.0F;
      }

      return qh.a(var4, 0.0F, var5?1.5F:1.0F);
   }

   public void X() {
      Iterator var1 = this.u.iterator();

      while(var1.hasNext()) {
         ahh var2 = (ahh)var1.next();
         var2.b();
      }

   }
}
