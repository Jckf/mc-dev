import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class avk {

   protected asv f;
   protected int g;
   protected int h;


   public avk() {}

   protected avk(int var1) {
      this.h = var1;
      this.g = -1;
   }

   public dh b() {
      dh var1 = new dh();
      var1.a("id", avi.a(this));
      var1.a("BB", (dy)this.f.h());
      var1.a("O", this.g);
      var1.a("GD", this.h);
      this.a(var1);
      return var1;
   }

   protected abstract void a(dh var1);

   public void a(ahb var1, dh var2) {
      if(var2.c("BB")) {
         this.f = new asv(var2.l("BB"));
      }

      this.g = var2.f("O");
      this.h = var2.f("GD");
      this.b(var2);
   }

   protected abstract void b(dh var1);

   public void a(avk var1, List var2, Random var3) {}

   public abstract boolean a(ahb var1, Random var2, asv var3);

   public asv c() {
      return this.f;
   }

   public int d() {
      return this.h;
   }

   public static avk a(List var0, asv var1) {
      Iterator var2 = var0.iterator();

      avk var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (avk)var2.next();
      } while(var3.c() == null || !var3.c().a(var1));

      return var3;
   }

   public agt a() {
      return new agt(this.f.e(), this.f.f(), this.f.g());
   }

   protected boolean a(ahb var1, asv var2) {
      int var3 = Math.max(this.f.a - 1, var2.a);
      int var4 = Math.max(this.f.b - 1, var2.b);
      int var5 = Math.max(this.f.c - 1, var2.c);
      int var6 = Math.min(this.f.d + 1, var2.d);
      int var7 = Math.min(this.f.e + 1, var2.e);
      int var8 = Math.min(this.f.f + 1, var2.f);

      int var9;
      int var10;
      for(var9 = var3; var9 <= var6; ++var9) {
         for(var10 = var5; var10 <= var8; ++var10) {
            if(var1.a(var9, var4, var10).o().d()) {
               return true;
            }

            if(var1.a(var9, var7, var10).o().d()) {
               return true;
            }
         }
      }

      for(var9 = var3; var9 <= var6; ++var9) {
         for(var10 = var4; var10 <= var7; ++var10) {
            if(var1.a(var9, var10, var5).o().d()) {
               return true;
            }

            if(var1.a(var9, var10, var8).o().d()) {
               return true;
            }
         }
      }

      for(var9 = var5; var9 <= var8; ++var9) {
         for(var10 = var4; var10 <= var7; ++var10) {
            if(var1.a(var3, var10, var9).o().d()) {
               return true;
            }

            if(var1.a(var6, var10, var9).o().d()) {
               return true;
            }
         }
      }

      return false;
   }

   protected int a(int var1, int var2) {
      switch(this.g) {
      case 0:
      case 2:
         return this.f.a + var1;
      case 1:
         return this.f.d - var2;
      case 3:
         return this.f.a + var2;
      default:
         return var1;
      }
   }

   protected int a(int var1) {
      return this.g == -1?var1:var1 + this.f.b;
   }

   protected int b(int var1, int var2) {
      switch(this.g) {
      case 0:
         return this.f.c + var2;
      case 1:
      case 3:
         return this.f.c + var1;
      case 2:
         return this.f.f - var2;
      default:
         return var2;
      }
   }

   protected int a(aji var1, int var2) {
      if(var1 == ajn.aq) {
         if(this.g == 1 || this.g == 3) {
            if(var2 == 1) {
               return 0;
            }

            return 1;
         }
      } else if(var1 != ajn.ao && var1 != ajn.av) {
         if(var1 != ajn.ar && var1 != ajn.ad && var1 != ajn.bl && var1 != ajn.bg && var1 != ajn.bz) {
            if(var1 == ajn.ap) {
               if(this.g == 0) {
                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 3) {
                     return 2;
                  }
               } else if(this.g == 1) {
                  if(var2 == 2) {
                     return 4;
                  }

                  if(var2 == 3) {
                     return 5;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 5) {
                     return 3;
                  }
               } else if(this.g == 3) {
                  if(var2 == 2) {
                     return 5;
                  }

                  if(var2 == 3) {
                     return 4;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 5) {
                     return 3;
                  }
               }
            } else if(var1 == ajn.aB) {
               if(this.g == 0) {
                  if(var2 == 3) {
                     return 4;
                  }

                  if(var2 == 4) {
                     return 3;
                  }
               } else if(this.g == 1) {
                  if(var2 == 3) {
                     return 1;
                  }

                  if(var2 == 4) {
                     return 2;
                  }

                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 1) {
                     return 4;
                  }
               } else if(this.g == 3) {
                  if(var2 == 3) {
                     return 2;
                  }

                  if(var2 == 4) {
                     return 1;
                  }

                  if(var2 == 2) {
                     return 3;
                  }

                  if(var2 == 1) {
                     return 4;
                  }
               }
            } else if(var1 != ajn.bC && !(var1 instanceof akk)) {
               if(var1 == ajn.J || var1 == ajn.F || var1 == ajn.at || var1 == ajn.z) {
                  if(this.g == 0) {
                     if(var2 == 2 || var2 == 3) {
                        return q.a[var2];
                     }
                  } else if(this.g == 1) {
                     if(var2 == 2) {
                        return 4;
                     }

                     if(var2 == 3) {
                        return 5;
                     }

                     if(var2 == 4) {
                        return 2;
                     }

                     if(var2 == 5) {
                        return 3;
                     }
                  } else if(this.g == 3) {
                     if(var2 == 2) {
                        return 5;
                     }

                     if(var2 == 3) {
                        return 4;
                     }

                     if(var2 == 4) {
                        return 2;
                     }

                     if(var2 == 5) {
                        return 3;
                     }
                  }
               }
            } else if(this.g == 0) {
               if(var2 == 0 || var2 == 2) {
                  return p.f[var2];
               }
            } else if(this.g == 1) {
               if(var2 == 2) {
                  return 1;
               }

               if(var2 == 0) {
                  return 3;
               }

               if(var2 == 1) {
                  return 2;
               }

               if(var2 == 3) {
                  return 0;
               }
            } else if(this.g == 3) {
               if(var2 == 2) {
                  return 3;
               }

               if(var2 == 0) {
                  return 1;
               }

               if(var2 == 1) {
                  return 2;
               }

               if(var2 == 3) {
                  return 0;
               }
            }
         } else if(this.g == 0) {
            if(var2 == 2) {
               return 3;
            }

            if(var2 == 3) {
               return 2;
            }
         } else if(this.g == 1) {
            if(var2 == 0) {
               return 2;
            }

            if(var2 == 1) {
               return 3;
            }

            if(var2 == 2) {
               return 0;
            }

            if(var2 == 3) {
               return 1;
            }
         } else if(this.g == 3) {
            if(var2 == 0) {
               return 2;
            }

            if(var2 == 1) {
               return 3;
            }

            if(var2 == 2) {
               return 1;
            }

            if(var2 == 3) {
               return 0;
            }
         }
      } else if(this.g == 0) {
         if(var2 == 0) {
            return 2;
         }

         if(var2 == 2) {
            return 0;
         }
      } else {
         if(this.g == 1) {
            return var2 + 1 & 3;
         }

         if(this.g == 3) {
            return var2 + 3 & 3;
         }
      }

      return var2;
   }

   protected void a(ahb var1, aji var2, int var3, int var4, int var5, int var6, asv var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.a(var5);
      int var10 = this.b(var4, var6);
      if(var7.b(var8, var9, var10)) {
         var1.d(var8, var9, var10, var2, var3, 2);
      }
   }

   protected aji a(ahb var1, int var2, int var3, int var4, asv var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.a(var3);
      int var8 = this.b(var2, var4);
      return !var5.b(var6, var7, var8)?ajn.a:var1.a(var6, var7, var8);
   }

   protected void a(ahb var1, asv var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = var4; var9 <= var7; ++var9) {
         for(int var10 = var3; var10 <= var6; ++var10) {
            for(int var11 = var5; var11 <= var8; ++var11) {
               this.a(var1, ajn.a, 0, var10, var9, var11, var2);
            }
         }
      }

   }

   protected void a(ahb var1, asv var2, int var3, int var4, int var5, int var6, int var7, int var8, aji var9, aji var10, boolean var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(!var11 || this.a(var1, var13, var12, var14, var2).o() != awt.a) {
                  if(var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.a(var1, var10, 0, var13, var12, var14, var2);
                  } else {
                     this.a(var1, var9, 0, var13, var12, var14, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(ahb var1, asv var2, int var3, int var4, int var5, int var6, int var7, int var8, aji var9, int var10, aji var11, int var12, boolean var13) {
      for(int var14 = var4; var14 <= var7; ++var14) {
         for(int var15 = var3; var15 <= var6; ++var15) {
            for(int var16 = var5; var16 <= var8; ++var16) {
               if(!var13 || this.a(var1, var15, var14, var16, var2).o() != awt.a) {
                  if(var14 != var4 && var14 != var7 && var15 != var3 && var15 != var6 && var16 != var5 && var16 != var8) {
                     this.a(var1, var11, var12, var15, var14, var16, var2);
                  } else {
                     this.a(var1, var9, var10, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(ahb var1, asv var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, avl var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(!var9 || this.a(var1, var13, var12, var14, var2).o() != awt.a) {
                  var11.a(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.a(var1, var11.a(), var11.b(), var13, var12, var14, var2);
               }
            }
         }
      }

   }

   protected void a(ahb var1, asv var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, aji var11, aji var12, boolean var13) {
      for(int var14 = var6; var14 <= var9; ++var14) {
         for(int var15 = var5; var15 <= var8; ++var15) {
            for(int var16 = var7; var16 <= var10; ++var16) {
               if(var3.nextFloat() <= var4 && (!var13 || this.a(var1, var15, var14, var16, var2).o() != awt.a)) {
                  if(var14 != var6 && var14 != var9 && var15 != var5 && var15 != var8 && var16 != var7 && var16 != var10) {
                     this.a(var1, var12, 0, var15, var14, var16, var2);
                  } else {
                     this.a(var1, var11, 0, var15, var14, var16, var2);
                  }
               }
            }
         }
      }

   }

   protected void a(ahb var1, asv var2, Random var3, float var4, int var5, int var6, int var7, aji var8, int var9) {
      if(var3.nextFloat() < var4) {
         this.a(var1, var8, var9, var5, var6, var7, var2);
      }

   }

   protected void a(ahb var1, asv var2, int var3, int var4, int var5, int var6, int var7, int var8, aji var9, boolean var10) {
      float var11 = (float)(var6 - var3 + 1);
      float var12 = (float)(var7 - var4 + 1);
      float var13 = (float)(var8 - var5 + 1);
      float var14 = (float)var3 + var11 / 2.0F;
      float var15 = (float)var5 + var13 / 2.0F;

      for(int var16 = var4; var16 <= var7; ++var16) {
         float var17 = (float)(var16 - var4) / var12;

         for(int var18 = var3; var18 <= var6; ++var18) {
            float var19 = ((float)var18 - var14) / (var11 * 0.5F);

            for(int var20 = var5; var20 <= var8; ++var20) {
               float var21 = ((float)var20 - var15) / (var13 * 0.5F);
               if(!var10 || this.a(var1, var18, var16, var20, var2).o() != awt.a) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if(var22 <= 1.05F) {
                     this.a(var1, var9, 0, var18, var16, var20, var2);
                  }
               }
            }
         }
      }

   }

   protected void b(ahb var1, int var2, int var3, int var4, asv var5) {
      int var6 = this.a(var2, var4);
      int var7 = this.a(var3);
      int var8 = this.b(var2, var4);
      if(var5.b(var6, var7, var8)) {
         while(!var1.c(var6, var7, var8) && var7 < 255) {
            var1.d(var6, var7, var8, ajn.a, 0, 2);
            ++var7;
         }

      }
   }

   protected void b(ahb var1, aji var2, int var3, int var4, int var5, int var6, asv var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.a(var5);
      int var10 = this.b(var4, var6);
      if(var7.b(var8, var9, var10)) {
         while((var1.c(var8, var9, var10) || var1.a(var8, var9, var10).o().d()) && var9 > 1) {
            var1.d(var8, var9, var10, var2, var3, 2);
            --var9;
         }

      }
   }

   protected boolean a(ahb var1, asv var2, Random var3, int var4, int var5, int var6, qx[] var7, int var8) {
      int var9 = this.a(var4, var6);
      int var10 = this.a(var5);
      int var11 = this.b(var4, var6);
      if(var2.b(var9, var10, var11) && var1.a(var9, var10, var11) != ajn.ae) {
         var1.d(var9, var10, var11, ajn.ae, 0, 2);
         aow var12 = (aow)var1.o(var9, var10, var11);
         if(var12 != null) {
            qx.a(var3, var7, (rb)var12, var8);
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(ahb var1, asv var2, Random var3, int var4, int var5, int var6, int var7, qx[] var8, int var9) {
      int var10 = this.a(var4, var6);
      int var11 = this.a(var5);
      int var12 = this.b(var4, var6);
      if(var2.b(var10, var11, var12) && var1.a(var10, var11, var12) != ajn.z) {
         var1.d(var10, var11, var12, ajn.z, this.a(ajn.z, var7), 2);
         apb var13 = (apb)var1.o(var10, var11, var12);
         if(var13 != null) {
            qx.a(var3, var8, var13, var9);
         }

         return true;
      } else {
         return false;
      }
   }

   protected void a(ahb var1, asv var2, Random var3, int var4, int var5, int var6, int var7) {
      int var8 = this.a(var4, var6);
      int var9 = this.a(var5);
      int var10 = this.b(var4, var6);
      if(var2.b(var8, var9, var10)) {
         ach.a(var1, var8, var9, var10, var7, ajn.ao);
      }

   }
}
