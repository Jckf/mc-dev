import java.util.concurrent.Callable;

class yy implements Callable {

   // $FF: synthetic field
   final add a;
   // $FF: synthetic field
   final yx b;


   yy(yx var1, add var2) {
      this.b = var1;
      this.a = var2;
   }

   public String a() {
      return this.a.s();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
