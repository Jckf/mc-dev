import java.util.Random;

public class any extends alj {

   public static final String[] b = new String[]{"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz"};


   public any(boolean var1) {
      super(var1, awt.e);
      this.a(abt.b);
   }

   public adb a(int var1, Random var2, int var3) {
      return adb.a((aji)ajn.U);
   }

   protected add j(int var1) {
      return new add(adb.a((aji)ajn.U), 2, var1 & 7);
   }

   public String b(int var1) {
      if(var1 < 0 || var1 >= b.length) {
         var1 = 0;
      }

      return super.a() + "." + b[var1];
   }

}
