import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class atw extends atg {

   public att b;
   public List c;
   public List d;
   public ArrayList e = new ArrayList();


   public atw() {}

   public atw(Random var1, int var2, int var3) {
      super(var1, var2, var3);
      this.c = new ArrayList();
      att[] var4 = atf.b();
      int var5 = var4.length;

      int var6;
      att var7;
      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.c = 0;
         this.c.add(var7);
      }

      this.d = new ArrayList();
      var4 = atf.c();
      var5 = var4.length;

      for(var6 = 0; var6 < var5; ++var6) {
         var7 = var4[var6];
         var7.c = 0;
         this.d.add(var7);
      }

   }

   protected void b(dh var1) {
      super.b(var1);
   }

   protected void a(dh var1) {
      super.a(var1);
   }
}
