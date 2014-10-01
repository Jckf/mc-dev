import java.util.concurrent.Callable;

class avf implements Callable {

   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final ave c;


   avf(ave var1, int var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public String a() {
      return this.c.a(this.a, this.b)?"True":"False";
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
