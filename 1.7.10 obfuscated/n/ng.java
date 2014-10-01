import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

class ng implements GenericFutureListener {

   // $FF: synthetic field
   final ej a;
   // $FF: synthetic field
   final fq b;
   // $FF: synthetic field
   final nc c;


   ng(nc var1, ej var2, fq var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void operationComplete(Future var1) {
      this.a.a((fj)this.b);
   }
}
