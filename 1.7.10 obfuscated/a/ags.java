
public class ags {

   private int a;
   private int b;
   private int c;
   private aji d;
   private int e;
   private int f;


   public ags(int var1, int var2, int var3, aji var4, int var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var5;
      this.f = var6;
      this.d = var4;
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.e;
   }

   public int e() {
      return this.f;
   }

   public aji f() {
      return this.d;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof ags)) {
         return false;
      } else {
         ags var2 = (ags)var1;
         return this.a == var2.a && this.b == var2.b && this.c == var2.c && this.e == var2.e && this.f == var2.f && this.d == var2.d;
      }
   }

   public String toString() {
      return "TE(" + this.a + "," + this.b + "," + this.c + ")," + this.e + "," + this.f + "," + this.d;
   }
}
