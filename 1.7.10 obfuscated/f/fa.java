import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class fa extends MessageToByteEncoder {

   private static final Logger a = LogManager.getLogger();
   private static final Marker b = MarkerManager.getMarker("PACKET_SENT", ej.b);
   private final eu c;


   public fa(eu var1) {
      this.c = var1;
   }

   protected void a(ChannelHandlerContext var1, ft var2, ByteBuf var3) {
      Integer var4 = (Integer)((BiMap)var1.channel().attr(ej.f).get()).inverse().get(var2.getClass());
      if(a.isDebugEnabled()) {
         a.debug(b, "OUT: [{}:{}] {}[{}]", new Object[]{var1.channel().attr(ej.d).get(), var4, var2.getClass().getName(), var2.b()});
      }

      if(var4 == null) {
         throw new IOException("Can\'t serialize unregistered packet");
      } else {
         et var5 = new et(var3);
         var5.b(var4.intValue());
         var2.b(var5);
         this.c.b(var4.intValue(), (long)var5.readableBytes());
      }
   }

   // $FF: synthetic method
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.a(var1, (ft)var2, var3);
   }

}
