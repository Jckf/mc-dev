import java.util.Iterator;
import java.util.List;

public class vj extends ui {

   private yv a;
   private wt b;
   private int c;
   private boolean d;


   public vj(yv var1) {
      this.a = var1;
      this.a(3);
   }

   public boolean a() {
      if(this.a.d() >= 0) {
         return false;
      } else if(!this.a.o.w()) {
         return false;
      } else {
         List var1 = this.a.o.a(wt.class, this.a.C.b(6.0D, 2.0D, 6.0D));
         if(var1.isEmpty()) {
            return false;
         } else {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               wt var3 = (wt)var2.next();
               if(var3.cb() > 0) {
                  this.b = var3;
                  break;
               }
            }

            return this.b != null;
         }
      }
   }

   public boolean b() {
      return this.b.cb() > 0;
   }

   public void c() {
      this.c = this.a.aI().nextInt(320);
      this.d = false;
      this.b.m().h();
   }

   public void d() {
      this.b = null;
      this.a.m().h();
   }

   public void e() {
      this.a.j().a(this.b, 30.0F, 30.0F);
      if(this.b.cb() == this.c) {
         this.a.m().a((sa)this.b, 0.5D);
         this.d = true;
      }

      if(this.d && this.a.f(this.b) < 4.0D) {
         this.b.a(false);
         this.a.m().h();
      }

   }
}
