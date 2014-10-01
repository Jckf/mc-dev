import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class bk extends y {

   public String c() {
      return "scoreboard";
   }

   public int a() {
      return 2;
   }

   public String c(ac var1) {
      return "commands.scoreboard.usage";
   }

   public void b(ac var1, String[] var2) {
      if(var2.length >= 1) {
         if(var2[0].equalsIgnoreCase("objectives")) {
            if(var2.length == 1) {
               throw new ci("commands.scoreboard.objectives.usage", new Object[0]);
            }

            if(var2[1].equalsIgnoreCase("list")) {
               this.d(var1);
            } else if(var2[1].equalsIgnoreCase("add")) {
               if(var2.length < 4) {
                  throw new ci("commands.scoreboard.objectives.add.usage", new Object[0]);
               }

               this.c(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("remove")) {
               if(var2.length != 3) {
                  throw new ci("commands.scoreboard.objectives.remove.usage", new Object[0]);
               }

               this.h(var1, var2[2]);
            } else {
               if(!var2[1].equalsIgnoreCase("setdisplay")) {
                  throw new ci("commands.scoreboard.objectives.usage", new Object[0]);
               }

               if(var2.length != 3 && var2.length != 4) {
                  throw new ci("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
               }

               this.k(var1, var2, 2);
            }

            return;
         }

         if(var2[0].equalsIgnoreCase("players")) {
            if(var2.length == 1) {
               throw new ci("commands.scoreboard.players.usage", new Object[0]);
            }

            if(var2[1].equalsIgnoreCase("list")) {
               if(var2.length > 3) {
                  throw new ci("commands.scoreboard.players.list.usage", new Object[0]);
               }

               this.l(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("add")) {
               if(var2.length != 5) {
                  throw new ci("commands.scoreboard.players.add.usage", new Object[0]);
               }

               this.m(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("remove")) {
               if(var2.length != 5) {
                  throw new ci("commands.scoreboard.players.remove.usage", new Object[0]);
               }

               this.m(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("set")) {
               if(var2.length != 5) {
                  throw new ci("commands.scoreboard.players.set.usage", new Object[0]);
               }

               this.m(var1, var2, 2);
            } else {
               if(!var2[1].equalsIgnoreCase("reset")) {
                  throw new ci("commands.scoreboard.players.usage", new Object[0]);
               }

               if(var2.length != 3) {
                  throw new ci("commands.scoreboard.players.reset.usage", new Object[0]);
               }

               this.n(var1, var2, 2);
            }

            return;
         }

         if(var2[0].equalsIgnoreCase("teams")) {
            if(var2.length == 1) {
               throw new ci("commands.scoreboard.teams.usage", new Object[0]);
            }

            if(var2[1].equalsIgnoreCase("list")) {
               if(var2.length > 3) {
                  throw new ci("commands.scoreboard.teams.list.usage", new Object[0]);
               }

               this.g(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("add")) {
               if(var2.length < 3) {
                  throw new ci("commands.scoreboard.teams.add.usage", new Object[0]);
               }

               this.d(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("remove")) {
               if(var2.length != 3) {
                  throw new ci("commands.scoreboard.teams.remove.usage", new Object[0]);
               }

               this.f(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("empty")) {
               if(var2.length != 3) {
                  throw new ci("commands.scoreboard.teams.empty.usage", new Object[0]);
               }

               this.j(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("join")) {
               if(var2.length < 4 && (var2.length != 3 || !(var1 instanceof yz))) {
                  throw new ci("commands.scoreboard.teams.join.usage", new Object[0]);
               }

               this.h(var1, var2, 2);
            } else if(var2[1].equalsIgnoreCase("leave")) {
               if(var2.length < 3 && !(var1 instanceof yz)) {
                  throw new ci("commands.scoreboard.teams.leave.usage", new Object[0]);
               }

               this.i(var1, var2, 2);
            } else {
               if(!var2[1].equalsIgnoreCase("option")) {
                  throw new ci("commands.scoreboard.teams.usage", new Object[0]);
               }

               if(var2.length != 4 && var2.length != 5) {
                  throw new ci("commands.scoreboard.teams.option.usage", new Object[0]);
               }

               this.e(var1, var2, 2);
            }

            return;
         }
      }

      throw new ci("commands.scoreboard.usage", new Object[0]);
   }

   protected bac d() {
      return MinecraftServer.I().a(0).W();
   }

   protected azx a(String var1, boolean var2) {
      bac var3 = this.d();
      azx var4 = var3.b(var1);
      if(var4 == null) {
         throw new cd("commands.scoreboard.objectiveNotFound", new Object[]{var1});
      } else if(var2 && var4.c().b()) {
         throw new cd("commands.scoreboard.objectiveReadOnly", new Object[]{var1});
      } else {
         return var4;
      }
   }

   protected azy a(String var1) {
      bac var2 = this.d();
      azy var3 = var2.e(var1);
      if(var3 == null) {
         throw new cd("commands.scoreboard.teamNotFound", new Object[]{var1});
      } else {
         return var3;
      }
   }

   protected void c(ac var1, String[] var2, int var3) {
      String var4 = var2[var3++];
      String var5 = var2[var3++];
      bac var6 = this.d();
      bah var7 = (bah)bah.a.get(var5);
      if(var7 == null) {
         throw new ci("commands.scoreboard.objectives.add.wrongType", new Object[]{var5});
      } else if(var6.b(var4) != null) {
         throw new cd("commands.scoreboard.objectives.add.alreadyExists", new Object[]{var4});
      } else if(var4.length() > 16) {
         throw new cf("commands.scoreboard.objectives.add.tooLong", new Object[]{var4, Integer.valueOf(16)});
      } else if(var4.length() == 0) {
         throw new ci("commands.scoreboard.objectives.add.usage", new Object[0]);
      } else {
         if(var2.length > var3) {
            String var8 = a(var1, var2, var3).c();
            if(var8.length() > 32) {
               throw new cf("commands.scoreboard.objectives.add.displayTooLong", new Object[]{var8, Integer.valueOf(32)});
            }

            if(var8.length() > 0) {
               var6.a(var4, var7).a(var8);
            } else {
               var6.a(var4, var7);
            }
         } else {
            var6.a(var4, var7);
         }

         a(var1, this, "commands.scoreboard.objectives.add.success", new Object[]{var4});
      }
   }

   protected void d(ac var1, String[] var2, int var3) {
      String var4 = var2[var3++];
      bac var5 = this.d();
      if(var5.e(var4) != null) {
         throw new cd("commands.scoreboard.teams.add.alreadyExists", new Object[]{var4});
      } else if(var4.length() > 16) {
         throw new cf("commands.scoreboard.teams.add.tooLong", new Object[]{var4, Integer.valueOf(16)});
      } else if(var4.length() == 0) {
         throw new ci("commands.scoreboard.teams.add.usage", new Object[0]);
      } else {
         if(var2.length > var3) {
            String var6 = a(var1, var2, var3).c();
            if(var6.length() > 32) {
               throw new cf("commands.scoreboard.teams.add.displayTooLong", new Object[]{var6, Integer.valueOf(32)});
            }

            if(var6.length() > 0) {
               var5.f(var4).a(var6);
            } else {
               var5.f(var4);
            }
         } else {
            var5.f(var4);
         }

         a(var1, this, "commands.scoreboard.teams.add.success", new Object[]{var4});
      }
   }

   protected void e(ac var1, String[] var2, int var3) {
      azy var4 = this.a(var2[var3++]);
      if(var4 != null) {
         String var5 = var2[var3++].toLowerCase();
         if(!var5.equalsIgnoreCase("color") && !var5.equalsIgnoreCase("friendlyfire") && !var5.equalsIgnoreCase("seeFriendlyInvisibles")) {
            throw new ci("commands.scoreboard.teams.option.usage", new Object[0]);
         } else if(var2.length == 4) {
            if(var5.equalsIgnoreCase("color")) {
               throw new ci("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(a.a(true, false))});
            } else if(!var5.equalsIgnoreCase("friendlyfire") && !var5.equalsIgnoreCase("seeFriendlyInvisibles")) {
               throw new ci("commands.scoreboard.teams.option.usage", new Object[0]);
            } else {
               throw new ci("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(Arrays.asList(new String[]{"true", "false"}))});
            }
         } else {
            String var6 = var2[var3++];
            if(var5.equalsIgnoreCase("color")) {
               a var7 = a.b(var6);
               if(var7 == null || var7.b()) {
                  throw new ci("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(a.a(true, false))});
               }

               var4.b(var7.toString());
               var4.c(a.v.toString());
            } else if(var5.equalsIgnoreCase("friendlyfire")) {
               if(!var6.equalsIgnoreCase("true") && !var6.equalsIgnoreCase("false")) {
                  throw new ci("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(Arrays.asList(new String[]{"true", "false"}))});
               }

               var4.a(var6.equalsIgnoreCase("true"));
            } else if(var5.equalsIgnoreCase("seeFriendlyInvisibles")) {
               if(!var6.equalsIgnoreCase("true") && !var6.equalsIgnoreCase("false")) {
                  throw new ci("commands.scoreboard.teams.option.noValue", new Object[]{var5, a(Arrays.asList(new String[]{"true", "false"}))});
               }

               var4.b(var6.equalsIgnoreCase("true"));
            }

            a(var1, this, "commands.scoreboard.teams.option.success", new Object[]{var5, var4.b(), var6});
         }
      }
   }

   protected void f(ac var1, String[] var2, int var3) {
      bac var4 = this.d();
      azy var5 = this.a(var2[var3++]);
      if(var5 != null) {
         var4.d(var5);
         a(var1, this, "commands.scoreboard.teams.remove.success", new Object[]{var5.b()});
      }
   }

   protected void g(ac var1, String[] var2, int var3) {
      bac var4 = this.d();
      if(var2.length > var3) {
         azy var5 = this.a(var2[var3++]);
         if(var5 == null) {
            return;
         }

         Collection var6 = var5.d();
         if(var6.size() <= 0) {
            throw new cd("commands.scoreboard.teams.list.player.empty", new Object[]{var5.b()});
         }

         fr var7 = new fr("commands.scoreboard.teams.list.player.count", new Object[]{Integer.valueOf(var6.size()), var5.b()});
         var7.b().a(a.c);
         var1.a(var7);
         var1.a(new fq(a(var6.toArray())));
      } else {
         Collection var9 = var4.g();
         if(var9.size() <= 0) {
            throw new cd("commands.scoreboard.teams.list.empty", new Object[0]);
         }

         fr var10 = new fr("commands.scoreboard.teams.list.count", new Object[]{Integer.valueOf(var9.size())});
         var10.b().a(a.c);
         var1.a(var10);
         Iterator var11 = var9.iterator();

         while(var11.hasNext()) {
            azy var8 = (azy)var11.next();
            var1.a(new fr("commands.scoreboard.teams.list.entry", new Object[]{var8.b(), var8.c(), Integer.valueOf(var8.d().size())}));
         }
      }

   }

   protected void h(ac var1, String[] var2, int var3) {
      bac var4 = this.d();
      String var5 = var2[var3++];
      HashSet var6 = new HashSet();
      HashSet var7 = new HashSet();
      String var8;
      if(var1 instanceof yz && var3 == var2.length) {
         var8 = b(var1).b_();
         if(var4.a(var8, var5)) {
            var6.add(var8);
         } else {
            var7.add(var8);
         }
      } else {
         while(var3 < var2.length) {
            var8 = e(var1, var2[var3++]);
            if(var4.a(var8, var5)) {
               var6.add(var8);
            } else {
               var7.add(var8);
            }
         }
      }

      if(!var6.isEmpty()) {
         a(var1, this, "commands.scoreboard.teams.join.success", new Object[]{Integer.valueOf(var6.size()), var5, a(var6.toArray(new String[0]))});
      }

      if(!var7.isEmpty()) {
         throw new cd("commands.scoreboard.teams.join.failure", new Object[]{Integer.valueOf(var7.size()), var5, a(var7.toArray(new String[0]))});
      }
   }

   protected void i(ac var1, String[] var2, int var3) {
      bac var4 = this.d();
      HashSet var5 = new HashSet();
      HashSet var6 = new HashSet();
      String var7;
      if(var1 instanceof yz && var3 == var2.length) {
         var7 = b(var1).b_();
         if(var4.g(var7)) {
            var5.add(var7);
         } else {
            var6.add(var7);
         }
      } else {
         while(var3 < var2.length) {
            var7 = e(var1, var2[var3++]);
            if(var4.g(var7)) {
               var5.add(var7);
            } else {
               var6.add(var7);
            }
         }
      }

      if(!var5.isEmpty()) {
         a(var1, this, "commands.scoreboard.teams.leave.success", new Object[]{Integer.valueOf(var5.size()), a(var5.toArray(new String[0]))});
      }

      if(!var6.isEmpty()) {
         throw new cd("commands.scoreboard.teams.leave.failure", new Object[]{Integer.valueOf(var6.size()), a(var6.toArray(new String[0]))});
      }
   }

   protected void j(ac var1, String[] var2, int var3) {
      bac var4 = this.d();
      azy var5 = this.a(var2[var3++]);
      if(var5 != null) {
         ArrayList var6 = new ArrayList(var5.d());
         if(var6.isEmpty()) {
            throw new cd("commands.scoreboard.teams.empty.alreadyEmpty", new Object[]{var5.b()});
         } else {
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
               String var8 = (String)var7.next();
               var4.a(var8, var5);
            }

            a(var1, this, "commands.scoreboard.teams.empty.success", new Object[]{Integer.valueOf(var6.size()), var5.b()});
         }
      }
   }

   protected void h(ac var1, String var2) {
      bac var3 = this.d();
      azx var4 = this.a(var2, false);
      var3.k(var4);
      a(var1, this, "commands.scoreboard.objectives.remove.success", new Object[]{var2});
   }

   protected void d(ac var1) {
      bac var2 = this.d();
      Collection var3 = var2.c();
      if(var3.size() <= 0) {
         throw new cd("commands.scoreboard.objectives.list.empty", new Object[0]);
      } else {
         fr var4 = new fr("commands.scoreboard.objectives.list.count", new Object[]{Integer.valueOf(var3.size())});
         var4.b().a(a.c);
         var1.a(var4);
         Iterator var5 = var3.iterator();

         while(var5.hasNext()) {
            azx var6 = (azx)var5.next();
            var1.a(new fr("commands.scoreboard.objectives.list.entry", new Object[]{var6.b(), var6.d(), var6.c().a()}));
         }

      }
   }

   protected void k(ac var1, String[] var2, int var3) {
      bac var4 = this.d();
      String var5 = var2[var3++];
      int var6 = bac.j(var5);
      azx var7 = null;
      if(var2.length == 4) {
         var7 = this.a(var2[var3++], false);
      }

      if(var6 < 0) {
         throw new cd("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[]{var5});
      } else {
         var4.a(var6, var7);
         if(var7 != null) {
            a(var1, this, "commands.scoreboard.objectives.setdisplay.successSet", new Object[]{bac.b(var6), var7.b()});
         } else {
            a(var1, this, "commands.scoreboard.objectives.setdisplay.successCleared", new Object[]{bac.b(var6)});
         }

      }
   }

   protected void l(ac var1, String[] var2, int var3) {
      bac var4 = this.d();
      if(var2.length > var3) {
         String var5 = e(var1, var2[var3++]);
         Map var6 = var4.d(var5);
         if(var6.size() <= 0) {
            throw new cd("commands.scoreboard.players.list.player.empty", new Object[]{var5});
         }

         fr var7 = new fr("commands.scoreboard.players.list.player.count", new Object[]{Integer.valueOf(var6.size()), var5});
         var7.b().a(a.c);
         var1.a(var7);
         Iterator var8 = var6.values().iterator();

         while(var8.hasNext()) {
            azz var9 = (azz)var8.next();
            var1.a(new fr("commands.scoreboard.players.list.player.entry", new Object[]{Integer.valueOf(var9.c()), var9.d().d(), var9.d().b()}));
         }
      } else {
         Collection var10 = var4.d();
         if(var10.size() <= 0) {
            throw new cd("commands.scoreboard.players.list.empty", new Object[0]);
         }

         fr var11 = new fr("commands.scoreboard.players.list.count", new Object[]{Integer.valueOf(var10.size())});
         var11.b().a(a.c);
         var1.a(var11);
         var1.a(new fq(a(var10.toArray())));
      }

   }

   protected void m(ac var1, String[] var2, int var3) {
      String var4 = var2[var3 - 1];
      String var5 = e(var1, var2[var3++]);
      azx var6 = this.a(var2[var3++], true);
      int var7 = var4.equalsIgnoreCase("set")?a(var1, var2[var3++]):a(var1, var2[var3++], 1);
      bac var8 = this.d();
      azz var9 = var8.a(var5, var6);
      if(var4.equalsIgnoreCase("set")) {
         var9.c(var7);
      } else if(var4.equalsIgnoreCase("add")) {
         var9.a(var7);
      } else {
         var9.b(var7);
      }

      a(var1, this, "commands.scoreboard.players.set.success", new Object[]{var6.b(), var5, Integer.valueOf(var9.c())});
   }

   protected void n(ac var1, String[] var2, int var3) {
      bac var4 = this.d();
      String var5 = e(var1, var2[var3++]);
      var4.c(var5);
      a(var1, this, "commands.scoreboard.players.reset.success", new Object[]{var5});
   }

   public List a(ac var1, String[] var2) {
      if(var2.length == 1) {
         return a(var2, new String[]{"objectives", "players", "teams"});
      } else {
         if(var2[0].equalsIgnoreCase("objectives")) {
            if(var2.length == 2) {
               return a(var2, new String[]{"list", "add", "remove", "setdisplay"});
            }

            if(var2[1].equalsIgnoreCase("add")) {
               if(var2.length == 4) {
                  Set var3 = bah.a.keySet();
                  return a(var2, var3);
               }
            } else if(var2[1].equalsIgnoreCase("remove")) {
               if(var2.length == 3) {
                  return a(var2, this.a(false));
               }
            } else if(var2[1].equalsIgnoreCase("setdisplay")) {
               if(var2.length == 3) {
                  return a(var2, new String[]{"list", "sidebar", "belowName"});
               }

               if(var2.length == 4) {
                  return a(var2, this.a(false));
               }
            }
         } else if(var2[0].equalsIgnoreCase("players")) {
            if(var2.length == 2) {
               return a(var2, new String[]{"set", "add", "remove", "reset", "list"});
            }

            if(!var2[1].equalsIgnoreCase("set") && !var2[1].equalsIgnoreCase("add") && !var2[1].equalsIgnoreCase("remove")) {
               if((var2[1].equalsIgnoreCase("reset") || var2[1].equalsIgnoreCase("list")) && var2.length == 3) {
                  return a(var2, this.d().d());
               }
            } else {
               if(var2.length == 3) {
                  return a(var2, MinecraftServer.I().E());
               }

               if(var2.length == 4) {
                  return a(var2, this.a(true));
               }
            }
         } else if(var2[0].equalsIgnoreCase("teams")) {
            if(var2.length == 2) {
               return a(var2, new String[]{"add", "remove", "join", "leave", "empty", "list", "option"});
            }

            if(var2[1].equalsIgnoreCase("join")) {
               if(var2.length == 3) {
                  return a(var2, this.d().f());
               }

               if(var2.length >= 4) {
                  return a(var2, MinecraftServer.I().E());
               }
            } else {
               if(var2[1].equalsIgnoreCase("leave")) {
                  return a(var2, MinecraftServer.I().E());
               }

               if(!var2[1].equalsIgnoreCase("empty") && !var2[1].equalsIgnoreCase("list") && !var2[1].equalsIgnoreCase("remove")) {
                  if(var2[1].equalsIgnoreCase("option")) {
                     if(var2.length == 3) {
                        return a(var2, this.d().f());
                     }

                     if(var2.length == 4) {
                        return a(var2, new String[]{"color", "friendlyfire", "seeFriendlyInvisibles"});
                     }

                     if(var2.length == 5) {
                        if(var2[3].equalsIgnoreCase("color")) {
                           return a(var2, a.a(true, false));
                        }

                        if(var2[3].equalsIgnoreCase("friendlyfire") || var2[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                           return a(var2, new String[]{"true", "false"});
                        }
                     }
                  }
               } else if(var2.length == 3) {
                  return a(var2, this.d().f());
               }
            }
         }

         return null;
      }
   }

   protected List a(boolean var1) {
      Collection var2 = this.d().c();
      ArrayList var3 = new ArrayList();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         azx var5 = (azx)var4.next();
         if(!var1 || !var5.c().b()) {
            var3.add(var5.b());
         }
      }

      return var3;
   }

   public boolean a(String[] var1, int var2) {
      return var1[0].equalsIgnoreCase("players")?var2 == 2:(!var1[0].equalsIgnoreCase("teams")?false:var2 == 2 || var2 == 3);
   }
}
