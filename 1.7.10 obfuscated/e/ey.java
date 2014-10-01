
class ey {

   private final long a;
   private final int b;
   private final double c;


   private ey(long var1, int var3, double var4) {
      this.a = var1;
      this.b = var3;
      this.c = var4;
   }

   public ey a(long var1) {
      return new ey(var1 + this.a, this.b + 1, (double)((var1 + this.a) / (long)(this.b + 1)));
   }

   public long a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public String toString() {
      return "{totalBytes=" + this.a + ", count=" + this.b + ", averageBytes=" + this.c + '}';
   }

   // $FF: synthetic method
   ey(long var1, int var3, double var4, ev var6) {
      this(var1, var3, var4);
   }

   // $FF: synthetic method
   static long a(ey var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static int b(ey var0) {
      return var0.b;
   }
}
