import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class k {

   private final b a;
   private final String b;
   private final List c = new ArrayList();
   private StackTraceElement[] d = new StackTraceElement[0];


   public k(b var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public static String a(int var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      try {
         var3.append(String.format("World: (%d,%d,%d)", new Object[]{Integer.valueOf(var0), Integer.valueOf(var1), Integer.valueOf(var2)}));
      } catch (Throwable var16) {
         var3.append("(Error finding world loc)");
      }

      var3.append(", ");

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      try {
         var4 = var0 >> 4;
         var5 = var2 >> 4;
         var6 = var0 & 15;
         var7 = var1 >> 4;
         var8 = var2 & 15;
         var9 = var4 << 4;
         var10 = var5 << 4;
         var11 = (var4 + 1 << 4) - 1;
         var12 = (var5 + 1 << 4) - 1;
         var3.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[]{Integer.valueOf(var6), Integer.valueOf(var7), Integer.valueOf(var8), Integer.valueOf(var4), Integer.valueOf(var5), Integer.valueOf(var9), Integer.valueOf(var10), Integer.valueOf(var11), Integer.valueOf(var12)}));
      } catch (Throwable var15) {
         var3.append("(Error finding chunk loc)");
      }

      var3.append(", ");

      try {
         var4 = var0 >> 9;
         var5 = var2 >> 9;
         var6 = var4 << 5;
         var7 = var5 << 5;
         var8 = (var4 + 1 << 5) - 1;
         var9 = (var5 + 1 << 5) - 1;
         var10 = var4 << 9;
         var11 = var5 << 9;
         var12 = (var4 + 1 << 9) - 1;
         int var13 = (var5 + 1 << 9) - 1;
         var3.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[]{Integer.valueOf(var4), Integer.valueOf(var5), Integer.valueOf(var6), Integer.valueOf(var7), Integer.valueOf(var8), Integer.valueOf(var9), Integer.valueOf(var10), Integer.valueOf(var11), Integer.valueOf(var12), Integer.valueOf(var13)}));
      } catch (Throwable var14) {
         var3.append("(Error finding world loc)");
      }

      return var3.toString();
   }

   public void a(String var1, Callable var2) {
      try {
         this.a(var1, var2.call());
      } catch (Throwable var4) {
         this.a(var1, var4);
      }

   }

   public void a(String var1, Object var2) {
      this.c.add(new o(var1, var2));
   }

   public void a(String var1, Throwable var2) {
      this.a(var1, (Object)var2);
   }

   public int a(int var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      if(var2.length <= 0) {
         return 0;
      } else {
         this.d = new StackTraceElement[var2.length - 3 - var1];
         System.arraycopy(var2, 3 + var1, this.d, 0, this.d.length);
         return this.d.length;
      }
   }

   public boolean a(StackTraceElement var1, StackTraceElement var2) {
      if(this.d.length != 0 && var1 != null) {
         StackTraceElement var3 = this.d[0];
         if(var3.isNativeMethod() == var1.isNativeMethod() && var3.getClassName().equals(var1.getClassName()) && var3.getFileName().equals(var1.getFileName()) && var3.getMethodName().equals(var1.getMethodName())) {
            if(var2 != null != this.d.length > 1) {
               return false;
            } else if(var2 != null && !this.d[1].equals(var2)) {
               return false;
            } else {
               this.d[0] = var1;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void b(int var1) {
      StackTraceElement[] var2 = new StackTraceElement[this.d.length - var1];
      System.arraycopy(this.d, 0, var2, 0, var2.length);
      this.d = var2;
   }

   public void a(StringBuilder var1) {
      var1.append("-- ").append(this.b).append(" --\n");
      var1.append("Details:");
      Iterator var2 = this.c.iterator();

      while(var2.hasNext()) {
         o var3 = (o)var2.next();
         var1.append("\n\t");
         var1.append(var3.a());
         var1.append(": ");
         var1.append(var3.b());
      }

      if(this.d != null && this.d.length > 0) {
         var1.append("\nStacktrace:");
         StackTraceElement[] var6 = this.d;
         int var7 = var6.length;

         for(int var4 = 0; var4 < var7; ++var4) {
            StackTraceElement var5 = var6[var4];
            var1.append("\n\tat ");
            var1.append(var5.toString());
         }
      }

   }

   public StackTraceElement[] a() {
      return this.d;
   }

   public static void a(k var0, int var1, int var2, int var3, aji var4, int var5) {
      int var6 = aji.b(var4);
      var0.a("Block type", (Callable)(new l(var6, var4)));
      var0.a("Block data value", (Callable)(new m(var5)));
      var0.a("Block location", (Callable)(new n(var1, var2, var3)));
   }
}
