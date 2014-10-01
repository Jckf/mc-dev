import java.util.Iterator;
import java.util.List;

public class va extends ui {

   private yv a;
   private sv b;
   private double c;
   private int d;


   public va(yv var1, double var2) {
      this.a = var1;
      this.c = var2;
      this.a(1);
   }

   public boolean a() {
      if(this.a.d() >= 0) {
         return false;
      } else if(this.a.aI().nextInt(400) != 0) {
         return false;
      } else {
         List var1 = this.a.o.a(yv.class, this.a.C.b(6.0D, 3.0D, 6.0D));
         double var2 = Double.MAX_VALUE;
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            yv var5 = (yv)var4.next();
            if(var5 != this.a && !var5.cb() && var5.d() < 0) {
               double var6 = var5.f(this.a);
               if(var6 <= var2) {
                  var2 = var6;
                  this.b = var5;
               }
            }
         }

         if(this.b == null) {
            azw var8 = vx.a(this.a, 16, 3);
            if(var8 == null) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean b() {
      return this.d > 0;
   }

   public void c() {
      if(this.b != null) {
         this.a.j(true);
      }

      this.d = 1000;
   }

   public void d() {
      this.a.j(false);
      this.b = null;
   }

   public void e() {
      --this.d;
      if(this.b != null) {
         if(this.a.f(this.b) > 4.0D) {
            this.a.m().a((sa)this.b, this.c);
         }
      } else if(this.a.m().g()) {
         azw var1 = vx.a(this.a, 16, 3);
         if(var1 == null) {
            return;
         }

         this.a.m().a(var1.a, var1.b, var1.c, this.c);
      }

   }
}
