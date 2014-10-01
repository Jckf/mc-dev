import java.util.Iterator;
import java.util.List;

public abstract class ss extends sa {

   private int e;
   public int a;
   public int b;
   public int c;
   public int d;


   public ss(ahb var1) {
      super(var1);
      this.L = 0.0F;
      this.a(0.5F, 0.5F);
   }

   public ss(ahb var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   protected void c() {}

   public void a(int var1) {
      this.a = var1;
      this.A = this.y = (float)(var1 * 90);
      float var2 = (float)this.f();
      float var3 = (float)this.i();
      float var4 = (float)this.f();
      if(var1 != 2 && var1 != 0) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
         this.y = this.A = (float)(p.f[var1] * 90);
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = (float)this.b + 0.5F;
      float var6 = (float)this.c + 0.5F;
      float var7 = (float)this.d + 0.5F;
      float var8 = 0.5625F;
      if(var1 == 2) {
         var7 -= var8;
      }

      if(var1 == 1) {
         var5 -= var8;
      }

      if(var1 == 0) {
         var7 += var8;
      }

      if(var1 == 3) {
         var5 += var8;
      }

      if(var1 == 2) {
         var5 -= this.c(this.f());
      }

      if(var1 == 1) {
         var7 += this.c(this.f());
      }

      if(var1 == 0) {
         var5 += this.c(this.f());
      }

      if(var1 == 3) {
         var7 -= this.c(this.f());
      }

      var6 += this.c(this.i());
      this.b((double)var5, (double)var6, (double)var7);
      float var9 = -0.03125F;
      this.C.b((double)(var5 - var2 - var9), (double)(var6 - var3 - var9), (double)(var7 - var4 - var9), (double)(var5 + var2 + var9), (double)(var6 + var3 + var9), (double)(var7 + var4 + var9));
   }

   private float c(int var1) {
      return var1 == 32?0.5F:(var1 == 64?0.5F:0.0F);
   }

   public void h() {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if(this.e++ == 100 && !this.o.E) {
         this.e = 0;
         if(!this.K && !this.e()) {
            this.B();
            this.b((sa)null);
         }
      }

   }

   public boolean e() {
      if(!this.o.a((sa)this, this.C).isEmpty()) {
         return false;
      } else {
         int var1 = Math.max(1, this.f() / 16);
         int var2 = Math.max(1, this.i() / 16);
         int var3 = this.b;
         int var4 = this.c;
         int var5 = this.d;
         if(this.a == 2) {
            var3 = qh.c(this.s - (double)((float)this.f() / 32.0F));
         }

         if(this.a == 1) {
            var5 = qh.c(this.u - (double)((float)this.f() / 32.0F));
         }

         if(this.a == 0) {
            var3 = qh.c(this.s - (double)((float)this.f() / 32.0F));
         }

         if(this.a == 3) {
            var5 = qh.c(this.u - (double)((float)this.f() / 32.0F));
         }

         var4 = qh.c(this.t - (double)((float)this.i() / 32.0F));

         for(int var6 = 0; var6 < var1; ++var6) {
            for(int var7 = 0; var7 < var2; ++var7) {
               awt var8;
               if(this.a != 2 && this.a != 0) {
                  var8 = this.o.a(this.b, var4 + var7, var5 + var6).o();
               } else {
                  var8 = this.o.a(var3 + var6, var4 + var7, this.d).o();
               }

               if(!var8.a()) {
                  return false;
               }
            }
         }

         List var9 = this.o.b((sa)this, this.C);
         Iterator var10 = var9.iterator();

         sa var11;
         do {
            if(!var10.hasNext()) {
               return true;
            }

            var11 = (sa)var10.next();
         } while(!(var11 instanceof ss));

         return false;
      }
   }

   public boolean R() {
      return true;
   }

   public boolean j(sa var1) {
      return var1 instanceof yz?this.a(ro.a((yz)var1), 0.0F):false;
   }

   public void i(int var1) {
      this.o.X();
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else {
         if(!this.K && !this.o.E) {
            this.B();
            this.Q();
            this.b(var1.j());
         }

         return true;
      }
   }

   public void d(double var1, double var3, double var5) {
      if(!this.o.E && !this.K && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.B();
         this.b((sa)null);
      }

   }

   public void g(double var1, double var3, double var5) {
      if(!this.o.E && !this.K && var1 * var1 + var3 * var3 + var5 * var5 > 0.0D) {
         this.B();
         this.b((sa)null);
      }

   }

   public void b(dh var1) {
      var1.a("Direction", (byte)this.a);
      var1.a("TileX", this.b);
      var1.a("TileY", this.c);
      var1.a("TileZ", this.d);
      switch(this.a) {
      case 0:
         var1.a("Dir", (byte)2);
         break;
      case 1:
         var1.a("Dir", (byte)1);
         break;
      case 2:
         var1.a("Dir", (byte)0);
         break;
      case 3:
         var1.a("Dir", (byte)3);
      }

   }

   public void a(dh var1) {
      if(var1.b("Direction", 99)) {
         this.a = var1.d("Direction");
      } else {
         switch(var1.d("Dir")) {
         case 0:
            this.a = 2;
            break;
         case 1:
            this.a = 1;
            break;
         case 2:
            this.a = 0;
            break;
         case 3:
            this.a = 3;
         }
      }

      this.b = var1.f("TileX");
      this.c = var1.f("TileY");
      this.d = var1.f("TileZ");
      this.a(this.a);
   }

   public abstract int f();

   public abstract int i();

   public abstract void b(sa var1);

   protected boolean V() {
      return false;
   }
}
