import java.util.concurrent.Callable;

class ahd implements Callable {

   // $FF: synthetic field
   final aji a;
   // $FF: synthetic field
   final ahb b;


   ahd(ahb var1, aji var2) {
      this.b = var1;
      this.a = var2;
   }

   public String a() {
      try {
         return String.format("ID #%d (%s // %s)", new Object[]{Integer.valueOf(aji.b(this.a)), this.a.a(), this.a.getClass().getCanonicalName()});
      } catch (Throwable var2) {
         return "ID #" + aji.b(this.a);
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
