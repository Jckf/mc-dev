
public class agu {

   public final int a;
   public final int b;


   public agu(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public static long a(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public int hashCode() {
      int var1 = 1664525 * this.a + 1013904223;
      int var2 = 1664525 * (this.b ^ -559038737) + 1013904223;
      return var1 ^ var2;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof agu)) {
         return false;
      } else {
         agu var2 = (agu)var1;
         return this.a == var2.a && this.b == var2.b;
      }
   }

   public int a() {
      return (this.a << 4) + 8;
   }

   public int b() {
      return (this.b << 4) + 8;
   }

   public agt a(int var1) {
      return new agt(this.a(), var1, this.b());
   }

   public String toString() {
      return "[" + this.a + ", " + this.b + "]";
   }
}
