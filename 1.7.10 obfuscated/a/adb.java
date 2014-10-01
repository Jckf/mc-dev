import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;

public class adb {

   public static final cw e = new cw();
   protected static final UUID f = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   private abt a;
   protected static Random g = new Random();
   protected int h = 64;
   private int b;
   protected boolean i;
   protected boolean j;
   private adb c;
   private String d;
   private String m;
   protected String l;


   public static int b(adb var0) {
      return var0 == null?0:e.b((Object)var0);
   }

   public static adb d(int var0) {
      return (adb)e.a(var0);
   }

   public static adb a(aji var0) {
      return d(aji.b(var0));
   }

   public static void l() {
      e.a(256, "iron_shovel", (new ady(adc.c)).c("shovelIron").f("iron_shovel"));
      e.a(257, "iron_pickaxe", (new adn(adc.c)).c("pickaxeIron").f("iron_pickaxe"));
      e.a(258, "iron_axe", (new abf(adc.c)).c("hatchetIron").f("iron_axe"));
      e.a(259, "flint_and_steel", (new acw()).c("flintAndSteel").f("flint_and_steel"));
      e.a(260, "apple", (new acx(4, 0.3F, false)).c("apple").f("apple"));
      e.a(261, "bow", (new abm()).c("bow").f("bow"));
      e.a(262, "arrow", (new adb()).c("arrow").a(abt.j).f("arrow"));
      e.a(263, "coal", (new abq()).c("coal").f("coal"));
      e.a(264, "diamond", (new adb()).c("diamond").a(abt.l).f("diamond"));
      e.a(265, "iron_ingot", (new adb()).c("ingotIron").a(abt.l).f("iron_ingot"));
      e.a(266, "gold_ingot", (new adb()).c("ingotGold").a(abt.l).f("gold_ingot"));
      e.a(267, "iron_sword", (new aeh(adc.c)).c("swordIron").f("iron_sword"));
      e.a(268, "wooden_sword", (new aeh(adc.a)).c("swordWood").f("wood_sword"));
      e.a(269, "wooden_shovel", (new ady(adc.a)).c("shovelWood").f("wood_shovel"));
      e.a(270, "wooden_pickaxe", (new adn(adc.a)).c("pickaxeWood").f("wood_pickaxe"));
      e.a(271, "wooden_axe", (new abf(adc.a)).c("hatchetWood").f("wood_axe"));
      e.a(272, "stone_sword", (new aeh(adc.b)).c("swordStone").f("stone_sword"));
      e.a(273, "stone_shovel", (new ady(adc.b)).c("shovelStone").f("stone_shovel"));
      e.a(274, "stone_pickaxe", (new adn(adc.b)).c("pickaxeStone").f("stone_pickaxe"));
      e.a(275, "stone_axe", (new abf(adc.b)).c("hatchetStone").f("stone_axe"));
      e.a(276, "diamond_sword", (new aeh(adc.d)).c("swordDiamond").f("diamond_sword"));
      e.a(277, "diamond_shovel", (new ady(adc.d)).c("shovelDiamond").f("diamond_shovel"));
      e.a(278, "diamond_pickaxe", (new adn(adc.d)).c("pickaxeDiamond").f("diamond_pickaxe"));
      e.a(279, "diamond_axe", (new abf(adc.d)).c("hatchetDiamond").f("diamond_axe"));
      e.a(280, "stick", (new adb()).q().c("stick").a(abt.l).f("stick"));
      e.a(281, "bowl", (new adb()).c("bowl").a(abt.l).f("bowl"));
      e.a(282, "mushroom_stew", (new abn(6)).c("mushroomStew").f("mushroom_stew"));
      e.a(283, "golden_sword", (new aeh(adc.e)).c("swordGold").f("gold_sword"));
      e.a(284, "golden_shovel", (new ady(adc.e)).c("shovelGold").f("gold_shovel"));
      e.a(285, "golden_pickaxe", (new adn(adc.e)).c("pickaxeGold").f("gold_pickaxe"));
      e.a(286, "golden_axe", (new abf(adc.e)).c("hatchetGold").f("gold_axe"));
      e.a(287, "string", (new abi(ajn.bD)).c("string").a(abt.l).f("string"));
      e.a(288, "feather", (new adb()).c("feather").a(abt.l).f("feather"));
      e.a(289, "gunpowder", (new adb()).c("sulphur").e(aen.k).a(abt.l).f("gunpowder"));
      e.a(290, "wooden_hoe", (new ada(adc.a)).c("hoeWood").f("wood_hoe"));
      e.a(291, "stone_hoe", (new ada(adc.b)).c("hoeStone").f("stone_hoe"));
      e.a(292, "iron_hoe", (new ada(adc.c)).c("hoeIron").f("iron_hoe"));
      e.a(293, "diamond_hoe", (new ada(adc.d)).c("hoeDiamond").f("diamond_hoe"));
      e.a(294, "golden_hoe", (new ada(adc.e)).c("hoeGold").f("gold_hoe"));
      e.a(295, "wheat_seeds", (new adw(ajn.aj, ajn.ak)).c("seeds").f("seeds_wheat"));
      e.a(296, "wheat", (new adb()).c("wheat").a(abt.l).f("wheat"));
      e.a(297, "bread", (new acx(5, 0.6F, false)).c("bread").f("bread"));
      e.a(298, "leather_helmet", (new abb(abd.a, 0, 0)).c("helmetCloth").f("leather_helmet"));
      e.a(299, "leather_chestplate", (new abb(abd.a, 0, 1)).c("chestplateCloth").f("leather_chestplate"));
      e.a(300, "leather_leggings", (new abb(abd.a, 0, 2)).c("leggingsCloth").f("leather_leggings"));
      e.a(301, "leather_boots", (new abb(abd.a, 0, 3)).c("bootsCloth").f("leather_boots"));
      e.a(302, "chainmail_helmet", (new abb(abd.b, 1, 0)).c("helmetChain").f("chainmail_helmet"));
      e.a(303, "chainmail_chestplate", (new abb(abd.b, 1, 1)).c("chestplateChain").f("chainmail_chestplate"));
      e.a(304, "chainmail_leggings", (new abb(abd.b, 1, 2)).c("leggingsChain").f("chainmail_leggings"));
      e.a(305, "chainmail_boots", (new abb(abd.b, 1, 3)).c("bootsChain").f("chainmail_boots"));
      e.a(306, "iron_helmet", (new abb(abd.c, 2, 0)).c("helmetIron").f("iron_helmet"));
      e.a(307, "iron_chestplate", (new abb(abd.c, 2, 1)).c("chestplateIron").f("iron_chestplate"));
      e.a(308, "iron_leggings", (new abb(abd.c, 2, 2)).c("leggingsIron").f("iron_leggings"));
      e.a(309, "iron_boots", (new abb(abd.c, 2, 3)).c("bootsIron").f("iron_boots"));
      e.a(310, "diamond_helmet", (new abb(abd.e, 3, 0)).c("helmetDiamond").f("diamond_helmet"));
      e.a(311, "diamond_chestplate", (new abb(abd.e, 3, 1)).c("chestplateDiamond").f("diamond_chestplate"));
      e.a(312, "diamond_leggings", (new abb(abd.e, 3, 2)).c("leggingsDiamond").f("diamond_leggings"));
      e.a(313, "diamond_boots", (new abb(abd.e, 3, 3)).c("bootsDiamond").f("diamond_boots"));
      e.a(314, "golden_helmet", (new abb(abd.d, 4, 0)).c("helmetGold").f("gold_helmet"));
      e.a(315, "golden_chestplate", (new abb(abd.d, 4, 1)).c("chestplateGold").f("gold_chestplate"));
      e.a(316, "golden_leggings", (new abb(abd.d, 4, 2)).c("leggingsGold").f("gold_leggings"));
      e.a(317, "golden_boots", (new abb(abd.d, 4, 3)).c("bootsGold").f("gold_boots"));
      e.a(318, "flint", (new adb()).c("flint").a(abt.l).f("flint"));
      e.a(319, "porkchop", (new acx(3, 0.3F, true)).c("porkchopRaw").f("porkchop_raw"));
      e.a(320, "cooked_porkchop", (new acx(8, 0.8F, true)).c("porkchopCooked").f("porkchop_cooked"));
      e.a(321, "painting", (new acz(tb.class)).c("painting").f("painting"));
      e.a(322, "golden_apple", (new acy(4, 1.2F, false)).j().a(rv.l.H, 5, 1, 1.0F).c("appleGold").f("apple_golden"));
      e.a(323, "sign", (new adz()).c("sign").f("sign"));
      e.a(324, "wooden_door", (new ach(awt.d)).c("doorWood").f("door_wood"));
      adb var0 = (new abo(ajn.a)).c("bucket").e(16).f("bucket_empty");
      e.a(325, "bucket", var0);
      e.a(326, "water_bucket", (new abo(ajn.i)).c("bucketWater").c(var0).f("bucket_water"));
      e.a(327, "lava_bucket", (new abo(ajn.k)).c("bucketLava").c(var0).f("bucket_lava"));
      e.a(328, "minecart", (new adj(0)).c("minecart").f("minecart_normal"));
      e.a(329, "saddle", (new adt()).c("saddle").f("saddle"));
      e.a(330, "iron_door", (new ach(awt.f)).c("doorIron").f("door_iron"));
      e.a(331, "redstone", (new ads()).c("redstone").e(aen.i).f("redstone_dust"));
      e.a(332, "snowball", (new aed()).c("snowball").f("snowball"));
      e.a(333, "boat", (new abj()).c("boat").f("boat"));
      e.a(334, "leather", (new adb()).c("leather").a(abt.l).f("leather"));
      e.a(335, "milk_bucket", (new adi()).c("milk").c(var0).f("bucket_milk"));
      e.a(336, "brick", (new adb()).c("brick").a(abt.l).f("brick"));
      e.a(337, "clay_ball", (new adb()).c("clay").a(abt.l).f("clay_ball"));
      e.a(338, "reeds", (new abi(ajn.aH)).c("reeds").a(abt.l).f("reeds"));
      e.a(339, "paper", (new adb()).c("paper").a(abt.f).f("paper"));
      e.a(340, "book", (new abk()).c("book").a(abt.f).f("book_normal"));
      e.a(341, "slime_ball", (new adb()).c("slimeball").a(abt.f).f("slimeball"));
      e.a(342, "chest_minecart", (new adj(1)).c("minecartChest").f("minecart_chest"));
      e.a(343, "furnace_minecart", (new adj(2)).c("minecartFurnace").f("minecart_furnace"));
      e.a(344, "egg", (new ack()).c("egg").f("egg"));
      e.a(345, "compass", (new adb()).c("compass").a(abt.i).f("compass"));
      e.a(346, "fishing_rod", (new acv()).c("fishingRod").f("fishing_rod"));
      e.a(347, "clock", (new adb()).c("clock").a(abt.i).f("clock"));
      e.a(348, "glowstone_dust", (new adb()).c("yellowDust").e(aen.j).a(abt.l).f("glowstone_dust"));
      e.a(349, "fish", (new act(false)).c("fish").f("fish_raw").a(true));
      e.a(350, "cooked_fished", (new act(true)).c("fish").f("fish_cooked").a(true));
      e.a(351, "dye", (new acj()).c("dyePowder").f("dye_powder"));
      e.a(352, "bone", (new adb()).c("bone").q().a(abt.f).f("bone"));
      e.a(353, "sugar", (new adb()).c("sugar").e(aen.b).a(abt.l).f("sugar"));
      e.a(354, "cake", (new abi(ajn.aQ)).e(1).c("cake").a(abt.h).f("cake"));
      e.a(355, "bed", (new abg()).e(1).c("bed").f("bed"));
      e.a(356, "repeater", (new abi(ajn.aR)).c("diode").a(abt.d).f("repeater"));
      e.a(357, "cookie", (new acx(2, 0.1F, false)).c("cookie").f("cookie"));
      e.a(358, "filled_map", (new adh()).c("map").f("map_filled"));
      e.a(359, "shears", (new adx()).c("shears").f("shears"));
      e.a(360, "melon", (new acx(2, 0.3F, false)).c("melon").f("melon"));
      e.a(361, "pumpkin_seeds", (new adw(ajn.bb, ajn.ak)).c("seeds_pumpkin").f("seeds_pumpkin"));
      e.a(362, "melon_seeds", (new adw(ajn.bc, ajn.ak)).c("seeds_melon").f("seeds_melon"));
      e.a(363, "beef", (new acx(3, 0.3F, true)).c("beefRaw").f("beef_raw"));
      e.a(364, "cooked_beef", (new acx(8, 0.8F, true)).c("beefCooked").f("beef_cooked"));
      e.a(365, "chicken", (new acx(2, 0.3F, true)).a(rv.s.H, 30, 0, 0.3F).c("chickenRaw").f("chicken_raw"));
      e.a(366, "cooked_chicken", (new acx(6, 0.6F, true)).c("chickenCooked").f("chicken_cooked"));
      e.a(367, "rotten_flesh", (new acx(4, 0.1F, true)).a(rv.s.H, 30, 0, 0.8F).c("rottenFlesh").f("rotten_flesh"));
      e.a(368, "ender_pearl", (new aco()).c("enderPearl").f("ender_pearl"));
      e.a(369, "blaze_rod", (new adb()).c("blazeRod").a(abt.l).f("blaze_rod"));
      e.a(370, "ghast_tear", (new adb()).c("ghastTear").e(aen.c).a(abt.k).f("ghast_tear"));
      e.a(371, "gold_nugget", (new adb()).c("goldNugget").a(abt.l).f("gold_nugget"));
      e.a(372, "nether_wart", (new adw(ajn.bm, ajn.aM)).c("netherStalkSeeds").e("+4").f("nether_wart"));
      e.a(373, "potion", (new adp()).c("potion").f("potion"));
      e.a(374, "glass_bottle", (new abl()).c("glassBottle").f("potion_bottle_empty"));
      e.a(375, "spider_eye", (new acx(2, 0.8F, false)).a(rv.u.H, 5, 0, 1.0F).c("spiderEye").e(aen.d).f("spider_eye"));
      e.a(376, "fermented_spider_eye", (new adb()).c("fermentedSpiderEye").e(aen.e).a(abt.k).f("spider_eye_fermented"));
      e.a(377, "blaze_powder", (new adb()).c("blazePowder").e(aen.g).a(abt.k).f("blaze_powder"));
      e.a(378, "magma_cream", (new adb()).c("magmaCream").e(aen.h).a(abt.k).f("magma_cream"));
      e.a(379, "brewing_stand", (new abi(ajn.bo)).c("brewingStand").a(abt.k).f("brewing_stand"));
      e.a(380, "cauldron", (new abi(ajn.bp)).c("cauldron").a(abt.k).f("cauldron"));
      e.a(381, "ender_eye", (new acn()).c("eyeOfEnder").f("ender_eye"));
      e.a(382, "speckled_melon", (new adb()).c("speckledMelon").e(aen.f).a(abt.k).f("melon_speckled"));
      e.a(383, "spawn_egg", (new aee()).c("monsterPlacer").f("spawn_egg"));
      e.a(384, "experience_bottle", (new acp()).c("expBottle").f("experience_bottle"));
      e.a(385, "fire_charge", (new acq()).c("fireball").f("fireball"));
      e.a(386, "writable_book", (new ael()).c("writingBook").a(abt.f).f("book_writable"));
      e.a(387, "written_book", (new aem()).c("writtenBook").f("book_written").e(16));
      e.a(388, "emerald", (new adb()).c("emerald").a(abt.l).f("emerald"));
      e.a(389, "item_frame", (new acz(st.class)).c("frame").f("item_frame"));
      e.a(390, "flower_pot", (new abi(ajn.bL)).c("flowerPot").a(abt.c).f("flower_pot"));
      e.a(391, "carrot", (new adv(4, 0.6F, ajn.bM, ajn.ak)).c("carrots").f("carrot"));
      e.a(392, "potato", (new adv(1, 0.3F, ajn.bN, ajn.ak)).c("potato").f("potato"));
      e.a(393, "baked_potato", (new acx(6, 0.6F, false)).c("potatoBaked").f("potato_baked"));
      e.a(394, "poisonous_potato", (new acx(2, 0.3F, false)).a(rv.u.H, 5, 0, 0.6F).c("potatoPoisonous").f("potato_poisonous"));
      e.a(395, "map", (new acl()).c("emptyMap").f("map_empty"));
      e.a(396, "golden_carrot", (new acx(6, 1.2F, false)).c("carrotGolden").e(aen.l).f("carrot_golden"));
      e.a(397, "skull", (new aeb()).c("skull").f("skull"));
      e.a(398, "carrot_on_a_stick", (new abp()).c("carrotOnAStick").f("carrot_on_a_stick"));
      e.a(399, "nether_star", (new aea()).c("netherStar").a(abt.l).f("nether_star"));
      e.a(400, "pumpkin_pie", (new acx(8, 0.3F, false)).c("pumpkinPie").a(abt.h).f("pumpkin_pie"));
      e.a(401, "fireworks", (new acs()).c("fireworks").f("fireworks"));
      e.a(402, "firework_charge", (new acr()).c("fireworksCharge").a(abt.f).f("fireworks_charge"));
      e.a(403, "enchanted_book", (new acm()).e(1).c("enchantedBook").f("book_enchanted"));
      e.a(404, "comparator", (new abi(ajn.bU)).c("comparator").a(abt.d).f("comparator"));
      e.a(405, "netherbrick", (new adb()).c("netherbrick").a(abt.l).f("netherbrick"));
      e.a(406, "quartz", (new adb()).c("netherquartz").a(abt.l).f("quartz"));
      e.a(407, "tnt_minecart", (new adj(3)).c("minecartTnt").f("minecart_tnt"));
      e.a(408, "hopper_minecart", (new adj(5)).c("minecartHopper").f("minecart_hopper"));
      e.a(417, "iron_horse_armor", (new adb()).c("horsearmormetal").e(1).a(abt.f).f("iron_horse_armor"));
      e.a(418, "golden_horse_armor", (new adb()).c("horsearmorgold").e(1).a(abt.f).f("gold_horse_armor"));
      e.a(419, "diamond_horse_armor", (new adb()).c("horsearmordiamond").e(1).a(abt.f).f("diamond_horse_armor"));
      e.a(420, "lead", (new adf()).c("leash").f("lead"));
      e.a(421, "name_tag", (new adm()).c("nameTag").f("name_tag"));
      e.a(422, "command_block_minecart", (new adj(6)).c("minecartCommandBlock").f("minecart_command_block").a((abt)null));
      e.a(2256, "record_13", (new adr("13")).c("record").f("record_13"));
      e.a(2257, "record_cat", (new adr("cat")).c("record").f("record_cat"));
      e.a(2258, "record_blocks", (new adr("blocks")).c("record").f("record_blocks"));
      e.a(2259, "record_chirp", (new adr("chirp")).c("record").f("record_chirp"));
      e.a(2260, "record_far", (new adr("far")).c("record").f("record_far"));
      e.a(2261, "record_mall", (new adr("mall")).c("record").f("record_mall"));
      e.a(2262, "record_mellohi", (new adr("mellohi")).c("record").f("record_mellohi"));
      e.a(2263, "record_stal", (new adr("stal")).c("record").f("record_stal"));
      e.a(2264, "record_strad", (new adr("strad")).c("record").f("record_strad"));
      e.a(2265, "record_ward", (new adr("ward")).c("record").f("record_ward"));
      e.a(2266, "record_11", (new adr("11")).c("record").f("record_11"));
      e.a(2267, "record_wait", (new adr("wait")).c("record").f("record_wait"));
      HashSet var1 = Sets.newHashSet((Object[])(new aji[]{ajn.a, ajn.bo, ajn.C, ajn.bm, ajn.bp, ajn.bL, ajn.aj, ajn.aH, ajn.aQ, ajn.bP, ajn.K, ajn.M, ajn.ay, ajn.aS, ajn.bb, ajn.an, ajn.bV, ajn.bD, ajn.bv, ajn.bc, ajn.az, ajn.bU, ajn.af, ajn.as, ajn.aR, ajn.av, ajn.ao}));
      Iterator var2 = aji.c.b().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         aji var4 = (aji)aji.c.a(var3);
         Object var5;
         if(var4 == ajn.L) {
            var5 = (new aek(ajn.L)).b("cloth");
         } else if(var4 == ajn.ce) {
            var5 = (new aek(ajn.ce)).b("clayHardenedStained");
         } else if(var4 == ajn.cn) {
            var5 = (new aek(ajn.cn)).b("stainedGlass");
         } else if(var4 == ajn.co) {
            var5 = (new aek(ajn.co)).b("stainedGlassPane");
         } else if(var4 == ajn.cg) {
            var5 = (new aek(ajn.cg)).b("woolCarpet");
         } else if(var4 == ajn.d) {
            var5 = (new adl(ajn.d, ajn.d, akl.a)).b("dirt");
         } else if(var4 == ajn.m) {
            var5 = (new adl(ajn.m, ajn.m, anh.a)).b("sand");
         } else if(var4 == ajn.r) {
            var5 = (new adl(ajn.r, ajn.r, amm.M)).b("log");
         } else if(var4 == ajn.s) {
            var5 = (new adl(ajn.s, ajn.s, ami.M)).b("log");
         } else if(var4 == ajn.f) {
            var5 = (new adl(ajn.f, ajn.f, aom.a)).b("wood");
         } else if(var4 == ajn.aU) {
            var5 = (new adl(ajn.aU, ajn.aU, amb.a)).b("monsterStoneEgg");
         } else if(var4 == ajn.aV) {
            var5 = (new adl(ajn.aV, ajn.aV, anw.a)).b("stonebricksmooth");
         } else if(var4 == ajn.A) {
            var5 = (new adl(ajn.A, ajn.A, ani.a)).b("sandStone");
         } else if(var4 == ajn.ca) {
            var5 = (new adl(ajn.ca, ajn.ca, amx.a)).b("quartzBlock");
         } else if(var4 == ajn.U) {
            var5 = (new aeg(ajn.U, ajn.U, ajn.T, false)).b("stoneSlab");
         } else if(var4 == ajn.T) {
            var5 = (new aeg(ajn.T, ajn.U, ajn.T, true)).b("stoneSlab");
         } else if(var4 == ajn.bx) {
            var5 = (new aeg(ajn.bx, ajn.bx, ajn.bw, false)).b("woodSlab");
         } else if(var4 == ajn.bw) {
            var5 = (new aeg(ajn.bw, ajn.bx, ajn.bw, true)).b("woodSlab");
         } else if(var4 == ajn.g) {
            var5 = (new adl(ajn.g, ajn.g, anj.a)).b("sapling");
         } else if(var4 == ajn.t) {
            var5 = (new adg(ajn.t)).b("leaves");
         } else if(var4 == ajn.u) {
            var5 = (new adg(ajn.u)).b("leaves");
         } else if(var4 == ajn.bd) {
            var5 = new abr(ajn.bd, false);
         } else if(var4 == ajn.H) {
            var5 = (new abr(ajn.H, true)).a(new String[]{"shrub", "grass", "fern"});
         } else if(var4 == ajn.N) {
            var5 = (new adl(ajn.N, ajn.N, alc.b)).b("flower");
         } else if(var4 == ajn.O) {
            var5 = (new adl(ajn.O, ajn.O, alc.a)).b("rose");
         } else if(var4 == ajn.aC) {
            var5 = new aec(ajn.aC, ajn.aC);
         } else if(var4 == ajn.bi) {
            var5 = new aej(ajn.bi);
         } else if(var4 == ajn.J) {
            var5 = new ado(ajn.J);
         } else if(var4 == ajn.F) {
            var5 = new ado(ajn.F);
         } else if(var4 == ajn.bK) {
            var5 = (new adl(ajn.bK, ajn.bK, aoi.a)).b("cobbleWall");
         } else if(var4 == ajn.bQ) {
            var5 = (new aba(ajn.bQ)).b("anvil");
         } else if(var4 == ajn.cm) {
            var5 = (new aci(ajn.cm, ajn.cm, ako.a)).b("doublePlant");
         } else {
            if(var1.contains(var4)) {
               continue;
            }

            var5 = new abh(var4);
         }

         e.a(aji.b(var4), var3, var5);
      }

   }

   public adb e(int var1) {
      this.h = var1;
      return this;
   }

   public boolean a(add var1, yz var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return false;
   }

   public float a(add var1, aji var2) {
      return 1.0F;
   }

   public add a(add var1, ahb var2, yz var3) {
      return var1;
   }

   public add b(add var1, ahb var2, yz var3) {
      return var1;
   }

   public int m() {
      return this.h;
   }

   public int a(int var1) {
      return 0;
   }

   public boolean n() {
      return this.j;
   }

   protected adb a(boolean var1) {
      this.j = var1;
      return this;
   }

   public int o() {
      return this.b;
   }

   protected adb f(int var1) {
      this.b = var1;
      return this;
   }

   public boolean p() {
      return this.b > 0 && !this.j;
   }

   public boolean a(add var1, sv var2, sv var3) {
      return false;
   }

   public boolean a(add var1, ahb var2, aji var3, int var4, int var5, int var6, sv var7) {
      return false;
   }

   public boolean b(aji var1) {
      return false;
   }

   public boolean a(add var1, yz var2, sv var3) {
      return false;
   }

   public adb q() {
      this.i = true;
      return this;
   }

   public adb c(String var1) {
      this.m = var1;
      return this;
   }

   public String k(add var1) {
      String var2 = this.a(var1);
      return var2 == null?"":dd.a(var2);
   }

   public String a() {
      return "item." + this.m;
   }

   public String a(add var1) {
      return "item." + this.m;
   }

   public adb c(adb var1) {
      this.c = var1;
      return this;
   }

   public boolean l(add var1) {
      return true;
   }

   public boolean s() {
      return true;
   }

   public adb t() {
      return this.c;
   }

   public boolean u() {
      return this.c != null;
   }

   public void a(add var1, ahb var2, sa var3, int var4, boolean var5) {}

   public void d(add var1, ahb var2, yz var3) {}

   public boolean h() {
      return false;
   }

   public aei d(add var1) {
      return aei.a;
   }

   public int d_(add var1) {
      return 0;
   }

   public void a(add var1, ahb var2, yz var3, int var4) {}

   protected adb e(String var1) {
      this.d = var1;
      return this;
   }

   public String i(add var1) {
      return this.d;
   }

   public boolean m(add var1) {
      return this.i(var1) != null;
   }

   public String n(add var1) {
      return ("" + dd.a(this.k(var1) + ".name")).trim();
   }

   public adq f(add var1) {
      return var1.y()?adq.c:adq.a;
   }

   public boolean e_(add var1) {
      return this.m() == 1 && this.p();
   }

   protected azu a(ahb var1, yz var2, boolean var3) {
      float var4 = 1.0F;
      float var5 = var2.B + (var2.z - var2.B) * var4;
      float var6 = var2.A + (var2.y - var2.A) * var4;
      double var7 = var2.p + (var2.s - var2.p) * (double)var4;
      double var9 = var2.q + (var2.t - var2.q) * (double)var4 + 1.62D - (double)var2.L;
      double var11 = var2.r + (var2.u - var2.r) * (double)var4;
      azw var13 = azw.a(var7, var9, var11);
      float var14 = qh.b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = qh.a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -qh.b(-var5 * 0.017453292F);
      float var17 = qh.a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      azw var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      return var1.a(var13, var23, var3, !var3, false);
   }

   public int c() {
      return 0;
   }

   public adb a(abt var1) {
      this.a = var1;
      return this;
   }

   public boolean v() {
      return true;
   }

   public boolean a(add var1, add var2) {
      return false;
   }

   public Multimap k() {
      return HashMultimap.create();
   }

   protected adb f(String var1) {
      this.l = var1;
      return this;
   }

}
