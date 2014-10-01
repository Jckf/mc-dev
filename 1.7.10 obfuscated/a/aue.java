import java.util.Random;

abstract class aue extends avk {

   protected int a;
   protected int b;
   protected int c;
   protected int d = -1;


   public aue() {}

   protected aue(Random var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(0);
      this.a = var5;
      this.b = var6;
      this.c = var7;
      this.g = var1.nextInt(4);
      switch(this.g) {
      case 0:
      case 2:
         this.f = new asv(var2, var3, var4, var2 + var5 - 1, var3 + var6 - 1, var4 + var7 - 1);
         break;
      default:
         this.f = new asv(var2, var3, var4, var2 + var7 - 1, var3 + var6 - 1, var4 + var5 - 1);
      }

   }

   protected void a(dh var1) {
      var1.a("Width", this.a);
      var1.a("Height", this.b);
      var1.a("Depth", this.c);
      var1.a("HPos", this.d);
   }

   protected void b(dh var1) {
      this.a = var1.f("Width");
      this.b = var1.f("Height");
      this.c = var1.f("Depth");
      this.d = var1.f("HPos");
   }

   protected boolean a(ahb var1, asv var2, int var3) {
      if(this.d >= 0) {
         return true;
      } else {
         int var4 = 0;
         int var5 = 0;

         for(int var6 = this.f.c; var6 <= this.f.f; ++var6) {
            for(int var7 = this.f.a; var7 <= this.f.d; ++var7) {
               if(var2.b(var7, 64, var6)) {
                  var4 += Math.max(var1.i(var7, var6), var1.t.i());
                  ++var5;
               }
            }
         }

         if(var5 == 0) {
            return false;
         } else {
            this.d = var4 / var5;
            this.f.a(0, this.d - this.f.b + var3, 0);
            return true;
         }
      }
   }
}
