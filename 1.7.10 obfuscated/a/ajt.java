import java.util.Random;

public class ajt extends aji {

   protected ajt() {
      super(awt.A);
      this.a(true);
      this.a(abt.c);
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(var1.c(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.a(var2, var3 - var6, var4) == this; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.e(var2, var3, var4);
            if(var7 == 15) {
               var1.b(var2, var3 + 1, var4, (aji)this);
               var1.a(var2, var3, var4, 0, 4);
               this.a(var1, var2, var3 + 1, var4, (aji)this);
            } else {
               var1.a(var2, var3, var4, var7 + 1, 4);
            }
         }
      }

   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return azt.a((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   public boolean d() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public int b() {
      return 13;
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return !super.c(var1, var2, var3, var4)?false:this.j(var1, var2, var3, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      if(!this.j(var1, var2, var3, var4)) {
         var1.a(var2, var3, var4, true);
      }

   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      if(var1.a(var2 - 1, var3, var4).o().a()) {
         return false;
      } else if(var1.a(var2 + 1, var3, var4).o().a()) {
         return false;
      } else if(var1.a(var2, var3, var4 - 1).o().a()) {
         return false;
      } else if(var1.a(var2, var3, var4 + 1).o().a()) {
         return false;
      } else {
         aji var5 = var1.a(var2, var3 - 1, var4);
         return var5 == ajn.aF || var5 == ajn.m;
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {
      var5.a(ro.g, 1.0F);
   }
}
