import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class ei extends MessageToByteEncoder {

   private final eg a;


   public ei(Cipher var1) {
      this.a = new eg(var1);
   }

   protected void a(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      this.a.a(var2, var3);
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.a(var1, (ByteBuf)var2, var3);
   }
}
