
public class aax extends aay {

   private final rb a;
   private yz b;
   private int c;


   public aax(yz var1, rb var2, rb var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.b = var1;
      this.a = var2;
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
      if(var1.b() == adb.a(ajn.ai)) {
         this.b.a((ph)pc.h, 1);
      }

      if(var1.b() instanceof adn) {
         this.b.a((ph)pc.i, 1);
      }

      if(var1.b() == adb.a(ajn.al)) {
         this.b.a((ph)pc.j, 1);
      }

      if(var1.b() instanceof ada) {
         this.b.a((ph)pc.l, 1);
      }

      if(var1.b() == ade.P) {
         this.b.a((ph)pc.m, 1);
      }

      if(var1.b() == ade.aU) {
         this.b.a((ph)pc.n, 1);
      }

      if(var1.b() instanceof adn && ((adn)var1.b()).i() != adc.a) {
         this.b.a((ph)pc.o, 1);
      }

      if(var1.b() instanceof aeh) {
         this.b.a((ph)pc.r, 1);
      }

      if(var1.b() == adb.a(ajn.bn)) {
         this.b.a((ph)pc.E, 1);
      }

      if(var1.b() == adb.a(ajn.X)) {
         this.b.a((ph)pc.G, 1);
      }

   }

   public void a(yz var1, add var2) {
      this.b(var2);

      for(int var3 = 0; var3 < this.a.a(); ++var3) {
         add var4 = this.a.a(var3);
         if(var4 != null) {
            this.a.a(var3, 1);
            if(var4.b().u()) {
               add var5 = new add(var4.b().t());
               if(!var4.b().l(var4) || !this.b.bm.a(var5)) {
                  if(this.a.a(var3) == null) {
                     this.a.a(var3, var5);
                  } else {
                     this.b.a(var5, false);
                  }
               }
            }
         }
      }

   }
}
