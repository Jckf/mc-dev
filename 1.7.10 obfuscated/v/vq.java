import java.util.Comparator;

public class vq implements Comparator {

   private final sa a;


   public vq(sa var1) {
      this.a = var1;
   }

   public int a(sa var1, sa var2) {
      double var3 = this.a.f(var1);
      double var5 = this.a.f(var2);
      return var3 < var5?-1:(var3 > var5?1:0);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((sa)var1, (sa)var2);
   }
}
