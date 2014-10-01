
public class uq extends ui {

   ahb a;
   td b;
   int c;
   double d;
   boolean e;
   ayf f;
   Class g;
   private int h;
   private double i;
   private double j;
   private double k;


   public uq(td var1, Class var2, double var3, boolean var5) {
      this(var1, var3, var5);
      this.g = var2;
   }

   public uq(td var1, double var2, boolean var4) {
      this.b = var1;
      this.a = var1.o;
      this.d = var2;
      this.e = var4;
      this.a(3);
   }

   public boolean a() {
      sv var1 = this.b.o();
      if(var1 == null) {
         return false;
      } else if(!var1.Z()) {
         return false;
      } else if(this.g != null && !this.g.isAssignableFrom(var1.getClass())) {
         return false;
      } else {
         this.f = this.b.m().a(var1);
         return this.f != null;
      }
   }

   public boolean b() {
      sv var1 = this.b.o();
      return var1 == null?false:(!var1.Z()?false:(!this.e?!this.b.m().g():this.b.b(qh.c(var1.s), qh.c(var1.t), qh.c(var1.u))));
   }

   public void c() {
      this.b.m().a(this.f, this.d);
      this.h = 0;
   }

   public void d() {
      this.b.m().h();
   }

   public void e() {
      sv var1 = this.b.o();
      this.b.j().a(var1, 30.0F, 30.0F);
      double var2 = this.b.e(var1.s, var1.C.b, var1.u);
      double var4 = (double)(this.b.M * 2.0F * this.b.M * 2.0F + var1.M);
      --this.h;
      if((this.e || this.b.n().a(var1)) && this.h <= 0 && (this.i == 0.0D && this.j == 0.0D && this.k == 0.0D || var1.e(this.i, this.j, this.k) >= 1.0D || this.b.aI().nextFloat() < 0.05F)) {
         this.i = var1.s;
         this.j = var1.C.b;
         this.k = var1.u;
         this.h = 4 + this.b.aI().nextInt(7);
         if(var2 > 1024.0D) {
            this.h += 10;
         } else if(var2 > 256.0D) {
            this.h += 5;
         }

         if(!this.b.m().a((sa)var1, this.d)) {
            this.h += 15;
         }
      }

      this.c = Math.max(this.c - 1, 0);
      if(var2 <= var4 && this.c <= 20) {
         this.c = 20;
         if(this.b.be() != null) {
            this.b.ba();
         }

         this.b.n(var1);
      }

   }
}
