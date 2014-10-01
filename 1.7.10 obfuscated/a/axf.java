
public class axf extends axn {

   private ahu[] c;
   private ahu[] d;
   private ahu[] e;
   private ahu[] f;


   public axf(long var1, axn var3, ahm var4) {
      super(var1);
      this.c = new ahu[]{ahu.q, ahu.q, ahu.q, ahu.X, ahu.X, ahu.p};
      this.d = new ahu[]{ahu.s, ahu.R, ahu.r, ahu.p, ahu.P, ahu.u};
      this.e = new ahu[]{ahu.s, ahu.r, ahu.t, ahu.p};
      this.f = new ahu[]{ahu.A, ahu.A, ahu.A, ahu.S};
      this.a = var3;
      if(var4 == ahm.f) {
         this.c = new ahu[]{ahu.q, ahu.s, ahu.r, ahu.u, ahu.p, ahu.t};
      }

   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a.a(var1, var2, var3, var4);
      int[] var6 = axl.a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + var7 * var3];
            int var10 = (var9 & 3840) >> 8;
            var9 &= -3841;
            if(b(var9)) {
               var6[var8 + var7 * var3] = var9;
            } else if(var9 == ahu.C.ay) {
               var6[var8 + var7 * var3] = var9;
            } else if(var9 == 1) {
               if(var10 > 0) {
                  if(this.a(3) == 0) {
                     var6[var8 + var7 * var3] = ahu.ab.ay;
                  } else {
                     var6[var8 + var7 * var3] = ahu.aa.ay;
                  }
               } else {
                  var6[var8 + var7 * var3] = this.c[this.a(this.c.length)].ay;
               }
            } else if(var9 == 2) {
               if(var10 > 0) {
                  var6[var8 + var7 * var3] = ahu.J.ay;
               } else {
                  var6[var8 + var7 * var3] = this.d[this.a(this.d.length)].ay;
               }
            } else if(var9 == 3) {
               if(var10 > 0) {
                  var6[var8 + var7 * var3] = ahu.U.ay;
               } else {
                  var6[var8 + var7 * var3] = this.e[this.a(this.e.length)].ay;
               }
            } else if(var9 == 4) {
               var6[var8 + var7 * var3] = this.f[this.a(this.f.length)].ay;
            } else {
               var6[var8 + var7 * var3] = ahu.C.ay;
            }
         }
      }

      return var6;
   }
}
