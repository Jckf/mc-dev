
public class r implements Comparable {

   public int a;
   public int b;
   public int c;


   public r() {}

   public r(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public r(r var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof r)) {
         return false;
      } else {
         r var2 = (r)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c;
      }
   }

   public int hashCode() {
      return this.a + this.c << 8 + this.b << 16;
   }

   public int a(r var1) {
      return this.b == var1.b?(this.c == var1.c?this.a - var1.a:this.c - var1.c):this.b - var1.b;
   }

   public void b(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public float e(int var1, int var2, int var3) {
      float var4 = (float)(this.a - var1);
      float var5 = (float)(this.b - var2);
      float var6 = (float)(this.c - var3);
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public float e(r var1) {
      return this.e(var1.a, var1.b, var1.c);
   }

   public String toString() {
      return "Pos{x=" + this.a + ", y=" + this.b + ", z=" + this.c + '}';
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((r)var1);
   }
}
