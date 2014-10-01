
public abstract class tk implements th {

   private final String a;
   private final double b;
   private boolean c;


   protected tk(String var1, double var2) {
      this.a = var1;
      this.b = var2;
      if(var1 == null) {
         throw new IllegalArgumentException("Name cannot be null!");
      }
   }

   public String a() {
      return this.a;
   }

   public double b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public tk a(boolean var1) {
      this.c = var1;
      return this;
   }

   public int hashCode() {
      return this.a.hashCode();
   }
}
