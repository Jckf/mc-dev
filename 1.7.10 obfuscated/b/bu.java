import java.util.List;

public class bu extends y {

   public String c() {
      return "summon";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.summon.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length < 1) {
         throw new ci("commands.summon.usage", new Object[0]);
      } else {
         String var3 = var2[0];
         double var4 = (double)var1.f_().a + 0.5D;
         double var6 = (double)var1.f_().b;
         double var8 = (double)var1.f_().c + 0.5D;
         if(var2.length >= 4) {
            var4 = a(var1, var4, var2[1]);
            var6 = a(var1, var6, var2[2]);
            var8 = a(var1, var8, var2[3]);
         }

         ahb var10 = var1.d();
         if(!var10.d((int)var4, (int)var6, (int)var8)) {
            a(var1, this, "commands.summon.outOfWorld", new Object[0]);
         } else {
            dh var11 = new dh();
            boolean var12 = false;
            if(var2.length >= 5) {
               fj var13 = a(var1, var2, 4);

               try {
                  dy var14 = eb.a(var13.c());
                  if(!(var14 instanceof dh)) {
                     a(var1, this, "commands.summon.tagError", new Object[]{"Not a valid tag"});
                     return;
                  }

                  var11 = (dh)var14;
                  var12 = true;
               } catch (ea var17) {
                  a(var1, this, "commands.summon.tagError", new Object[]{var17.getMessage()});
                  return;
               }
            }

            var11.a("id", var3);
            sa var18 = sg.a(var11, var10);
            if(var18 == null) {
               a(var1, this, "commands.summon.failed", new Object[0]);
            } else {
               var18.b(var4, var6, var8, var18.y, var18.z);
               if(!var12 && var18 instanceof sw) {
                  ((sw)var18).a((sy)null);
               }

               var10.d(var18);
               sa var19 = var18;

               for(dh var15 = var11; var19 != null && var15.b("Riding", 10); var15 = var15.m("Riding")) {
                  sa var16 = sg.a(var15.m("Riding"), var10);
                  if(var16 != null) {
                     var16.b(var4, var6, var8, var16.y, var16.z);
                     var10.d(var16);
                     var19.a(var16);
                  }

                  var19 = var16;
               }

               a(var1, this, "commands.summon.success", new Object[0]);
            }
         }
      }
   }

   public List a(ac var1, String[] var2) {
      return var2.length == 1?a(var2, this.d()):null;
   }

   protected String[] d() {
      return (String[])sg.b().toArray(new String[0]);
   }
}
