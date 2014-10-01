import java.util.List;

public class baf implements bah {

   private final String g;


   public baf(String var1) {
      this.g = var1;
      bah.a.put(var1, this);
   }

   public String a() {
      return this.g;
   }

   public int a(List var1) {
      return 0;
   }

   public boolean b() {
      return false;
   }
}
