import java.util.Random;

public class bhr extends bir {

   private int a;
   private int b;


   public bhr(int var1, int var2) {
      super(false);
      this.b = var1;
      this.a = var2;
   }

   public boolean b(aqu var1, Random var2, dt var3) {
      atr var4;
      while(((var4 = var1.p(var3).c()).r() == bof.a || var4.r() == bof.j) && var3.o() > 0) {
         var3 = var3.b();
      }

      atr var5 = var1.p(var3).c();
      if(var5 == aty.d || var5 == aty.c) {
         var3 = var3.a();
         this.a(var1, var3, aty.r, this.b);

         for(int var6 = var3.o(); var6 <= var3.o() + 2; ++var6) {
            int var7 = var6 - var3.o();
            int var8 = 2 - var7;

            for(int var9 = var3.n() - var8; var9 <= var3.n() + var8; ++var9) {
               int var10 = var9 - var3.n();

               for(int var11 = var3.p() - var8; var11 <= var3.p() + var8; ++var11) {
                  int var12 = var11 - var3.p();
                  if(Math.abs(var10) != var8 || Math.abs(var12) != var8 || var2.nextInt(2) != 0) {
                     dt var13 = new dt(var9, var6, var11);
                     if(!var1.p(var13).c().m()) {
                        this.a(var1, var13, aty.t, this.a);
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
