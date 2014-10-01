import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ez extends ByteToMessageDecoder {

   private static final Logger a = LogManager.getLogger();
   private static final Marker b = MarkerManager.getMarker("PACKET_RECEIVED", ej.b);
   private final eu c;


   public ez(eu var1) {
      this.c = var1;
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      int var4 = var2.readableBytes();
      if(var4 != 0) {
         et var5 = new et(var2);
         int var6 = var5.a();
         ft var7 = ft.a((BiMap)var1.channel().attr(ej.e).get(), var6);
         if(var7 == null) {
            throw new IOException("Bad packet id " + var6);
         } else {
            var7.a(var5);
            if(var5.readableBytes() > 0) {
               throw new IOException("Packet was larger than I expected, found " + var5.readableBytes() + " bytes extra whilst reading packet " + var6);
            } else {
               var3.add(var7);
               this.c.a(var6, (long)var4);
               if(a.isDebugEnabled()) {
                  a.debug(b, " IN: [{}:{}] {}[{}]", new Object[]{var1.channel().attr(ej.d).get(), Integer.valueOf(var6), var7.getClass().getName(), var7.b()});
               }

            }
         }
      }
   }

}
