import java.util.Iterator;

public class ayj {

   public final yz a;
   public int[] b;
   public int[] c;
   private int f;
   private int g;
   private byte[] h;
   public int d;
   private boolean i;
   // $FF: synthetic field
   final ayi e;


   public ayj(ayi var1, yz var2) {
      this.e = var1;
      this.b = new int[128];
      this.c = new int[128];
      this.a = var2;

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         this.b[var3] = 0;
         this.c[var3] = 127;
      }

   }

   public byte[] a(add var1) {
      byte[] var2;
      if(!this.i) {
         var2 = new byte[]{(byte)2, this.e.d};
         this.i = true;
         return var2;
      } else {
         int var3;
         int var11;
         if(--this.g < 0) {
            this.g = 4;
            var2 = new byte[this.e.g.size() * 3 + 1];
            var2[0] = 1;
            var3 = 0;

            for(Iterator var4 = this.e.g.values().iterator(); var4.hasNext(); ++var3) {
               ayk var5 = (ayk)var4.next();
               var2[var3 * 3 + 1] = (byte)(var5.a << 4 | var5.d & 15);
               var2[var3 * 3 + 2] = var5.b;
               var2[var3 * 3 + 3] = var5.c;
            }

            boolean var9 = !var1.A();
            if(this.h != null && this.h.length == var2.length) {
               for(var11 = 0; var11 < var2.length; ++var11) {
                  if(var2[var11] != this.h[var11]) {
                     var9 = false;
                     break;
                  }
               }
            } else {
               var9 = false;
            }

            if(!var9) {
               this.h = var2;
               return var2;
            }
         }

         for(int var8 = 0; var8 < 1; ++var8) {
            var3 = this.f++ * 11 % 128;
            if(this.b[var3] >= 0) {
               int var10 = this.c[var3] - this.b[var3] + 1;
               var11 = this.b[var3];
               byte[] var6 = new byte[var10 + 3];
               var6[0] = 0;
               var6[1] = (byte)var3;
               var6[2] = (byte)var11;

               for(int var7 = 0; var7 < var6.length - 3; ++var7) {
                  var6[var7 + 3] = this.e.e[(var7 + var11) * 128 + var3];
               }

               this.c[var3] = -1;
               this.b[var3] = -1;
               return var6;
            }
         }

         return null;
      }
   }
}
