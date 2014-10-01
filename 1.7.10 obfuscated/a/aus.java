import java.util.List;
import java.util.Random;

public class aus extends avc {

   private boolean a;


   public aus() {}

   public aus(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Mob", this.a);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a = var1.n("Mob");
   }

   public void a(avk var1, List var2, Random var3) {
      if(var1 != null) {
         ((auz)var1).b = this;
      }

   }

   public static aus a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -4, -1, 0, 11, 8, 16, var5);
      return a(var7) && avk.a(var0, var7) == null?new aus(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      this.a(var1, var3, 0, 0, 0, 10, 7, 15, false, var2, aui.c());
      this.a(var1, var2, var3, avd.c, 4, 1, 0);
      byte var4 = 6;
      this.a(var1, var3, 1, var4, 1, 1, var4, 14, false, var2, aui.c());
      this.a(var1, var3, 9, var4, 1, 9, var4, 14, false, var2, aui.c());
      this.a(var1, var3, 2, var4, 1, 8, var4, 2, false, var2, aui.c());
      this.a(var1, var3, 2, var4, 14, 8, var4, 14, false, var2, aui.c());
      this.a(var1, var3, 1, 1, 1, 2, 1, 4, false, var2, aui.c());
      this.a(var1, var3, 8, 1, 1, 9, 1, 4, false, var2, aui.c());
      this.a(var1, var3, 1, 1, 1, 1, 1, 3, ajn.k, ajn.k, false);
      this.a(var1, var3, 9, 1, 1, 9, 1, 3, ajn.k, ajn.k, false);
      this.a(var1, var3, 3, 1, 8, 7, 1, 12, false, var2, aui.c());
      this.a(var1, var3, 4, 1, 9, 6, 1, 11, ajn.k, ajn.k, false);

      int var5;
      for(var5 = 3; var5 < 14; var5 += 2) {
         this.a(var1, var3, 0, 3, var5, 0, 4, var5, ajn.aY, ajn.aY, false);
         this.a(var1, var3, 10, 3, var5, 10, 4, var5, ajn.aY, ajn.aY, false);
      }

      for(var5 = 2; var5 < 9; var5 += 2) {
         this.a(var1, var3, var5, 3, 15, var5, 4, 15, ajn.aY, ajn.aY, false);
      }

      var5 = this.a(ajn.bg, 3);
      this.a(var1, var3, 4, 1, 5, 6, 1, 7, false, var2, aui.c());
      this.a(var1, var3, 4, 2, 6, 6, 2, 7, false, var2, aui.c());
      this.a(var1, var3, 4, 3, 7, 6, 3, 7, false, var2, aui.c());

      for(int var6 = 4; var6 <= 6; ++var6) {
         this.a(var1, ajn.bg, var5, var6, 1, 4, var3);
         this.a(var1, ajn.bg, var5, var6, 2, 5, var3);
         this.a(var1, ajn.bg, var5, var6, 3, 6, var3);
      }

      byte var14 = 2;
      byte var7 = 0;
      byte var8 = 3;
      byte var9 = 1;
      switch(this.g) {
      case 0:
         var14 = 0;
         var7 = 2;
         break;
      case 1:
         var14 = 1;
         var7 = 3;
         var8 = 0;
         var9 = 2;
      case 2:
      default:
         break;
      case 3:
         var14 = 3;
         var7 = 1;
         var8 = 0;
         var9 = 2;
      }

      this.a(var1, ajn.br, var14 + (var2.nextFloat() > 0.9F?4:0), 4, 3, 8, var3);
      this.a(var1, ajn.br, var14 + (var2.nextFloat() > 0.9F?4:0), 5, 3, 8, var3);
      this.a(var1, ajn.br, var14 + (var2.nextFloat() > 0.9F?4:0), 6, 3, 8, var3);
      this.a(var1, ajn.br, var7 + (var2.nextFloat() > 0.9F?4:0), 4, 3, 12, var3);
      this.a(var1, ajn.br, var7 + (var2.nextFloat() > 0.9F?4:0), 5, 3, 12, var3);
      this.a(var1, ajn.br, var7 + (var2.nextFloat() > 0.9F?4:0), 6, 3, 12, var3);
      this.a(var1, ajn.br, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 9, var3);
      this.a(var1, ajn.br, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 10, var3);
      this.a(var1, ajn.br, var8 + (var2.nextFloat() > 0.9F?4:0), 3, 3, 11, var3);
      this.a(var1, ajn.br, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 9, var3);
      this.a(var1, ajn.br, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 10, var3);
      this.a(var1, ajn.br, var9 + (var2.nextFloat() > 0.9F?4:0), 7, 3, 11, var3);
      if(!this.a) {
         int var13 = this.a(3);
         int var10 = this.a(5, 6);
         int var11 = this.b(5, 6);
         if(var3.b(var10, var13, var11)) {
            this.a = true;
            var1.d(var10, var13, var11, ajn.ac, 0, 2);
            apj var12 = (apj)var1.o(var10, var13, var11);
            if(var12 != null) {
               var12.a().a("Silverfish");
            }
         }
      }

      return true;
   }
}
