import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;

public class ns {

   public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   private final Map c = Maps.newHashMap();
   private final Map d = Maps.newHashMap();
   private final LinkedList e = Lists.newLinkedList();
   private final MinecraftServer f;
   protected final Gson b;
   private final File g;
   private static final ParameterizedType h = new nu();


   public ns(MinecraftServer var1, File var2) {
      this.f = var1;
      this.g = var2;
      GsonBuilder var3 = new GsonBuilder();
      var3.registerTypeHierarchyAdapter(nv.class, new nw(this, (nt)null));
      this.b = var3.create();
      this.b();
   }

   private static GameProfile a(MinecraftServer var0, String var1) {
      GameProfile[] var2 = new GameProfile[1];
      nt var3 = new nt(var2);
      var0.aw().findProfilesByNames(new String[]{var1}, Agent.MINECRAFT, var3);
      if(!var0.Y() && var2[0] == null) {
         UUID var4 = yz.a(new GameProfile((UUID)null, var1));
         GameProfile var5 = new GameProfile(var4, var1);
         var3.onProfileLookupSucceeded(var5);
      }

      return var2[0];
   }

   public void a(GameProfile var1) {
      this.a(var1, (Date)null);
   }

   private void a(GameProfile var1, Date var2) {
      UUID var3 = var1.getId();
      if(var2 == null) {
         Calendar var4 = Calendar.getInstance();
         var4.setTime(new Date());
         var4.add(2, 1);
         var2 = var4.getTime();
      }

      String var10 = var1.getName().toLowerCase(Locale.ROOT);
      nv var5 = new nv(this, var1, var2, (nt)null);
      LinkedList var6 = this.e;
      synchronized(this.e) {
         if(this.d.containsKey(var3)) {
            nv var7 = (nv)this.d.get(var3);
            this.c.remove(var7.a().getName().toLowerCase(Locale.ROOT));
            this.c.put(var1.getName().toLowerCase(Locale.ROOT), var5);
            this.e.remove(var1);
         } else {
            this.d.put(var3, var5);
            this.c.put(var10, var5);
         }

         this.e.addFirst(var1);
      }
   }

   public GameProfile a(String var1) {
      String var2 = var1.toLowerCase(Locale.ROOT);
      nv var3 = (nv)this.c.get(var2);
      if(var3 != null && (new Date()).getTime() >= nv.a(var3).getTime()) {
         this.d.remove(var3.a().getId());
         this.c.remove(var3.a().getName().toLowerCase(Locale.ROOT));
         LinkedList var4 = this.e;
         synchronized(this.e) {
            this.e.remove(var3.a());
         }

         var3 = null;
      }

      GameProfile var9;
      if(var3 != null) {
         var9 = var3.a();
         LinkedList var5 = this.e;
         synchronized(this.e) {
            this.e.remove(var9);
            this.e.addFirst(var9);
         }
      } else {
         var9 = a(this.f, var2);
         if(var9 != null) {
            this.a(var9);
            var3 = (nv)this.c.get(var2);
         }
      }

      this.c();
      return var3 == null?null:var3.a();
   }

   public String[] a() {
      ArrayList var1 = Lists.newArrayList((Iterable)this.c.keySet());
      return (String[])var1.toArray(new String[var1.size()]);
   }

   public GameProfile a(UUID var1) {
      nv var2 = (nv)this.d.get(var1);
      return var2 == null?null:var2.a();
   }

   private nv b(UUID var1) {
      nv var2 = (nv)this.d.get(var1);
      if(var2 != null) {
         GameProfile var3 = var2.a();
         LinkedList var4 = this.e;
         synchronized(this.e) {
            this.e.remove(var3);
            this.e.addFirst(var3);
         }
      }

      return var2;
   }

   public void b() {
      List var1 = null;
      BufferedReader var2 = null;

      label81: {
         try {
            var2 = Files.newReader(this.g, Charsets.UTF_8);
            var1 = (List)this.b.fromJson((Reader)var2, (Type)h);
            break label81;
         } catch (FileNotFoundException var10) {
            ;
         } finally {
            IOUtils.closeQuietly((Reader)var2);
         }

         return;
      }

      if(var1 != null) {
         this.c.clear();
         this.d.clear();
         LinkedList var3 = this.e;
         synchronized(this.e) {
            this.e.clear();
         }

         var1 = Lists.reverse(var1);
         Iterator var12 = var1.iterator();

         while(var12.hasNext()) {
            nv var4 = (nv)var12.next();
            if(var4 != null) {
               this.a(var4.a(), var4.b());
            }
         }
      }

   }

   public void c() {
      String var1 = this.b.toJson((Object)this.a(1000));
      BufferedWriter var2 = null;

      try {
         var2 = Files.newWriter(this.g, Charsets.UTF_8);
         var2.write(var1);
         return;
      } catch (FileNotFoundException var8) {
         ;
      } catch (IOException var9) {
         return;
      } finally {
         IOUtils.closeQuietly((Writer)var2);
      }

   }

   private List a(int var1) {
      ArrayList var2 = Lists.newArrayList();
      LinkedList var4 = this.e;
      ArrayList var3;
      synchronized(this.e) {
         var3 = Lists.newArrayList(Iterators.limit(this.e.iterator(), var1));
      }

      Iterator var8 = var3.iterator();

      while(var8.hasNext()) {
         GameProfile var5 = (GameProfile)var8.next();
         nv var6 = this.b(var5.getId());
         if(var6 != null) {
            var2.add(var6);
         }
      }

      return var2;
   }

}
