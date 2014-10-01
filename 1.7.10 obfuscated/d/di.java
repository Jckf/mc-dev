import java.util.concurrent.Callable;

class di implements Callable {

   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final dh b;


   di(dh var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public String a() {
      return dy.a[((dy)dh.a(this.b).get(this.a)).a()];
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
