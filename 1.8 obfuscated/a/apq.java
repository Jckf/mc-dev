
public class apq extends apf {

   protected apq(int var1, oa var2, int var3, apg var4) {
      super(var1, var2, var3, var4);
      this.c("fishingSpeed");
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
}
