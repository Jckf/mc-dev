import org.apache.commons.lang3.StringUtils;

public class iq extends ft {

   private String a;


   public iq() {}

   public iq(String var1) {
      this.a = var1;
   }

   public void a(et var1) {
      this.a = var1.c(32767);
   }

   public void b(et var1) {
      var1.a(StringUtils.substring(this.a, 0, 32767));
   }

   public void a(io var1) {
      var1.a(this);
   }

   public String c() {
      return this.a;
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }
}
