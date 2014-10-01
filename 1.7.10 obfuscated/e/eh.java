import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class eh extends MessageToMessageDecoder {

   private final eg a;


   public eh(Cipher var1) {
      this.a = new eg(var1);
   }

   protected void a(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      var3.add(this.a.a(var1, var2));
   }

   // $FF: synthetic method
   protected void decode(ChannelHandlerContext var1, Object var2, List var3) {
      this.a(var1, (ByteBuf)var2, var3);
   }
}
