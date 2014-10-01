import java.util.Collections;
import java.util.List;

public class vo extends vu {

   private final Class a;
   private final int b;
   private final vq e;
   private final sj f;
   private sv g;


   public vo(td var1, Class var2, int var3, boolean var4) {
      this(var1, var2, var3, var4, false);
   }

   public vo(td var1, Class var2, int var3, boolean var4, boolean var5) {
      this(var1, var2, var3, var4, var5, (sj)null);
   }

   public vo(td var1, Class var2, int var3, boolean var4, boolean var5, sj var6) {
      super(var1, var4, var5);
      this.a = var2;
      this.b = var3;
      this.e = new vq(var1);
      this.a(1);
      this.f = new vp(this, var6);
   }

   public boolean a() {
      if(this.b > 0 && this.c.aI().nextInt(this.b) != 0) {
         return false;
      } else {
         double var1 = this.f();
         List var3 = this.c.o.a(this.a, this.c.C.b(var1, 4.0D, var1), this.f);
         Collections.sort(var3, this.e);
         if(var3.isEmpty()) {
            return false;
         } else {
            this.g = (sv)var3.get(0);
            return true;
         }
      }
   }

   public void c() {
      this.c.d(this.g);
      super.c();
   }
}
