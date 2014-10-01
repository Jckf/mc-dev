import java.util.List;
import java.util.Random;

public class avx extends awd {

   private boolean a;
   private int b;


   public avx() {}

   public avx(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
      this.a = var3.nextBoolean();
      this.b = var3.nextInt(3);
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("T", this.b);
      var1.a("C", this.a);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.b = var1.f("T");
      this.a = var1.n("C");
   }

   public static avx a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      asv var8 = asv.a(var3, var4, var5, 0, 0, 0, 4, 6, 5, var6);
      return a(var8) && avk.a(var1, var8) == null?new avx(var0, var7, var2, var8, var6):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 6 - 1, 0);
      }

      this.a(var1, var3, 1, 1, 1, 3, 5, 4, ajn.a, ajn.a, false);
      this.a(var1, var3, 0, 0, 0, 3, 0, 4, ajn.e, ajn.e, false);
      this.a(var1, var3, 1, 0, 1, 2, 0, 3, ajn.d, ajn.d, false);
      if(this.a) {
         this.a(var1, var3, 1, 4, 1, 2, 4, 3, ajn.r, ajn.r, false);
      } else {
         this.a(var1, var3, 1, 5, 1, 2, 5, 3, ajn.r, ajn.r, false);
      }

      this.a(var1, ajn.r, 0, 1, 4, 0, var3);
      this.a(var1, ajn.r, 0, 2, 4, 0, var3);
      this.a(var1, ajn.r, 0, 1, 4, 4, var3);
      this.a(var1, ajn.r, 0, 2, 4, 4, var3);
      this.a(var1, ajn.r, 0, 0, 4, 1, var3);
      this.a(var1, ajn.r, 0, 0, 4, 2, var3);
      this.a(var1, ajn.r, 0, 0, 4, 3, var3);
      this.a(var1, ajn.r, 0, 3, 4, 1, var3);
      this.a(var1, ajn.r, 0, 3, 4, 2, var3);
      this.a(var1, ajn.r, 0, 3, 4, 3, var3);
      this.a(var1, var3, 0, 1, 0, 0, 3, 0, ajn.r, ajn.r, false);
      this.a(var1, var3, 3, 1, 0, 3, 3, 0, ajn.r, ajn.r, false);
      this.a(var1, var3, 0, 1, 4, 0, 3, 4, ajn.r, ajn.r, false);
      this.a(var1, var3, 3, 1, 4, 3, 3, 4, ajn.r, ajn.r, false);
      this.a(var1, var3, 0, 1, 1, 0, 3, 3, ajn.f, ajn.f, false);
      this.a(var1, var3, 3, 1, 1, 3, 3, 3, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 1, 0, 2, 3, 0, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 1, 4, 2, 3, 4, ajn.f, ajn.f, false);
      this.a(var1, ajn.aZ, 0, 0, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 3, 2, 2, var3);
      if(this.b > 0) {
         this.a(var1, ajn.aJ, 0, this.b, 1, 3, var3);
         this.a(var1, ajn.aw, 0, this.b, 2, 3, var3);
      }

      this.a(var1, ajn.a, 0, 1, 1, 0, var3);
      this.a(var1, ajn.a, 0, 1, 2, 0, var3);
      this.a(var1, var3, var2, 1, 1, 0, this.a(ajn.ao, 1));
      if(this.a(var1, 1, 0, -1, var3).o() == awt.a && this.a(var1, 1, -1, -1, var3).o() != awt.a) {
         this.a(var1, ajn.ar, this.a(ajn.ar, 3), 1, 0, -1, var3);
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 4; ++var5) {
            this.b(var1, var5, 6, var4, var3);
            this.b(var1, ajn.e, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
