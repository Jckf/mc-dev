import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ph {

   public final String e;
   private final fj a;
   public boolean f;
   private final pm b;
   private final bah c;
   private Class d;
   private static NumberFormat k = NumberFormat.getIntegerInstance(Locale.US);
   public static pm g = new pi();
   private static DecimalFormat l = new DecimalFormat("########0.00");
   public static pm h = new pj();
   public static pm i = new pk();
   public static pm j = new pl();


   public ph(String var1, fj var2, pm var3) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = new bai(this);
      bah.a.put(this.c.a(), this.c);
   }

   public ph(String var1, fj var2) {
      this(var1, var2, g);
   }

   public ph i() {
      this.f = true;
      return this;
   }

   public ph h() {
      if(pp.a.containsKey(this.e)) {
         throw new RuntimeException("Duplicate stat id: \"" + ((ph)pp.a.get(this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
      } else {
         pp.b.add(this);
         pp.a.put(this.e, this);
         return this;
      }
   }

   public boolean d() {
      return false;
   }

   public fj e() {
      fj var1 = this.a.f();
      var1.b().a(a.h);
      var1.b().a(new fl(fm.b, new fq(this.e)));
      return var1;
   }

   public fj j() {
      fj var1 = this.e();
      fj var2 = (new fq("[")).a(var1).a("]");
      var2.a(var1.b());
      return var2;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         ph var2 = (ph)var1;
         return this.e.equals(var2.e);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.e.hashCode();
   }

   public String toString() {
      return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
   }

   public bah k() {
      return this.c;
   }

   public Class l() {
      return this.d;
   }

   public ph b(Class var1) {
      this.d = var1;
      return this;
   }

}
