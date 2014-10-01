
public class aal extends zs {

   private final rb a;


   public aal(yx var1, rb var2) {
      this.a = var2;
      var2.f();
      byte var3 = 51;

      int var4;
      for(var4 = 0; var4 < var2.a(); ++var4) {
         this.a(new aay(var2, var4, 44 + var4 * 18, 20));
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(int var5 = 0; var5 < 9; ++var5) {
            this.a(new aay(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, var4 * 18 + var3));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.a(new aay(var1, var4, 8 + var4 * 18, 58 + var3));
      }

   }

   public boolean a(yz var1) {
      return this.a.a(var1);
   }

   public add b(yz var1, int var2) {
      add var3 = null;
      aay var4 = (aay)this.c.get(var2);
      if(var4 != null && var4.e()) {
         add var5 = var4.d();
         var3 = var5.m();
         if(var2 < this.a.a()) {
            if(!this.a(var5, this.a.a(), this.c.size(), true)) {
               return null;
            }
         } else if(!this.a(var5, 0, this.a.a(), false)) {
            return null;
         }

         if(var5.b == 0) {
            var4.c((add)null);
         } else {
            var4.f();
         }
      }

      return var3;
   }

   public void b(yz var1) {
      super.b(var1);
      this.a.l_();
   }
}
