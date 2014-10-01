import java.util.ArrayList;

public class tb extends ss {

   public tc e;


   public tb(ahb var1) {
      super(var1);
   }

   public tb(ahb var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      ArrayList var6 = new ArrayList();
      tc[] var7 = tc.values();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         tc var10 = var7[var9];
         this.e = var10;
         this.a(var5);
         if(this.e()) {
            var6.add(var10);
         }
      }

      if(!var6.isEmpty()) {
         this.e = (tc)var6.get(this.Z.nextInt(var6.size()));
      }

      this.a(var5);
   }

   public void b(dh var1) {
      var1.a("Motive", this.e.B);
      super.b(var1);
   }

   public void a(dh var1) {
      String var2 = var1.j("Motive");
      tc[] var3 = tc.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         tc var6 = var3[var5];
         if(var6.B.equals(var2)) {
            this.e = var6;
         }
      }

      if(this.e == null) {
         this.e = tc.a;
      }

      super.a(var1);
   }

   public int f() {
      return this.e.C;
   }

   public int i() {
      return this.e.D;
   }

   public void b(sa var1) {
      if(var1 instanceof yz) {
         yz var2 = (yz)var1;
         if(var2.bE.d) {
            return;
         }
      }

      this.a(new add(ade.an), 0.0F);
   }
}
