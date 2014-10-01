
public class fn {

   private fn a;
   private a b;
   private Boolean c;
   private Boolean d;
   private Boolean e;
   private Boolean f;
   private Boolean g;
   private fh h;
   private fl i;
   private static final fn j = new fo();


   public a a() {
      return this.b == null?this.n().a():this.b;
   }

   public boolean b() {
      return this.c == null?this.n().b():this.c.booleanValue();
   }

   public boolean c() {
      return this.d == null?this.n().c():this.d.booleanValue();
   }

   public boolean d() {
      return this.f == null?this.n().d():this.f.booleanValue();
   }

   public boolean e() {
      return this.e == null?this.n().e():this.e.booleanValue();
   }

   public boolean f() {
      return this.g == null?this.n().f():this.g.booleanValue();
   }

   public boolean g() {
      return this.c == null && this.d == null && this.f == null && this.e == null && this.g == null && this.b == null && this.h == null && this.i == null;
   }

   public fh h() {
      return this.h == null?this.n().h():this.h;
   }

   public fl i() {
      return this.i == null?this.n().i():this.i;
   }

   public fn a(a var1) {
      this.b = var1;
      return this;
   }

   public fn a(Boolean var1) {
      this.c = var1;
      return this;
   }

   public fn b(Boolean var1) {
      this.d = var1;
      return this;
   }

   public fn c(Boolean var1) {
      this.f = var1;
      return this;
   }

   public fn d(Boolean var1) {
      this.e = var1;
      return this;
   }

   public fn e(Boolean var1) {
      this.g = var1;
      return this;
   }

   public fn a(fh var1) {
      this.h = var1;
      return this;
   }

   public fn a(fl var1) {
      this.i = var1;
      return this;
   }

   public fn a(fn var1) {
      this.a = var1;
      return this;
   }

   private fn n() {
      return this.a == null?j:this.a;
   }

   public String toString() {
      return "Style{hasParent=" + (this.a != null) + ", color=" + this.b + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + this.h() + ", hoverEvent=" + this.i() + '}';
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof fn)) {
         return false;
      } else {
         fn var2 = (fn)var1;
         boolean var10000;
         if(this.b() == var2.b() && this.a() == var2.a() && this.c() == var2.c() && this.f() == var2.f() && this.d() == var2.d() && this.e() == var2.e()) {
            label56: {
               if(this.h() != null) {
                  if(!this.h().equals(var2.h())) {
                     break label56;
                  }
               } else if(var2.h() != null) {
                  break label56;
               }

               if(this.i() != null) {
                  if(!this.i().equals(var2.i())) {
                     break label56;
                  }
               } else if(var2.i() != null) {
                  break label56;
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      }
   }

   public int hashCode() {
      int var1 = this.b.hashCode();
      var1 = 31 * var1 + this.c.hashCode();
      var1 = 31 * var1 + this.d.hashCode();
      var1 = 31 * var1 + this.e.hashCode();
      var1 = 31 * var1 + this.f.hashCode();
      var1 = 31 * var1 + this.g.hashCode();
      var1 = 31 * var1 + this.h.hashCode();
      var1 = 31 * var1 + this.i.hashCode();
      return var1;
   }

   public fn l() {
      fn var1 = new fn();
      var1.c = this.c;
      var1.d = this.d;
      var1.f = this.f;
      var1.e = this.e;
      var1.g = this.g;
      var1.b = this.b;
      var1.h = this.h;
      var1.i = this.i;
      var1.a = this.a;
      return var1;
   }

   public fn m() {
      fn var1 = new fn();
      var1.a(Boolean.valueOf(this.b()));
      var1.b(Boolean.valueOf(this.c()));
      var1.c(Boolean.valueOf(this.d()));
      var1.d(Boolean.valueOf(this.e()));
      var1.e(Boolean.valueOf(this.f()));
      var1.a(this.a());
      var1.a(this.h());
      var1.a(this.i());
      return var1;
   }

   // $FF: synthetic method
   static Boolean a(fn var0, Boolean var1) {
      return var0.c = var1;
   }

   // $FF: synthetic method
   static Boolean b(fn var0, Boolean var1) {
      return var0.d = var1;
   }

   // $FF: synthetic method
   static Boolean c(fn var0, Boolean var1) {
      return var0.e = var1;
   }

   // $FF: synthetic method
   static Boolean d(fn var0, Boolean var1) {
      return var0.f = var1;
   }

   // $FF: synthetic method
   static Boolean e(fn var0, Boolean var1) {
      return var0.g = var1;
   }

   // $FF: synthetic method
   static a a(fn var0, a var1) {
      return var0.b = var1;
   }

   // $FF: synthetic method
   static fh a(fn var0, fh var1) {
      return var0.h = var1;
   }

   // $FF: synthetic method
   static fl a(fn var0, fl var1) {
      return var0.i = var1;
   }

   // $FF: synthetic method
   static Boolean b(fn var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static Boolean c(fn var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static Boolean d(fn var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static Boolean e(fn var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static Boolean f(fn var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static a g(fn var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static fh h(fn var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static fl i(fn var0) {
      return var0.i;
   }

}
