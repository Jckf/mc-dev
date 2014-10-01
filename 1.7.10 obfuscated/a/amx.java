
public class amx extends aji {

   public static final String[] a = new String[]{"default", "chiseled", "lines"};
   private static final String[] b = new String[]{"side", "chiseled", "lines", null, null};


   public amx() {
      super(awt.e);
      this.a(abt.b);
   }

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      if(var9 == 2) {
         switch(var5) {
         case 0:
         case 1:
            var9 = 2;
            break;
         case 2:
         case 3:
            var9 = 4;
            break;
         case 4:
         case 5:
            var9 = 3;
         }
      }

      return var9;
   }

   public int a(int var1) {
      return var1 != 3 && var1 != 4?var1:2;
   }

   protected add j(int var1) {
      return var1 != 3 && var1 != 4?super.j(var1):new add(adb.a((aji)this), 1, 2);
   }

   public int b() {
      return 39;
   }

   public awv f(int var1) {
      return awv.p;
   }

}
