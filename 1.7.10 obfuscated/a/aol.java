
public class aol extends ajd {

   private final int a;


   protected aol(String var1, awt var2, int var3) {
      super(var1, var2);
      this.a = var3;
   }

   protected int e(ahb var1, int var2, int var3, int var4) {
      int var5 = Math.min(var1.a(sa.class, this.a(var2, var3, var4)).size(), this.a);
      if(var5 <= 0) {
         return 0;
      } else {
         float var6 = (float)Math.min(this.a, var5) / (float)this.a;
         return qh.f(var6 * 15.0F);
      }
   }

   protected int c(int var1) {
      return var1;
   }

   protected int d(int var1) {
      return var1;
   }

   public int a(ahb var1) {
      return 10;
   }
}
