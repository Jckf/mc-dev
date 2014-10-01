import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nc {

   private static final Logger b = LogManager.getLogger();
   private static final NioEventLoopGroup c = new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty IO #%d").setDaemon(true).build());
   private final MinecraftServer d;
   public volatile boolean a;
   private final List e = Collections.synchronizedList(new ArrayList());
   private final List f = Collections.synchronizedList(new ArrayList());


   public nc(MinecraftServer var1) {
      this.d = var1;
      this.a = true;
   }

   public void a(InetAddress var1, int var2) {
      List var3 = this.e;
      synchronized(this.e) {
         this.e.add(((ServerBootstrap)((ServerBootstrap)(new ServerBootstrap()).channel(NioServerSocketChannel.class)).childHandler(new nd(this)).group(c).localAddress(var1, var2)).bind().syncUninterruptibly());
      }
   }

   public void b() {
      this.a = false;
      Iterator var1 = this.e.iterator();

      while(var1.hasNext()) {
         ChannelFuture var2 = (ChannelFuture)var1.next();
         var2.channel().close().syncUninterruptibly();
      }

   }

   public void c() {
      List var1 = this.f;
      synchronized(this.f) {
         Iterator var2 = this.f.iterator();

         while(var2.hasNext()) {
            ej var3 = (ej)var2.next();
            if(!var3.d()) {
               var2.remove();
               if(var3.f() != null) {
                  var3.e().a(var3.f());
               } else if(var3.e() != null) {
                  var3.e().a(new fq("Disconnected"));
               }
            } else {
               try {
                  var3.a();
               } catch (Exception var8) {
                  if(var3.c()) {
                     b var10 = b.a(var8, "Ticking memory connection");
                     k var6 = var10.a("Ticking connection");
                     var6.a("Connection", (Callable)(new nf(this, var3)));
                     throw new s(var10);
                  }

                  b.warn("Failed to handle packet for " + var3.b(), (Throwable)var8);
                  fq var5 = new fq("Internal server error");
                  var3.a((ft)(new gs(var5)), new GenericFutureListener[]{new ng(this, var3, var5)});
                  var3.g();
               }
            }
         }

      }
   }

   public MinecraftServer d() {
      return this.d;
   }

   // $FF: synthetic method
   static List a(nc var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static MinecraftServer b(nc var0) {
      return var0.d;
   }

}
