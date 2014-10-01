
public class iz extends ft {

   private String a;
   private int b;
   private byte[] c;


   public void a(et var1) {
      this.a = var1.c(20);
      this.b = var1.readShort();
      if(this.b > 0 && this.b < 32767) {
         this.c = new byte[this.b];
         var1.readBytes(this.c);
      }

   }

   public void b(et var1) {
      var1.a(this.a);
      var1.writeShort((short)this.b);
      if(this.c != null) {
         var1.writeBytes(this.c);
      }

   }

   public void a(io var1) {
      var1.a(this);
   }

   public String c() {
      return this.a;
   }

   public byte[] e() {
      return this.c;
   }
}
