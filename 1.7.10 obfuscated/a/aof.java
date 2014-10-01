import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class aof extends aji {

   public aof() {
      super(awt.q);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
      this.a(true);
   }

   public int a(ahb var1) {
      return 10;
   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return 30;
   }

   public adb a(int var1, Random var2, int var3) {
      return ade.F;
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = (var6 & 2) == 2;
      boolean var8 = !ahb.a((ahl)var1, var2, var3 - 1, var4);
      if(var7 != var8) {
         this.b(var1, var2, var3, var4, var6, 0);
         var1.f(var2, var3, var4);
      }

   }

   public void a(ahl var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      boolean var6 = (var5 & 4) == 4;
      boolean var7 = (var5 & 2) == 2;
      if(!var7) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
      } else if(!var6) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      } else {
         this.a(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
      }

   }

   public void b(ahb var1, int var2, int var3, int var4) {
      int var5 = ahb.a((ahl)var1, var2, var3 - 1, var4)?0:2;
      var1.a(var2, var3, var4, var5, 3);
      this.a(var1, var2, var3, var4, var5);
   }

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      this.a(var1, var2, var3, var4, var6 | 1);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, yz var6) {
      if(!var1.E) {
         if(var6.bF() != null && var6.bF().b() == ade.aZ) {
            var1.a(var2, var3, var4, var5 | 8, 4);
         }

      }
   }

   private void a(ahb var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;

      while(var6 < 2) {
         int var7 = 1;

         while(true) {
            if(var7 < 42) {
               int var8 = var2 + p.a[var6] * var7;
               int var9 = var4 + p.b[var6] * var7;
               aji var10 = var1.a(var8, var3, var9);
               if(var10 == ajn.bC) {
                  int var11 = var1.e(var8, var3, var9) & 3;
                  if(var11 == p.f[var6]) {
                     ajn.bC.a(var1, var8, var3, var9, false, var1.e(var8, var3, var9), true, var7, var5);
                  }
               } else if(var10 == ajn.bD) {
                  ++var7;
                  continue;
               }
            }

            ++var6;
            break;
         }
      }

   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {
      if(!var1.E) {
         if((var1.e(var2, var3, var4) & 1) != 1) {
            this.e(var1, var2, var3, var4);
         }
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {
      if(!var1.E) {
         if((var1.e(var2, var3, var4) & 1) == 1) {
            this.e(var1, var2, var3, var4);
         }
      }
   }

   private void e(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      boolean var6 = (var5 & 1) == 1;
      boolean var7 = false;
      List var8 = var1.b((sa)null, azt.a((double)var2 + this.B, (double)var3 + this.C, (double)var4 + this.D, (double)var2 + this.E, (double)var3 + this.F, (double)var4 + this.G));
      if(!var8.isEmpty()) {
         Iterator var9 = var8.iterator();

         while(var9.hasNext()) {
            sa var10 = (sa)var9.next();
            if(!var10.az()) {
               var7 = true;
               break;
            }
         }
      }

      if(var7 && !var6) {
         var5 |= 1;
      }

      if(!var7 && var6) {
         var5 &= -2;
      }

      if(var7 != var6) {
         var1.a(var2, var3, var4, var5, 3);
         this.a(var1, var2, var3, var4, var5);
      }

      if(var7) {
         var1.a(var2, var3, var4, this, this.a(var1));
      }

   }
}
