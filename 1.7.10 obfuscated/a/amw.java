
public class amw extends akk {

   private boolean a;


   protected amw(boolean var1) {
      super(awt.C);
      this.a(true);
      this.a = var1;
      this.a(abt.b);
   }

   public void b(ahb var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      if(var1.a(var2, var3 - 1, var4) == ajn.aE && var1.a(var2, var3 - 2, var4) == ajn.aE) {
         if(!var1.E) {
            var1.d(var2, var3, var4, e(0), 0, 2);
            var1.d(var2, var3 - 1, var4, e(0), 0, 2);
            var1.d(var2, var3 - 2, var4, e(0), 0, 2);
            wr var9 = new wr(var1);
            var9.b((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
            var1.d((sa)var9);
            var1.c(var2, var3, var4, e(0));
            var1.c(var2, var3 - 1, var4, e(0));
            var1.c(var2, var3 - 2, var4, e(0));
         }

         for(int var10 = 0; var10 < 120; ++var10) {
            var1.a("snowshovel", (double)var2 + var1.s.nextDouble(), (double)(var3 - 2) + var1.s.nextDouble() * 2.5D, (double)var4 + var1.s.nextDouble(), 0.0D, 0.0D, 0.0D);
         }
      } else if(var1.a(var2, var3 - 1, var4) == ajn.S && var1.a(var2, var3 - 2, var4) == ajn.S) {
         boolean var5 = var1.a(var2 - 1, var3 - 1, var4) == ajn.S && var1.a(var2 + 1, var3 - 1, var4) == ajn.S;
         boolean var6 = var1.a(var2, var3 - 1, var4 - 1) == ajn.S && var1.a(var2, var3 - 1, var4 + 1) == ajn.S;
         if(var5 || var6) {
            var1.d(var2, var3, var4, e(0), 0, 2);
            var1.d(var2, var3 - 1, var4, e(0), 0, 2);
            var1.d(var2, var3 - 2, var4, e(0), 0, 2);
            if(var5) {
               var1.d(var2 - 1, var3 - 1, var4, e(0), 0, 2);
               var1.d(var2 + 1, var3 - 1, var4, e(0), 0, 2);
            } else {
               var1.d(var2, var3 - 1, var4 - 1, e(0), 0, 2);
               var1.d(var2, var3 - 1, var4 + 1, e(0), 0, 2);
            }

            wt var7 = new wt(var1);
            var7.i(true);
            var7.b((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
            var1.d((sa)var7);

            for(int var8 = 0; var8 < 120; ++var8) {
               var1.a("snowballpoof", (double)var2 + var1.s.nextDouble(), (double)(var3 - 2) + var1.s.nextDouble() * 3.9D, (double)var4 + var1.s.nextDouble(), 0.0D, 0.0D, 0.0D);
            }

            var1.c(var2, var3, var4, e(0));
            var1.c(var2, var3 - 1, var4, e(0));
            var1.c(var2, var3 - 2, var4, e(0));
            if(var5) {
               var1.c(var2 - 1, var3 - 1, var4, e(0));
               var1.c(var2 + 1, var3 - 1, var4, e(0));
            } else {
               var1.c(var2, var3 - 1, var4 - 1, e(0));
               var1.c(var2, var3 - 1, var4 + 1, e(0));
            }
         }
      }

   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4).J.j() && ahb.a((ahl)var1, var2, var3 - 1, var4);
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {
      int var7 = qh.c((double)(var5.y * 4.0F / 360.0F) + 2.5D) & 3;
      var1.a(var2, var3, var4, var7, 2);
   }
}
