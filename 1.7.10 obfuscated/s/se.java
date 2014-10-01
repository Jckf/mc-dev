
public enum se {

   a("SIZE_1", 0),
   b("SIZE_2", 1),
   c("SIZE_3", 2),
   d("SIZE_4", 3),
   e("SIZE_5", 4),
   f("SIZE_6", 5);
   // $FF: synthetic field
   private static final se[] g = new se[]{a, b, c, d, e, f};


   private se(String var1, int var2) {}

   public int a(double var1) {
      double var3 = var1 - ((double)qh.c(var1) + 0.5D);
      switch(sd.a[this.ordinal()]) {
      case 1:
         if(var3 < 0.0D) {
            if(var3 < -0.3125D) {
               return qh.f(var1 * 32.0D);
            }
         } else if(var3 < 0.3125D) {
            return qh.f(var1 * 32.0D);
         }

         return qh.c(var1 * 32.0D);
      case 2:
         if(var3 < 0.0D) {
            if(var3 < -0.3125D) {
               return qh.c(var1 * 32.0D);
            }
         } else if(var3 < 0.3125D) {
            return qh.c(var1 * 32.0D);
         }

         return qh.f(var1 * 32.0D);
      case 3:
         if(var3 > 0.0D) {
            return qh.c(var1 * 32.0D);
         }

         return qh.f(var1 * 32.0D);
      case 4:
         if(var3 < 0.0D) {
            if(var3 < -0.1875D) {
               return qh.f(var1 * 32.0D);
            }
         } else if(var3 < 0.1875D) {
            return qh.f(var1 * 32.0D);
         }

         return qh.c(var1 * 32.0D);
      case 5:
         if(var3 < 0.0D) {
            if(var3 < -0.1875D) {
               return qh.c(var1 * 32.0D);
            }
         } else if(var3 < 0.1875D) {
            return qh.c(var1 * 32.0D);
         }

         return qh.f(var1 * 32.0D);
      case 6:
      default:
         if(var3 > 0.0D) {
            return qh.f(var1 * 32.0D);
         } else {
            return qh.c(var1 * 32.0D);
         }
      }
   }

}
