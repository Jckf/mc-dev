import java.util.List;
import java.util.Random;

public class auy extends avc {

   private boolean a;


   public auy() {}

   public auy(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.a = true;
      this.g = var2.nextInt(4);
      this.d = avd.a;
      switch(this.g) {
      case 0:
      case 2:
         this.f = new asv(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
         break;
      default:
         this.f = new asv(var3, 64, var4, var3 + 5 - 1, 74, var4 + 5 - 1);
      }

   }

   public auy(int var1, Random var2, asv var3, int var4) {
      super(var1);
      this.a = false;
      this.g = var4;
      this.d = this.a(var2);
      this.f = var3;
   }

   protected void a(dh var1) {
      super.a(var1);
      var1.a("Source", this.a);
   }

   protected void b(dh var1) {
      super.b(var1);
      this.a = var1.n("Source");
   }

   public void a(avk var1, List var2, Random var3) {
      if(this.a) {
         aui.a(auo.class);
      }

      this.a((auz)var1, var2, var3, 1, 1);
   }

   public static auy a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      asv var7 = asv.a(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return a(var7) && avk.a(var0, var7) == null?new auy(var6, var1, var7, var5):null;
   }

   public boolean a(ahb var1, Random var2, asv var3) {
      if(this.a(var1, var3)) {
         return false;
      } else {
         this.a(var1, var3, 0, 0, 0, 4, 10, 4, true, var2, aui.c());
         this.a(var1, var2, var3, this.d, 1, 7, 0);
         this.a(var1, var2, var3, avd.a, 1, 1, 4);
         this.a(var1, ajn.aV, 0, 2, 6, 1, var3);
         this.a(var1, ajn.aV, 0, 1, 5, 1, var3);
         this.a(var1, ajn.U, 0, 1, 6, 1, var3);
         this.a(var1, ajn.aV, 0, 1, 5, 2, var3);
         this.a(var1, ajn.aV, 0, 1, 4, 3, var3);
         this.a(var1, ajn.U, 0, 1, 5, 3, var3);
         this.a(var1, ajn.aV, 0, 2, 4, 3, var3);
         this.a(var1, ajn.aV, 0, 3, 3, 3, var3);
         this.a(var1, ajn.U, 0, 3, 4, 3, var3);
         this.a(var1, ajn.aV, 0, 3, 3, 2, var3);
         this.a(var1, ajn.aV, 0, 3, 2, 1, var3);
         this.a(var1, ajn.U, 0, 3, 3, 1, var3);
         this.a(var1, ajn.aV, 0, 2, 2, 1, var3);
         this.a(var1, ajn.aV, 0, 1, 1, 1, var3);
         this.a(var1, ajn.U, 0, 1, 2, 1, var3);
         this.a(var1, ajn.aV, 0, 1, 1, 2, var3);
         this.a(var1, ajn.U, 0, 1, 1, 3, var3);
         return true;
      }
   }
}
