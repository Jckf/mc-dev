
public class aas implements rb {

   private final agm a;
   private add[] b = new add[3];
   private final yz c;
   private agn d;
   private int e;


   public aas(yz var1, agm var2) {
      this.c = var1;
      this.a = var2;
   }

   public int a() {
      return this.b.length;
   }

   public add a(int var1) {
      return this.b[var1];
   }

   public add a(int var1, int var2) {
      if(this.b[var1] != null) {
         add var3;
         if(var1 == 2) {
            var3 = this.b[var1];
            this.b[var1] = null;
            return var3;
         } else if(this.b[var1].b <= var2) {
            var3 = this.b[var1];
            this.b[var1] = null;
            if(this.d(var1)) {
               this.h();
            }

            return var3;
         } else {
            var3 = this.b[var1].a(var2);
            if(this.b[var1].b == 0) {
               this.b[var1] = null;
            }

            if(this.d(var1)) {
               this.h();
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   private boolean d(int var1) {
      return var1 == 0 || var1 == 1;
   }

   public add a_(int var1) {
      if(this.b[var1] != null) {
         add var2 = this.b[var1];
         this.b[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void a(int var1, add var2) {
      this.b[var1] = var2;
      if(var2 != null && var2.b > this.d()) {
         var2.b = this.d();
      }

      if(this.d(var1)) {
         this.h();
      }

   }

   public String b() {
      return "mob.villager";
   }

   public boolean k_() {
      return false;
   }

   public int d() {
      return 64;
   }

   public boolean a(yz var1) {
      return this.a.b() == var1;
   }

   public void f() {}

   public void l_() {}

   public boolean b(int var1, add var2) {
      return true;
   }

   public void e() {
      this.h();
   }

   public void h() {
      this.d = null;
      add var1 = this.b[0];
      add var2 = this.b[1];
      if(var1 == null) {
         var1 = var2;
         var2 = null;
      }

      if(var1 == null) {
         this.a(2, (add)null);
      } else {
         ago var3 = this.a.b(this.c);
         if(var3 != null) {
            agn var4 = var3.a(var1, var2, this.e);
            if(var4 != null && !var4.g()) {
               this.d = var4;
               this.a(2, var4.d().m());
            } else if(var2 != null) {
               var4 = var3.a(var2, var1, this.e);
               if(var4 != null && !var4.g()) {
                  this.d = var4;
                  this.a(2, var4.d().m());
               } else {
                  this.a(2, (add)null);
               }
            } else {
               this.a(2, (add)null);
            }
         }
      }

      this.a.a_(this.a(2));
   }

   public agn i() {
      return this.d;
   }

   public void c(int var1) {
      this.e = var1;
      this.h();
   }
}
