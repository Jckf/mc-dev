import java.util.List;
import java.util.Random;

public class aun extends avc {

   private int a;


   public aun() {}

   public aun(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.f = var3;
      this.a = var4 != 2 && var4 != 0?var3.b():var3.d();
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Steps", this.a);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a = var1.f("Steps");
   }

   public static asv a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      boolean var6 = true;
      asv var7 = asv.a(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      avk var8 = avk.a(var0, var7);
      if(var8 == null) {
         return null;
      } else {
         if(var8.c().b == var7.b) {
            for(int var9 = 3; var9 >= 1; --var9) {
               var7 = asv.a(var2, var3, var4, -1, -1, 0, 5, 5, var9 - 1, var5);
               if(!var8.c().a(var7)) {
                  return asv.a(var2, var3, var4, -1, -1, 0, 5, 5, var9, var5);
               }
            }
         }

         return null;
      }
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         for(int var4 = 0; var4 < this.a; ++var4) {
            this.a(var1, ajn.aV, 0, 0, 0, var4, var3);
            this.a(var1, ajn.aV, 0, 1, 0, var4, var3);
            this.a(var1, ajn.aV, 0, 2, 0, var4, var3);
            this.a(var1, ajn.aV, 0, 3, 0, var4, var3);
            this.a(var1, ajn.aV, 0, 4, 0, var4, var3);

            for(int var5 = 1; var5 <= 3; ++var5) {
               this.a(var1, ajn.aV, 0, 0, var5, var4, var3);
               this.a(var1, ajn.a, 0, 1, var5, var4, var3);
               this.a(var1, ajn.a, 0, 2, var5, var4, var3);
               this.a(var1, ajn.a, 0, 3, var5, var4, var3);
               this.a(var1, ajn.aV, 0, 4, var5, var4, var3);
            }

            this.a(var1, ajn.aV, 0, 0, 4, var4, var3);
            this.a(var1, ajn.aV, 0, 1, 4, var4, var3);
            this.a(var1, ajn.aV, 0, 2, 4, var4, var3);
            this.a(var1, ajn.aV, 0, 3, 4, var4, var3);
            this.a(var1, ajn.aV, 0, 4, 4, var4, var3);
         }

         return true;
      }
   }
}
