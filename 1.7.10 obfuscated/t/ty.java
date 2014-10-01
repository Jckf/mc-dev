
public class ty extends ui {

   private wv a;
   private yz b;
   private ahb c;
   private float d;
   private int e;


   public ty(wv var1, float var2) {
      this.a = var1;
      this.c = var1.o;
      this.d = var2;
      this.a(2);
   }

   public boolean a() {
      this.b = this.c.a(this.a, (double)this.d);
      return this.b == null?false:this.a(this.b);
   }

   public boolean b() {
      return !this.b.Z()?false:(this.a.f(this.b) > (double)(this.d * this.d)?false:this.e > 0 && this.a(this.b));
   }

   public void c() {
      this.a.m(true);
      this.e = 40 + this.a.aI().nextInt(40);
   }

   public void d() {
      this.a.m(false);
      this.b = null;
   }

   public void e() {
      this.a.j().a(this.b.s, this.b.t + (double)this.b.g(), this.b.u, 10.0F, (float)this.a.x());
      --this.e;
   }

   private boolean a(yz var1) {
      add var2 = var1.bm.h();
      return var2 == null?false:(!this.a.bZ() && var2.b() == ade.aS?true:this.a.c(var2));
   }
}
