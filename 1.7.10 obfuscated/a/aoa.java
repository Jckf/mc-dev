import java.util.List;
import java.util.Random;

public class aoa extends aji {

   private final String a;
   private final boolean b;
   private final String M;


   protected aoa(String var1, String var2, awt var3, boolean var4) {
      super(var3);
      this.a = var2;
      this.b = var4;
      this.M = var1;
      this.a(abt.c);
   }

   public adb a(int var1, Random var2, int var3) {
      return !this.b?null:super.a(var1, var2, var3);
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public int b() {
      return this.J == awt.s?41:18;
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      boolean var8 = this.a(var1.a(var2, var3, var4 - 1));
      boolean var9 = this.a(var1.a(var2, var3, var4 + 1));
      boolean var10 = this.a(var1.a(var2 - 1, var3, var4));
      boolean var11 = this.a(var1.a(var2 + 1, var3, var4));
      if((!var10 || !var11) && (var10 || var11 || var8 || var9)) {
         if(var10 && !var11) {
            this.a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
            super.a(var1, var2, var3, var4, var5, var6, var7);
         } else if(!var10 && var11) {
            this.a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.a(var1, var2, var3, var4, var5, var6, var7);
         }
      } else {
         this.a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

      if((!var8 || !var9) && (var10 || var11 || var8 || var9)) {
         if(var8 && !var9) {
            this.a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
            super.a(var1, var2, var3, var4, var5, var6, var7);
         } else if(!var8 && var9) {
            this.a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
            super.a(var1, var2, var3, var4, var5, var6, var7);
         }
      } else {
         this.a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public void g() {
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(ahl var1, int var2, int var3, int var4) {
      float var5 = 0.4375F;
      float var6 = 0.5625F;
      float var7 = 0.4375F;
      float var8 = 0.5625F;
      boolean var9 = this.a(var1.a(var2, var3, var4 - 1));
      boolean var10 = this.a(var1.a(var2, var3, var4 + 1));
      boolean var11 = this.a(var1.a(var2 - 1, var3, var4));
      boolean var12 = this.a(var1.a(var2 + 1, var3, var4));
      if((!var11 || !var12) && (var11 || var12 || var9 || var10)) {
         if(var11 && !var12) {
            var5 = 0.0F;
         } else if(!var11 && var12) {
            var6 = 1.0F;
         }
      } else {
         var5 = 0.0F;
         var6 = 1.0F;
      }

      if((!var9 || !var10) && (var11 || var12 || var9 || var10)) {
         if(var9 && !var10) {
            var7 = 0.0F;
         } else if(!var9 && var10) {
            var8 = 1.0F;
         }
      } else {
         var7 = 0.0F;
         var8 = 1.0F;
      }

      this.a(var5, 0.0F, var7, var6, 1.0F, var8);
   }

   public final boolean a(aji var1) {
      return var1.j() || var1 == this || var1 == ajn.w || var1 == ajn.cn || var1 == ajn.co || var1 instanceof aoa;
   }

   protected boolean E() {
      return true;
   }

   protected add j(int var1) {
      return new add(adb.a((aji)this), 1, var1);
   }
}
