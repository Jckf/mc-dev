
// $FF: synthetic class
class bkj {

   // $FF: synthetic field
   static final int[] a = new int[ej.values().length];


   static {
      try {
         a[ej.c.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[ej.d.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[ej.e.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
