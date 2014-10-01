
public class un extends ui {

   private sw b;
   protected sa a;
   private float c;
   private int d;
   private float e;
   private Class f;


   public un(sw var1, Class var2, float var3) {
      this.b = var1;
      this.f = var2;
      this.c = var3;
      this.e = 0.02F;
      this.a(2);
   }

   public un(sw var1, Class var2, float var3, float var4) {
      this.b = var1;
      this.f = var2;
      this.c = var3;
      this.e = var4;
      this.a(2);
   }

   public boolean a() {
      if(this.b.aI().nextFloat() >= this.e) {
         return false;
      } else {
         if(this.b.o() != null) {
            this.a = this.b.o();
         }

         if(this.f == yz.class) {
            this.a = this.b.o.a(this.b, (double)this.c);
         } else {
            this.a = this.b.o.a(this.f, this.b.C.b((double)this.c, 3.0D, (double)this.c), (sa)this.b);
         }

         return this.a != null;
      }
   }

   public boolean b() {
      return !this.a.Z()?false:(this.b.f(this.a) > (double)(this.c * this.c)?false:this.d > 0);
   }

   public void c() {
      this.d = 40 + this.b.aI().nextInt(40);
   }

   public void d() {
      this.a = null;
   }

   public void e() {
      this.b.j().a(this.a.s, this.a.t + (double)this.a.g(), this.a.u, 10.0F, (float)this.b.x());
      --this.d;
   }
}
