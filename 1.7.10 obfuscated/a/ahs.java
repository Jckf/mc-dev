
public class ahs implements Comparable {

   private static long f;
   private final aji g;
   public int a;
   public int b;
   public int c;
   public long d;
   public int e;
   private long h;


   public ahs(int var1, int var2, int var3, aji var4) {
      this.h = (long)(f++);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.g = var4;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof ahs)) {
         return false;
      } else {
         ahs var2 = (ahs)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && aji.a(this.g, var2.g);
      }
   }

   public int hashCode() {
      return (this.a * 1024 * 1024 + this.c * 1024 + this.b) * 256;
   }

   public ahs a(long var1) {
      this.d = var1;
      return this;
   }

   public void a(int var1) {
      this.e = var1;
   }

   public int a(ahs var1) {
      return this.d < var1.d?-1:(this.d > var1.d?1:(this.e != var1.e?this.e - var1.e:(this.h < var1.h?-1:(this.h > var1.h?1:0))));
   }

   public String toString() {
      return aji.b(this.g) + ": (" + this.a + ", " + this.b + ", " + this.c + "), " + this.d + ", " + this.e + ", " + this.h;
   }

   public aji a() {
      return this.g;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((ahs)var1);
   }
}
