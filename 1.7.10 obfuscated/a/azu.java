
public class azu {

   public azv a;
   public int b;
   public int c;
   public int d;
   public int e;
   public azw f;
   public sa g;


   public azu(int var1, int var2, int var3, int var4, azw var5) {
      this(var1, var2, var3, var4, var5, true);
   }

   public azu(int var1, int var2, int var3, int var4, azw var5, boolean var6) {
      this.a = var6?azv.b:azv.a;
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = azw.a(var5.a, var5.b, var5.c);
   }

   public azu(sa var1) {
      this(var1, azw.a(var1.s, var1.t, var1.u));
   }

   public azu(sa var1, azw var2) {
      this.a = azv.c;
      this.g = var1;
      this.f = var2;
   }

   public String toString() {
      return "HitResult{type=" + this.a + ", x=" + this.b + ", y=" + this.c + ", z=" + this.d + ", f=" + this.e + ", pos=" + this.f + ", entity=" + this.g + '}';
   }
}
