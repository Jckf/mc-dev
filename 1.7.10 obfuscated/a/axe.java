
public class axe extends axn {

   public axe(long var1, axn var3) {
      super(var1);
      this.a = var3;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var6 = axl.a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + 1 + (var7 + 1) * (var3 + 2)];
            if(!this.a(var5, var6, var8, var7, var3, var9, ahu.r.ay, ahu.I.ay) && !this.b(var5, var6, var8, var7, var3, var9, ahu.aa.ay, ahu.Z.ay) && !this.b(var5, var6, var8, var7, var3, var9, ahu.ab.ay, ahu.Z.ay) && !this.b(var5, var6, var8, var7, var3, var9, ahu.U.ay, ahu.t.ay)) {
               int var10;
               int var11;
               int var12;
               int var13;
               if(var9 == ahu.q.ay) {
                  var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                  var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                  var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                  var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                  if(var10 != ahu.A.ay && var11 != ahu.A.ay && var12 != ahu.A.ay && var13 != ahu.A.ay) {
                     var6[var8 + var7 * var3] = var9;
                  } else {
                     var6[var8 + var7 * var3] = ahu.W.ay;
                  }
               } else if(var9 == ahu.u.ay) {
                  var10 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                  var11 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                  var12 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                  var13 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                  if(var10 != ahu.q.ay && var11 != ahu.q.ay && var12 != ahu.q.ay && var13 != ahu.q.ay && var10 != ahu.S.ay && var11 != ahu.S.ay && var12 != ahu.S.ay && var13 != ahu.S.ay && var10 != ahu.A.ay && var11 != ahu.A.ay && var12 != ahu.A.ay && var13 != ahu.A.ay) {
                     if(var10 != ahu.J.ay && var13 != ahu.J.ay && var11 != ahu.J.ay && var12 != ahu.J.ay) {
                        var6[var8 + var7 * var3] = var9;
                     } else {
                        var6[var8 + var7 * var3] = ahu.L.ay;
                     }
                  } else {
                     var6[var8 + var7 * var3] = ahu.p.ay;
                  }
               } else {
                  var6[var8 + var7 * var3] = var9;
               }
            }
         }
      }

      return var6;
   }

   private boolean a(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(!a(var6, var7)) {
         return false;
      } else {
         int var9 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
         int var10 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
         int var11 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
         int var12 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
         if(this.b(var9, var7) && this.b(var10, var7) && this.b(var11, var7) && this.b(var12, var7)) {
            var2[var3 + var4 * var5] = var6;
         } else {
            var2[var3 + var4 * var5] = var8;
         }

         return true;
      }
   }

   private boolean b(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var6 != var7) {
         return false;
      } else {
         int var9 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
         int var10 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
         int var11 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
         int var12 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
         if(a(var9, var7) && a(var10, var7) && a(var11, var7) && a(var12, var7)) {
            var2[var3 + var4 * var5] = var6;
         } else {
            var2[var3 + var4 * var5] = var8;
         }

         return true;
      }
   }

   private boolean b(int var1, int var2) {
      if(a(var1, var2)) {
         return true;
      } else if(ahu.d(var1) != null && ahu.d(var2) != null) {
         ahw var3 = ahu.d(var1).m();
         ahw var4 = ahu.d(var2).m();
         return var3 == var4 || var3 == ahw.c || var4 == ahw.c;
      } else {
         return false;
      }
   }
}
