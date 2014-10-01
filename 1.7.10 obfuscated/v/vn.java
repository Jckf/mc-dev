import java.util.Iterator;
import java.util.List;

public class vn extends vu {

   boolean a;
   private int b;


   public vn(td var1, boolean var2) {
      super(var1, false);
      this.a = var2;
      this.a(1);
   }

   public boolean a() {
      int var1 = this.c.aK();
      return var1 != this.b && this.a(this.c.aJ(), false);
   }

   public void c() {
      this.c.d(this.c.aJ());
      this.b = this.c.aK();
      if(this.a) {
         double var1 = this.f();
         List var3 = this.c.o.a(this.c.getClass(), azt.a(this.c.s, this.c.t, this.c.u, this.c.s + 1.0D, this.c.t + 1.0D, this.c.u + 1.0D).b(var1, 10.0D, var1));
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            td var5 = (td)var4.next();
            if(this.c != var5 && var5.o() == null && !var5.c(this.c.aJ())) {
               var5.d(this.c.aJ());
            }
         }
      }

      super.c();
   }
}
