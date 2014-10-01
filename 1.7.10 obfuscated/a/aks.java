
public class aks extends ajc {

   protected aks() {
      super(awt.e);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.g(0);
      this.a(abt.c);
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public aor a(ahb var1, int var2) {
      return new apd();
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         apd var10 = (apd)var1.o(var2, var3, var4);
         var5.a(var2, var3, var4, var10.b()?var10.a():null);
         return true;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      if(var6.u()) {
         ((apd)var1.o(var2, var3, var4)).a(var6.s());
      }

   }
}
