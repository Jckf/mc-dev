
public class bn extends y {

   public String c() {
      return "setworldspawn";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.setworldspawn.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length == 3) {
         if(var1.d() == null) {
            throw new ci("commands.setworldspawn.usage", new Object[0]);
         }

         byte var3 = 0;
         int var7 = var3 + 1;
         int var4 = a(var1, var2[var3], -30000000, 30000000);
         int var5 = a(var1, var2[var7++], 0, 256);
         int var6 = a(var1, var2[var7++], -30000000, 30000000);
         var1.d().x(var4, var5, var6);
         a(var1, this, "commands.setworldspawn.success", new Object[]{Integer.valueOf(var4), Integer.valueOf(var5), Integer.valueOf(var6)});
      } else {
         if(var2.length != 0) {
            throw new ci("commands.setworldspawn.usage", new Object[0]);
         }

         r var8 = b(var1).f_();
         var1.d().x(var8.a, var8.b, var8.c);
         a(var1, this, "commands.setworldspawn.success", new Object[]{Integer.valueOf(var8.a), Integer.valueOf(var8.b), Integer.valueOf(var8.c)});
      }

   }
}
