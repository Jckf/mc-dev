
public class rw {

   private int a;
   private int b;
   private int c;
   private boolean d;
   private boolean e;


   public rw(int var1, int var2) {
      this(var1, var2, 0);
   }

   public rw(int var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   public rw(int var1, int var2, int var3, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
   }

   public rw(rw var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
   }

   public void a(rw var1) {
      if(this.a != var1.a) {
         System.err.println("This method should only be called for matching effects!");
      }

      if(var1.c > this.c) {
         this.c = var1.c;
         this.b = var1.b;
      } else if(var1.c == this.c && this.b < var1.b) {
         this.b = var1.b;
      } else if(!var1.e && this.e) {
         this.e = var1.e;
      }

   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public void a(boolean var1) {
      this.d = var1;
   }

   public boolean e() {
      return this.e;
   }

   public boolean a(sv var1) {
      if(this.b > 0) {
         if(rv.a[this.a].a(this.b, this.c)) {
            this.b(var1);
         }

         this.h();
      }

      return this.b > 0;
   }

   private int h() {
      return --this.b;
   }

   public void b(sv var1) {
      if(this.b > 0) {
         rv.a[this.a].a(var1, this.c);
      }

   }

   public String f() {
      return rv.a[this.a].a();
   }

   public int hashCode() {
      return this.a;
   }

   public String toString() {
      String var1 = "";
      if(this.c() > 0) {
         var1 = this.f() + " x " + (this.c() + 1) + ", Duration: " + this.b();
      } else {
         var1 = this.f() + ", Duration: " + this.b();
      }

      if(this.d) {
         var1 = var1 + ", Splash: true";
      }

      return rv.a[this.a].i()?"(" + var1 + ")":var1;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof rw)) {
         return false;
      } else {
         rw var2 = (rw)var1;
         return this.a == var2.a && this.c == var2.c && this.b == var2.b && this.d == var2.d && this.e == var2.e;
      }
   }

   public dh a(dh var1) {
      var1.a("Id", (byte)this.a());
      var1.a("Amplifier", (byte)this.c());
      var1.a("Duration", this.b());
      var1.a("Ambient", this.e());
      return var1;
   }

   public static rw b(dh var0) {
      byte var1 = var0.d("Id");
      if(var1 >= 0 && var1 < rv.a.length && rv.a[var1] != null) {
         byte var2 = var0.d("Amplifier");
         int var3 = var0.f("Duration");
         boolean var4 = var0.n("Ambient");
         return new rw(var1, var3, var2, var4);
      } else {
         return null;
      }
   }
}
