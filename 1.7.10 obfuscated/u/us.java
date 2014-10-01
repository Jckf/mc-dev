import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class us extends ui {

   private td a;
   private double b;
   private ayf c;
   private vy d;
   private boolean e;
   private List f = new ArrayList();


   public us(td var1, double var2, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.e = var4;
      this.a(1);
   }

   public boolean a() {
      this.f();
      if(this.e && this.a.o.w()) {
         return false;
      } else {
         vz var1 = this.a.o.A.a(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u), 0);
         if(var1 == null) {
            return false;
         } else {
            this.d = this.a(var1);
            if(this.d == null) {
               return false;
            } else {
               boolean var2 = this.a.m().c();
               this.a.m().b(false);
               this.c = this.a.m().a((double)this.d.a, (double)this.d.b, (double)this.d.c);
               this.a.m().b(var2);
               if(this.c != null) {
                  return true;
               } else {
                  azw var3 = vx.a(this.a, 10, 7, azw.a((double)this.d.a, (double)this.d.b, (double)this.d.c));
                  if(var3 == null) {
                     return false;
                  } else {
                     this.a.m().b(false);
                     this.c = this.a.m().a(var3.a, var3.b, var3.c);
                     this.a.m().b(var2);
                     return this.c != null;
                  }
               }
            }
         }
      }
   }

   public boolean b() {
      if(this.a.m().g()) {
         return false;
      } else {
         float var1 = this.a.M + 4.0F;
         return this.a.e((double)this.d.a, (double)this.d.b, (double)this.d.c) > (double)(var1 * var1);
      }
   }

   public void c() {
      this.a.m().a(this.c, this.b);
   }

   public void d() {
      if(this.a.m().g() || this.a.e((double)this.d.a, (double)this.d.b, (double)this.d.c) < 16.0D) {
         this.f.add(this.d);
      }

   }

   private vy a(vz var1) {
      vy var2 = null;
      int var3 = Integer.MAX_VALUE;
      List var4 = var1.f();
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         vy var6 = (vy)var5.next();
         int var7 = var6.b(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u));
         if(var7 < var3 && !this.a(var6)) {
            var2 = var6;
            var3 = var7;
         }
      }

      return var2;
   }

   private boolean a(vy var1) {
      Iterator var2 = this.f.iterator();

      vy var3;
      do {
         if(!var2.hasNext()) {
            return false;
         }

         var3 = (vy)var2.next();
      } while(var1.a != var3.a || var1.b != var3.b || var1.c != var3.c);

      return true;
   }

   private void f() {
      if(this.f.size() > 15) {
         this.f.remove(0);
      }

   }
}
