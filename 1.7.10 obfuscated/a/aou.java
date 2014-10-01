import java.util.concurrent.Callable;

class aou implements Callable {

   // $FF: synthetic field
   final aor a;


   aou(aor var1) {
      this.a = var1;
   }

   public String a() {
      int var1 = this.a.b.e(this.a.c, this.a.d, this.a.e);
      if(var1 < 0) {
         return "Unknown? (Got " + var1 + ")";
      } else {
         String var2 = String.format("%4s", new Object[]{Integer.toBinaryString(var1)}).replace(" ", "0");
         return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[]{Integer.valueOf(var1), var2});
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
