import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

final class al implements Comparator {

   // $FF: synthetic field
   final dt a;


   al(dt var1) {
      this.a = var1;
   }

   public int a(wv var1, wv var2) {
      return ComparisonChain.start().compare(var1.b(this.a), var2.b(this.a)).result();
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((wv)var1, (wv)var2);
   }
}
