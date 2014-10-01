import java.util.Random;

public class akb extends ajc {

   public akb() {
      super(awt.f);
   }

   public aor a(ahb var1, int var2) {
      return new aox();
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!var1.E) {
         boolean var6 = var1.v(var2, var3, var4);
         int var7 = var1.e(var2, var3, var4);
         boolean var8 = (var7 & 1) != 0;
         if(var6 && !var8) {
            var1.a(var2, var3, var4, var7 | 1, 4);
            var1.a(var2, var3, var4, this, this.a(var1));
         } else if(!var6 && var8) {
            var1.a(var2, var3, var4, var7 & -2, 4);
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      aor var6 = var1.o(var2, var3, var4);
      if(var6 != null && var6 instanceof aox) {
         agp var7 = ((aox)var6).a();
         var7.a(var1);
         var1.f(var2, var3, var4, this);
      }

   }

   public int a(ahb var1) {
      return 1;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      aox var10 = (aox)var1.o(var2, var3, var4);
      if(var10 != null) {
         var5.a((aor)var10);
      }

      return true;
   }

   public boolean M() {
      return true;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      aor var6 = var1.o(var2, var3, var4);
      return var6 != null && var6 instanceof aox?((aox)var6).a().g():0;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      aox var7 = (aox)var1.o(var2, var3, var4);
      if(var6.u()) {
         var7.a().b(var6.s());
      }

   }

   public int a(Random var1) {
      return 0;
   }
}
