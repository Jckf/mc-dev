import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class aug extends ave {

   private List e;
   private boolean f;
   private agu[] g;
   private double h;
   private int i;


   public aug() {
      this.g = new agu[3];
      this.h = 32.0D;
      this.i = 3;
      this.e = new ArrayList();
      ahu[] var1 = ahu.n();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         ahu var4 = var1[var3];
         if(var4 != null && var4.am > 0.0F) {
            this.e.add(var4);
         }
      }

   }

   public aug(Map var1) {
      this();
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(((String)var3.getKey()).equals("distance")) {
            this.h = qh.a((String)var3.getValue(), this.h, 1.0D);
         } else if(((String)var3.getKey()).equals("count")) {
            this.g = new agu[qh.a((String)var3.getValue(), this.g.length, 1)];
         } else if(((String)var3.getKey()).equals("spread")) {
            this.i = qh.a((String)var3.getValue(), this.i, 1);
         }
      }

   }

   public String a() {
      return "Stronghold";
   }

   protected boolean a(int var1, int var2) {
      if(!this.f) {
         Random var3 = new Random();
         var3.setSeed(this.c.H());
         double var4 = var3.nextDouble() * 3.141592653589793D * 2.0D;
         int var6 = 1;

         for(int var7 = 0; var7 < this.g.length; ++var7) {
            double var8 = (1.25D * (double)var6 + var3.nextDouble()) * this.h * (double)var6;
            int var10 = (int)Math.round(Math.cos(var4) * var8);
            int var11 = (int)Math.round(Math.sin(var4) * var8);
            agt var12 = this.c.v().a((var10 << 4) + 8, (var11 << 4) + 8, 112, this.e, var3);
            if(var12 != null) {
               var10 = var12.a >> 4;
               var11 = var12.c >> 4;
            }

            this.g[var7] = new agu(var10, var11);
            var4 += 6.283185307179586D * (double)var6 / (double)this.i;
            if(var7 == this.i) {
               var6 += 2 + var3.nextInt(5);
               this.i += 1 + var3.nextInt(2);
            }
         }

         this.f = true;
      }

      agu[] var13 = this.g;
      int var14 = var13.length;

      for(int var5 = 0; var5 < var14; ++var5) {
         agu var15 = var13[var5];
         if(var1 == var15.a && var2 == var15.b) {
            return true;
         }
      }

      return false;
   }

   protected List o_() {
      ArrayList var1 = new ArrayList();
      agu[] var2 = this.g;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         agu var5 = var2[var4];
         if(var5 != null) {
            var1.add(var5.a(64));
         }
      }

      return var1;
   }

   protected avm b(int var1, int var2) {
      auh var3;
      for(var3 = new auh(this.c, this.b, var1, var2); var3.b().isEmpty() || ((auz)var3.b().get(0)).b == null; var3 = new auh(this.c, this.b, var1, var2)) {
         ;
      }

      return var3;
   }
}
