
public class to extends tk {

   private final double a;
   private final double b;
   private String c;


   public to(String var1, double var2, double var4, double var6) {
      super(var1, var2);
      this.a = var4;
      this.b = var6;
      if(var4 > var6) {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      } else if(var2 < var4) {
         throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
      } else if(var2 > var6) {
         throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
      }
   }

   public to a(String var1) {
      this.c = var1;
      return this;
   }

   public String f() {
      return this.c;
   }

   public double a(double var1) {
      if(var1 < this.a) {
         var1 = this.a;
      }

      if(var1 > this.b) {
         var1 = this.b;
      }

      return var1;
   }
}
