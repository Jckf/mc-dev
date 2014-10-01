import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class eu {

   private static final Logger a = LogManager.getLogger();
   private static final Marker b = MarkerManager.getMarker("NETSTAT_MARKER", ej.c);
   private ex c = new ex();
   private ex d = new ex();


   public void a(int var1, long var2) {
      this.c.a(var1, var2);
   }

   public void b(int var1, long var2) {
      this.d.a(var1, var2);
   }

   public long a() {
      return this.c.a();
   }

   public long b() {
      return this.d.a();
   }

   public long c() {
      return this.c.b();
   }

   public long d() {
      return this.d.b();
   }

   public ew e() {
      return this.c.c();
   }

   public ew f() {
      return this.c.d();
   }

   public ew g() {
      return this.d.c();
   }

   public ew h() {
      return this.d.d();
   }

   public ew a(int var1) {
      return this.c.a(var1);
   }

   public ew b(int var1) {
      return this.d.a(var1);
   }

   // $FF: synthetic method
   static Logger i() {
      return a;
   }

   // $FF: synthetic method
   static Marker j() {
      return b;
   }

}
