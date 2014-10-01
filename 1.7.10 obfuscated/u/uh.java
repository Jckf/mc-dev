import java.util.Iterator;
import java.util.List;

public class uh extends ui {

   wf a;
   wf b;
   double c;
   private int d;


   public uh(wf var1, double var2) {
      this.a = var1;
      this.c = var2;
   }

   public boolean a() {
      if(this.a.d() >= 0) {
         return false;
      } else {
         List var1 = this.a.o.a(this.a.getClass(), this.a.C.b(8.0D, 4.0D, 8.0D));
         wf var2 = null;
         double var3 = Double.MAX_VALUE;
         Iterator var5 = var1.iterator();

         while(var5.hasNext()) {
            wf var6 = (wf)var5.next();
            if(var6.d() >= 0) {
               double var7 = this.a.f(var6);
               if(var7 <= var3) {
                  var3 = var7;
                  var2 = var6;
               }
            }
         }

         if(var2 == null) {
            return false;
         } else if(var3 < 9.0D) {
            return false;
         } else {
            this.b = var2;
            return true;
         }
      }
   }

   public boolean b() {
      if(!this.b.Z()) {
         return false;
      } else {
         double var1 = this.a.f(this.b);
         return var1 >= 9.0D && var1 <= 256.0D;
      }
   }

   public void c() {
      this.d = 0;
   }

   public void d() {
      this.b = null;
   }

   public void e() {
      if(--this.d <= 0) {
         this.d = 10;
         this.a.m().a((sa)this.b, this.c);
      }
   }
}
