
class oh extends RuntimeException {

   private oh(String var1, Throwable var2) {
      super(var1, var2);
   }

   private oh(String var1) {
      super(var1);
   }

   // $FF: synthetic method
   oh(String var1, oa var2) {
      this(var1);
   }

   // $FF: synthetic method
   oh(String var1, Throwable var2, oa var3) {
      this(var1, var2);
   }
}
