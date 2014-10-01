import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class aie extends aib {

   private ahu c;
   private float d;


   public aie(ahu var1, float var2) {
      this.c = var1;
      this.d = var2;
   }

   public ahu a(int var1, int var2) {
      return this.c;
   }

   public ahu[] a(ahu[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new ahu[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.c);
      return var1;
   }

   public float[] a(float[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.d);
      return var1;
   }

   public ahu[] b(ahu[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new ahu[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.c);
      return var1;
   }

   public ahu[] a(ahu[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return this.b(var1, var2, var3, var4, var5);
   }

   public agt a(int var1, int var2, int var3, List var4, Random var5) {
      return var4.contains(this.c)?new agt(var1 - var3 + var5.nextInt(var3 * 2 + 1), 0, var2 - var3 + var5.nextInt(var3 * 2 + 1)):null;
   }

   public boolean a(int var1, int var2, int var3, List var4) {
      return var4.contains(this.c);
   }
}
