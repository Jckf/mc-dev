import java.util.ArrayList;
import java.util.Iterator;

public class xj extends sa {

   private aji e;
   public int a;
   public int b;
   public boolean c;
   private boolean f;
   private boolean g;
   private int h;
   private float i;
   public dh d;


   public xj(ahb var1) {
      super(var1);
      this.c = true;
      this.h = 40;
      this.i = 2.0F;
   }

   public xj(ahb var1, double var2, double var4, double var6, aji var8) {
      this(var1, var2, var4, var6, var8, 0);
   }

   public xj(ahb var1, double var2, double var4, double var6, aji var8, int var9) {
      super(var1);
      this.c = true;
      this.h = 40;
      this.i = 2.0F;
      this.e = var8;
      this.a = var9;
      this.k = true;
      this.a(0.98F, 0.98F);
      this.L = this.N / 2.0F;
      this.b(var2, var4, var6);
      this.v = 0.0D;
      this.w = 0.0D;
      this.x = 0.0D;
      this.p = var2;
      this.q = var4;
      this.r = var6;
   }

   protected boolean g_() {
      return false;
   }

   protected void c() {}

   public boolean R() {
      return !this.K;
   }

   public void h() {
      if(this.e.o() == awt.a) {
         this.B();
      } else {
         this.p = this.s;
         this.q = this.t;
         this.r = this.u;
         ++this.b;
         this.w -= 0.03999999910593033D;
         this.d(this.v, this.w, this.x);
         this.v *= 0.9800000190734863D;
         this.w *= 0.9800000190734863D;
         this.x *= 0.9800000190734863D;
         if(!this.o.E) {
            int var1 = qh.c(this.s);
            int var2 = qh.c(this.t);
            int var3 = qh.c(this.u);
            if(this.b == 1) {
               if(this.o.a(var1, var2, var3) != this.e) {
                  this.B();
                  return;
               }

               this.o.f(var1, var2, var3);
            }

            if(this.D) {
               this.v *= 0.699999988079071D;
               this.x *= 0.699999988079071D;
               this.w *= -0.5D;
               if(this.o.a(var1, var2, var3) != ajn.M) {
                  this.B();
                  if(!this.f && this.o.a(this.e, var1, var2, var3, true, 1, (sa)null, (add)null) && !akx.e(this.o, var1, var2 - 1, var3) && this.o.d(var1, var2, var3, this.e, this.a, 3)) {
                     if(this.e instanceof akx) {
                        ((akx)this.e).a(this.o, var1, var2, var3, this.a);
                     }

                     if(this.d != null && this.e instanceof akw) {
                        aor var4 = this.o.o(var1, var2, var3);
                        if(var4 != null) {
                           dh var5 = new dh();
                           var4.b(var5);
                           Iterator var6 = this.d.c().iterator();

                           while(var6.hasNext()) {
                              String var7 = (String)var6.next();
                              dy var8 = this.d.a(var7);
                              if(!var7.equals("x") && !var7.equals("y") && !var7.equals("z")) {
                                 var5.a(var7, var8.b());
                              }
                           }

                           var4.a(var5);
                           var4.e();
                        }
                     }
                  } else if(this.c && !this.f) {
                     this.a(new add(this.e, 1, this.e.a(this.a)), 0.0F);
                  }
               }
            } else if(this.b > 100 && !this.o.E && (var2 < 1 || var2 > 256) || this.b > 600) {
               if(this.c) {
                  this.a(new add(this.e, 1, this.e.a(this.a)), 0.0F);
               }

               this.B();
            }
         }

      }
   }

   protected void b(float var1) {
      if(this.g) {
         int var2 = qh.f(var1 - 1.0F);
         if(var2 > 0) {
            ArrayList var3 = new ArrayList(this.o.b((sa)this, this.C));
            boolean var4 = this.e == ajn.bQ;
            ro var5 = var4?ro.m:ro.n;
            Iterator var6 = var3.iterator();

            while(var6.hasNext()) {
               sa var7 = (sa)var6.next();
               var7.a(var5, (float)Math.min(qh.d((float)var2 * this.i), this.h));
            }

            if(var4 && (double)this.Z.nextFloat() < 0.05000000074505806D + (double)var2 * 0.05D) {
               int var8 = this.a >> 2;
               int var9 = this.a & 3;
               ++var8;
               if(var8 > 2) {
                  this.f = true;
               } else {
                  this.a = var9 | var8 << 2;
               }
            }
         }
      }

   }

   protected void b(dh var1) {
      var1.a("Tile", (byte)aji.b(this.e));
      var1.a("TileID", aji.b(this.e));
      var1.a("Data", (byte)this.a);
      var1.a("Time", (byte)this.b);
      var1.a("DropItem", this.c);
      var1.a("HurtEntities", this.g);
      var1.a("FallHurtAmount", this.i);
      var1.a("FallHurtMax", this.h);
      if(this.d != null) {
         var1.a("TileEntityData", (dy)this.d);
      }

   }

   protected void a(dh var1) {
      if(var1.b("TileID", 99)) {
         this.e = aji.e(var1.f("TileID"));
      } else {
         this.e = aji.e(var1.d("Tile") & 255);
      }

      this.a = var1.d("Data") & 255;
      this.b = var1.d("Time") & 255;
      if(var1.b("HurtEntities", 99)) {
         this.g = var1.n("HurtEntities");
         this.i = var1.h("FallHurtAmount");
         this.h = var1.f("FallHurtMax");
      } else if(this.e == ajn.bQ) {
         this.g = true;
      }

      if(var1.b("DropItem", 99)) {
         this.c = var1.n("DropItem");
      }

      if(var1.b("TileEntityData", 10)) {
         this.d = var1.m("TileEntityData");
      }

      if(this.e.o() == awt.a) {
         this.e = ajn.m;
      }

   }

   public void a(boolean var1) {
      this.g = var1;
   }

   public void a(k var1) {
      super.a(var1);
      var1.a("Immitating block ID", (Object)Integer.valueOf(aji.b(this.e)));
      var1.a("Immitating block data", (Object)Integer.valueOf(this.a));
   }

   public aji f() {
      return this.e;
   }
}
