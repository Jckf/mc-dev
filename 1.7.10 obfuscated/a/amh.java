
public class amh extends alt {

   public static final String[][] N = new String[][]{{"leaves_acacia", "leaves_big_oak"}, {"leaves_acacia_opaque", "leaves_big_oak_opaque"}};
   public static final String[] O = new String[]{"acacia", "big_oak"};


   protected void c(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      if((var5 & 3) == 1 && var1.s.nextInt(var6) == 0) {
         this.a(var1, var2, var3, var4, new add(ade.e, 1, 0));
      }

   }

   public int a(int var1) {
      return super.a(var1) + 4;
   }

   public int k(ahb var1, int var2, int var3, int var4) {
      return var1.e(var2, var3, var4) & 3;
   }

   public String[] e() {
      return O;
   }

}
