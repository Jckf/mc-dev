import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xk extends sa {

   private static final Logger d = LogManager.getLogger();
   public int a;
   public int b;
   private int e;
   private String f;
   private String g;
   public float c;


   public xk(ahb var1, double var2, double var4, double var6) {
      super(var1);
      this.e = 5;
      this.c = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.a(0.25F, 0.25F);
      this.L = this.N / 2.0F;
      this.b(var2, var4, var6);
      this.y = (float)(Math.random() * 360.0D);
      this.v = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.w = 0.20000000298023224D;
      this.x = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
   }

   public xk(ahb var1, double var2, double var4, double var6, add var8) {
      this(var1, var2, var4, var6);
      this.a(var8);
   }

   protected boolean g_() {
      return false;
   }

   public xk(ahb var1) {
      super(var1);
      this.e = 5;
      this.c = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.a(0.25F, 0.25F);
      this.L = this.N / 2.0F;
   }

   protected void c() {
      this.z().a(10, 5);
   }

   public void h() {
      if(this.f() == null) {
         this.B();
      } else {
         super.h();
         if(this.b > 0) {
            --this.b;
         }

         this.p = this.s;
         this.q = this.t;
         this.r = this.u;
         this.w -= 0.03999999910593033D;
         this.X = this.j(this.s, (this.C.b + this.C.e) / 2.0D, this.u);
         this.d(this.v, this.w, this.x);
         boolean var1 = (int)this.p != (int)this.s || (int)this.q != (int)this.t || (int)this.r != (int)this.u;
         if(var1 || this.aa % 25 == 0) {
            if(this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)).o() == awt.i) {
               this.w = 0.20000000298023224D;
               this.v = (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
               this.x = (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
               this.a("random.fizz", 0.4F, 2.0F + this.Z.nextFloat() * 0.4F);
            }

            if(!this.o.E) {
               this.k();
            }
         }

         float var2 = 0.98F;
         if(this.D) {
            var2 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.98F;
         }

         this.v *= (double)var2;
         this.w *= 0.9800000190734863D;
         this.x *= (double)var2;
         if(this.D) {
            this.w *= -0.5D;
         }

         ++this.a;
         if(!this.o.E && this.a >= 6000) {
            this.B();
         }

      }
   }

   private void k() {
      Iterator var1 = this.o.a(xk.class, this.C.b(0.5D, 0.0D, 0.5D)).iterator();

      while(var1.hasNext()) {
         xk var2 = (xk)var1.next();
         this.a(var2);
      }

   }

   public boolean a(xk var1) {
      if(var1 == this) {
         return false;
      } else if(var1.Z() && this.Z()) {
         add var2 = this.f();
         add var3 = var1.f();
         if(var3.b() != var2.b()) {
            return false;
         } else if(var3.p() ^ var2.p()) {
            return false;
         } else if(var3.p() && !var3.q().equals(var2.q())) {
            return false;
         } else if(var3.b() == null) {
            return false;
         } else if(var3.b().n() && var3.k() != var2.k()) {
            return false;
         } else if(var3.b < var2.b) {
            return var1.a(this);
         } else if(var3.b + var2.b > var3.e()) {
            return false;
         } else {
            var3.b += var2.b;
            var1.b = Math.max(var1.b, this.b);
            var1.a = Math.min(var1.a, this.a);
            var1.a(var3);
            this.B();
            return true;
         }
      } else {
         return false;
      }
   }

   public void e() {
      this.a = 4800;
   }

   public boolean N() {
      return this.o.a(this.C, awt.h, (sa)this);
   }

   protected void f(int var1) {
      this.a(ro.a, (float)var1);
   }

   public boolean a(ro var1, float var2) {
      if(this.aw()) {
         return false;
      } else if(this.f() != null && this.f().b() == ade.bN && var1.c()) {
         return false;
      } else {
         this.Q();
         this.e = (int)((float)this.e - var2);
         if(this.e <= 0) {
            this.B();
         }

         return false;
      }
   }

   public void b(dh var1) {
      var1.a("Health", (short)((byte)this.e));
      var1.a("Age", (short)this.a);
      if(this.j() != null) {
         var1.a("Thrower", this.f);
      }

      if(this.i() != null) {
         var1.a("Owner", this.g);
      }

      if(this.f() != null) {
         var1.a("Item", (dy)this.f().b(new dh()));
      }

   }

   public void a(dh var1) {
      this.e = var1.e("Health") & 255;
      this.a = var1.e("Age");
      if(var1.c("Owner")) {
         this.g = var1.j("Owner");
      }

      if(var1.c("Thrower")) {
         this.f = var1.j("Thrower");
      }

      dh var2 = var1.m("Item");
      this.a(add.a(var2));
      if(this.f() == null) {
         this.B();
      }

   }

   public void b_(yz var1) {
      if(!this.o.E) {
         add var2 = this.f();
         int var3 = var2.b;
         if(this.b == 0 && (this.g == null || 6000 - this.a <= 200 || this.g.equals(var1.b_())) && var1.bm.a(var2)) {
            if(var2.b() == adb.a(ajn.r)) {
               var1.a((ph)pc.g);
            }

            if(var2.b() == adb.a(ajn.s)) {
               var1.a((ph)pc.g);
            }

            if(var2.b() == ade.aA) {
               var1.a((ph)pc.t);
            }

            if(var2.b() == ade.i) {
               var1.a((ph)pc.w);
            }

            if(var2.b() == ade.bj) {
               var1.a((ph)pc.A);
            }

            if(var2.b() == ade.i && this.j() != null) {
               yz var4 = this.o.a(this.j());
               if(var4 != null && var4 != var1) {
                  var4.a((ph)pc.x);
               }
            }

            this.o.a((sa)var1, "random.pop", 0.2F, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.a((sa)this, var3);
            if(var2.b <= 0) {
               this.B();
            }
         }

      }
   }

   public String b_() {
      return dd.a("item." + this.f().a());
   }

   public boolean av() {
      return false;
   }

   public void b(int var1) {
      super.b(var1);
      if(!this.o.E) {
         this.k();
      }

   }

   public add f() {
      add var1 = this.z().f(10);
      return var1 == null?new add(ajn.b):var1;
   }

   public void a(add var1) {
      this.z().b(10, var1);
      this.z().h(10);
   }

   public String i() {
      return this.g;
   }

   public void a(String var1) {
      this.g = var1;
   }

   public String j() {
      return this.f;
   }

   public void b(String var1) {
      this.f = var1;
   }

}
