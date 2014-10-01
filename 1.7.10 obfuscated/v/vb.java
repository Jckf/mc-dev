
public class vb extends ui {

   private sw a;
   private double b;
   private double c;
   private int d;


   public vb(sw var1) {
      this.a = var1;
      this.a(3);
   }

   public boolean a() {
      return this.a.aI().nextFloat() < 0.02F;
   }

   public boolean b() {
      return this.d >= 0;
   }

   public void c() {
      double var1 = 6.283185307179586D * this.a.aI().nextDouble();
      this.b = Math.cos(var1);
      this.c = Math.sin(var1);
      this.d = 20 + this.a.aI().nextInt(20);
   }

   public void e() {
      --this.d;
      this.a.j().a(this.a.s + this.b, this.a.t + (double)this.a.g(), this.a.u + this.c, 10.0F, (float)this.a.x());
   }
}
