
public class ig extends ft {

   private int a;
   private int b;
   private int c;


   public ig() {}

   public ig(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public boolean a() {
      return false;
   }

   public String b() {
      return String.format("x=%d, y=%d, z=%d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
   }
}
