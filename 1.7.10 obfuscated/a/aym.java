import java.io.File;

public class aym extends ayq {

   public aym(File var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public aqc a(aqo var1) {
      File var2 = this.b();
      File var3;
      if(var1 instanceof aqp) {
         var3 = new File(var2, "DIM-1");
         var3.mkdirs();
         return new aqk(var3);
      } else if(var1 instanceof aqr) {
         var3 = new File(var2, "DIM1");
         var3.mkdirs();
         return new aqk(var3);
      } else {
         return new aqk(var2);
      }
   }

   public void a(ays var1, dh var2) {
      var1.e(19133);
      super.a(var1, var2);
   }

   public void a() {
      try {
         azr.a.a();
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      aqj.a();
   }
}
