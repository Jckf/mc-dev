import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aps extends aor {

   private aji a;
   private int i;
   private int j;
   private boolean k;
   private boolean l;
   private float m;
   private float n;
   private List o = new ArrayList();


   public aps() {}

   public aps(aji var1, int var2, int var3, boolean var4, boolean var5) {
      this.a = var1;
      this.i = var2;
      this.j = var3;
      this.k = var4;
      this.l = var5;
   }

   public aji a() {
      return this.a;
   }

   public int p() {
      return this.i;
   }

   public boolean b() {
      return this.k;
   }

   public int c() {
      return this.j;
   }

   public float a(float var1) {
      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return this.n + (this.m - this.n) * var1;
   }

   private void a(float var1, float var2) {
      if(this.k) {
         var1 = 1.0F - var1;
      } else {
         --var1;
      }

      azt var3 = ajn.M.a(this.b, this.c, this.d, this.e, this.a, var1, this.j);
      if(var3 != null) {
         List var4 = this.b.b((sa)null, var3);
         if(!var4.isEmpty()) {
            this.o.addAll(var4);
            Iterator var5 = this.o.iterator();

            while(var5.hasNext()) {
               sa var6 = (sa)var5.next();
               var6.d((double)(var2 * (float)q.b[this.j]), (double)(var2 * (float)q.c[this.j]), (double)(var2 * (float)q.d[this.j]));
            }

            this.o.clear();
         }
      }

   }

   public void f() {
      if(this.n < 1.0F && this.b != null) {
         this.n = this.m = 1.0F;
         this.b.p(this.c, this.d, this.e);
         this.s();
         if(this.b.a(this.c, this.d, this.e) == ajn.M) {
            this.b.d(this.c, this.d, this.e, this.a, this.i, 3);
            this.b.e(this.c, this.d, this.e, this.a);
         }
      }

   }

   public void h() {
      this.n = this.m;
      if(this.n >= 1.0F) {
         this.a(1.0F, 0.25F);
         this.b.p(this.c, this.d, this.e);
         this.s();
         if(this.b.a(this.c, this.d, this.e) == ajn.M) {
            this.b.d(this.c, this.d, this.e, this.a, this.i, 3);
            this.b.e(this.c, this.d, this.e, this.a);
         }

      } else {
         this.m += 0.5F;
         if(this.m >= 1.0F) {
            this.m = 1.0F;
         }

         if(this.k) {
            this.a(this.m, this.m - this.n + 0.0625F);
         }

      }
   }

   public void a(dh var1) {
      super.a(var1);
      this.a = aji.e(var1.f("blockId"));
      this.i = var1.f("blockData");
      this.j = var1.f("facing");
      this.n = this.m = var1.h("progress");
      this.k = var1.n("extending");
   }

   public void b(dh var1) {
      super.b(var1);
      var1.a("blockId", aji.b(this.a));
      var1.a("blockData", this.i);
      var1.a("facing", this.j);
      var1.a("progress", this.n);
      var1.a("extending", this.k);
   }
}
