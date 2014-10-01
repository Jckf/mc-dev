
public class agr extends qw {

   public final dh b;
   public final String c;
   // $FF: synthetic field
   final agq d;


   public agr(agq var1, dh var2) {
      super(var2.f("Weight"));
      this.d = var1;
      dh var3 = var2.m("Properties");
      String var4 = var2.j("Type");
      if(var4.equals("Minecart")) {
         if(var3 != null) {
            switch(var3.f("Type")) {
            case 0:
               var4 = "MinecartRideable";
               break;
            case 1:
               var4 = "MinecartChest";
               break;
            case 2:
               var4 = "MinecartFurnace";
            }
         } else {
            var4 = "MinecartRideable";
         }
      }

      this.b = var3;
      this.c = var4;
   }

   public agr(agq var1, dh var2, String var3) {
      super(1);
      this.d = var1;
      if(var3.equals("Minecart")) {
         if(var2 != null) {
            switch(var2.f("Type")) {
            case 0:
               var3 = "MinecartRideable";
               break;
            case 1:
               var3 = "MinecartChest";
               break;
            case 2:
               var3 = "MinecartFurnace";
            }
         } else {
            var3 = "MinecartRideable";
         }
      }

      this.b = var2;
      this.c = var3;
   }

   public dh a() {
      dh var1 = new dh();
      var1.a("Properties", (dy)this.b);
      var1.a("Type", this.c);
      var1.a("Weight", this.a);
      return var1;
   }
}
