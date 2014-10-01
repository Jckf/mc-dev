
public class jn extends ft {

   private int a;
   private int b;
   private int c;
   private String[] d;


   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      this.d = new String[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.d[var2] = var1.c(15);
      }

   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);

      for(int var2 = 0; var2 < 4; ++var2) {
         var1.a(this.d[var2]);
      }

   }

   public void a(io var1) {
      var1.a(this);
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public String[] f() {
      return this.d;
   }
}
