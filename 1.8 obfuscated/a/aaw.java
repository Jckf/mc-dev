import org.apache.commons.lang3.StringUtils;

public abstract class aaw extends zb {

   protected final xu e;
   protected boolean f;
   private boolean a;
   private int b;
   private int c;
   private int d;


   public aaw(xu var1, boolean var2) {
      this(var1, var2, false);
   }

   public aaw(xu var1, boolean var2, boolean var3) {
      this.e = var1;
      this.f = var2;
      this.a = var3;
   }

   public boolean b() {
      xm var1 = this.e.u();
      if(var1 == null) {
         return false;
      } else if(!var1.ai()) {
         return false;
      } else {
         bsf var2 = this.e.bN();
         bsf var3 = var1.bN();
         if(var2 != null && var3 == var2) {
            return false;
         } else {
            double var4 = this.f();
            if(this.e.h(var1) > var4 * var4) {
               return false;
            } else {
               if(this.f) {
                  if(this.e.t().a(var1)) {
                     this.d = 0;
                  } else if(++this.d > 60) {
                     return false;
                  }
               }

               return !(var1 instanceof ahd) || !((ahd)var1).by.a;
            }
         }
      }
   }

   protected double f() {
      xz var1 = this.e.a(afs.b);
      return var1 == null?16.0D:var1.e();
   }

   public void c() {
      this.b = 0;
      this.c = 0;
      this.d = 0;
   }

   public void d() {
      this.e.d((xm)null);
   }

   public static boolean a(xn var0, xm var1, boolean var2, boolean var3) {
      if(var1 == null) {
         return false;
      } else if(var1 == var0) {
         return false;
      } else if(!var1.ai()) {
         return false;
      } else if(!var0.a(var1.getClass())) {
         return false;
      } else {
         bsf var4 = var0.bN();
         bsf var5 = var1.bN();
         if(var4 != null && var5 == var4) {
            return false;
         } else {
            if(var0 instanceof xt && StringUtils.isNotEmpty(((xt)var0).b())) {
               if(var1 instanceof xt && ((xt)var0).b().equals(((xt)var1).b())) {
                  return false;
               }

               if(var1 == ((xt)var0).l_()) {
                  return false;
               }
            } else if(var1 instanceof ahd && !var2 && ((ahd)var1).by.a) {
               return false;
            }

            return !var3 || var0.t().a(var1);
         }
      }
   }

   protected boolean a(xm var1, boolean var2) {
      if(!a(this.e, var1, var2, this.f)) {
         return false;
      } else if(!this.e.d(new dt(var1))) {
         return false;
      } else {
         if(this.a) {
            if(--this.c <= 0) {
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

   private boolean a(xm var1) {
      this.c = 10 + this.e.bb().nextInt(5);
      bpv var2 = this.e.s().a((wv)var1);
      if(var2 == null) {
         return false;
      } else {
         bpt var3 = var2.c();
         if(var3 == null) {
            return false;
         } else {
            int var4 = var3.a - uv.c(var1.s);
            int var5 = var3.c - uv.c(var1.u);
            return (double)(var4 * var4 + var5 * var5) <= 2.25D;
         }
      }
   }
}
