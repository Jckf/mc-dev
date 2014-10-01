import java.util.List;
import java.util.Random;

public class atc extends avm {

   public atc() {}

   public atc(ahb var1, Random var2, int var3, int var4) {
      super(var3, var4);
      ata var5 = new ata(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
      this.a.add(var5);
      var5.a((avk)var5, (List)this.a, var2);
      this.c();
      this.a(var1, var2, 10);
   }
}
