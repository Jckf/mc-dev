import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class azq {

   private azc a;
   private Map b = new HashMap();
   private List c = new ArrayList();
   private Map d = new HashMap();


   public azq(azc var1) {
      this.a = var1;
      this.b();
   }

   public ayl a(Class var1, String var2) {
      ayl var3 = (ayl)this.b.get(var2);
      if(var3 != null) {
         return var3;
      } else {
         if(this.a != null) {
            try {
               File var4 = this.a.a(var2);
               if(var4 != null && var4.exists()) {
                  try {
                     var3 = (ayl)var1.getConstructor(new Class[]{String.class}).newInstance(new Object[]{var2});
                  } catch (Exception var7) {
                     throw new RuntimeException("Failed to instantiate " + var1.toString(), var7);
                  }

                  FileInputStream var5 = new FileInputStream(var4);
                  dh var6 = du.a((InputStream)var5);
                  var5.close();
                  var3.a(var6.m("data"));
               }
            } catch (Exception var8) {
               var8.printStackTrace();
            }
         }

         if(var3 != null) {
            this.b.put(var2, var3);
            this.c.add(var3);
         }

         return var3;
      }
   }

   public void a(String var1, ayl var2) {
      if(var2 == null) {
         throw new RuntimeException("Can\'t set null data");
      } else {
         if(this.b.containsKey(var1)) {
            this.c.remove(this.b.remove(var1));
         }

         this.b.put(var1, var2);
         this.c.add(var2);
      }
   }

   public void a() {
      for(int var1 = 0; var1 < this.c.size(); ++var1) {
         ayl var2 = (ayl)this.c.get(var1);
         if(var2.d()) {
            this.a(var2);
            var2.a(false);
         }
      }

   }

   private void a(ayl var1) {
      if(this.a != null) {
         try {
            File var2 = this.a.a(var1.h);
            if(var2 != null) {
               dh var3 = new dh();
               var1.b(var3);
               dh var4 = new dh();
               var4.a("data", (dy)var3);
               FileOutputStream var5 = new FileOutputStream(var2);
               du.a(var4, (OutputStream)var5);
               var5.close();
            }
         } catch (Exception var6) {
            var6.printStackTrace();
         }

      }
   }

   private void b() {
      try {
         this.d.clear();
         if(this.a == null) {
            return;
         }

         File var1 = this.a.a("idcounts");
         if(var1 != null && var1.exists()) {
            DataInputStream var2 = new DataInputStream(new FileInputStream(var1));
            dh var3 = du.a(var2);
            var2.close();
            Iterator var4 = var3.c().iterator();

            while(var4.hasNext()) {
               String var5 = (String)var4.next();
               dy var6 = var3.a(var5);
               if(var6 instanceof dw) {
                  dw var7 = (dw)var6;
                  short var9 = var7.e();
                  this.d.put(var5, Short.valueOf(var9));
               }
            }
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }

   }

   public int a(String var1) {
      Short var2 = (Short)this.d.get(var1);
      if(var2 == null) {
         var2 = Short.valueOf((short)0);
      } else {
         var2 = Short.valueOf((short)(var2.shortValue() + 1));
      }

      this.d.put(var1, var2);
      if(this.a == null) {
         return var2.shortValue();
      } else {
         try {
            File var3 = this.a.a("idcounts");
            if(var3 != null) {
               dh var4 = new dh();
               Iterator var5 = this.d.keySet().iterator();

               while(var5.hasNext()) {
                  String var6 = (String)var5.next();
                  short var7 = ((Short)this.d.get(var6)).shortValue();
                  var4.a(var6, var7);
               }

               DataOutputStream var9 = new DataOutputStream(new FileOutputStream(var3));
               du.a(var4, (DataOutput)var9);
               var9.close();
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         return var2.shortValue();
      }
   }
}
