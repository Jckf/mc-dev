
public class apm extends aor {

   public String[] a = new String[]{"", "", "", ""};
   public int i = -1;
   private boolean j = true;
   private yz k;


   public void b(dh var1) {
      super.b(var1);
      var1.a("Text1", this.a[0]);
      var1.a("Text2", this.a[1]);
      var1.a("Text3", this.a[2]);
      var1.a("Text4", this.a[3]);
   }

   public void a(dh var1) {
      this.j = false;
      super.a(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         this.a[var2] = var1.j("Text" + (var2 + 1));
         if(this.a[var2].length() > 15) {
            this.a[var2] = this.a[var2].substring(0, 15);
         }
      }

   }

   public ft m() {
      String[] var1 = new String[4];
      System.arraycopy(this.a, 0, var1, 0, 4);
      return new ii(this.c, this.d, this.e, var1);
   }

   public boolean a() {
      return this.j;
   }

   public void a(yz var1) {
      this.k = var1;
   }

   public yz b() {
      return this.k;
   }
}
