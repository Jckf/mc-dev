import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ate extends avm {

   public ate() {}

   public ate(ahb var1, Random var2, int var3, int var4) {
      super(var3, var4);
      atw var5 = new atw(var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.a.add(var5);
      var5.a(var5, this.a, var2);
      ArrayList var6 = var5.e;

      while(!var6.isEmpty()) {
         int var7 = var2.nextInt(var6.size());
         avk var8 = (avk)var6.remove(var7);
         var8.a((avk)var5, (List)this.a, var2);
      }

      this.c();
      this.a(var1, var2, 48, 70);
   }
}
