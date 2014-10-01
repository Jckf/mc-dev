
public class aad extends zs {

   private rb a;
   private int f;


   public aad(rb var1, rb var2) {
      this.a = var2;
      this.f = var2.a() / 9;
      var2.f();
      int var3 = (this.f - 4) * 18;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.f; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.a(new aay(var2, var5 + var4 * 9, 8 + var5 * 18, 18 + var4 * 18));
         }
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.a(new aay(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 103 + var4 * 18 + var3));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.a(new aay(var1, var4, 8 + var4 * 18, 161 + var3));
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
         if(var2 < this.f * 9) {
            if(!this.a(var5, this.f * 9, this.c.size(), true)) {
               return null;
            }
         } else if(!this.a(var5, 0, this.f * 9, false)) {
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

   public rb e() {
      return this.a;
   }
}
