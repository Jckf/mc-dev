
public class iu extends ft {

   private String a;
   private int b;
   private zb c;
   private boolean d;
   private rd e;
   private boolean f;


   public void a(et var1) {
      this.a = var1.c(7);
      this.b = var1.readByte();
      this.c = zb.a(var1.readByte());
      this.d = var1.readBoolean();
      this.e = rd.a(var1.readByte());
      this.f = var1.readBoolean();
   }

   public void b(et var1) {
      var1.a(this.a);
      var1.writeByte(this.b);
      var1.writeByte(this.c.a());
      var1.writeBoolean(this.d);
      var1.writeByte(this.e.a());
      var1.writeBoolean(this.f);
   }

   public void a(io var1) {
      var1.a(this);
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public zb e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public rd g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }

   public String b() {
      return String.format("lang=\'%s\', view=%d, chat=%s, col=%b, difficulty=%s, cape=%b", new Object[]{this.a, Integer.valueOf(this.b), this.c, Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f)});
   }
}
