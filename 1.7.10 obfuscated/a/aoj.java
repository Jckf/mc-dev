import java.util.List;

public class aoj extends ajr {

   protected aoj() {
      float var1 = 0.5F;
      float var2 = 0.015625F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var2, 0.5F + var1);
      this.a(abt.c);
   }

   public int b() {
      return 23;
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      if(var7 == null || !(var7 instanceof xi)) {
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return azt.a((double)var2 + this.B, (double)var3 + this.C, (double)var4 + this.D, (double)var2 + this.E, (double)var3 + this.F, (double)var4 + this.G);
   }

   protected boolean a(aji var1) {
      return var1 == ajn.j;
   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return var3 >= 0 && var3 < 256?var1.a(var2, var3 - 1, var4).o() == awt.h && var1.e(var2, var3 - 1, var4) == 0:false;
   }
}
