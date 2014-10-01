import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class ni implements GenericFutureListener {

   // $FF: synthetic field
   final fq a;
   // $FF: synthetic field
   final nh b;


   ni(nh var1, fq var2) {
      this.b = var1;
      this.a = var2;
   }

   public void operationComplete(Future var1) {
      this.b.a.a((fj)this.a);
   }
}
