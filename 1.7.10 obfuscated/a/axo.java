import java.util.concurrent.Callable;

final class axo implements Callable {

   // $FF: synthetic field
   final int a;


   axo(int var1) {
      this.a = var1;
   }

   public String a() {
      return String.valueOf(ahu.d(this.a));
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
