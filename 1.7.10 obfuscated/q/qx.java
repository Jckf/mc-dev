import java.util.Random;

public class qx extends qw {

   private add b;
   private int c;
   private int d;


   public qx(adb var1, int var2, int var3, int var4, int var5) {
      super(var5);
      this.b = new add(var1, 1, var2);
      this.c = var3;
      this.d = var4;
   }

   public qx(add var1, int var2, int var3, int var4) {
      super(var4);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public static void a(Random var0, qx[] var1, rb var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         qx var5 = (qx)qv.a(var0, (qw[])var1);
         int var6 = var5.c + var0.nextInt(var5.d - var5.c + 1);
         if(var5.b.e() >= var6) {
            add var7 = var5.b.m();
            var7.b = var6;
            var2.a(var0.nextInt(var2.a()), var7);
         } else {
            for(int var9 = 0; var9 < var6; ++var9) {
               add var8 = var5.b.m();
               var8.b = 1;
               var2.a(var0.nextInt(var2.a()), var8);
            }
         }
      }

   }

   public static void a(Random var0, qx[] var1, apb var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         qx var5 = (qx)qv.a(var0, (qw[])var1);
         int var6 = var5.c + var0.nextInt(var5.d - var5.c + 1);
         if(var5.b.e() >= var6) {
            add var7 = var5.b.m();
            var7.b = var6;
            var2.a(var0.nextInt(var2.a()), var7);
         } else {
            for(int var9 = 0; var9 < var6; ++var9) {
               add var8 = var5.b.m();
               var8.b = 1;
               var2.a(var0.nextInt(var2.a()), var8);
            }
         }
      }

   }

   public static qx[] a(qx[] var0, qx ... var1) {
      qx[] var2 = new qx[var0.length + var1.length];
      int var3 = 0;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         var2[var3++] = var0[var4];
      }

      qx[] var8 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         qx var7 = var8[var6];
         var2[var3++] = var7;
      }

      return var2;
   }
}
