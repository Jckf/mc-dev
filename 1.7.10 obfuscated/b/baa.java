import java.util.Comparator;

final class baa implements Comparator {

   public int a(azz var1, azz var2) {
      return var1.c() > var2.c()?1:(var1.c() < var2.c()?-1:0);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((azz)var1, (azz)var2);
   }
}
