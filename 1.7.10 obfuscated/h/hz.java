
public class hz extends ft {

   private int a;
   private int b;
   private add c;


   public hz() {}

   public hz(int var1, int var2, add var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3 == null?null:var3.m();
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.c();
   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.a(this.c);
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("entity=%d, slot=%d, item=%s", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
   }
}
