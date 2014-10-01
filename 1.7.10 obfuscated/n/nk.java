
// $FF: synthetic class
class nk {

   // $FF: synthetic field
   static final int[] a = new int[it.values().length];


   static {
      try {
         a[it.a.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[it.b.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[it.c.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
