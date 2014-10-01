
public class aau extends aay {

   private final aas a;
   private yz b;
   private int c;
   private final agm d;


   public aau(yz var1, agm var2, aas var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.b = var1;
      this.d = var2;
      this.a = var3;
   }

   public boolean a(add var1) {
      return false;
   }

   public add a(int var1) {
      if(this.e()) {
         this.c += Math.min(var1, this.d().b);
      }

      return super.a(var1);
   }

   protected void a(add var1, int var2) {
      this.c += var2;
      this.b(var1);
   }

   protected void b(add var1) {
      var1.a(this.b.o, this.b, this.c);
      this.c = 0;
   }

   public void a(yz var1, add var2) {
      this.b(var2);
      agn var3 = this.a.i();
      if(var3 != null) {
         add var4 = this.a.a(0);
         add var5 = this.a.a(1);
         if(this.a(var3, var4, var5) || this.a(var3, var5, var4)) {
            this.d.a(var3);
            if(var4 != null && var4.b <= 0) {
               var4 = null;
            }

            if(var5 != null && var5.b <= 0) {
               var5 = null;
            }

            this.a.a(0, var4);
            this.a.a(1, var5);
         }
      }

   }

   private boolean a(agn var1, add var2, add var3) {
      add var4 = var1.a();
      add var5 = var1.b();
      if(var2 != null && var2.b() == var4.b()) {
         if(var5 != null && var3 != null && var5.b() == var3.b()) {
            var2.b -= var4.b;
            var3.b -= var5.b;
            return true;
         }

         if(var5 == null && var3 == null) {
            var2.b -= var4.b;
            return true;
         }
      }

      return false;
   }
}
