import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class axr extends axn {

   private static final Logger c = LogManager.getLogger();
   private axn d;


   public axr(long var1, axn var3, axn var4) {
      super(var1);
      this.a = var3;
      this.d = var4;
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var6 = this.d.a(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var7 = axl.a(var3 * var4);

      for(int var8 = 0; var8 < var4; ++var8) {
         for(int var9 = 0; var9 < var3; ++var9) {
            this.a((long)(var9 + var1), (long)(var8 + var2));
            int var10 = var5[var9 + 1 + (var8 + 1) * (var3 + 2)];
            int var11 = var6[var9 + 1 + (var8 + 1) * (var3 + 2)];
            boolean var12 = (var11 - 2) % 29 == 0;
            if(var10 > 255) {
               c.debug("old! " + var10);
            }

            if(var10 != 0 && var11 >= 2 && (var11 - 2) % 29 == 1 && var10 < 128) {
               if(ahu.d(var10 + 128) != null) {
                  var7[var9 + var8 * var3] = var10 + 128;
               } else {
                  var7[var9 + var8 * var3] = var10;
               }
            } else if(this.a(3) != 0 && !var12) {
               var7[var9 + var8 * var3] = var10;
            } else {
               int var13 = var10;
               int var14;
               if(var10 == ahu.q.ay) {
                  var13 = ahu.F.ay;
               } else if(var10 == ahu.s.ay) {
                  var13 = ahu.G.ay;
               } else if(var10 == ahu.P.ay) {
                  var13 = ahu.Q.ay;
               } else if(var10 == ahu.R.ay) {
                  var13 = ahu.p.ay;
               } else if(var10 == ahu.t.ay) {
                  var13 = ahu.H.ay;
               } else if(var10 == ahu.U.ay) {
                  var13 = ahu.V.ay;
               } else if(var10 == ahu.S.ay) {
                  var13 = ahu.T.ay;
               } else if(var10 == ahu.p.ay) {
                  if(this.a(3) == 0) {
                     var13 = ahu.G.ay;
                  } else {
                     var13 = ahu.s.ay;
                  }
               } else if(var10 == ahu.A.ay) {
                  var13 = ahu.B.ay;
               } else if(var10 == ahu.J.ay) {
                  var13 = ahu.K.ay;
               } else if(var10 == ahu.o.ay) {
                  var13 = ahu.M.ay;
               } else if(var10 == ahu.r.ay) {
                  var13 = ahu.W.ay;
               } else if(var10 == ahu.X.ay) {
                  var13 = ahu.Y.ay;
               } else if(a(var10, ahu.aa.ay)) {
                  var13 = ahu.Z.ay;
               } else if(var10 == ahu.M.ay && this.a(3) == 0) {
                  var14 = this.a(2);
                  if(var14 == 0) {
                     var13 = ahu.p.ay;
                  } else {
                     var13 = ahu.s.ay;
                  }
               }

               if(var12 && var13 != var10) {
                  if(ahu.d(var13 + 128) != null) {
                     var13 += 128;
                  } else {
                     var13 = var10;
                  }
               }

               if(var13 == var10) {
                  var7[var9 + var8 * var3] = var10;
               } else {
                  var14 = var5[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                  int var15 = var5[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                  int var16 = var5[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                  int var17 = var5[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                  int var18 = 0;
                  if(a(var14, var10)) {
                     ++var18;
                  }

                  if(a(var15, var10)) {
                     ++var18;
                  }

                  if(a(var16, var10)) {
                     ++var18;
                  }

                  if(a(var17, var10)) {
                     ++var18;
                  }

                  if(var18 >= 3) {
                     var7[var9 + var8 * var3] = var13;
                  } else {
                     var7[var9 + var8 * var3] = var10;
                  }
               }
            }
         }
      }

      return var7;
   }

}
