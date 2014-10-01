import java.util.Random;

public class amn extends aji {

   public amn() {
      super(awt.e);
      this.a(abt.b);
   }

   public adb a(int var1, Random var2, int var3) {
      return this == ajn.q?ade.h:(this == ajn.ag?ade.i:(this == ajn.x?ade.aR:(this == ajn.bA?ade.bC:(this == ajn.bY?ade.bU:adb.a((aji)this)))));
   }

   public int a(Random var1) {
      return this == ajn.x?4 + var1.nextInt(5):1;
   }

   public int a(int var1, Random var2) {
      if(var1 > 0 && adb.a((aji)this) != this.a(0, var2, var1)) {
         int var3 = var2.nextInt(var1 + 2) - 1;
         if(var3 < 0) {
            var3 = 0;
         }

         return this.a(var2) * (var3 + 1);
      } else {
         return this.a(var2);
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if(this.a(var5, var1.s, var7) != adb.a((aji)this)) {
         int var8 = 0;
         if(this == ajn.q) {
            var8 = qh.a(var1.s, 0, 2);
         } else if(this == ajn.ag) {
            var8 = qh.a(var1.s, 3, 7);
         } else if(this == ajn.bA) {
            var8 = qh.a(var1.s, 3, 7);
         } else if(this == ajn.x) {
            var8 = qh.a(var1.s, 2, 5);
         } else if(this == ajn.bY) {
            var8 = qh.a(var1.s, 2, 5);
         }

         this.c(var1, var2, var3, var4, var8);
      }

   }

   public int a(int var1) {
      return this == ajn.x?4:0;
   }
}
