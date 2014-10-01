import java.util.Random;

public class ue extends ui {

   private td a;
   private double b;
   private double c;
   private double d;
   private double e;
   private ahb f;


   public ue(td var1, double var2) {
      this.a = var1;
      this.e = var2;
      this.f = var1.o;
      this.a(1);
   }

   public boolean a() {
      if(!this.f.w()) {
         return false;
      } else if(!this.a.al()) {
         return false;
      } else if(!this.f.i(qh.c(this.a.s), (int)this.a.C.b, qh.c(this.a.u))) {
         return false;
      } else {
         azw var1 = this.f();
         if(var1 == null) {
            return false;
         } else {
            this.b = var1.a;
            this.c = var1.b;
            this.d = var1.c;
            return true;
         }
      }
   }

   public boolean b() {
      return !this.a.m().g();
   }

   public void c() {
      this.a.m().a(this.b, this.c, this.d, this.e);
   }

   private azw f() {
      Random var1 = this.a.aI();

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = qh.c(this.a.s + (double)var1.nextInt(20) - 10.0D);
         int var4 = qh.c(this.a.C.b + (double)var1.nextInt(6) - 3.0D);
         int var5 = qh.c(this.a.u + (double)var1.nextInt(20) - 10.0D);
         if(!this.f.i(var3, var4, var5) && this.a.a(var3, var4, var5) < 0.0F) {
            return azw.a((double)var3, (double)var4, (double)var5);
         }
      }

      return null;
   }
}
