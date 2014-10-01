import java.util.Random;

public class ant extends alw {

   protected ant(awt var1) {
      super(var1);
      this.a(false);
      if(var1 == awt.i) {
         this.a(true);
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.a(var2, var3, var4) == this) {
         this.n(var1, var2, var3, var4);
      }

   }

   private void n(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      var1.d(var2, var3, var4, aji.e(aji.b((aji)this) - 1), var5, 2);
      var1.a(var2, var3, var4, aji.e(aji.b((aji)this) - 1), this.a(var1));
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(this.J == awt.i) {
         int var6 = var5.nextInt(3);

         int var7;
         for(var7 = 0; var7 < var6; ++var7) {
            var2 += var5.nextInt(3) - 1;
            ++var3;
            var4 += var5.nextInt(3) - 1;
            aji var8 = var1.a(var2, var3, var4);
            if(var8.J == awt.a) {
               if(this.o(var1, var2 - 1, var3, var4) || this.o(var1, var2 + 1, var3, var4) || this.o(var1, var2, var3, var4 - 1) || this.o(var1, var2, var3, var4 + 1) || this.o(var1, var2, var3 - 1, var4) || this.o(var1, var2, var3 + 1, var4)) {
                  var1.b(var2, var3, var4, (aji)ajn.ab);
                  return;
               }
            } else if(var8.J.c()) {
               return;
            }
         }

         if(var6 == 0) {
            var7 = var2;
            int var10 = var4;

            for(int var9 = 0; var9 < 3; ++var9) {
               var2 = var7 + var5.nextInt(3) - 1;
               var4 = var10 + var5.nextInt(3) - 1;
               if(var1.c(var2, var3 + 1, var4) && this.o(var1, var2, var3, var4)) {
                  var1.b(var2, var3 + 1, var4, (aji)ajn.ab);
               }
            }
         }
      }

   }

   private boolean o(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4).o().h();
   }
}
