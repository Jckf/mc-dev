import java.util.concurrent.Callable;

class dj implements Callable {

   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final dh b;


   dj(dh var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public String a() {
      return dy.a[this.a];
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
