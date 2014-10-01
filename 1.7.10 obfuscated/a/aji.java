import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class aji {

   public static final cw c = new cn("air");
   private abt a;
   protected String d;
   public static final ajm e = new ajm("stone", 1.0F, 1.0F);
   public static final ajm f = new ajm("wood", 1.0F, 1.0F);
   public static final ajm g = new ajm("gravel", 1.0F, 1.0F);
   public static final ajm h = new ajm("grass", 1.0F, 1.0F);
   public static final ajm i = new ajm("stone", 1.0F, 1.0F);
   public static final ajm j = new ajm("stone", 1.0F, 1.5F);
   public static final ajm k = new ajj("stone", 1.0F, 1.0F);
   public static final ajm l = new ajm("cloth", 1.0F, 1.0F);
   public static final ajm m = new ajm("sand", 1.0F, 1.0F);
   public static final ajm n = new ajm("snow", 1.0F, 1.0F);
   public static final ajm o = new ajk("ladder", 1.0F, 1.0F);
   public static final ajm p = new ajl("anvil", 0.3F, 1.0F);
   protected boolean q;
   protected int r;
   protected boolean s;
   protected int t;
   protected boolean u;
   protected float v;
   protected float w;
   protected boolean x = true;
   protected boolean y = true;
   protected boolean z;
   protected boolean A;
   protected double B;
   protected double C;
   protected double D;
   protected double E;
   protected double F;
   protected double G;
   public ajm H;
   public float I;
   protected final awt J;
   public float K;
   private String b;


   public static int b(aji var0) {
      return c.b((Object)var0);
   }

   public static aji e(int var0) {
      return (aji)c.a(var0);
   }

   public static aji a(adb var0) {
      return e(adb.b(var0));
   }

   public static aji b(String var0) {
      if(c.b(var0)) {
         return (aji)c.a(var0);
      } else {
         try {
            return (aji)c.a(Integer.parseInt(var0));
         } catch (NumberFormatException var2) {
            return null;
         }
      }
   }

   public boolean j() {
      return this.q;
   }

   public int k() {
      return this.r;
   }

   public int m() {
      return this.t;
   }

   public boolean n() {
      return this.u;
   }

   public awt o() {
      return this.J;
   }

   public awv f(int var1) {
      return this.o().r();
   }

   public static void p() {
      c.a(0, "air", (new aja()).c("air"));
      c.a(1, "stone", (new anv()).c(1.5F).b(10.0F).a(i).c("stone").d("stone"));
      c.a(2, "grass", (new alh()).c(0.6F).a(h).c("grass").d("grass"));
      c.a(3, "dirt", (new akl()).c(0.5F).a(g).c("dirt").d("dirt"));
      aji var0 = (new aji(awt.e)).c(2.0F).b(10.0F).a(i).c("stonebrick").a(abt.b).d("cobblestone");
      c.a(4, "cobblestone", var0);
      aji var1 = (new aom()).c(2.0F).b(5.0F).a(f).c("wood").d("planks");
      c.a(5, "planks", var1);
      c.a(6, "sapling", (new anj()).c(0.0F).a(h).c("sapling").d("sapling"));
      c.a(7, "bedrock", (new aji(awt.e)).s().b(6000000.0F).a(i).c("bedrock").H().a(abt.b).d("bedrock"));
      c.a(8, "flowing_water", (new akr(awt.h)).c(100.0F).g(3).c("water").H().d("water_flow"));
      c.a(9, "water", (new ant(awt.h)).c(100.0F).g(3).c("water").H().d("water_still"));
      c.a(10, "flowing_lava", (new akr(awt.i)).c(100.0F).a(1.0F).c("lava").H().d("lava_flow"));
      c.a(11, "lava", (new ant(awt.i)).c(100.0F).a(1.0F).c("lava").H().d("lava_still"));
      c.a(12, "sand", (new anh()).c(0.5F).a(m).c("sand").d("sand"));
      c.a(13, "gravel", (new ali()).c(0.6F).a(g).c("gravel").d("gravel"));
      c.a(14, "gold_ore", (new amn()).c(3.0F).b(5.0F).a(i).c("oreGold").d("gold_ore"));
      c.a(15, "iron_ore", (new amn()).c(3.0F).b(5.0F).a(i).c("oreIron").d("iron_ore"));
      c.a(16, "coal_ore", (new amn()).c(3.0F).b(5.0F).a(i).c("oreCoal").d("coal_ore"));
      c.a(17, "log", (new amm()).c("log").d("log"));
      c.a(18, "leaves", (new aml()).c("leaves").d("leaves"));
      c.a(19, "sponge", (new anp()).c(0.6F).a(h).c("sponge").d("sponge"));
      c.a(20, "glass", (new alf(awt.s, false)).c(0.3F).a(k).c("glass").d("glass"));
      c.a(21, "lapis_ore", (new amn()).c(3.0F).b(5.0F).a(i).c("oreLapis").d("lapis_ore"));
      c.a(22, "lapis_block", (new alz(awv.H)).c(3.0F).b(5.0F).a(i).c("blockLapis").a(abt.b).d("lapis_block"));
      c.a(23, "dispenser", (new akm()).c(3.5F).a(i).c("dispenser").d("dispenser"));
      aji var2 = (new ani()).a(i).c(0.8F).c("sandStone").d("sandstone");
      c.a(24, "sandstone", var2);
      c.a(25, "noteblock", (new amj()).c(0.8F).c("musicBlock").d("noteblock"));
      c.a(26, "bed", (new ajh()).c(0.2F).c("bed").H().d("bed"));
      c.a(27, "golden_rail", (new amt()).c(0.7F).a(j).c("goldenRail").d("rail_golden"));
      c.a(28, "detector_rail", (new aki()).c(0.7F).a(j).c("detectorRail").d("rail_detector"));
      c.a(29, "sticky_piston", (new app(true)).c("pistonStickyBase"));
      c.a(30, "web", (new aok()).g(1).c(4.0F).c("web").d("web"));
      c.a(31, "tallgrass", (new anz()).c(0.0F).a(h).c("tallgrass"));
      c.a(32, "deadbush", (new akh()).c(0.0F).a(h).c("deadbush").d("deadbush"));
      c.a(33, "piston", (new app(false)).c("pistonBase"));
      c.a(34, "piston_head", new apq());
      c.a(35, "wool", (new aka(awt.n)).c(0.8F).a(l).c("cloth").d("wool_colored"));
      c.a(36, "piston_extension", new apr());
      c.a(37, "yellow_flower", (new alc(0)).c(0.0F).a(h).c("flower1").d("flower_dandelion"));
      c.a(38, "red_flower", (new alc(1)).c(0.0F).a(h).c("flower2").d("flower_rose"));
      c.a(39, "brown_mushroom", (new amc()).c(0.0F).a(h).a(0.125F).c("mushroom").d("mushroom_brown"));
      c.a(40, "red_mushroom", (new amc()).c(0.0F).a(h).c("mushroom").d("mushroom_red"));
      c.a(41, "gold_block", (new alz(awv.F)).c(3.0F).b(10.0F).a(j).c("blockGold").d("gold_block"));
      c.a(42, "iron_block", (new alz(awv.h)).c(5.0F).b(10.0F).a(j).c("blockIron").d("iron_block"));
      c.a(43, "double_stone_slab", (new any(true)).c(2.0F).b(10.0F).a(i).c("stoneSlab"));
      c.a(44, "stone_slab", (new any(false)).c(2.0F).b(10.0F).a(i).c("stoneSlab"));
      aji var3 = (new aji(awt.e)).c(2.0F).b(10.0F).a(i).c("brick").a(abt.b).d("brick");
      c.a(45, "brick_block", var3);
      c.a(46, "tnt", (new aob()).c(0.0F).a(h).c("tnt").d("tnt"));
      c.a(47, "bookshelf", (new ajp()).c(1.5F).a(f).c("bookshelf").d("bookshelf"));
      c.a(48, "mossy_cobblestone", (new aji(awt.e)).c(2.0F).b(10.0F).a(i).c("stoneMoss").a(abt.b).d("cobblestone_mossy"));
      c.a(49, "obsidian", (new amk()).c(50.0F).b(2000.0F).a(i).c("obsidian").d("obsidian"));
      c.a(50, "torch", (new aoc()).c(0.0F).a(0.9375F).a(f).c("torch").d("torch_on"));
      c.a(51, "fire", (new alb()).c(0.0F).a(1.0F).a(f).c("fire").H().d("fire"));
      c.a(52, "mob_spawner", (new ama()).c(5.0F).a(j).c("mobSpawner").H().d("mob_spawner"));
      c.a(53, "oak_stairs", (new ans(var1, 0)).c("stairsWood"));
      c.a(54, "chest", (new ajx(0)).c(2.5F).a(f).c("chest"));
      c.a(55, "redstone_wire", (new ana()).c(0.0F).a(e).c("redstoneDust").H().d("redstone_dust"));
      c.a(56, "diamond_ore", (new amn()).c(3.0F).b(5.0F).a(i).c("oreDiamond").d("diamond_ore"));
      c.a(57, "diamond_block", (new alz(awv.G)).c(5.0F).b(10.0F).a(j).c("blockDiamond").d("diamond_block"));
      c.a(58, "crafting_table", (new ake()).c(2.5F).a(f).c("workbench").d("crafting_table"));
      c.a(59, "wheat", (new akf()).c("crops").d("wheat"));
      aji var4 = (new aky()).c(0.6F).a(g).c("farmland").d("farmland");
      c.a(60, "farmland", var4);
      c.a(61, "furnace", (new ale(false)).c(3.5F).a(i).c("furnace").a(abt.c));
      c.a(62, "lit_furnace", (new ale(true)).c(3.5F).a(i).a(0.875F).c("furnace"));
      c.a(63, "standing_sign", (new ank(apm.class, true)).c(1.0F).a(f).c("sign").H());
      c.a(64, "wooden_door", (new akn(awt.d)).c(3.0F).a(f).c("doorWood").H().d("door_wood"));
      c.a(65, "ladder", (new als()).c(0.4F).a(o).c("ladder").d("ladder"));
      c.a(66, "rail", (new amy()).c(0.7F).a(j).c("rail").d("rail_normal"));
      c.a(67, "stone_stairs", (new ans(var0, 0)).c("stairsStone"));
      c.a(68, "wall_sign", (new ank(apm.class, false)).c(1.0F).a(f).c("sign").H());
      c.a(69, "lever", (new alv()).c(0.5F).a(f).c("lever").d("lever"));
      c.a(70, "stone_pressure_plate", (new amu("stone", awt.e, amv.b)).c(0.5F).a(i).c("pressurePlate"));
      c.a(71, "iron_door", (new akn(awt.f)).c(5.0F).a(j).c("doorIron").H().d("door_iron"));
      c.a(72, "wooden_pressure_plate", (new amu("planks_oak", awt.d, amv.a)).c(0.5F).a(f).c("pressurePlate"));
      c.a(73, "redstone_ore", (new amz(false)).c(3.0F).b(5.0F).a(i).c("oreRedstone").a(abt.b).d("redstone_ore"));
      c.a(74, "lit_redstone_ore", (new amz(true)).a(0.625F).c(3.0F).b(5.0F).a(i).c("oreRedstone").d("redstone_ore"));
      c.a(75, "unlit_redstone_torch", (new anc(false)).c(0.0F).a(f).c("notGate").d("redstone_torch_off"));
      c.a(76, "redstone_torch", (new anc(true)).c(0.0F).a(0.5F).a(f).c("notGate").a(abt.d).d("redstone_torch_on"));
      c.a(77, "stone_button", (new anx()).c(0.5F).a(i).c("button"));
      c.a(78, "snow_layer", (new ann()).c(0.1F).a(n).c("snow").g(0).d("snow"));
      c.a(79, "ice", (new alp()).c(0.5F).g(3).a(k).c("ice").d("ice"));
      c.a(80, "snow", (new anm()).c(0.2F).a(n).c("snow").d("snow"));
      c.a(81, "cactus", (new ajt()).c(0.4F).a(l).c("cactus").d("cactus"));
      c.a(82, "clay", (new ajy()).c(0.6F).a(g).c("clay").d("clay"));
      c.a(83, "reeds", (new ane()).c(0.0F).a(h).c("reeds").H().d("reeds"));
      c.a(84, "jukebox", (new alq()).c(2.0F).b(10.0F).a(i).c("jukebox").d("jukebox"));
      c.a(85, "fence", (new akz("planks_oak", awt.d)).c(2.0F).b(5.0F).a(f).c("fence"));
      aji var5 = (new amw(false)).c(1.0F).a(f).c("pumpkin").d("pumpkin");
      c.a(86, "pumpkin", var5);
      c.a(87, "netherrack", (new amg()).c(0.4F).a(i).c("hellrock").d("netherrack"));
      c.a(88, "soul_sand", (new ano()).c(0.5F).a(m).c("hellsand").d("soul_sand"));
      c.a(89, "glowstone", (new alg(awt.s)).c(0.3F).a(k).a(1.0F).c("lightgem").d("glowstone"));
      c.a(90, "portal", (new amp()).c(-1.0F).a(k).a(0.75F).c("portal").d("portal"));
      c.a(91, "lit_pumpkin", (new amw(true)).c(1.0F).a(f).a(1.0F).c("litpumpkin").d("pumpkin"));
      c.a(92, "cake", (new aju()).c(0.5F).a(l).c("cake").H().d("cake"));
      c.a(93, "unpowered_repeater", (new anf(false)).c(0.0F).a(f).c("diode").H().d("repeater_off"));
      c.a(94, "powered_repeater", (new anf(true)).c(0.0F).a(0.625F).a(f).c("diode").H().d("repeater_on"));
      c.a(95, "stained_glass", (new anq(awt.s)).c(0.3F).a(k).c("stainedGlass").d("glass"));
      c.a(96, "trapdoor", (new aoe(awt.d)).c(3.0F).a(f).c("trapdoor").H().d("trapdoor"));
      c.a(97, "monster_egg", (new amb()).c(0.75F).c("monsterStoneEgg"));
      aji var6 = (new anw()).c(1.5F).b(10.0F).a(i).c("stonebricksmooth").d("stonebrick");
      c.a(98, "stonebrick", var6);
      c.a(99, "brown_mushroom_block", (new alo(awt.d, 0)).c(0.2F).a(f).c("mushroom").d("mushroom_block"));
      c.a(100, "red_mushroom_block", (new alo(awt.d, 1)).c(0.2F).a(f).c("mushroom").d("mushroom_block"));
      c.a(101, "iron_bars", (new aoa("iron_bars", "iron_bars", awt.f, true)).c(5.0F).b(10.0F).a(j).c("fenceIron"));
      c.a(102, "glass_pane", (new aoa("glass", "glass_pane_top", awt.s, false)).c(0.3F).a(k).c("thinGlass"));
      aji var7 = (new aly()).c(1.0F).a(f).c("melon").d("melon");
      c.a(103, "melon_block", var7);
      c.a(104, "pumpkin_stem", (new anu(var5)).c(0.0F).a(f).c("pumpkinStem").d("pumpkin_stem"));
      c.a(105, "melon_stem", (new anu(var7)).c(0.0F).a(f).c("pumpkinStem").d("melon_stem"));
      c.a(106, "vine", (new aoh()).c(0.2F).a(h).c("vine").d("vine"));
      c.a(107, "fence_gate", (new ala()).c(2.0F).b(5.0F).a(f).c("fenceGate"));
      c.a(108, "brick_stairs", (new ans(var3, 0)).c("stairsBrick"));
      c.a(109, "stone_brick_stairs", (new ans(var6, 0)).c("stairsStoneBrickSmooth"));
      c.a(110, "mycelium", (new amd()).c(0.6F).a(h).c("mycel").d("mycelium"));
      c.a(111, "waterlily", (new aoj()).c(0.0F).a(h).c("waterlily").d("waterlily"));
      aji var8 = (new aji(awt.e)).c(2.0F).b(10.0F).a(i).c("netherBrick").a(abt.b).d("nether_brick");
      c.a(112, "nether_brick", var8);
      c.a(113, "nether_brick_fence", (new akz("nether_brick", awt.e)).c(2.0F).b(10.0F).a(i).c("netherFence"));
      c.a(114, "nether_brick_stairs", (new ans(var8, 0)).c("stairsNetherBrick"));
      c.a(115, "nether_wart", (new amf()).c("netherStalk").d("nether_wart"));
      c.a(116, "enchanting_table", (new aks()).c(5.0F).b(2000.0F).c("enchantmentTable").d("enchanting_table"));
      c.a(117, "brewing_stand", (new ajq()).c(0.5F).a(0.125F).c("brewingStand").d("brewing_stand"));
      c.a(118, "cauldron", (new ajw()).c(2.0F).c("cauldron").d("cauldron"));
      c.a(119, "end_portal", (new akt(awt.E)).c(-1.0F).b(6000000.0F));
      c.a(120, "end_portal_frame", (new aku()).a(k).a(0.125F).c(-1.0F).c("endPortalFrame").b(6000000.0F).a(abt.c).d("endframe"));
      c.a(121, "end_stone", (new aji(awt.e)).c(3.0F).b(15.0F).a(i).c("whiteStone").a(abt.b).d("end_stone"));
      c.a(122, "dragon_egg", (new akp()).c(3.0F).b(15.0F).a(i).a(0.125F).c("dragonEgg").d("dragon_egg"));
      c.a(123, "redstone_lamp", (new anb(false)).c(0.3F).a(k).c("redstoneLight").a(abt.d).d("redstone_lamp_off"));
      c.a(124, "lit_redstone_lamp", (new anb(true)).c(0.3F).a(k).c("redstoneLight").d("redstone_lamp_on"));
      c.a(125, "double_wooden_slab", (new aoo(true)).c(2.0F).b(5.0F).a(f).c("woodSlab"));
      c.a(126, "wooden_slab", (new aoo(false)).c(2.0F).b(5.0F).a(f).c("woodSlab"));
      c.a(127, "cocoa", (new ajz()).c(0.2F).b(5.0F).a(f).c("cocoa").d("cocoa"));
      c.a(128, "sandstone_stairs", (new ans(var2, 0)).c("stairsSandStone"));
      c.a(129, "emerald_ore", (new amn()).c(3.0F).b(5.0F).a(i).c("oreEmerald").d("emerald_ore"));
      c.a(130, "ender_chest", (new akv()).c(22.5F).b(1000.0F).a(i).c("enderChest").a(0.5F));
      c.a(131, "tripwire_hook", (new aog()).c("tripWireSource").d("trip_wire_source"));
      c.a(132, "tripwire", (new aof()).c("tripWire").d("trip_wire"));
      c.a(133, "emerald_block", (new alz(awv.I)).c(5.0F).b(10.0F).a(j).c("blockEmerald").d("emerald_block"));
      c.a(134, "spruce_stairs", (new ans(var1, 1)).c("stairsWoodSpruce"));
      c.a(135, "birch_stairs", (new ans(var1, 2)).c("stairsWoodBirch"));
      c.a(136, "jungle_stairs", (new ans(var1, 3)).c("stairsWoodJungle"));
      c.a(137, "command_block", (new akb()).s().b(6000000.0F).c("commandBlock").d("command_block"));
      c.a(138, "beacon", (new ajg()).c("beacon").a(1.0F).d("beacon"));
      c.a(139, "cobblestone_wall", (new aoi(var0)).c("cobbleWall"));
      c.a(140, "flower_pot", (new ald()).c(0.0F).a(e).c("flowerPot").d("flower_pot"));
      c.a(141, "carrots", (new ajv()).c("carrots").d("carrots"));
      c.a(142, "potatoes", (new amr()).c("potatoes").d("potatoes"));
      c.a(143, "wooden_button", (new aon()).c(0.5F).a(f).c("button"));
      c.a(144, "skull", (new anl()).c(1.0F).a(i).c("skull").d("skull"));
      c.a(145, "anvil", (new ajb()).c(5.0F).a(p).b(2000.0F).c("anvil"));
      c.a(146, "trapped_chest", (new ajx(1)).c(2.5F).a(f).c("chestTrap"));
      c.a(147, "light_weighted_pressure_plate", (new aol("gold_block", awt.f, 15)).c(0.5F).a(f).c("weightedPlate_light"));
      c.a(148, "heavy_weighted_pressure_plate", (new aol("iron_block", awt.f, 150)).c(0.5F).a(f).c("weightedPlate_heavy"));
      c.a(149, "unpowered_comparator", (new akc(false)).c(0.0F).a(f).c("comparator").H().d("comparator_off"));
      c.a(150, "powered_comparator", (new akc(true)).c(0.0F).a(0.625F).a(f).c("comparator").H().d("comparator_on"));
      c.a(151, "daylight_detector", (new akg()).c(0.2F).a(f).c("daylightDetector").d("daylight_detector"));
      c.a(152, "redstone_block", (new ams(awv.f)).c(5.0F).b(10.0F).a(j).c("blockRedstone").d("redstone_block"));
      c.a(153, "quartz_ore", (new amn()).c(3.0F).b(5.0F).a(i).c("netherquartz").d("quartz_ore"));
      c.a(154, "hopper", (new aln()).c(3.0F).b(8.0F).a(f).c("hopper").d("hopper"));
      aji var9 = (new amx()).a(i).c(0.8F).c("quartzBlock").d("quartz_block");
      c.a(155, "quartz_block", var9);
      c.a(156, "quartz_stairs", (new ans(var9, 0)).c("stairsQuartz"));
      c.a(157, "activator_rail", (new amt()).c(0.7F).a(j).c("activatorRail").d("rail_activator"));
      c.a(158, "dropper", (new akq()).c(3.5F).a(i).c("dropper").d("dropper"));
      c.a(159, "stained_hardened_clay", (new aka(awt.e)).c(1.25F).b(7.0F).a(i).c("clayHardenedStained").d("hardened_clay_stained"));
      c.a(160, "stained_glass_pane", (new anr()).c(0.3F).a(k).c("thinStainedGlass").d("glass"));
      c.a(161, "leaves2", (new amh()).c("leaves").d("leaves"));
      c.a(162, "log2", (new ami()).c("log").d("log"));
      c.a(163, "acacia_stairs", (new ans(var1, 4)).c("stairsWoodAcacia"));
      c.a(164, "dark_oak_stairs", (new ans(var1, 5)).c("stairsWoodDarkOak"));
      c.a(170, "hay_block", (new alm()).c(0.5F).a(h).c("hayBlock").a(abt.b).d("hay_block"));
      c.a(171, "carpet", (new aop()).c(0.1F).a(l).c("woolCarpet").g(0));
      c.a(172, "hardened_clay", (new all()).c(1.25F).b(7.0F).a(i).c("clayHardened").d("hardened_clay"));
      c.a(173, "coal_block", (new aji(awt.e)).c(5.0F).b(10.0F).a(i).c("blockCoal").a(abt.b).d("coal_block"));
      c.a(174, "packed_ice", (new amo()).c(0.5F).a(k).c("icePacked").d("ice_packed"));
      c.a(175, "double_plant", new ako());
      Iterator var10 = c.iterator();

      while(var10.hasNext()) {
         aji var11 = (aji)var10.next();
         if(var11.J == awt.a) {
            var11.u = false;
         } else {
            boolean var12 = false;
            boolean var13 = var11.b() == 10;
            boolean var14 = var11 instanceof alj;
            boolean var15 = var11 == var4;
            boolean var16 = var11.s;
            boolean var17 = var11.r == 0;
            if(var13 || var14 || var15 || var16 || var17) {
               var12 = true;
            }

            var11.u = var12;
         }
      }

   }

   protected aji(awt var1) {
      this.H = e;
      this.I = 1.0F;
      this.K = 0.6F;
      this.J = var1;
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.q = this.c();
      this.r = this.c()?255:0;
      this.s = !var1.b();
   }

   protected aji a(ajm var1) {
      this.H = var1;
      return this;
   }

   protected aji g(int var1) {
      this.r = var1;
      return this;
   }

   protected aji a(float var1) {
      this.t = (int)(15.0F * var1);
      return this;
   }

   protected aji b(float var1) {
      this.w = var1 * 3.0F;
      return this;
   }

   public boolean r() {
      return this.J.k() && this.d() && !this.f();
   }

   public boolean d() {
      return true;
   }

   public boolean b(ahl var1, int var2, int var3, int var4) {
      return !this.J.c();
   }

   public int b() {
      return 0;
   }

   protected aji c(float var1) {
      this.v = var1;
      if(this.w < var1 * 5.0F) {
         this.w = var1 * 5.0F;
      }

      return this;
   }

   protected aji s() {
      this.c(-1.0F);
      return this;
   }

   public float f(ahb var1, int var2, int var3, int var4) {
      return this.v;
   }

   protected aji a(boolean var1) {
      this.z = var1;
      return this;
   }

   public boolean t() {
      return this.z;
   }

   public boolean u() {
      return this.A;
   }

   protected final void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.B = (double)var1;
      this.C = (double)var2;
      this.D = (double)var3;
      this.E = (double)var4;
      this.F = (double)var5;
      this.G = (double)var6;
   }

   public boolean d(ahl var1, int var2, int var3, int var4, int var5) {
      return var1.a(var2, var3, var4).o().a();
   }

   public void a(ahb var1, int var2, int var3, int var4, azt var5, List var6, sa var7) {
      azt var8 = this.a(var1, var2, var3, var4);
      if(var8 != null && var5.b(var8)) {
         var6.add(var8);
      }

   }

   public azt a(ahb var1, int var2, int var3, int var4) {
      return azt.a((double)var2 + this.B, (double)var3 + this.C, (double)var4 + this.D, (double)var2 + this.E, (double)var3 + this.F, (double)var4 + this.G);
   }

   public boolean c() {
      return true;
   }

   public boolean a(int var1, boolean var2) {
      return this.v();
   }

   public boolean v() {
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, Random var5) {}

   public void b(ahb var1, int var2, int var3, int var4, int var5) {}

   public void a(ahb var1, int var2, int var3, int var4, aji var5) {}

   public int a(ahb var1) {
      return 10;
   }

   public void b(ahb var1, int var2, int var3, int var4) {}

   public void a(ahb var1, int var2, int var3, int var4, aji var5, int var6) {}

   public int a(Random var1) {
      return 1;
   }

   public adb a(int var1, Random var2, int var3) {
      return adb.a(this);
   }

   public float a(yz var1, ahb var2, int var3, int var4, int var5) {
      float var6 = this.f(var2, var3, var4, var5);
      return var6 < 0.0F?0.0F:(!var1.a(this)?var1.a(this, false) / var6 / 100.0F:var1.a(this, true) / var6 / 30.0F);
   }

   public final void b(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, 1.0F, var6);
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.E) {
         int var8 = this.a(var7, var1.s);

         for(int var9 = 0; var9 < var8; ++var9) {
            if(var1.s.nextFloat() <= var6) {
               adb var10 = this.a(var5, var1.s, var7);
               if(var10 != null) {
                  this.a(var1, var2, var3, var4, new add(var10, 1, this.a(var5)));
               }
            }
         }

      }
   }

   protected void a(ahb var1, int var2, int var3, int var4, add var5) {
      if(!var1.E && var1.O().b("doTileDrops")) {
         float var6 = 0.7F;
         double var7 = (double)(var1.s.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         double var9 = (double)(var1.s.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         double var11 = (double)(var1.s.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
         xk var13 = new xk(var1, (double)var2 + var7, (double)var3 + var9, (double)var4 + var11, var5);
         var13.b = 10;
         var1.d((sa)var13);
      }
   }

   protected void c(ahb var1, int var2, int var3, int var4, int var5) {
      if(!var1.E) {
         while(var5 > 0) {
            int var6 = sq.a(var5);
            var5 -= var6;
            var1.d((sa)(new sq(var1, (double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, var6)));
         }
      }

   }

   public int a(int var1) {
      return 0;
   }

   public float a(sa var1) {
      return this.w / 5.0F;
   }

   public azu a(ahb var1, int var2, int var3, int var4, azw var5, azw var6) {
      this.a((ahl)var1, var2, var3, var4);
      var5 = var5.c((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.c((double)(-var2), (double)(-var3), (double)(-var4));
      azw var7 = var5.b(var6, this.B);
      azw var8 = var5.b(var6, this.E);
      azw var9 = var5.c(var6, this.C);
      azw var10 = var5.c(var6, this.F);
      azw var11 = var5.d(var6, this.D);
      azw var12 = var5.d(var6, this.G);
      if(!this.a(var7)) {
         var7 = null;
      }

      if(!this.a(var8)) {
         var8 = null;
      }

      if(!this.b(var9)) {
         var9 = null;
      }

      if(!this.b(var10)) {
         var10 = null;
      }

      if(!this.c(var11)) {
         var11 = null;
      }

      if(!this.c(var12)) {
         var12 = null;
      }

      azw var13 = null;
      if(var7 != null && (var13 == null || var5.e(var7) < var5.e(var13))) {
         var13 = var7;
      }

      if(var8 != null && (var13 == null || var5.e(var8) < var5.e(var13))) {
         var13 = var8;
      }

      if(var9 != null && (var13 == null || var5.e(var9) < var5.e(var13))) {
         var13 = var9;
      }

      if(var10 != null && (var13 == null || var5.e(var10) < var5.e(var13))) {
         var13 = var10;
      }

      if(var11 != null && (var13 == null || var5.e(var11) < var5.e(var13))) {
         var13 = var11;
      }

      if(var12 != null && (var13 == null || var5.e(var12) < var5.e(var13))) {
         var13 = var12;
      }

      if(var13 == null) {
         return null;
      } else {
         byte var14 = -1;
         if(var13 == var7) {
            var14 = 4;
         }

         if(var13 == var8) {
            var14 = 5;
         }

         if(var13 == var9) {
            var14 = 0;
         }

         if(var13 == var10) {
            var14 = 1;
         }

         if(var13 == var11) {
            var14 = 2;
         }

         if(var13 == var12) {
            var14 = 3;
         }

         return new azu(var2, var3, var4, var14, var13.c((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean a(azw var1) {
      return var1 == null?false:var1.b >= this.C && var1.b <= this.F && var1.c >= this.D && var1.c <= this.G;
   }

   private boolean b(azw var1) {
      return var1 == null?false:var1.a >= this.B && var1.a <= this.E && var1.c >= this.D && var1.c <= this.G;
   }

   private boolean c(azw var1) {
      return var1 == null?false:var1.a >= this.B && var1.a <= this.E && var1.b >= this.C && var1.b <= this.F;
   }

   public void a(ahb var1, int var2, int var3, int var4, agw var5) {}

   public boolean a(ahb var1, int var2, int var3, int var4, int var5, add var6) {
      return this.d(var1, var2, var3, var4, var5);
   }

   public boolean d(ahb var1, int var2, int var3, int var4, int var5) {
      return this.c(var1, var2, var3, var4);
   }

   public boolean c(ahb var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4).J.j();
   }

   public boolean a(ahb var1, int var2, int var3, int var4, yz var5, int var6, float var7, float var8, float var9) {
      return false;
   }

   public void b(ahb var1, int var2, int var3, int var4, sa var5) {}

   public int a(ahb var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      return var9;
   }

   public void a(ahb var1, int var2, int var3, int var4, yz var5) {}

   public void a(ahb var1, int var2, int var3, int var4, sa var5, azw var6) {}

   public void a(ahl var1, int var2, int var3, int var4) {}

   public final double x() {
      return this.B;
   }

   public final double y() {
      return this.E;
   }

   public final double z() {
      return this.C;
   }

   public final double A() {
      return this.F;
   }

   public final double B() {
      return this.D;
   }

   public final double C() {
      return this.G;
   }

   public int b(ahl var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   public boolean f() {
      return false;
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5) {}

   public int c(ahl var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   public void g() {}

   public void a(ahb var1, yz var2, int var3, int var4, int var5, int var6) {
      var2.a(pp.C[b(this)], 1);
      var2.a(0.025F);
      if(this.E() && afv.e(var2)) {
         add var8 = this.j(var6);
         if(var8 != null) {
            this.a(var1, var3, var4, var5, var8);
         }
      } else {
         int var7 = afv.f(var2);
         this.b(var1, var3, var4, var5, var6, var7);
      }

   }

   protected boolean E() {
      return this.d() && !this.A;
   }

   protected add j(int var1) {
      int var2 = 0;
      adb var3 = adb.a(this);
      if(var3 != null && var3.n()) {
         var2 = var1;
      }

      return new add(var3, 1, var2);
   }

   public int a(int var1, Random var2) {
      return this.a(var2);
   }

   public boolean j(ahb var1, int var2, int var3, int var4) {
      return true;
   }

   public void a(ahb var1, int var2, int var3, int var4, sv var5, add var6) {}

   public void e(ahb var1, int var2, int var3, int var4, int var5) {}

   public aji c(String var1) {
      this.b = var1;
      return this;
   }

   public String F() {
      return dd.a(this.a() + ".name");
   }

   public String a() {
      return "tile." + this.b;
   }

   public boolean a(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   public boolean G() {
      return this.y;
   }

   protected aji H() {
      this.y = false;
      return this;
   }

   public int h() {
      return this.J.m();
   }

   public void a(ahb var1, int var2, int var3, int var4, sa var5, float var6) {}

   public int k(ahb var1, int var2, int var3, int var4) {
      return this.a(var1.e(var2, var3, var4));
   }

   public aji a(abt var1) {
      this.a = var1;
      return this;
   }

   public void a(ahb var1, int var2, int var3, int var4, int var5, yz var6) {}

   public void f(ahb var1, int var2, int var3, int var4, int var5) {}

   public void l(ahb var1, int var2, int var3, int var4) {}

   public boolean L() {
      return true;
   }

   public boolean a(agw var1) {
      return true;
   }

   public boolean c(aji var1) {
      return this == var1;
   }

   public static boolean a(aji var0, aji var1) {
      return var0 != null && var1 != null?(var0 == var1?true:var0.c(var1)):false;
   }

   public boolean M() {
      return false;
   }

   public int g(ahb var1, int var2, int var3, int var4, int var5) {
      return 0;
   }

   protected aji d(String var1) {
      this.d = var1;
      return this;
   }

}
