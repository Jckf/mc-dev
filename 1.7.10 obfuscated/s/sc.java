import java.util.concurrent.Callable;

class sc implements Callable {

   // $FF: synthetic field
   final sa a;


   sc(sa var1) {
      this.a = var1;
   }

   public String a() {
      return this.a.b_();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
