
public class ii extends ft {

   private int a;
   private int b;
   private int c;
   private String[] d;


   public ii() {}

   public ii(int var1, int var2, int var3, String[] var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = new String[]{var4[0], var4[1], var4[2], var4[3]};
   }

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

   public void a(fv var1) {
      var1.a(this);
   }
}
