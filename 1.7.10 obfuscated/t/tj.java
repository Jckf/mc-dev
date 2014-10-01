import java.util.UUID;
import org.apache.commons.lang3.Validate;

public class tj {

   private final double a;
   private final int b;
   private final String c;
   private final UUID d;
   private boolean e;


   public tj(String var1, double var2, int var4) {
      this(UUID.randomUUID(), var1, var2, var4);
   }

   public tj(UUID var1, String var2, double var3, int var5) {
      this.e = true;
      this.d = var1;
      this.c = var2;
      this.a = var3;
      this.b = var5;
      Validate.notEmpty((CharSequence)var2, "Modifier name cannot be empty", new Object[0]);
      Validate.inclusiveBetween(Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(var5), "Invalid operation", new Object[0]);
   }

   public UUID a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public int c() {
      return this.b;
   }

   public double d() {
      return this.a;
   }

   public boolean e() {
      return this.e;
   }

   public tj a(boolean var1) {
      this.e = var1;
      return this;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         tj var2 = (tj)var1;
         if(this.d != null) {
            if(!this.d.equals(var2.d)) {
               return false;
            }
         } else if(var2.d != null) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.d != null?this.d.hashCode():0;
   }

   public String toString() {
      return "AttributeModifier{amount=" + this.a + ", operation=" + this.b + ", name=\'" + this.c + '\'' + ", id=" + this.d + ", serialize=" + this.e + '}';
   }
}
