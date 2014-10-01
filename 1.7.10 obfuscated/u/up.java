
public class up extends ui {

   private yv b;
   private yv c;
   private ahb d;
   private int e;
   vz a;


   public up(yv var1) {
      this.b = var1;
      this.d = var1.o;
      this.a(3);
   }

   public boolean a() {
      if(this.b.d() != 0) {
         return false;
      } else if(this.b.aI().nextInt(500) != 0) {
         return false;
      } else {
         this.a = this.d.A.a(qh.c(this.b.s), qh.c(this.b.t), qh.c(this.b.u), 0);
         if(this.a == null) {
            return false;
         } else if(!this.f()) {
            return false;
         } else {
            sa var1 = this.d.a(yv.class, this.b.C.b(8.0D, 3.0D, 8.0D), (sa)this.b);
            if(var1 == null) {
               return false;
            } else {
               this.c = (yv)var1;
               return this.c.d() == 0;
            }
         }
      }
   }

   public void c() {
      this.e = 300;
      this.b.i(true);
   }

   public void d() {
      this.a = null;
      this.c = null;
      this.b.i(false);
   }

   public boolean b() {
      return this.e >= 0 && this.f() && this.b.d() == 0;
   }

   public void e() {
      --this.e;
      this.b.j().a(this.c, 10.0F, 30.0F);
      if(this.b.f(this.c) > 2.25D) {
         this.b.m().a((sa)this.c, 0.25D);
      } else if(this.e == 0 && this.c.ca()) {
         this.g();
      }

      if(this.b.aI().nextInt(35) == 0) {
         this.d.a(this.b, (byte)12);
      }

   }

   private boolean f() {
      if(!this.a.i()) {
         return false;
      } else {
         int var1 = (int)((double)((float)this.a.c()) * 0.35D);
         return this.a.e() < var1;
      }
   }

   private void g() {
      yv var1 = this.b.b((rx)this.c);
      this.c.c(6000);
      this.b.c(6000);
      var1.c(-24000);
      var1.b(this.b.s, this.b.t, this.b.u, 0.0F, 0.0F);
      this.d.d((sa)var1);
      this.d.a(var1, (byte)12);
   }
}
