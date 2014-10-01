
public class axw extends axn {

   public axw(long var1, axn var3) {
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
            ahu var10 = ahu.d(var9);
            int var11;
            int var12;
            int var13;
            int var14;
            if(var9 == ahu.C.ay) {
               var11 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               var12 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               var13 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               var14 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if(var11 != ahu.o.ay && var12 != ahu.o.ay && var13 != ahu.o.ay && var14 != ahu.o.ay) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  var6[var8 + var7 * var3] = ahu.D.ay;
               }
            } else if(var10 != null && var10.l() == aik.class) {
               var11 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
               var12 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
               var13 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
               var14 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
               if(this.c(var11) && this.c(var12) && this.c(var13) && this.c(var14)) {
                  if(!b(var11) && !b(var12) && !b(var13) && !b(var14)) {
                     var6[var8 + var7 * var3] = var9;
                  } else {
                     var6[var8 + var7 * var3] = ahu.E.ay;
                  }
               } else {
                  var6[var8 + var7 * var3] = ahu.L.ay;
               }
            } else if(var9 != ahu.r.ay && var9 != ahu.W.ay && var9 != ahu.I.ay) {
               if(var10 != null && var10.j()) {
                  this.a(var5, var6, var8, var7, var3, var9, ahu.O.ay);
               } else if(var9 != ahu.Z.ay && var9 != ahu.aa.ay) {
                  if(var9 != ahu.o.ay && var9 != ahu.M.ay && var9 != ahu.v.ay && var9 != ahu.u.ay) {
                     var11 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                     var12 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                     var13 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                     var14 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                     if(!b(var11) && !b(var12) && !b(var13) && !b(var14)) {
                        var6[var8 + var7 * var3] = var9;
                     } else {
                        var6[var8 + var7 * var3] = ahu.E.ay;
                     }
                  } else {
                     var6[var8 + var7 * var3] = var9;
                  }
               } else {
                  var11 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                  var12 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                  var13 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                  var14 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                  if(!b(var11) && !b(var12) && !b(var13) && !b(var14)) {
                     if(this.d(var11) && this.d(var12) && this.d(var13) && this.d(var14)) {
                        var6[var8 + var7 * var3] = var9;
                     } else {
                        var6[var8 + var7 * var3] = ahu.q.ay;
                     }
                  } else {
                     var6[var8 + var7 * var3] = var9;
                  }
               }
            } else {
               this.a(var5, var6, var8, var7, var3, var9, ahu.N.ay);
            }
         }
      }

      return var6;
   }

   private void a(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7) {
      if(b(var6)) {
         var2[var3 + var4 * var5] = var6;
      } else {
         int var8 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
         int var9 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
         int var10 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
         int var11 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
         if(!b(var8) && !b(var9) && !b(var10) && !b(var11)) {
            var2[var3 + var4 * var5] = var6;
         } else {
            var2[var3 + var4 * var5] = var7;
         }

      }
   }

   private boolean c(int var1) {
      return ahu.d(var1) != null && ahu.d(var1).l() == aik.class?true:var1 == ahu.L.ay || var1 == ahu.J.ay || var1 == ahu.K.ay || var1 == ahu.s.ay || var1 == ahu.t.ay || b(var1);
   }

   private boolean d(int var1) {
      return ahu.d(var1) != null && ahu.d(var1) instanceof ail;
   }
}
