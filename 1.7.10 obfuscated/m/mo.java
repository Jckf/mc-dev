import java.util.concurrent.Callable;

class mo implements Callable {

   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final mn b;


   mo(mn var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public String a() {
      String var1 = "Once per " + this.a + " ticks";
      if(this.a == Integer.MAX_VALUE) {
         var1 = "Maximum (" + var1 + ")";
      }

      return var1;
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
