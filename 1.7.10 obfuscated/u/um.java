
public class um extends ui {

   sw a;
   sv b;
   float c;


   public um(sw var1, float var2) {
      this.a = var1;
      this.c = var2;
      this.a(5);
   }

   public boolean a() {
      this.b = this.a.o();
      if(this.b == null) {
         return false;
      } else {
         double var1 = this.a.f(this.b);
         return var1 >= 4.0D && var1 <= 16.0D?(!this.a.D?false:this.a.aI().nextInt(5) == 0):false;
      }
   }

   public boolean b() {
      return !this.a.D;
   }

   public void c() {
      double var1 = this.b.s - this.a.s;
      double var3 = this.b.u - this.a.u;
      float var5 = qh.a(var1 * var1 + var3 * var3);
      this.a.v += var1 / (double)var5 * 0.5D * 0.800000011920929D + this.a.v * 0.20000000298023224D;
      this.a.x += var3 / (double)var5 * 0.5D * 0.800000011920929D + this.a.x * 0.20000000298023224D;
      this.a.w = (double)this.c;
   }
}
