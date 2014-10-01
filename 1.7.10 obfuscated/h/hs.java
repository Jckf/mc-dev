
public class hs extends ft {

   private int a;
   private rd b;
   private ahk c;
   private ahm d;


   public hs() {}

   public hs(int var1, rd var2, ahm var3, ahk var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var3;
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public void a(et var1) {
      this.a = var1.readInt();
      this.b = rd.a(var1.readUnsignedByte());
      this.c = ahk.a(var1.readUnsignedByte());
      this.d = ahm.a(var1.c(16));
      if(this.d == null) {
         this.d = ahm.b;
      }

   }

   public void b(et var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b.a());
      var1.writeByte(this.c.a());
      var1.a(this.d.a());
   }
}
