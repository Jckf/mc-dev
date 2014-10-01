import java.util.concurrent.Callable;

class aot implements Callable {

   // $FF: synthetic field
   final aor a;


   aot(aor var1) {
      this.a = var1;
   }

   public String a() {
      int var1 = aji.b(this.a.b.a(this.a.c, this.a.d, this.a.e));

      try {
         return String.format("ID #%d (%s // %s)", new Object[]{Integer.valueOf(var1), aji.e(var1).a(), aji.e(var1).getClass().getCanonicalName()});
      } catch (Throwable var3) {
         return "ID #" + var1;
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
