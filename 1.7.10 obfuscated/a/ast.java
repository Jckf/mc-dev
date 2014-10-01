
public class ast {

   private aji a;
   private int b;
   private int c;
   private int d;


   public ast(int var1, aji var2) {
      this.b = 1;
      this.b = var1;
      this.a = var2;
   }

   public ast(int var1, aji var2, int var3) {
      this(var1, var2);
      this.c = var3;
   }

   public int a() {
      return this.b;
   }

   public aji b() {
      return this.a;
   }

   public int c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public void c(int var1) {
      this.d = var1;
   }

   public String toString() {
      String var1 = Integer.toString(aji.b(this.a));
      if(this.b > 1) {
         var1 = this.b + "x" + var1;
      }

      if(this.c > 0) {
         var1 = var1 + ":" + this.c;
      }

      return var1;
   }
}
