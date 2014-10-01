import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class my {

   private static final Logger p = LogManager.getLogger();
   public sa a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public double j;
   public double k;
   public double l;
   public int m;
   private double q;
   private double r;
   private double s;
   private boolean t;
   private boolean u;
   private int v;
   private sa w;
   private boolean x;
   public boolean n;
   public Set o = new HashSet();


   public my(sa var1, int var2, int var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.u = var4;
      this.d = qh.c(var1.s * 32.0D);
      this.e = qh.c(var1.t * 32.0D);
      this.f = qh.c(var1.u * 32.0D);
      this.g = qh.d(var1.y * 256.0F / 360.0F);
      this.h = qh.d(var1.z * 256.0F / 360.0F);
      this.i = qh.d(var1.au() * 256.0F / 360.0F);
   }

   public boolean equals(Object var1) {
      return var1 instanceof my?((my)var1).a.y() == this.a.y():false;
   }

   public int hashCode() {
      return this.a.y();
   }

   public void a(List var1) {
      this.n = false;
      if(!this.t || this.a.e(this.q, this.r, this.s) > 16.0D) {
         this.q = this.a.s;
         this.r = this.a.t;
         this.s = this.a.u;
         this.t = true;
         this.n = true;
         this.b(var1);
      }

      if(this.w != this.a.m || this.a.m != null && this.m % 60 == 0) {
         this.w = this.a.m;
         this.a((ft)(new hx(0, this.a, this.a.m)));
      }

      if(this.a instanceof st && this.m % 10 == 0) {
         st var23 = (st)this.a;
         add var24 = var23.j();
         if(var24 != null && var24.b() instanceof adh) {
            ayi var26 = ade.aY.a(var24, this.a.o);
            Iterator var27 = var1.iterator();

            while(var27.hasNext()) {
               yz var28 = (yz)var27.next();
               mw var29 = (mw)var28;
               var26.a(var29, var24);
               ft var30 = ade.aY.c(var24, this.a.o, var29);
               if(var30 != null) {
                  var29.a.a(var30);
               }
            }
         }

         this.b();
      } else if(this.m % this.c == 0 || this.a.al || this.a.z().a()) {
         int var2;
         int var3;
         if(this.a.m == null) {
            ++this.v;
            var2 = this.a.as.a(this.a.s);
            var3 = qh.c(this.a.t * 32.0D);
            int var4 = this.a.as.a(this.a.u);
            int var5 = qh.d(this.a.y * 256.0F / 360.0F);
            int var6 = qh.d(this.a.z * 256.0F / 360.0F);
            int var7 = var2 - this.d;
            int var8 = var3 - this.e;
            int var9 = var4 - this.f;
            Object var10 = null;
            boolean var11 = Math.abs(var7) >= 4 || Math.abs(var8) >= 4 || Math.abs(var9) >= 4 || this.m % 60 == 0;
            boolean var12 = Math.abs(var5 - this.g) >= 4 || Math.abs(var6 - this.h) >= 4;
            if(this.m > 0 || this.a instanceof zc) {
               if(var7 >= -128 && var7 < 128 && var8 >= -128 && var8 < 128 && var9 >= -128 && var9 < 128 && this.v <= 400 && !this.x) {
                  if(var11 && var12) {
                     var10 = new hh(this.a.y(), (byte)var7, (byte)var8, (byte)var9, (byte)var5, (byte)var6);
                  } else if(var11) {
                     var10 = new hg(this.a.y(), (byte)var7, (byte)var8, (byte)var9);
                  } else if(var12) {
                     var10 = new hi(this.a.y(), (byte)var5, (byte)var6);
                  }
               } else {
                  this.v = 0;
                  var10 = new ik(this.a.y(), var2, var3, var4, (byte)var5, (byte)var6);
               }
            }

            if(this.u) {
               double var13 = this.a.v - this.j;
               double var15 = this.a.w - this.k;
               double var17 = this.a.x - this.l;
               double var19 = 0.02D;
               double var21 = var13 * var13 + var15 * var15 + var17 * var17;
               if(var21 > var19 * var19 || var21 > 0.0D && this.a.v == 0.0D && this.a.w == 0.0D && this.a.x == 0.0D) {
                  this.j = this.a.v;
                  this.k = this.a.w;
                  this.l = this.a.x;
                  this.a((ft)(new hy(this.a.y(), this.j, this.k, this.l)));
               }
            }

            if(var10 != null) {
               this.a((ft)var10);
            }

            this.b();
            if(var11) {
               this.d = var2;
               this.e = var3;
               this.f = var4;
            }

            if(var12) {
               this.g = var5;
               this.h = var6;
            }

            this.x = false;
         } else {
            var2 = qh.d(this.a.y * 256.0F / 360.0F);
            var3 = qh.d(this.a.z * 256.0F / 360.0F);
            boolean var25 = Math.abs(var2 - this.g) >= 4 || Math.abs(var3 - this.h) >= 4;
            if(var25) {
               this.a((ft)(new hi(this.a.y(), (byte)var2, (byte)var3)));
               this.g = var2;
               this.h = var3;
            }

            this.d = this.a.as.a(this.a.s);
            this.e = qh.c(this.a.t * 32.0D);
            this.f = this.a.as.a(this.a.u);
            this.b();
            this.x = true;
         }

         var2 = qh.d(this.a.au() * 256.0F / 360.0F);
         if(Math.abs(var2 - this.i) >= 4) {
            this.a((ft)(new ht(this.a, (byte)var2)));
            this.i = var2;
         }

         this.a.al = false;
      }

      ++this.m;
      if(this.a.H) {
         this.b((ft)(new hy(this.a)));
         this.a.H = false;
      }

   }

   private void b() {
      te var1 = this.a.z();
      if(var1.a()) {
         this.b((ft)(new hw(this.a.y(), var1, false)));
      }

      if(this.a instanceof sv) {
         tq var2 = (tq)((sv)this.a).bc();
         Set var3 = var2.b();
         if(!var3.isEmpty()) {
            this.b((ft)(new il(this.a.y(), var3)));
         }

         var3.clear();
      }

   }

   public void a(ft var1) {
      Iterator var2 = this.o.iterator();

      while(var2.hasNext()) {
         mw var3 = (mw)var2.next();
         var3.a.a(var1);
      }

   }

   public void b(ft var1) {
      this.a(var1);
      if(this.a instanceof mw) {
         ((mw)this.a).a.a(var1);
      }

   }

   public void a() {
      Iterator var1 = this.o.iterator();

      while(var1.hasNext()) {
         mw var2 = (mw)var1.next();
         var2.d(this.a);
      }

   }

   public void a(mw var1) {
      if(this.o.contains(var1)) {
         var1.d(this.a);
         this.o.remove(var1);
      }

   }

   public void b(mw var1) {
      if(var1 != this.a) {
         double var2 = var1.s - (double)(this.d / 32);
         double var4 = var1.u - (double)(this.f / 32);
         if(var2 >= (double)(-this.b) && var2 <= (double)this.b && var4 >= (double)(-this.b) && var4 <= (double)this.b) {
            if(!this.o.contains(var1) && (this.d(var1) || this.a.n)) {
               this.o.add(var1);
               ft var6 = this.c();
               var1.a.a(var6);
               if(!this.a.z().d()) {
                  var1.a.a((ft)(new hw(this.a.y(), this.a.z(), true)));
               }

               if(this.a instanceof sv) {
                  tq var7 = (tq)((sv)this.a).bc();
                  Collection var8 = var7.c();
                  if(!var8.isEmpty()) {
                     var1.a.a((ft)(new il(this.a.y(), var8)));
                  }
               }

               this.j = this.a.v;
               this.k = this.a.w;
               this.l = this.a.x;
               if(this.u && !(var6 instanceof fz)) {
                  var1.a.a((ft)(new hy(this.a.y(), this.a.v, this.a.w, this.a.x)));
               }

               if(this.a.m != null) {
                  var1.a.a((ft)(new hx(0, this.a, this.a.m)));
               }

               if(this.a instanceof sw && ((sw)this.a).bO() != null) {
                  var1.a.a((ft)(new hx(1, this.a, ((sw)this.a).bO())));
               }

               if(this.a instanceof sv) {
                  for(int var10 = 0; var10 < 5; ++var10) {
                     add var13 = ((sv)this.a).q(var10);
                     if(var13 != null) {
                        var1.a.a((ft)(new hz(this.a.y(), var10, var13)));
                     }
                  }
               }

               if(this.a instanceof yz) {
                  yz var11 = (yz)this.a;
                  if(var11.bm()) {
                     var1.a.a((ft)(new hp(var11, qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u))));
                  }
               }

               if(this.a instanceof sv) {
                  sv var12 = (sv)this.a;
                  Iterator var14 = var12.aQ().iterator();

                  while(var14.hasNext()) {
                     rw var9 = (rw)var14.next();
                     var1.a.a((ft)(new in(this.a.y(), var9)));
                  }
               }
            }
         } else if(this.o.contains(var1)) {
            this.o.remove(var1);
            var1.d(this.a);
         }

      }
   }

   private boolean d(mw var1) {
      return var1.r().t().a(var1, this.a.ah, this.a.aj);
   }

   public void b(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.b((mw)var1.get(var2));
      }

   }

   private ft c() {
      if(this.a.K) {
         p.warn("Fetching addPacket for removed entity");
      }

      if(this.a instanceof xk) {
         return new fw(this.a, 2, 1);
      } else if(this.a instanceof mw) {
         return new gb((yz)this.a);
      } else if(this.a instanceof xl) {
         xl var9 = (xl)this.a;
         return new fw(this.a, 10, var9.m());
      } else if(this.a instanceof xi) {
         return new fw(this.a, 1);
      } else if(!(this.a instanceof ry) && !(this.a instanceof xa)) {
         if(this.a instanceof xe) {
            yz var8 = ((xe)this.a).b;
            return new fw(this.a, 90, var8 != null?var8.y():this.a.y());
         } else if(this.a instanceof zc) {
            sa var7 = ((zc)this.a).c;
            return new fw(this.a, 60, var7 != null?var7.y():this.a.y());
         } else if(this.a instanceof zj) {
            return new fw(this.a, 61);
         } else if(this.a instanceof zo) {
            return new fw(this.a, 73, ((zo)this.a).k());
         } else if(this.a instanceof zn) {
            return new fw(this.a, 75);
         } else if(this.a instanceof zm) {
            return new fw(this.a, 65);
         } else if(this.a instanceof zd) {
            return new fw(this.a, 72);
         } else if(this.a instanceof zf) {
            return new fw(this.a, 76);
         } else {
            fw var2;
            if(this.a instanceof ze) {
               ze var6 = (ze)this.a;
               var2 = null;
               byte var3 = 63;
               if(this.a instanceof zi) {
                  var3 = 64;
               } else if(this.a instanceof zp) {
                  var3 = 66;
               }

               if(var6.a != null) {
                  var2 = new fw(this.a, var3, ((ze)this.a).a.y());
               } else {
                  var2 = new fw(this.a, var3, 0);
               }

               var2.d((int)(var6.b * 8000.0D));
               var2.e((int)(var6.c * 8000.0D));
               var2.f((int)(var6.d * 8000.0D));
               return var2;
            } else if(this.a instanceof zl) {
               return new fw(this.a, 62);
            } else if(this.a instanceof xw) {
               return new fw(this.a, 50);
            } else if(this.a instanceof wz) {
               return new fw(this.a, 51);
            } else if(this.a instanceof xj) {
               xj var5 = (xj)this.a;
               return new fw(this.a, 70, aji.b(var5.f()) | var5.a << 16);
            } else if(this.a instanceof tb) {
               return new ga((tb)this.a);
            } else if(this.a instanceof st) {
               st var4 = (st)this.a;
               var2 = new fw(this.a, 71, var4.a);
               var2.a(qh.d((float)(var4.b * 32)));
               var2.b(qh.d((float)(var4.c * 32)));
               var2.c(qh.d((float)(var4.d * 32)));
               return var2;
            } else if(this.a instanceof su) {
               su var1 = (su)this.a;
               var2 = new fw(this.a, 77);
               var2.a(qh.d((float)(var1.b * 32)));
               var2.b(qh.d((float)(var1.c * 32)));
               var2.c(qh.d((float)(var1.d * 32)));
               return var2;
            } else if(this.a instanceof sq) {
               return new fx((sq)this.a);
            } else {
               throw new IllegalArgumentException("Don\'t know how to add " + this.a.getClass() + "!");
            }
         }
      } else {
         this.i = qh.d(this.a.au() * 256.0F / 360.0F);
         return new fz((sv)this.a);
      }
   }

   public void c(mw var1) {
      if(this.o.contains(var1)) {
         this.o.remove(var1);
         var1.d(this.a);
      }

   }

}
