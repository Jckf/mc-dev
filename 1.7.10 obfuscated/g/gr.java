import io.netty.buffer.ByteBuf;

public class gr extends ft {

   private String a;
   private byte[] b;


   public gr() {}

   public gr(String var1, ByteBuf var2) {
      this(var1, var2.array());
   }

   public gr(String var1, byte[] var2) {
      this.a = var1;
      this.b = var2;
      if(var2.length >= 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   public void a(et var1) {
      this.a = var1.c(20);
      this.b = new byte[var1.readUnsignedShort()];
      var1.readBytes(this.b);
   }

   public void b(et var1) {
      var1.a(this.a);
      var1.writeShort(this.b.length);
      var1.writeBytes(this.b);
   }

   public void a(fv var1) {
      var1.a(this);
   }
}
