import java.util.concurrent.Callable;

final class n implements Callable {

   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final int c;


   n(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public String a() {
      return k.a(this.a, this.b, this.c);
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
