import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.SocketAddress;
import java.util.Queue;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ej extends SimpleChannelInboundHandler {

   private static final Logger i = LogManager.getLogger();
   public static final Marker a = MarkerManager.getMarker("NETWORK");
   public static final Marker b = MarkerManager.getMarker("NETWORK_PACKETS", a);
   public static final Marker c = MarkerManager.getMarker("NETWORK_STAT", a);
   public static final AttributeKey d = new AttributeKey("protocol");
   public static final AttributeKey e = new AttributeKey("receivable_packets");
   public static final AttributeKey f = new AttributeKey("sendable_packets");
   public static final NioEventLoopGroup g = new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Client IO #%d").setDaemon(true).build());
   public static final eu h = new eu();
   private final boolean j;
   private final Queue k = Queues.newConcurrentLinkedQueue();
   private final Queue l = Queues.newConcurrentLinkedQueue();
   private Channel m;
   private SocketAddress n;
   private fb o;
   private eo p;
   private fj q;
   private boolean r;


   public ej(boolean var1) {
      this.j = var1;
   }

   public void channelActive(ChannelHandlerContext var1) {
      super.channelActive(var1);
      this.m = var1.channel();
      this.n = this.m.remoteAddress();
      this.a(eo.a);
   }

   public void a(eo var1) {
      this.p = (eo)this.m.attr(d).getAndSet(var1);
      this.m.attr(e).set(var1.a(this.j));
      this.m.attr(f).set(var1.b(this.j));
      this.m.config().setAutoRead(true);
      i.debug("Enabled auto read");
   }

   public void channelInactive(ChannelHandlerContext var1) {
      this.a((fj)(new fr("disconnect.endOfStream", new Object[0])));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      fr var3;
      if(var2 instanceof TimeoutException) {
         var3 = new fr("disconnect.timeout", new Object[0]);
      } else {
         var3 = new fr("disconnect.genericReason", new Object[]{"Internal Exception: " + var2});
      }

      this.a((fj)var3);
   }

   protected void a(ChannelHandlerContext var1, ft var2) {
      if(this.m.isOpen()) {
         if(var2.a()) {
            var2.a(this.o);
         } else {
            this.k.add(var2);
         }
      }

   }

   public void a(fb var1) {
      Validate.notNull(var1, "packetListener", new Object[0]);
      i.debug("Set listener of {} to {}", new Object[]{this, var1});
      this.o = var1;
   }

   public void a(ft var1, GenericFutureListener ... var2) {
      if(this.m != null && this.m.isOpen()) {
         this.i();
         this.b(var1, var2);
      } else {
         this.l.add(new en(var1, var2));
      }

   }

   private void b(ft var1, GenericFutureListener[] var2) {
      eo var3 = eo.a(var1);
      eo var4 = (eo)this.m.attr(d).get();
      if(var4 != var3) {
         i.debug("Disabled auto read");
         this.m.config().setAutoRead(false);
      }

      if(this.m.eventLoop().inEventLoop()) {
         if(var3 != var4) {
            this.a(var3);
         }

         this.m.writeAndFlush(var1).addListeners(var2).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      } else {
         this.m.eventLoop().execute(new ek(this, var3, var4, var1, var2));
      }

   }

   private void i() {
      if(this.m != null && this.m.isOpen()) {
         while(!this.l.isEmpty()) {
            en var1 = (en)this.l.poll();
            this.b(en.a(var1), en.b(var1));
         }

      }
   }

   public void a() {
      this.i();
      eo var1 = (eo)this.m.attr(d).get();
      if(this.p != var1) {
         if(this.p != null) {
            this.o.a(this.p, var1);
         }

         this.p = var1;
      }

      if(this.o != null) {
         for(int var2 = 1000; !this.k.isEmpty() && var2 >= 0; --var2) {
            ft var3 = (ft)this.k.poll();
            var3.a(this.o);
         }

         this.o.a();
      }

      this.m.flush();
   }

   public SocketAddress b() {
      return this.n;
   }

   public void a(fj var1) {
      if(this.m.isOpen()) {
         this.m.close();
         this.q = var1;
      }

   }

   public boolean c() {
      return this.m instanceof LocalChannel || this.m instanceof LocalServerChannel;
   }

   public void a(SecretKey var1) {
      this.m.pipeline().addBefore("splitter", "decrypt", new eh(pt.a(2, var1)));
      this.m.pipeline().addBefore("prepender", "encrypt", new ei(pt.a(1, var1)));
      this.r = true;
   }

   public boolean d() {
      return this.m != null && this.m.isOpen();
   }

   public fb e() {
      return this.o;
   }

   public fj f() {
      return this.q;
   }

   public void g() {
      this.m.config().setAutoRead(false);
   }

   // $FF: synthetic method
   protected void channelRead0(ChannelHandlerContext var1, Object var2) {
      this.a(var1, (ft)var2);
   }

   // $FF: synthetic method
   static Channel a(ej var0) {
      return var0.m;
   }

}
