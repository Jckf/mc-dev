import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fr extends fe {

   private final String d;
   private final Object[] e;
   private final Object f = new Object();
   private long g = -1L;
   List b = Lists.newArrayList();
   public static final Pattern c = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");


   public fr(String var1, Object ... var2) {
      this.d = var1;
      this.e = var2;
      Object[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Object var6 = var3[var5];
         if(var6 instanceof fj) {
            ((fj)var6).b().a(this.b());
         }
      }

   }

   synchronized void g() {
      Object var1 = this.f;
      synchronized(this.f) {
         long var2 = dd.a();
         if(var2 == this.g) {
            return;
         }

         this.g = var2;
         this.b.clear();
      }

      try {
         this.b(dd.a(this.d));
      } catch (fs var6) {
         this.b.clear();

         try {
            this.b(dd.b(this.d));
         } catch (fs var5) {
            throw var6;
         }
      }

   }

   protected void b(String var1) {
      boolean var2 = false;
      Matcher var3 = c.matcher(var1);
      int var4 = 0;
      int var5 = 0;

      try {
         int var7;
         for(; var3.find(var5); var5 = var7) {
            int var6 = var3.start();
            var7 = var3.end();
            if(var6 > var5) {
               fq var8 = new fq(String.format(var1.substring(var5, var6), new Object[0]));
               var8.b().a(this.b());
               this.b.add(var8);
            }

            String var14 = var3.group(2);
            String var9 = var1.substring(var6, var7);
            if("%".equals(var14) && "%%".equals(var9)) {
               fq var15 = new fq("%");
               var15.b().a(this.b());
               this.b.add(var15);
            } else {
               if(!"s".equals(var14)) {
                  throw new fs(this, "Unsupported format: \'" + var9 + "\'");
               }

               String var10 = var3.group(1);
               int var11 = var10 != null?Integer.parseInt(var10) - 1:var4++;
               this.b.add(this.a(var11));
            }
         }

         if(var5 < var1.length()) {
            fq var13 = new fq(String.format(var1.substring(var5), new Object[0]));
            var13.b().a(this.b());
            this.b.add(var13);
         }

      } catch (IllegalFormatException var12) {
         throw new fs(this, var12);
      }
   }

   private fj a(int var1) {
      if(var1 >= this.e.length) {
         throw new fs(this, var1);
      } else {
         Object var2 = this.e[var1];
         Object var3;
         if(var2 instanceof fj) {
            var3 = (fj)var2;
         } else {
            var3 = new fq(var2 == null?"null":var2.toString());
            ((fj)var3).b().a(this.b());
         }

         return (fj)var3;
      }
   }

   public fj a(fn var1) {
      super.a(var1);
      Object[] var2 = this.e;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Object var5 = var2[var4];
         if(var5 instanceof fj) {
            ((fj)var5).b().a(this.b());
         }
      }

      if(this.g > -1L) {
         Iterator var6 = this.b.iterator();

         while(var6.hasNext()) {
            fj var7 = (fj)var6.next();
            var7.b().a(var1);
         }
      }

      return this;
   }

   public Iterator iterator() {
      this.g();
      return Iterators.concat(a(this.b), a(this.a));
   }

   public String e() {
      this.g();
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         fj var3 = (fj)var2.next();
         var1.append(var3.e());
      }

      return var1.toString();
   }

   public fr h() {
      Object[] var1 = new Object[this.e.length];

      for(int var2 = 0; var2 < this.e.length; ++var2) {
         if(this.e[var2] instanceof fj) {
            var1[var2] = ((fj)this.e[var2]).f();
         } else {
            var1[var2] = this.e[var2];
         }
      }

      fr var5 = new fr(this.d, var1);
      var5.a(this.b().l());
      Iterator var3 = this.a().iterator();

      while(var3.hasNext()) {
         fj var4 = (fj)var3.next();
         var5.a(var4.f());
      }

      return var5;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof fr)) {
         return false;
      } else {
         fr var2 = (fr)var1;
         return Arrays.equals(this.e, var2.e) && this.d.equals(var2.d) && super.equals(var1);
      }
   }

   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.d.hashCode();
      var1 = 31 * var1 + Arrays.hashCode(this.e);
      return var1;
   }

   public String toString() {
      return "TranslatableComponent{key=\'" + this.d + '\'' + ", args=" + Arrays.toString(this.e) + ", siblings=" + this.a + ", style=" + this.b() + '}';
   }

   public String i() {
      return this.d;
   }

   public Object[] j() {
      return this.e;
   }

   // $FF: synthetic method
   public fj f() {
      return this.h();
   }

}
