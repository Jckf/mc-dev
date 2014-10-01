import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class azy extends bae {

   private final bac a;
   private final String b;
   private final Set c = new HashSet();
   private String d;
   private String e = "";
   private String f = "";
   private boolean g = true;
   private boolean h = true;


   public azy(bac var1, String var2) {
      this.a = var1;
      this.b = var2;
      this.d = var2;
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.d;
   }

   public void a(String var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.d = var1;
         this.a.b(this);
      }
   }

   public Collection d() {
      return this.c;
   }

   public String e() {
      return this.e;
   }

   public void b(String var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("Prefix cannot be null");
      } else {
         this.e = var1;
         this.a.b(this);
      }
   }

   public String f() {
      return this.f;
   }

   public void c(String var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("Suffix cannot be null");
      } else {
         this.f = var1;
         this.a.b(this);
      }
   }

   public String d(String var1) {
      return this.e() + var1 + this.f();
   }

   public static String a(bae var0, String var1) {
      return var0 == null?var1:var0.d(var1);
   }

   public boolean g() {
      return this.g;
   }

   public void a(boolean var1) {
      this.g = var1;
      this.a.b(this);
   }

   public boolean h() {
      return this.h;
   }

   public void b(boolean var1) {
      this.h = var1;
      this.a.b(this);
   }

   public int i() {
      int var1 = 0;
      if(this.g()) {
         var1 |= 1;
      }

      if(this.h()) {
         var1 |= 2;
      }

      return var1;
   }
}
