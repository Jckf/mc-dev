import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public abstract class fe implements fj {

   protected List a = Lists.newArrayList();
   private fn b;


   public fj a(fj var1) {
      var1.b().a(this.b());
      this.a.add(var1);
      return this;
   }

   public List a() {
      return this.a;
   }

   public fj a(String var1) {
      return this.a((fj)(new fq(var1)));
   }

   public fj a(fn var1) {
      this.b = var1;
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         fj var3 = (fj)var2.next();
         var3.b().a(this.b());
      }

      return this;
   }

   public fn b() {
      if(this.b == null) {
         this.b = new fn();
         Iterator var1 = this.a.iterator();

         while(var1.hasNext()) {
            fj var2 = (fj)var1.next();
            var2.b().a(this.b);
         }
      }

      return this.b;
   }

   public Iterator iterator() {
      return Iterators.concat(Iterators.forArray(new fe[]{this}), a((Iterable)this.a));
   }

   public final String c() {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.iterator();

      while(var2.hasNext()) {
         fj var3 = (fj)var2.next();
         var1.append(var3.e());
      }

      return var1.toString();
   }

   public static Iterator a(Iterable var0) {
      Iterator var1 = Iterators.concat(Iterators.transform(var0.iterator(), new ff()));
      var1 = Iterators.transform(var1, new fg());
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof fe)) {
         return false;
      } else {
         fe var2 = (fe)var1;
         return this.a.equals(var2.a) && this.b().equals(var2.b());
      }
   }

   public int hashCode() {
      return 31 * this.b.hashCode() + this.a.hashCode();
   }

   public String toString() {
      return "BaseComponent{style=" + this.b + ", siblings=" + this.a + '}';
   }
}
