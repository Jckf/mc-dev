
// $FF: synthetic class
class nm {

   // $FF: synthetic field
   static final int[] a = new int[eo.values().length];


   static {
      try {
         a[eo.d.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[eo.c.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
