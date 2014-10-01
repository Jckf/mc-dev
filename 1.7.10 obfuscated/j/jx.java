import io.netty.buffer.ByteBuf;
import java.security.PrivateKey;
import javax.crypto.SecretKey;

public class jx extends ft {

   private byte[] a = new byte[0];
   private byte[] b = new byte[0];


   public void a(et var1) {
      this.a = a((ByteBuf)var1);
      this.b = a((ByteBuf)var1);
   }

   public void b(et var1) {
      a(var1, this.a);
      a(var1, this.b);
   }

   public void a(jv var1) {
      var1.a(this);
   }

   public SecretKey a(PrivateKey var1) {
      return pt.a(var1, this.a);
   }

   public byte[] b(PrivateKey var1) {
      return var1 == null?this.b:pt.b(var1, this.b);
   }
}
