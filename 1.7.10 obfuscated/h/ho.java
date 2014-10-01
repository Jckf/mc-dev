
public class ho extends ft {

   private String a;
   private boolean b;
   private int c;


   public ho() {}

   public ho(String var1, boolean var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(et var1) {
      this.a = var1.c(16);
      this.b = var1.readBoolean();
      this.c = var1.readShort();
   }

   public void b(et var1) {
      var1.a(this.a);
      var1.writeBoolean(this.b);
      var1.writeShort(this.c);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
