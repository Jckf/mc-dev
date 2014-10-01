import org.apache.commons.lang3.StringUtils;

public abstract class vu extends ui {

   protected td c;
   protected boolean d;
   private boolean a;
   private int b;
   private int e;
   private int f;


   public vu(td var1, boolean var2) {
      this(var1, var2, false);
   }

   public vu(td var1, boolean var2, boolean var3) {
      this.c = var1;
      this.d = var2;
      this.a = var3;
   }

   public boolean b() {
      sv var1 = this.c.o();
      if(var1 == null) {
         return false;
      } else if(!var1.Z()) {
         return false;
      } else {
         double var2 = this.f();
         if(this.c.f(var1) > var2 * var2) {
            return false;
         } else {
            if(this.d) {
               if(this.c.n().a(var1)) {
                  this.f = 0;
               } else if(++this.f > 60) {
                  return false;
               }
            }

            return !(var1 instanceof mw) || !((mw)var1).c.d();
         }
      }
   }

   protected double f() {
      ti var1 = this.c.a(yj.b);
      return var1 == null?16.0D:var1.e();
   }

   public void c() {
      this.b = 0;
      this.e = 0;
      this.f = 0;
   }

   public void d() {
      this.c.d((sv)null);
   }

   protected boolean a(sv var1, boolean var2) {
      if(var1 == null) {
         return false;
      } else if(var1 == this.c) {
         return false;
      } else if(!var1.Z()) {
         return false;
      } else if(!this.c.a(var1.getClass())) {
         return false;
      } else {
         if(this.c instanceof ta && StringUtils.isNotEmpty(((ta)this.c).b())) {
            if(var1 instanceof ta && ((ta)this.c).b().equals(((ta)var1).b())) {
               return false;
            }

            if(var1 == ((ta)this.c).i_()) {
               return false;
            }
         } else if(var1 instanceof yz && !var2 && ((yz)var1).bE.a) {
            return false;
         }

         if(!this.c.b(qh.c(var1.s), qh.c(var1.t), qh.c(var1.u))) {
            return false;
         } else if(this.d && !this.c.n().a(var1)) {
            return false;
         } else {
            if(this.a) {
               if(--this.e <= 0) {
                  this.b = 0;
               }

               if(this.b == 0) {
                  this.b = this.a(var1)?1:2;
               }

               if(this.b == 2) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private boolean a(sv var1) {
      this.e = 10 + this.c.aI().nextInt(5);
      ayf var2 = this.c.m().a(var1);
      if(var2 == null) {
         return false;
      } else {
         aye var3 = var2.c();
         if(var3 == null) {
            return false;
         } else {
            int var4 = var3.a - qh.c(var1.s);
            int var5 = var3.c - qh.c(var1.u);
            return (double)(var4 * var4 + var5 * var5) <= 2.25D;
         }
      }
   }
}
