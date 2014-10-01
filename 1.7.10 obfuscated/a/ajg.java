
public class ajg extends ajc {

   public ajg() {
      super(awt.s);
      this.c(3.0F);
      this.a(abt.f);
   }

   public aor a(ahb var1, int var2) {
      return new aoq();
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      if(var1.E) {
         return true;
      } else {
         aoq var10 = (aoq)var1.o(var2, var3, var4);
         if(var10 != null) {
            var5.a(var10);
         }

         return true;
      }
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 34;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      if(var6.u()) {
         ((aoq)var1.o(var2, var3, var4)).a(var6.s());
      }

   }
}
