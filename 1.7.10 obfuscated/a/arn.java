import java.util.Random;

public abstract class arn {

   private final boolean a;


   public arn() {
      this.a = false;
   }

   public arn(boolean var1) {
      this.a = var1;
   }

   public abstract boolean a(ahb var1, Random var2, int var3, int var4, int var5);

   public void a(double var1, double var3, double var5) {}

   protected void a(ahb var1, int var2, int var3, int var4, aji var5) {
      this.a(var1, var2, var3, var4, var5, 0);
   }

   protected void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      if(this.a) {
         var1.d(var2, var3, var4, var5, var6, 3);
      } else {
         var1.d(var2, var3, var4, var5, var6, 2);
      }

   }
}
