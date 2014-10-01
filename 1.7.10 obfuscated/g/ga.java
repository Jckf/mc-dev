
public class ga extends ft {

   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private String f;


   public ga() {}

   public ga(tb var1) {
      this.a = var1.y();
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.a;
      this.f = var1.e.B;
   }

   public void a(et var1) {
      this.a = var1.a();
      this.f = var1.c(tc.A);
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
   }

   public void b(et var1) {
      var1.b(this.a);
      var1.a(this.f);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("id=%d, type=%s, x=%d, y=%d, z=%d", new Object[]{Integer.valueOf(this.a), this.f, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
   }
}
