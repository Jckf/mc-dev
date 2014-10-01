import java.util.Random;
import org.apache.commons.lang3.tuple.ImmutablePair;

public class amb extends aji {

   public static final String[] a = new String[]{"stone", "cobble", "brick", "mossybrick", "crackedbrick", "chiseledbrick"};


   public amb() {
      super(awt.B);
      this.c(0.0F);
      this.a(abt.c);
   }

   public void b(ahb var1, int var2, int var3, int var4, int var5) {
      if(!var1.E) {
         yk var6 = new yk(var1);
         var6.b((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D, 0.0F, 0.0F);
         var1.d((sa)var6);
         var6.s();
      }

      super.b(var1, var2, var3, var4, var5);
   }

   public int a(Random var1) {
      return 0;
   }

   public static boolean a(aji var0) {
      return var0 == ajn.b || var0 == ajn.e || var0 == ajn.aV;
   }

   public static int a(aji var0, int var1) {
      if(var1 == 0) {
         if(var0 == ajn.e) {
            return 1;
         }

         if(var0 == ajn.aV) {
            return 2;
         }
      } else if(var0 == ajn.aV) {
         switch(var1) {
         case 1:
            return 3;
         case 2:
            return 4;
         case 3:
            return 5;
         }
      }

      return 0;
   }

   public static ImmutablePair b(int var0) {
      switch(var0) {
      case 1:
         return new ImmutablePair(ajn.e, Integer.valueOf(0));
      case 2:
         return new ImmutablePair(ajn.aV, Integer.valueOf(0));
      case 3:
         return new ImmutablePair(ajn.aV, Integer.valueOf(1));
      case 4:
         return new ImmutablePair(ajn.aV, Integer.valueOf(2));
      case 5:
         return new ImmutablePair(ajn.aV, Integer.valueOf(3));
      default:
         return new ImmutablePair(ajn.b, Integer.valueOf(0));
      }
   }

   protected add j(int var1) {
      switch(var1) {
      case 1:
         return new add(ajn.e);
      case 2:
         return new add(ajn.aV);
      case 3:
         return new add(ajn.aV, 1, 1);
      case 4:
         return new add(ajn.aV, 1, 2);
      case 5:
         return new add(ajn.aV, 1, 3);
      default:
         return new add(ajn.b);
      }
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.E) {
         yk var8 = new yk(var1);
         var8.b((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D, 0.0F, 0.0F);
         var1.d((sa)var8);
         var8.s();
      }

   }

   public int k(ahb var1, int var2, int var3, int var4) {
      return var1.e(var2, var3, var4);
   }

}
