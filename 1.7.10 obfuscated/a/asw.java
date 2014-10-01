import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class asw extends ave {

   private double e = 0.004D;


   public asw() {}

   public String a() {
      return "Mineshaft";
   }

   public asw(Map var1) {
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if(((String)var3.getKey()).equals("chance")) {
            this.e = qh.a((String)var3.getValue(), this.e);
         }
      }

   }

   protected boolean a(int var1, int var2) {
      return this.b.nextDouble() < this.e && this.b.nextInt(80) < Math.max(Math.abs(var1), Math.abs(var2));
   }

   protected avm b(int var1, int var2) {
      return new atc(this.c, this.b, var1, var2);
   }
}
