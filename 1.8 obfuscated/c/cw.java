import java.util.EnumSet;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class cw extends z {

   public String c() {
      return "tp";
   }

   public int a() {
      return 2;
   }

   public String c(ae var1) {
      return "commands.tp.usage";
   }

   public void a(ae var1, String[] var2) {
      if(var2.length < 1) {
         throw new dp("commands.tp.usage", new Object[0]);
      } else {
         byte var3 = 0;
         Object var4;
         if(var2.length != 2 && var2.length != 4 && var2.length != 6) {
            var4 = b(var1);
         } else {
            var4 = b(var1, var2[0]);
            var3 = 1;
         }

         if(var2.length != 1 && var2.length != 2) {
            if(var2.length < var3 + 3) {
               throw new dp("commands.tp.usage", new Object[0]);
            } else if(((wv)var4).o != null) {
               int var14 = var3 + 1;
               aa var6 = a(((wv)var4).s, var2[var3], true);
               aa var7 = a(((wv)var4).t, var2[var14++], 0, 0, false);
               aa var8 = a(((wv)var4).u, var2[var14++], true);
               aa var9 = a((double)((wv)var4).y, var2.length > var14?var2[var14++]:"~", false);
               aa var10 = a((double)((wv)var4).z, var2.length > var14?var2[var14]:"~", false);
               float var12;
               if(var4 instanceof qw) {
                  EnumSet var11 = EnumSet.noneOf(ij.class);
                  if(var6.c()) {
                     var11.add(ij.a);
                  }

                  if(var7.c()) {
                     var11.add(ij.b);
                  }

                  if(var8.c()) {
                     var11.add(ij.c);
                  }

                  if(var10.c()) {
                     var11.add(ij.e);
                  }

                  if(var9.c()) {
                     var11.add(ij.d);
                  }

                  var12 = (float)var9.b();
                  if(!var9.c()) {
                     var12 = uv.g(var12);
                  }

                  float var13 = (float)var10.b();
                  if(!var10.c()) {
                     var13 = uv.g(var13);
                  }

                  if(var13 > 90.0F || var13 < -90.0F) {
                     var13 = uv.g(180.0F - var13);
                     var12 = uv.g(var12 + 180.0F);
                  }

                  ((wv)var4).a((wv)null);
                  ((qw)var4).a.a(var6.b(), var7.b(), var8.b(), var12, var13, var11);
                  ((wv)var4).f(var12);
               } else {
                  float var15 = (float)uv.g(var9.a());
                  var12 = (float)uv.g(var10.a());
                  if(var12 > 90.0F || var12 < -90.0F) {
                     var12 = uv.g(180.0F - var12);
                     var15 = uv.g(var15 + 180.0F);
                  }

                  ((wv)var4).b(var6.a(), var7.a(), var8.a(), var15, var12);
                  ((wv)var4).f(var15);
               }

               a(var1, this, "commands.tp.success.coordinates", new Object[]{((wv)var4).d_(), Double.valueOf(var6.a()), Double.valueOf(var7.a()), Double.valueOf(var8.a())});
            }
         } else {
            wv var5 = b(var1, var2[var2.length - 1]);
            if(var5.o != ((wv)var4).o) {
               throw new di("commands.tp.notSameDimension", new Object[0]);
            } else {
               ((wv)var4).a((wv)null);
               if(var4 instanceof qw) {
                  ((qw)var4).a.a(var5.s, var5.t, var5.u, var5.y, var5.z);
               } else {
                  ((wv)var4).b(var5.s, var5.t, var5.u, var5.y, var5.z);
               }

               a(var1, this, "commands.tp.success", new Object[]{((wv)var4).d_(), var5.d_()});
            }
         }
      }
   }

   public List a(ae var1, String[] var2, dt var3) {
      return var2.length != 1 && var2.length != 2?null:a(var2, MinecraftServer.M().I());
   }

   public boolean b(String[] var1, int var2) {
      return var2 == 0;
   }
}
