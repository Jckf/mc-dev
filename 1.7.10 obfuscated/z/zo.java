import java.util.Iterator;
import java.util.List;

public class zo extends zk {

   private add c;


   public zo(ahb var1) {
      super(var1);
   }

   public zo(ahb var1, sv var2, int var3) {
      this(var1, var2, new add(ade.bn, 1, var3));
   }

   public zo(ahb var1, sv var2, add var3) {
      super(var1, var2);
      this.c = var3;
   }

   public zo(ahb var1, double var2, double var4, double var6, add var8) {
      super(var1, var2, var4, var6);
      this.c = var8;
   }

   protected float i() {
      return 0.05F;
   }

   protected float e() {
      return 0.5F;
   }

   protected float f() {
      return -20.0F;
   }

   public void a(int var1) {
      if(this.c == null) {
         this.c = new add(ade.bn, 1, 0);
      }

      this.c.b(var1);
   }

   public int k() {
      if(this.c == null) {
         this.c = new add(ade.bn, 1, 0);
      }

      return this.c.k();
   }

   protected void a(azu var1) {
      if(!this.o.E) {
         List var2 = ade.bn.g(this.c);
         if(var2 != null && !var2.isEmpty()) {
            azt var3 = this.C.b(4.0D, 2.0D, 4.0D);
            List var4 = this.o.a(sv.class, var3);
            if(var4 != null && !var4.isEmpty()) {
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  sv var6 = (sv)var5.next();
                  double var7 = this.f(var6);
                  if(var7 < 16.0D) {
                     double var9 = 1.0D - Math.sqrt(var7) / 4.0D;
                     if(var6 == var1.g) {
                        var9 = 1.0D;
                     }

                     Iterator var11 = var2.iterator();

                     while(var11.hasNext()) {
                        rw var12 = (rw)var11.next();
                        int var13 = var12.a();
                        if(rv.a[var13].b()) {
                           rv.a[var13].a(this.j(), var6, var12.c(), var9);
                        } else {
                           int var14 = (int)(var9 * (double)var12.b() + 0.5D);
                           if(var14 > 20) {
                              var6.c(new rw(var13, var14, var12.c()));
                           }
                        }
                     }
                  }
               }
            }
         }

         this.o.c(2002, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), this.k());
         this.B();
      }

   }

   public void a(dh var1) {
      super.a(var1);
      if(var1.b("Potion", 10)) {
         this.c = add.a(var1.m("Potion"));
      } else {
         this.a(var1.f("potionValue"));
      }

      if(this.c == null) {
         this.B();
      }

   }

   public void b(dh var1) {
      super.b(var1);
      if(this.c != null) {
         var1.a("Potion", (dy)this.c.b(new dh()));
      }

   }
}
