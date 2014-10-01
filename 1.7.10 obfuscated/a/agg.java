
public class agg extends aft {

   protected agg(int var1, int var2, afu var3) {
      super(var1, var2, var3);
      if(var3 == afu.h) {
         this.b("lootBonusDigger");
      } else if(var3 == afu.i) {
         this.b("lootBonusFishing");
      } else {
         this.b("lootBonus");
      }

   }

   public int a(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int b() {
      return 3;
   }

   public boolean a(aft var1) {
      return super.a(var1) && var1.B != s.B;
   }
}
