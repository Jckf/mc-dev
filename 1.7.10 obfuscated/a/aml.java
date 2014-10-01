
public class aml extends alt {

   public static final String[][] N = new String[][]{{"leaves_oak", "leaves_spruce", "leaves_birch", "leaves_jungle"}, {"leaves_oak_opaque", "leaves_spruce_opaque", "leaves_birch_opaque", "leaves_jungle_opaque"}};
   public static final String[] O = new String[]{"oak", "spruce", "birch", "jungle"};


   protected void c(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      if((var5 & 3) == 0 && var1.s.nextInt(var6) == 0) {
         this.a(var1, var2, var3, var4, new add(ade.e, 1, 0));
      }

   }

   protected int b(int var1) {
      int var2 = super.b(var1);
      if((var1 & 3) == 3) {
         var2 = 40;
      }

      return var2;
   }

   public String[] e() {
      return O;
   }

}
