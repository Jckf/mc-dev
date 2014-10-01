import java.util.List;
import java.util.Random;

public class avw extends awd {

   private boolean a;


   public avw() {}

   public avw(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
      this.a = var3.nextBoolean();
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Terrace", this.a);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a = var1.n("Terrace");
   }

   public static avw a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      asv var8 = asv.a(var3, var4, var5, 0, 0, 0, 5, 6, 5, var6);
      return avk.a(var1, var8) != null?null:new avw(var0, var7, var2, var8, var6);
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.k < 0) {
         this.k = this.b(var1, var3);
         if(this.k < 0) {
            return true;
         }

         this.f.a(0, this.k - this.f.e + 6 - 1, 0);
      }

      this.a(var1, var3, 0, 0, 0, 4, 0, 4, ajn.e, ajn.e, false);
      this.a(var1, var3, 0, 4, 0, 4, 4, 4, ajn.r, ajn.r, false);
      this.a(var1, var3, 1, 4, 1, 3, 4, 3, ajn.f, ajn.f, false);
      this.a(var1, ajn.e, 0, 0, 1, 0, var3);
      this.a(var1, ajn.e, 0, 0, 2, 0, var3);
      this.a(var1, ajn.e, 0, 0, 3, 0, var3);
      this.a(var1, ajn.e, 0, 4, 1, 0, var3);
      this.a(var1, ajn.e, 0, 4, 2, 0, var3);
      this.a(var1, ajn.e, 0, 4, 3, 0, var3);
      this.a(var1, ajn.e, 0, 0, 1, 4, var3);
      this.a(var1, ajn.e, 0, 0, 2, 4, var3);
      this.a(var1, ajn.e, 0, 0, 3, 4, var3);
      this.a(var1, ajn.e, 0, 4, 1, 4, var3);
      this.a(var1, ajn.e, 0, 4, 2, 4, var3);
      this.a(var1, ajn.e, 0, 4, 3, 4, var3);
      this.a(var1, var3, 0, 1, 1, 0, 3, 3, ajn.f, ajn.f, false);
      this.a(var1, var3, 4, 1, 1, 4, 3, 3, ajn.f, ajn.f, false);
      this.a(var1, var3, 1, 1, 4, 3, 3, 4, ajn.f, ajn.f, false);
      this.a(var1, ajn.aZ, 0, 0, 2, 2, var3);
      this.a(var1, ajn.aZ, 0, 2, 2, 4, var3);
      this.a(var1, ajn.aZ, 0, 4, 2, 2, var3);
      this.a(var1, ajn.f, 0, 1, 1, 0, var3);
      this.a(var1, ajn.f, 0, 1, 2, 0, var3);
      this.a(var1, ajn.f, 0, 1, 3, 0, var3);
      this.a(var1, ajn.f, 0, 2, 3, 0, var3);
      this.a(var1, ajn.f, 0, 3, 3, 0, var3);
      this.a(var1, ajn.f, 0, 3, 2, 0, var3);
      this.a(var1, ajn.f, 0, 3, 1, 0, var3);
      if(this.a(var1, 2, 0, -1, var3).o() == awt.a && this.a(var1, 2, -1, -1, var3).o() != awt.a) {
         this.a(var1, ajn.ar, this.a(ajn.ar, 3), 2, 0, -1, var3);
      }

      this.a(var1, var3, 1, 1, 1, 3, 3, 3, ajn.a, ajn.a, false);
      if(this.a) {
         this.a(var1, ajn.aJ, 0, 0, 5, 0, var3);
         this.a(var1, ajn.aJ, 0, 1, 5, 0, var3);
         this.a(var1, ajn.aJ, 0, 2, 5, 0, var3);
         this.a(var1, ajn.aJ, 0, 3, 5, 0, var3);
         this.a(var1, ajn.aJ, 0, 4, 5, 0, var3);
         this.a(var1, ajn.aJ, 0, 0, 5, 4, var3);
         this.a(var1, ajn.aJ, 0, 1, 5, 4, var3);
         this.a(var1, ajn.aJ, 0, 2, 5, 4, var3);
         this.a(var1, ajn.aJ, 0, 3, 5, 4, var3);
         this.a(var1, ajn.aJ, 0, 4, 5, 4, var3);
         this.a(var1, ajn.aJ, 0, 4, 5, 1, var3);
         this.a(var1, ajn.aJ, 0, 4, 5, 2, var3);
         this.a(var1, ajn.aJ, 0, 4, 5, 3, var3);
         this.a(var1, ajn.aJ, 0, 0, 5, 1, var3);
         this.a(var1, ajn.aJ, 0, 0, 5, 2, var3);
         this.a(var1, ajn.aJ, 0, 0, 5, 3, var3);
      }

      int var4;
      if(this.a) {
         var4 = this.a(ajn.ap, 3);
         this.a(var1, ajn.ap, var4, 3, 1, 3, var3);
         this.a(var1, ajn.ap, var4, 3, 2, 3, var3);
         this.a(var1, ajn.ap, var4, 3, 3, 3, var3);
         this.a(var1, ajn.ap, var4, 3, 4, 3, var3);
      }

      this.a(var1, ajn.aa, 0, 2, 3, 1, var3);

      for(var4 = 0; var4 < 5; ++var4) {
         for(int var5 = 0; var5 < 5; ++var5) {
            this.b(var1, var5, 6, var4, var3);
            this.b(var1, ajn.e, 0, var5, -1, var4, var3);
         }
      }

      this.a(var1, var3, 1, 1, 2, 1);
      return true;
   }
}
