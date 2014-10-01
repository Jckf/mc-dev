
class agz {

   private String a;
   private boolean b;
   private int c;
   private double d;


   public agz(String var1) {
      this.a(var1);
   }

   public void a(String var1) {
      this.a = var1;
      this.b = Boolean.parseBoolean(var1);

      try {
         this.c = Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
         ;
      }

      try {
         this.d = Double.parseDouble(var1);
      } catch (NumberFormatException var3) {
         ;
      }

   }

   public String a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }
}
