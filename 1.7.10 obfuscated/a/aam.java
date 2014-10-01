
public class aam extends zs {

   private rb a;
   private wi f;


   public aam(rb var1, rb var2, wi var3) {
      this.a = var2;
      this.f = var3;
      byte var4 = 3;
      var2.f();
      int var5 = (var4 - 4) * 18;
      this.a(new aan(this, var2, 0, 8, 18));
      this.a(new aao(this, var2, 1, 8, 36, var3));
      int var6;
      int var7;
      if(var3.ck()) {
         for(var6 = 0; var6 < var4; ++var6) {
            for(var7 = 0; var7 < 5; ++var7) {
               this.a(new aay(var2, 2 + var7 + var6 * 5, 80 + var7 * 18, 18 + var6 * 18));
            }
         }
      }

      for(var6 = 0; var6 < 3; ++var6) {
         for(var7 = 0; var7 < 9; ++var7) {
            this.a(new aay(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 102 + var6 * 18 + var5));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.a(new aay(var1, var6, 8 + var6 * 18, 160 + var5));
      }

   }

   public boolean a(yz var1) {
      return this.a.a(var1) && this.f.Z() && this.f.e(var1) < 8.0F;
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
         } else if(this.a(1).a(var5) && !this.a(1).e()) {
            if(!this.a(var5, 1, 2, false)) {
               return null;
            }
         } else if(this.a(0).a(var5)) {
            if(!this.a(var5, 0, 1, false)) {
               return null;
            }
         } else if(this.a.a() <= 2 || !this.a(var5, 2, this.a.a(), false)) {
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
