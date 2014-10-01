import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;

class ek implements Runnable {

   // $FF: synthetic field
   final eo a;
   // $FF: synthetic field
   final eo b;
   // $FF: synthetic field
   final ft c;
   // $FF: synthetic field
   final GenericFutureListener[] d;
   // $FF: synthetic field
   final ej e;


   ek(ej var1, eo var2, eo var3, ft var4, GenericFutureListener[] var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public void run() {
      if(this.a != this.b) {
         this.e.a(this.a);
      }

      ej.a(this.e).writeAndFlush(this.c).addListeners(this.d).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
   }
}
