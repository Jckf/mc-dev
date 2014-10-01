
public class ahz {

   public float[] a;
   public ahu[] b;
   public int c;
   public int d;
   public long e;
   // $FF: synthetic field
   final ahy f;


   public ahz(ahy var1, int var2, int var3) {
      this.f = var1;
      this.a = new float[256];
      this.b = new ahu[256];
      this.c = var2;
      this.d = var3;
      ahy.a(var1).a(this.a, var2 << 4, var3 << 4, 16, 16);
      ahy.a(var1).a(this.b, var2 << 4, var3 << 4, 16, 16, false);
   }

   public ahu a(int var1, int var2) {
      return this.b[var1 & 15 | (var2 & 15) << 4];
   }
}
