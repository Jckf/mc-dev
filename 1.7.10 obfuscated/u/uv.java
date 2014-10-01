
public class uv extends ui {

   ahb a;
   sw b;
   sv c;
   int d;


   public uv(sw var1) {
      this.b = var1;
      this.a = var1.o;
      this.a(3);
   }

   public boolean a() {
      sv var1 = this.b.o();
      if(var1 == null) {
         return false;
      } else {
         this.c = var1;
         return true;
      }
   }

   public boolean b() {
      return !this.c.Z()?false:(this.b.f(this.c) > 225.0D?false:!this.b.m().g() || this.a());
   }

   public void d() {
      this.c = null;
      this.b.m().h();
   }

   public void e() {
      this.b.j().a(this.c, 30.0F, 30.0F);
      double var1 = (double)(this.b.M * 2.0F * this.b.M * 2.0F);
      double var3 = this.b.e(this.c.s, this.c.C.b, this.c.u);
      double var5 = 0.8D;
      if(var3 > var1 && var3 < 16.0D) {
         var5 = 1.33D;
      } else if(var3 < 225.0D) {
         var5 = 0.6D;
      }

      this.b.m().a((sa)this.c, var5);
      this.d = Math.max(this.d - 1, 0);
      if(var3 <= var1) {
         if(this.d <= 0) {
            this.d = 20;
            this.b.n(this.c);
         }
      }
   }
}
