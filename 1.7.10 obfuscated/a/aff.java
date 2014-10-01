import java.util.Comparator;

class aff implements Comparator {

   // $FF: synthetic field
   final afe a;


   aff(afe var1) {
      this.a = var1;
   }

   public int a(afg var1, afg var2) {
      return var1 instanceof afi && var2 instanceof afh?1:(var2 instanceof afi && var1 instanceof afh?-1:(var2.a() < var1.a()?-1:(var2.a() > var1.a()?1:0)));
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((afg)var1, (afg)var2);
   }
}
