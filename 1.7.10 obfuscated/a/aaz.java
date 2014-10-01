
public class aaz extends zs {

   private apb a;


   public aaz(rb var1, apb var2) {
      this.a = var2;

      int var3;
      int var4;
      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < 3; ++var4) {
            this.a(new aay(var2, var4 + var3 * 3, 62 + var4 * 18, 17 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < 9; ++var4) {
            this.a(new aay(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(var3 = 0; var3 < 9; ++var3) {
         this.a(new aay(var1, var3, 8 + var3 * 18, 142));
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
         if(var2 < 9) {
            if(!this.a(var5, 9, 45, true)) {
               return null;
            }
         } else if(!this.a(var5, 0, 9, false)) {
            return null;
         }

         if(var5.b == 0) {
            var4.c((add)null);
         } else {
            var4.f();
         }

         if(var5.b == var3.b) {
            return null;
         }

         var4.a(var1, var5);
      }

      return var3;
   }
}
