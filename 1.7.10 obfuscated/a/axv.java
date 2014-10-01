
public class axv extends axn {

   private axn c;
   private axn d;


   public axv(long var1, axn var3, axn var4) {
      super(var1);
      this.c = var3;
      this.d = var4;
   }

   public void a(long var1) {
      this.c.a(var1);
      this.d.a(var1);
      super.a(var1);
   }

   public int[] a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.c.a(var1, var2, var3, var4);
      int[] var6 = this.d.a(var1, var2, var3, var4);
      int[] var7 = axl.a(var3 * var4);

      for(int var8 = 0; var8 < var3 * var4; ++var8) {
         if(var5[var8] != ahu.o.ay && var5[var8] != ahu.M.ay) {
            if(var6[var8] == ahu.v.ay) {
               if(var5[var8] == ahu.A.ay) {
                  var7[var8] = ahu.z.ay;
               } else if(var5[var8] != ahu.C.ay && var5[var8] != ahu.D.ay) {
                  var7[var8] = var6[var8] & 255;
               } else {
                  var7[var8] = ahu.D.ay;
               }
            } else {
               var7[var8] = var5[var8];
            }
         } else {
            var7[var8] = var5[var8];
         }
      }

      return var7;
   }
}
