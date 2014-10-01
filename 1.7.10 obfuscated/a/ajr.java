import java.util.Random;

public class ajr extends aji {

   protected ajr(awt var1) {
      super(var1);
      this.a(true);
      float var2 = 0.2F;
      this.a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var2 * 3.0F, 0.5F + var2);
      this.a(abt.c);
   }

   protected ajr() {
      this(awt.k);
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return super.c(var1, var2, var3, var4) && this.a(var1.a(var2, var3 - 1, var4));
   }

   protected boolean a(aji var1) {
      return var1 == ajn.c || var1 == ajn.d || var1 == ajn.ak;
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      super.a(var1, var2, var3, var4, var5);
      this.e(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      this.e(var1, var2, var3, var4);
   }

   protected void e(ahb var1, int var2, int var3, int var4) {
      if(!this.j(var1, var2, var3, var4)) {
         this.b(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.d(var2, var3, var4, e(0), 0, 2);
      }

   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return this.a(var1.a(var2, var3 - 1, var4));
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 1;
   }
}
