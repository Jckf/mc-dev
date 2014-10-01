
public class gj extends ft {

   private fj a;
   private boolean b;


   public gj() {
      this.b = true;
   }

   public gj(fj var1) {
      this(var1, true);
   }

   public gj(fj var1, boolean var2) {
      this.b = true;
      this.a = var1;
      this.b = var2;
   }

   public void a(et var1) {
      this.a = fk.a(var1.c(32767));
   }

   public void b(et var1) {
      var1.a(fk.a(this.a));
   }

   public void a(fv var1) {
      var1.a(this);
   }

   public String b() {
      return String.format("message=\'%s\'", new Object[]{this.a});
   }

   public boolean d() {
      return this.b;
   }
}
