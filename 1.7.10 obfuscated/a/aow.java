import java.util.Iterator;
import java.util.List;

public class aow extends aor implements rb {

   private add[] p = new add[36];
   public boolean a;
   public aow i;
   public aow j;
   public aow k;
   public aow l;
   public float m;
   public float n;
   public int o;
   private int q;
   private int r = -1;
   private String s;


   public int a() {
      return 27;
   }

   public add a(int var1) {
      return this.p[var1];
   }

   public add a(int var1, int var2) {
      if(this.p[var1] != null) {
         add var3;
         if(this.p[var1].b <= var2) {
            var3 = this.p[var1];
            this.p[var1] = null;
            this.e();
            return var3;
         } else {
            var3 = this.p[var1].a(var2);
            if(this.p[var1].b == 0) {
               this.p[var1] = null;
            }

            this.e();
            return var3;
         }
      } else {
         return null;
      }
   }

   public add a_(int var1) {
      if(this.p[var1] != null) {
         add var2 = this.p[var1];
         this.p[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      this.p[var1] = var2;
      if(var2 != null && var2.b > this.d()) {
         var2.b = this.d();
      }

      this.e();
   }

   public String b() {
      return this.k_()?this.s:"container.chest";
   }

   public boolean k_() {
      return this.s != null && this.s.length() > 0;
   }

   public void a(String var1) {
      this.s = var1;
   }

   public void a(dh var1) {
      super.a(var1);
      dq var2 = var1.c("Items", 10);
      this.p = new add[this.a()];
      if(var1.b("CustomName", 8)) {
         this.s = var1.j("CustomName");
      }

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         dh var4 = var2.b(var3);
         int var5 = var4.d("Slot") & 255;
         if(var5 >= 0 && var5 < this.p.length) {
            this.p[var5] = add.a(var4);
         }
      }

   }

   public void b(dh var1) {
      super.b(var1);
      dq var2 = new dq();

      for(int var3 = 0; var3 < this.p.length; ++var3) {
         if(this.p[var3] != null) {
            dh var4 = new dh();
            var4.a("Slot", (byte)var3);
            this.p[var3].b(var4);
            var2.a((dy)var4);
         }
      }

      var1.a("Items", (dy)var2);
      if(this.k_()) {
         var1.a("CustomName", this.s);
      }

   }

   public int d() {
      return 64;
   }

   public boolean a(yz var1) {
      return this.b.o(this.c, this.d, this.e) != this?false:var1.e((double)this.c + 0.5D, (double)this.d + 0.5D, (double)this.e + 0.5D) <= 64.0D;
   }

   public void u() {
      super.u();
      this.a = false;
   }

   private void a(aow var1, int var2) {
      if(var1.r()) {
         this.a = false;
      } else if(this.a) {
         switch(var2) {
         case 0:
            if(this.l != var1) {
               this.a = false;
            }
            break;
         case 1:
            if(this.k != var1) {
               this.a = false;
            }
            break;
         case 2:
            if(this.i != var1) {
               this.a = false;
            }
            break;
         case 3:
            if(this.j != var1) {
               this.a = false;
            }
         }
      }

   }

   public void i() {
      if(!this.a) {
         this.a = true;
         this.i = null;
         this.j = null;
         this.k = null;
         this.l = null;
         if(this.a(this.c - 1, this.d, this.e)) {
            this.k = (aow)this.b.o(this.c - 1, this.d, this.e);
         }

         if(this.a(this.c + 1, this.d, this.e)) {
            this.j = (aow)this.b.o(this.c + 1, this.d, this.e);
         }

         if(this.a(this.c, this.d, this.e - 1)) {
            this.i = (aow)this.b.o(this.c, this.d, this.e - 1);
         }

         if(this.a(this.c, this.d, this.e + 1)) {
            this.l = (aow)this.b.o(this.c, this.d, this.e + 1);
         }

         if(this.i != null) {
            this.i.a(this, 0);
         }

         if(this.l != null) {
            this.l.a(this, 2);
         }

         if(this.j != null) {
            this.j.a(this, 1);
         }

         if(this.k != null) {
            this.k.a(this, 3);
         }

      }
   }

   private boolean a(int var1, int var2, int var3) {
      if(this.b == null) {
         return false;
      } else {
         aji var4 = this.b.a(var1, var2, var3);
         return var4 instanceof ajx && ((ajx)var4).a == this.j();
      }
   }

   public void h() {
      super.h();
      this.i();
      ++this.q;
      float var1;
      if(!this.b.E && this.o != 0 && (this.q + this.c + this.d + this.e) % 200 == 0) {
         this.o = 0;
         var1 = 5.0F;
         List var2 = this.b.a(yz.class, azt.a((double)((float)this.c - var1), (double)((float)this.d - var1), (double)((float)this.e - var1), (double)((float)(this.c + 1) + var1), (double)((float)(this.d + 1) + var1), (double)((float)(this.e + 1) + var1)));
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            yz var4 = (yz)var3.next();
            if(var4.bo instanceof aad) {
               rb var5 = ((aad)var4.bo).e();
               if(var5 == this || var5 instanceof ra && ((ra)var5).a((rb)this)) {
                  ++this.o;
               }
            }
         }
      }

      this.n = this.m;
      var1 = 0.1F;
      double var11;
      if(this.o > 0 && this.m == 0.0F && this.i == null && this.k == null) {
         double var8 = (double)this.c + 0.5D;
         var11 = (double)this.e + 0.5D;
         if(this.l != null) {
            var11 += 0.5D;
         }

         if(this.j != null) {
            var8 += 0.5D;
         }

         this.b.a(var8, (double)this.d + 0.5D, var11, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
      }

      if(this.o == 0 && this.m > 0.0F || this.o > 0 && this.m < 1.0F) {
         float var9 = this.m;
         if(this.o > 0) {
            this.m += var1;
         } else {
            this.m -= var1;
         }

         if(this.m > 1.0F) {
            this.m = 1.0F;
         }

         float var10 = 0.5F;
         if(this.m < var10 && var9 >= var10 && this.i == null && this.k == null) {
            var11 = (double)this.c + 0.5D;
            double var6 = (double)this.e + 0.5D;
            if(this.l != null) {
               var6 += 0.5D;
            }

            if(this.j != null) {
               var11 += 0.5D;
            }

            this.b.a(var11, (double)this.d + 0.5D, var6, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
         }

         if(this.m < 0.0F) {
            this.m = 0.0F;
         }
      }

   }

   public boolean c(int var1, int var2) {
      if(var1 == 1) {
         this.o = var2;
         return true;
      } else {
         return super.c(var1, var2);
      }
   }

   public void f() {
      if(this.o < 0) {
         this.o = 0;
      }

      ++this.o;
      this.b.c(this.c, this.d, this.e, this.q(), 1, this.o);
      this.b.d(this.c, this.d, this.e, this.q());
      this.b.d(this.c, this.d - 1, this.e, this.q());
   }

   public void l_() {
      if(this.q() instanceof ajx) {
         --this.o;
         this.b.c(this.c, this.d, this.e, this.q(), 1, this.o);
         this.b.d(this.c, this.d, this.e, this.q());
         this.b.d(this.c, this.d - 1, this.e, this.q());
      }

   }

   public boolean b(int var1, add var2) {
      return true;
   }

   public void s() {
      super.s();
      this.u();
      this.i();
   }

   public int j() {
      if(this.r == -1) {
         if(this.b == null || !(this.q() instanceof ajx)) {
            return 0;
         }

         this.r = ((ajx)this.q()).a;
      }

      return this.r;
   }
}
