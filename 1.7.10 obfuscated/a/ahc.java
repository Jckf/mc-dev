import java.util.concurrent.Callable;

class ahc implements Callable {

   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final ahb c;


   ahc(ahb var1, int var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public String a() {
      return k.a(this.a, 0, this.b);
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
