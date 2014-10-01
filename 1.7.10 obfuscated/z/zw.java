
class zw extends aay {

   // $FF: synthetic field
   final ahb a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final int c;
   // $FF: synthetic field
   final int d;
   // $FF: synthetic field
   final zu e;


   zw(zu var1, rb var2, int var3, int var4, int var5, ahb var6, int var7, int var8, int var9) {
      super(var2, var3, var4, var5);
      this.e = var1;
      this.a = var6;
      this.b = var7;
      this.c = var8;
      this.d = var9;
   }

   public boolean a(add var1) {
      return false;
   }

   public boolean a(yz var1) {
      return (var1.bE.d || var1.bF >= this.e.a) && this.e.a > 0 && this.e();
   }

   public void a(yz var1, add var2) {
      if(!var1.bE.d) {
         var1.a(-this.e.a);
      }

      zu.a(this.e).a(0, (add)null);
      if(zu.b(this.e) > 0) {
         add var3 = zu.a(this.e).a(1);
         if(var3 != null && var3.b > zu.b(this.e)) {
            var3.b -= zu.b(this.e);
            zu.a(this.e).a(1, var3);
         } else {
            zu.a(this.e).a(1, (add)null);
         }
      } else {
         zu.a(this.e).a(1, (add)null);
      }

      this.e.a = 0;
      if(!var1.bE.d && !this.a.E && this.a.a(this.b, this.c, this.d) == ajn.bQ && var1.aI().nextFloat() < 0.12F) {
         int var6 = this.a.e(this.b, this.c, this.d);
         int var4 = var6 & 3;
         int var5 = var6 >> 2;
         ++var5;
         if(var5 > 2) {
            this.a.f(this.b, this.c, this.d);
            this.a.c(1020, this.b, this.c, this.d, 0);
         } else {
            this.a.a(this.b, this.c, this.d, var4 | var5 << 2, 2);
            this.a.c(1021, this.b, this.c, this.d, 0);
         }
      } else if(!this.a.E) {
         this.a.c(1021, this.b, this.c, this.d, 0);
      }

   }
}
