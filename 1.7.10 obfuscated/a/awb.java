import java.util.List;
import java.util.Random;

public class awb extends awe {

   private int a;


   public awb() {}

   public awb(awa var1, int var2, Random var3, asv var4, int var5) {
      super(var1, var2);
      this.g = var5;
      this.f = var4;
      this.a = Math.max(var4.b(), var4.d());
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Length", this.a);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a = var1.f("Length");
   }

   public void a(avk var1, List var2, Random var3) {
      boolean var4 = false;

      int var5;
      avk var6;
      for(var5 = var3.nextInt(5); var5 < this.a - 8; var5 += 2 + var3.nextInt(5)) {
         var6 = this.a((awa)var1, var2, var3, 0, var5);
         if(var6 != null) {
            var5 += Math.max(var6.f.b(), var6.f.d());
            var4 = true;
         }
      }

      for(var5 = var3.nextInt(5); var5 < this.a - 8; var5 += 2 + var3.nextInt(5)) {
         var6 = this.b((awa)var1, var2, var3, 0, var5);
         if(var6 != null) {
            var5 += Math.max(var6.f.b(), var6.f.d());
            var4 = true;
         }
      }

      if(var4 && var3.nextInt(3) > 0) {
         switch(this.g) {
         case 0:
            avp.b((awa)var1, var2, var3, this.f.a - 1, this.f.b, this.f.f - 2, 1, this.d());
            break;
         case 1:
            avp.b((awa)var1, var2, var3, this.f.a, this.f.b, this.f.c - 1, 2, this.d());
            break;
         case 2:
            avp.b((awa)var1, var2, var3, this.f.a - 1, this.f.b, this.f.c, 1, this.d());
            break;
         case 3:
            avp.b((awa)var1, var2, var3, this.f.d - 2, this.f.b, this.f.c - 1, 2, this.d());
         }
      }

      if(var4 && var3.nextInt(3) > 0) {
         switch(this.g) {
         case 0:
            avp.b((awa)var1, var2, var3, this.f.d + 1, this.f.b, this.f.f - 2, 3, this.d());
            break;
         case 1:
            avp.b((awa)var1, var2, var3, this.f.a, this.f.b, this.f.f + 1, 0, this.d());
            break;
         case 2:
            avp.b((awa)var1, var2, var3, this.f.d + 1, this.f.b, this.f.c, 3, this.d());
            break;
         case 3:
            avp.b((awa)var1, var2, var3, this.f.d - 2, this.f.b, this.f.f + 1, 0, this.d());
         }
      }

   }

   public static asv a(awa var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 7 * qh.a(var2, 3, 5); var7 >= 7; var7 -= 7) {
         asv var8 = asv.a(var3, var4, var5, 0, 0, 0, 3, 3, var7, var6);
         if(avk.a(var1, var8) == null) {
            return var8;
         }
      }

      return null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      aji var4 = this.b(ajn.n, 0);

      for(int var5 = this.f.a; var5 <= this.f.d; ++var5) {
         for(int var6 = this.f.c; var6 <= this.f.f; ++var6) {
            if(var3.b(var5, 64, var6)) {
               int var7 = var1.i(var5, var6) - 1;
               var1.d(var5, var7, var6, var4, 0, 2);
            }
         }
      }

      return true;
   }
}
