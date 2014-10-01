
public abstract class ang extends aji {

   protected ang(awt var1) {
      super(var1);
   }

   public int b() {
      return 31;
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = var9 & 3;
      byte var11 = 0;
      switch(var5) {
      case 0:
      case 1:
         var11 = 0;
         break;
      case 2:
      case 3:
         var11 = 8;
         break;
      case 4:
      case 5:
         var11 = 4;
      }

      return var10 | var11;
   }

   public int a(int var1) {
      return var1 & 3;
   }

   public int k(int var1) {
      return var1 & 3;
   }

   protected add j(int var1) {
      return new add(adb.a((aji)this), 1, this.k(var1));
   }
}
