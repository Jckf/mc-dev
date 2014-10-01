
public class alc extends ajr {

   private static final String[][] M = new String[][]{{"flower_dandelion"}, {"flower_rose", "flower_blue_orchid", "flower_allium", "flower_houstonia", "flower_tulip_red", "flower_tulip_orange", "flower_tulip_white", "flower_tulip_pink", "flower_oxeye_daisy"}};
   public static final String[] a = new String[]{"poppy", "blueOrchid", "allium", "houstonia", "tulipRed", "tulipOrange", "tulipWhite", "tulipPink", "oxeyeDaisy"};
   public static final String[] b = new String[]{"dandelion"};
   private int O;


   protected alc(int var1) {
      super(awt.k);
      this.O = var1;
   }

   public int a(int var1) {
      return var1;
   }

   public static alc e(String var0) {
      String[] var1 = b;
      int var2 = var1.length;

      int var3;
      String var4;
      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         if(var4.equals(var0)) {
            return ajn.N;
         }
      }

      var1 = a;
      var2 = var1.length;

      for(var3 = 0; var3 < var2; ++var3) {
         var4 = var1[var3];
         if(var4.equals(var0)) {
            return ajn.O;
         }
      }

      return null;
   }

   public static int f(String var0) {
      int var1;
      for(var1 = 0; var1 < b.length; ++var1) {
         if(b[var1].equals(var0)) {
            return var1;
         }
      }

      for(var1 = 0; var1 < a.length; ++var1) {
         if(a[var1].equals(var0)) {
            return var1;
         }
      }

      return 0;
   }

}
