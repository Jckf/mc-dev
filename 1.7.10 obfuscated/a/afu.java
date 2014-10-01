
public enum afu {

   a("all", 0),
   b("armor", 1),
   c("armor_feet", 2),
   d("armor_legs", 3),
   e("armor_torso", 4),
   f("armor_head", 5),
   g("weapon", 6),
   h("digger", 7),
   i("fishing_rod", 8),
   j("breakable", 9),
   k("bow", 10);
   // $FF: synthetic field
   private static final afu[] l = new afu[]{a, b, c, d, e, f, g, h, i, j, k};


   private afu(String var1, int var2) {}

   public boolean a(adb var1) {
      if(this == a) {
         return true;
      } else if(this == j && var1.p()) {
         return true;
      } else if(var1 instanceof abb) {
         if(this == b) {
            return true;
         } else {
            abb var2 = (abb)var1;
            return var2.b == 0?this == f:(var2.b == 2?this == d:(var2.b == 1?this == e:(var2.b == 3?this == c:false)));
         }
      } else {
         return var1 instanceof aeh?this == g:(var1 instanceof acg?this == h:(var1 instanceof abm?this == k:(var1 instanceof acv?this == i:false)));
      }
   }

}
