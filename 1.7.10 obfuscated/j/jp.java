
public class jp extends ft {

   private int a;
   private String b;
   private int c;
   private eo d;


   public void a(et var1) {
      this.a = var1.a();
      this.b = var1.c(255);
      this.c = var1.readUnsignedShort();
      this.d = eo.a(var1.a());
   }

   public void b(et var1) {
      var1.b(this.a);
      var1.a(this.b);
      var1.writeShort(this.c);
      var1.b(this.d.c());
   }

   public void a(jq var1) {
      var1.a(this);
   }

   public boolean a() {
      return true;
   }

   public eo c() {
      return this.d;
   }

   public int d() {
      return this.a;
   }
}
