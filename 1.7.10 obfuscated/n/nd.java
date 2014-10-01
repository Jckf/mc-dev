import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

class nd extends ChannelInitializer {

   // $FF: synthetic field
   final nc a;


   nd(nc var1) {
      this.a = var1;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
      } catch (ChannelException var4) {
         ;
      }

      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(false));
      } catch (ChannelException var3) {
         ;
      }

      var1.pipeline().addLast("timeout", (ChannelHandler)(new ReadTimeoutHandler(30))).addLast("legacy_query", (ChannelHandler)(new mz(this.a))).addLast("splitter", (ChannelHandler)(new fc())).addLast("decoder", (ChannelHandler)(new ez(ej.h))).addLast("prepender", (ChannelHandler)(new fd())).addLast("encoder", (ChannelHandler)(new fa(ej.h)));
      ej var2 = new ej(false);
      nc.a(this.a).add(var2);
      var1.pipeline().addLast("packet_handler", (ChannelHandler)var2);
      var2.a((fb)(new nl(nc.b(this.a), var2)));
   }
}
