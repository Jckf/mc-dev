import io.netty.buffer.ByteBuf;
import java.security.PublicKey;

public class jt extends ft {

   private String a;
   private PublicKey b;
   private byte[] c;


   public jt() {}

   public jt(String var1, PublicKey var2, byte[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(et var1) {
      this.a = var1.c(20);
      this.b = pt.a(a((ByteBuf)var1));
      this.c = a((ByteBuf)var1);
   }

   public void b(et var1) {
      var1.a(this.a);
      a(var1, this.b.getEncoded());
      a(var1, this.c);
   }

   public void a(jr var1) {
      var1.a(this);
   }
}
