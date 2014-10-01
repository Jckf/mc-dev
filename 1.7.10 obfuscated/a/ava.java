import java.util.List;
import java.util.Random;

public class ava extends avc {

   private boolean a;
   private boolean b;


   public ava() {}

   public ava(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.g = var4;
      this.d = this.a(var2);
      this.f = var3;
      this.a = var2.nextInt(2) == 0;
      this.b = var2.nextInt(2) == 0;
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Left", this.a);
      var1.a("Right", this.b);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a = var1.n("Left");
      this.b = var1.n("Right");
   }

   public void a(avk var1, List var2, Random var3) {
      this.a((auz)var1, var2, var3, 1, 1);
      if(this.a) {
         this.b((auz)var1, var2, var3, 1, 2);
      }

      if(this.b) {
         this.c((auz)var1, var2, var3, 1, 2);
      }

   }

   public static ava a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return a(var7) && avk.a(var0, var7) == null?new ava(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 1, 1, 0);
         this.a(var1, var2, var3, avd.a, 1, 1, 6);
         this.a(var1, var3, var2, 0.1F, 1, 2, 1, ajn.aa, 0);
         this.a(var1, var3, var2, 0.1F, 3, 2, 1, ajn.aa, 0);
         this.a(var1, var3, var2, 0.1F, 1, 2, 5, ajn.aa, 0);
         this.a(var1, var3, var2, 0.1F, 3, 2, 5, ajn.aa, 0);
         if(this.a) {
            this.a(var1, var3, 0, 1, 2, 0, 3, 4, ajn.a, ajn.a, false);
         }

         if(this.b) {
            this.a(var1, var3, 4, 1, 2, 4, 3, 4, ajn.a, ajn.a, false);
         }

         return true;
      }
   }
}
