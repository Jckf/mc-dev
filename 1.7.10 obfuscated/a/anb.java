import java.util.Random;

public class anb extends aji {

   private final boolean a;


   public anb(boolean var1) {
      super(awt.t);
      this.a = var1;
      if(var1) {
         this.a(1.0F);
      }

   }

   public void b(ahb var1, int var2, int var3, int var4) {
      if(!var1.E) {
         if(this.a && !var1.v(var2, var3, var4)) {
            var1.a(var2, var3, var4, this, 4);
         } else if(!this.a && var1.v(var2, var3, var4)) {
            var1.d(var2, var3, var4, ajn.bv, 0, 2);
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E) {
         if(this.a && !var1.v(var2, var3, var4)) {
            var1.a(var2, var3, var4, this, 4);
         } else if(!this.a && var1.v(var2, var3, var4)) {
            var1.d(var2, var3, var4, ajn.bv, 0, 2);
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E && this.a && !var1.v(var2, var3, var4)) {
         var1.d(var2, var3, var4, ajn.bu, 0, 2);
      }

   }

   public adb a(int var1, Random var2, int var3) {
      return adb.a(ajn.bu);
   }

   protected add j(int var1) {
      return new add(ajn.bu);
   }
}
