
public class zx extends zs {

   private aoq a;
   private final zy f;
   private int g;
   private int h;
   private int i;


   public zx(yx var1, aoq var2) {
      this.a = var2;
      this.a((aay)(this.f = new zy(this, var2, 0, 136, 110)));
      byte var3 = 36;
      short var4 = 137;

      int var5;
      for(var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 9; ++var6) {
            this.a(new aay(var1, var6 + var5 * 9 + 9, var3 + var6 * 18, var4 + var5 * 18));
         }
      }

      for(var5 = 0; var5 < 9; ++var5) {
         this.a(new aay(var1, var5, var3 + var5 * 18, 58 + var4));
      }

      this.g = var2.l();
      this.h = var2.j();
      this.i = var2.k();
   }

   public void a(aac var1) {
      super.a(var1);
      var1.a(this, 0, this.g);
      var1.a(this, 1, this.h);
      var1.a(this, 2, this.i);
   }

   public aoq e() {
      return this.a;
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
         if(var2 == 0) {
            if(!this.a(var5, 1, 37, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if(!this.f.e() && this.f.a(var5) && var5.b == 1) {
            if(!this.a(var5, 0, 1, false)) {
               return null;
            }
         } else if(var2 >= 1 && var2 < 28) {
            if(!this.a(var5, 28, 37, false)) {
               return null;
            }
         } else if(var2 >= 28 && var2 < 37) {
            if(!this.a(var5, 1, 28, false)) {
               return null;
            }
         } else if(!this.a(var5, 1, 37, false)) {
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
