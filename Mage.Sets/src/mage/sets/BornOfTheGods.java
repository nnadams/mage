
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author LevelX2
 */
public final class BornOfTheGods extends ExpansionSet {

    private static final BornOfTheGods instance = new BornOfTheGods();

    public static BornOfTheGods getInstance() {
        return instance;
    }

    private BornOfTheGods() {
        super("Born of the Gods", "BNG", ExpansionSet.buildDate(2014, 2, 7), SetType.EXPANSION);
        this.blockName = "Theros";
        this.parentSet = Theros.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Acolyte's Reward", 1, Rarity.UNCOMMON, mage.cards.a.AcolytesReward.class));
        cards.add(new SetCardInfo("Aerie Worshippers", 30, Rarity.UNCOMMON, mage.cards.a.AerieWorshippers.class));
        cards.add(new SetCardInfo("Akroan Conscriptor", 87, Rarity.UNCOMMON, mage.cards.a.AkroanConscriptor.class));
        cards.add(new SetCardInfo("Akroan Phalanx", 2, Rarity.UNCOMMON, mage.cards.a.AkroanPhalanx.class));
        cards.add(new SetCardInfo("Akroan Skyguard", 3, Rarity.COMMON, mage.cards.a.AkroanSkyguard.class));
        cards.add(new SetCardInfo("Arbiter of the Ideal", 31, Rarity.RARE, mage.cards.a.ArbiterOfTheIdeal.class));
        cards.add(new SetCardInfo("Archetype of Aggression", 88, Rarity.UNCOMMON, mage.cards.a.ArchetypeOfAggression.class));
        cards.add(new SetCardInfo("Archetype of Courage", 4, Rarity.UNCOMMON, mage.cards.a.ArchetypeOfCourage.class));
        cards.add(new SetCardInfo("Archetype of Endurance", 116, Rarity.UNCOMMON, mage.cards.a.ArchetypeOfEndurance.class));
        cards.add(new SetCardInfo("Archetype of Finality", 58, Rarity.UNCOMMON, mage.cards.a.ArchetypeOfFinality.class));
        cards.add(new SetCardInfo("Archetype of Imagination", 32, Rarity.UNCOMMON, mage.cards.a.ArchetypeOfImagination.class));
        cards.add(new SetCardInfo("Ashiok's Adept", 59, Rarity.UNCOMMON, mage.cards.a.AshioksAdept.class));
        cards.add(new SetCardInfo("Aspect of Hydra", 117, Rarity.COMMON, mage.cards.a.AspectOfHydra.class));
        cards.add(new SetCardInfo("Asphyxiate", 60, Rarity.COMMON, mage.cards.a.Asphyxiate.class));
        cards.add(new SetCardInfo("Astral Cornucopia", 157, Rarity.RARE, mage.cards.a.AstralCornucopia.class));
        cards.add(new SetCardInfo("Bile Blight", 61, Rarity.UNCOMMON, mage.cards.b.BileBlight.class));
        cards.add(new SetCardInfo("Black Oak of Odunos", 62, Rarity.UNCOMMON, mage.cards.b.BlackOakOfOdunos.class));
        cards.add(new SetCardInfo("Bolt of Keranos", 89, Rarity.COMMON, mage.cards.b.BoltOfKeranos.class));
        cards.add(new SetCardInfo("Brimaz, King of Oreskos", 5, Rarity.MYTHIC, mage.cards.b.BrimazKingOfOreskos.class));
        cards.add(new SetCardInfo("Champion of Stray Souls", 63, Rarity.MYTHIC, mage.cards.c.ChampionOfStraySouls.class));
        cards.add(new SetCardInfo("Charging Badger", 118, Rarity.COMMON, mage.cards.c.ChargingBadger.class));
        cards.add(new SetCardInfo("Chorus of the Tides", 33, Rarity.COMMON, mage.cards.c.ChorusOfTheTides.class));
        cards.add(new SetCardInfo("Chromanticore", 144, Rarity.MYTHIC, mage.cards.c.Chromanticore.class));
        cards.add(new SetCardInfo("Claim of Erebos", 64, Rarity.COMMON, mage.cards.c.ClaimOfErebos.class));
        cards.add(new SetCardInfo("Courser of Kruphix", 119, Rarity.RARE, mage.cards.c.CourserOfKruphix.class));
        cards.add(new SetCardInfo("Crypsis", 34, Rarity.COMMON, mage.cards.c.Crypsis.class));
        cards.add(new SetCardInfo("Culling Mark", 120, Rarity.COMMON, mage.cards.c.CullingMark.class));
        cards.add(new SetCardInfo("Cyclops of One-Eyed Pass", 90, Rarity.COMMON, mage.cards.c.CyclopsOfOneEyedPass.class));
        cards.add(new SetCardInfo("Dawn to Dusk", 6, Rarity.UNCOMMON, mage.cards.d.DawnToDusk.class));
        cards.add(new SetCardInfo("Deepwater Hypnotist", 35, Rarity.COMMON, mage.cards.d.DeepwaterHypnotist.class));
        cards.add(new SetCardInfo("Divination", 36, Rarity.COMMON, mage.cards.d.Divination.class));
        cards.add(new SetCardInfo("Drown in Sorrow", 65, Rarity.UNCOMMON, mage.cards.d.DrownInSorrow.class));
        cards.add(new SetCardInfo("Eater of Hope", 66, Rarity.RARE, mage.cards.e.EaterOfHope.class));
        cards.add(new SetCardInfo("Eidolon of Countless Battles", 7, Rarity.RARE, mage.cards.e.EidolonOfCountlessBattles.class));
        cards.add(new SetCardInfo("Elite Skirmisher", 8, Rarity.COMMON, mage.cards.e.EliteSkirmisher.class));
        cards.add(new SetCardInfo("Ephara, God of the Polis", 145, Rarity.MYTHIC, mage.cards.e.EpharaGodOfThePolis.class));
        cards.add(new SetCardInfo("Ephara's Enlightenment", 146, Rarity.UNCOMMON, mage.cards.e.EpharasEnlightenment.class));
        cards.add(new SetCardInfo("Ephara's Radiance", 9, Rarity.COMMON, mage.cards.e.EpharasRadiance.class));
        cards.add(new SetCardInfo("Epiphany Storm", 91, Rarity.COMMON, mage.cards.e.EpiphanyStorm.class));
        cards.add(new SetCardInfo("Eternity Snare", 37, Rarity.UNCOMMON, mage.cards.e.EternitySnare.class));
        cards.add(new SetCardInfo("Evanescent Intellect", 38, Rarity.COMMON, mage.cards.e.EvanescentIntellect.class));
        cards.add(new SetCardInfo("Everflame Eidolon", 92, Rarity.UNCOMMON, mage.cards.e.EverflameEidolon.class));
        cards.add(new SetCardInfo("Excoriate", 10, Rarity.COMMON, mage.cards.e.Excoriate.class));
        cards.add(new SetCardInfo("Eye Gouge", 67, Rarity.COMMON, mage.cards.e.EyeGouge.class));
        cards.add(new SetCardInfo("Fall of the Hammer", 93, Rarity.COMMON, mage.cards.f.FallOfTheHammer.class));
        cards.add(new SetCardInfo("Fanatic of Xenagos", 147, Rarity.UNCOMMON, mage.cards.f.FanaticOfXenagos.class));
        cards.add(new SetCardInfo("Fated Conflagration", 94, Rarity.RARE, mage.cards.f.FatedConflagration.class));
        cards.add(new SetCardInfo("Fated Infatuation", 39, Rarity.RARE, mage.cards.f.FatedInfatuation.class));
        cards.add(new SetCardInfo("Fated Intervention", 121, Rarity.RARE, mage.cards.f.FatedIntervention.class));
        cards.add(new SetCardInfo("Fated Retribution", 11, Rarity.RARE, mage.cards.f.FatedRetribution.class));
        cards.add(new SetCardInfo("Fated Return", 69, Rarity.RARE, mage.cards.f.FatedReturn.class));
        cards.add(new SetCardInfo("Fate Unraveler", 68, Rarity.RARE, mage.cards.f.FateUnraveler.class));
        cards.add(new SetCardInfo("Fearsome Temper", 95, Rarity.COMMON, mage.cards.f.FearsomeTemper.class));
        cards.add(new SetCardInfo("Felhide Brawler", 70, Rarity.COMMON, mage.cards.f.FelhideBrawler.class));
        cards.add(new SetCardInfo("Felhide Spiritbinder", 96, Rarity.RARE, mage.cards.f.FelhideSpiritbinder.class));
        cards.add(new SetCardInfo("Flame-Wreathed Phoenix", 97, Rarity.MYTHIC, mage.cards.f.FlameWreathedPhoenix.class));
        cards.add(new SetCardInfo("Flitterstep Eidolon", 40, Rarity.UNCOMMON, mage.cards.f.FlitterstepEidolon.class));
        cards.add(new SetCardInfo("Floodtide Serpent", 41, Rarity.COMMON, mage.cards.f.FloodtideSerpent.class));
        cards.add(new SetCardInfo("Forgestoker Dragon", 98, Rarity.RARE, mage.cards.f.ForgestokerDragon.class));
        cards.add(new SetCardInfo("Forlorn Pseudamma", 71, Rarity.UNCOMMON, mage.cards.f.ForlornPseudamma.class));
        cards.add(new SetCardInfo("Forsaken Drifters", 72, Rarity.COMMON, mage.cards.f.ForsakenDrifters.class));
        cards.add(new SetCardInfo("Ghostblade Eidolon", 12, Rarity.UNCOMMON, mage.cards.g.GhostbladeEidolon.class));
        cards.add(new SetCardInfo("Gild", 73, Rarity.RARE, mage.cards.g.Gild.class));
        cards.add(new SetCardInfo("Glimpse the Sun God", 13, Rarity.UNCOMMON, mage.cards.g.GlimpseTheSunGod.class));
        cards.add(new SetCardInfo("God-Favored General", 14, Rarity.UNCOMMON, mage.cards.g.GodFavoredGeneral.class));
        cards.add(new SetCardInfo("Gorgon's Head", 158, Rarity.UNCOMMON, mage.cards.g.GorgonsHead.class));
        cards.add(new SetCardInfo("Graverobber Spider", 122, Rarity.UNCOMMON, mage.cards.g.GraverobberSpider.class));
        cards.add(new SetCardInfo("Great Hart", 15, Rarity.COMMON, mage.cards.g.GreatHart.class));
        cards.add(new SetCardInfo("Griffin Dreamfinder", 16, Rarity.COMMON, mage.cards.g.GriffinDreamfinder.class));
        cards.add(new SetCardInfo("Grisly Transformation", 74, Rarity.COMMON, mage.cards.g.GrislyTransformation.class));
        cards.add(new SetCardInfo("Herald of Torment", 75, Rarity.RARE, mage.cards.h.HeraldOfTorment.class));
        cards.add(new SetCardInfo("Heroes' Podium", 159, Rarity.RARE, mage.cards.h.HeroesPodium.class));
        cards.add(new SetCardInfo("Hero of Iroas", 17, Rarity.RARE, mage.cards.h.HeroOfIroas.class));
        cards.add(new SetCardInfo("Hero of Leina Tower", 123, Rarity.RARE, mage.cards.h.HeroOfLeinaTower.class));
        cards.add(new SetCardInfo("Hold at Bay", 18, Rarity.COMMON, mage.cards.h.HoldAtBay.class));
        cards.add(new SetCardInfo("Hunter's Prowess", 124, Rarity.RARE, mage.cards.h.HuntersProwess.class));
        cards.add(new SetCardInfo("Impetuous Sunchaser", 99, Rarity.COMMON, mage.cards.i.ImpetuousSunchaser.class));
        cards.add(new SetCardInfo("Karametra, God of Harvests", 148, Rarity.MYTHIC, mage.cards.k.KarametraGodOfHarvests.class));
        cards.add(new SetCardInfo("Karametra's Favor", 125, Rarity.COMMON, mage.cards.k.KarametrasFavor.class));
        cards.add(new SetCardInfo("Kiora's Follower", 150, Rarity.UNCOMMON, mage.cards.k.KiorasFollower.class));
        cards.add(new SetCardInfo("Kiora, the Crashing Wave", 149, Rarity.MYTHIC, mage.cards.k.KioraTheCrashingWave.class));
        cards.add(new SetCardInfo("Kragma Butcher", 100, Rarity.COMMON, mage.cards.k.KragmaButcher.class));
        cards.add(new SetCardInfo("Kraken of the Straits", 42, Rarity.UNCOMMON, mage.cards.k.KrakenOfTheStraits.class));
        cards.add(new SetCardInfo("Lightning Volley", 101, Rarity.UNCOMMON, mage.cards.l.LightningVolley.class));
        cards.add(new SetCardInfo("Loyal Pegasus", 19, Rarity.COMMON, mage.cards.l.LoyalPegasus.class));
        cards.add(new SetCardInfo("Marshmist Titan", 76, Rarity.COMMON, mage.cards.m.MarshmistTitan.class));
        cards.add(new SetCardInfo("Meletis Astronomer", 43, Rarity.UNCOMMON, mage.cards.m.MeletisAstronomer.class));
        cards.add(new SetCardInfo("Mindreaver", 44, Rarity.RARE, mage.cards.m.Mindreaver.class));
        cards.add(new SetCardInfo("Mischief and Mayhem", 126, Rarity.UNCOMMON, mage.cards.m.MischiefAndMayhem.class));
        cards.add(new SetCardInfo("Mogis, God of Slaughter", 151, Rarity.MYTHIC, mage.cards.m.MogisGodOfSlaughter.class));
        cards.add(new SetCardInfo("Mortal's Ardor", 20, Rarity.COMMON, mage.cards.m.MortalsArdor.class));
        cards.add(new SetCardInfo("Mortal's Resolve", 127, Rarity.COMMON, mage.cards.m.MortalsResolve.class));
        cards.add(new SetCardInfo("Necrobite", 77, Rarity.COMMON, mage.cards.n.Necrobite.class));
        cards.add(new SetCardInfo("Nessian Demolok", 128, Rarity.UNCOMMON, mage.cards.n.NessianDemolok.class));
        cards.add(new SetCardInfo("Nessian Wilds Ravager", 129, Rarity.RARE, mage.cards.n.NessianWildsRavager.class));
        cards.add(new SetCardInfo("Noble Quarry", 130, Rarity.UNCOMMON, mage.cards.n.NobleQuarry.class));
        cards.add(new SetCardInfo("Nullify", 45, Rarity.COMMON, mage.cards.n.Nullify.class));
        cards.add(new SetCardInfo("Nyxborn Eidolon", 78, Rarity.COMMON, mage.cards.n.NyxbornEidolon.class));
        cards.add(new SetCardInfo("Nyxborn Rollicker", 102, Rarity.COMMON, mage.cards.n.NyxbornRollicker.class));
        cards.add(new SetCardInfo("Nyxborn Shieldmate", 21, Rarity.COMMON, mage.cards.n.NyxbornShieldmate.class));
        cards.add(new SetCardInfo("Nyxborn Triton", 46, Rarity.COMMON, mage.cards.n.NyxbornTriton.class));
        cards.add(new SetCardInfo("Nyxborn Wolf", 131, Rarity.COMMON, mage.cards.n.NyxbornWolf.class));
        cards.add(new SetCardInfo("Odunos River Trawler", 79, Rarity.UNCOMMON, mage.cards.o.OdunosRiverTrawler.class));
        cards.add(new SetCardInfo("Oracle of Bones", 103, Rarity.RARE, mage.cards.o.OracleOfBones.class));
        cards.add(new SetCardInfo("Oracle's Insight", 47, Rarity.UNCOMMON, mage.cards.o.OraclesInsight.class));
        cards.add(new SetCardInfo("Oreskos Sun Guide", 22, Rarity.COMMON, mage.cards.o.OreskosSunGuide.class));
        cards.add(new SetCardInfo("Ornitharch", 23, Rarity.UNCOMMON, mage.cards.o.Ornitharch.class));
        cards.add(new SetCardInfo("Pain Seer", 80, Rarity.RARE, mage.cards.p.PainSeer.class));
        cards.add(new SetCardInfo("Peregrination", 132, Rarity.UNCOMMON, mage.cards.p.Peregrination.class));
        cards.add(new SetCardInfo("Perplexing Chimera", 48, Rarity.RARE, mage.cards.p.PerplexingChimera.class));
        cards.add(new SetCardInfo("Pharagax Giant", 104, Rarity.COMMON, mage.cards.p.PharagaxGiant.class));
        cards.add(new SetCardInfo("Phenax, God of Deception", 152, Rarity.MYTHIC, mage.cards.p.PhenaxGodOfDeception.class));
        cards.add(new SetCardInfo("Pheres-Band Raiders", 133, Rarity.UNCOMMON, mage.cards.p.PheresBandRaiders.class));
        cards.add(new SetCardInfo("Pheres-Band Tromper", 134, Rarity.COMMON, mage.cards.p.PheresBandTromper.class));
        cards.add(new SetCardInfo("Pillar of War", 160, Rarity.UNCOMMON, mage.cards.p.PillarOfWar.class));
        cards.add(new SetCardInfo("Pinnacle of Rage", 105, Rarity.UNCOMMON, mage.cards.p.PinnacleOfRage.class));
        cards.add(new SetCardInfo("Plea for Guidance", 24, Rarity.RARE, mage.cards.p.PleaForGuidance.class));
        cards.add(new SetCardInfo("Ragemonger", 153, Rarity.UNCOMMON, mage.cards.r.Ragemonger.class));
        cards.add(new SetCardInfo("Raised by Wolves", 135, Rarity.UNCOMMON, mage.cards.r.RaisedByWolves.class));
        cards.add(new SetCardInfo("Reap What Is Sown", 154, Rarity.UNCOMMON, mage.cards.r.ReapWhatIsSown.class));
        cards.add(new SetCardInfo("Reckless Reveler", 106, Rarity.COMMON, mage.cards.r.RecklessReveler.class));
        cards.add(new SetCardInfo("Retraction Helix", 49, Rarity.COMMON, mage.cards.r.RetractionHelix.class));
        cards.add(new SetCardInfo("Revoke Existence", 25, Rarity.COMMON, mage.cards.r.RevokeExistence.class));
        cards.add(new SetCardInfo("Rise to the Challenge", 107, Rarity.COMMON, mage.cards.r.RiseToTheChallenge.class));
        cards.add(new SetCardInfo("Sanguimancy", 81, Rarity.UNCOMMON, mage.cards.s.Sanguimancy.class));
        cards.add(new SetCardInfo("Satyr Firedancer", 108, Rarity.RARE, mage.cards.s.SatyrFiredancer.class));
        cards.add(new SetCardInfo("Satyr Nyx-Smith", 109, Rarity.UNCOMMON, mage.cards.s.SatyrNyxSmith.class));
        cards.add(new SetCardInfo("Satyr Wayfinder", 136, Rarity.COMMON, mage.cards.s.SatyrWayfinder.class));
        cards.add(new SetCardInfo("Scourge of Skola Vale", 137, Rarity.RARE, mage.cards.s.ScourgeOfSkolaVale.class));
        cards.add(new SetCardInfo("Scouring Sands", 110, Rarity.COMMON, mage.cards.s.ScouringSands.class));
        cards.add(new SetCardInfo("Searing Blood", 111, Rarity.UNCOMMON, mage.cards.s.SearingBlood.class));
        cards.add(new SetCardInfo("Servant of Tymaret", 82, Rarity.COMMON, mage.cards.s.ServantOfTymaret.class));
        cards.add(new SetCardInfo("Setessan Oathsworn", 138, Rarity.COMMON, mage.cards.s.SetessanOathsworn.class));
        cards.add(new SetCardInfo("Setessan Starbreaker", 139, Rarity.COMMON, mage.cards.s.SetessanStarbreaker.class));
        cards.add(new SetCardInfo("Shrike Harpy", 83, Rarity.UNCOMMON, mage.cards.s.ShrikeHarpy.class));
        cards.add(new SetCardInfo("Silent Sentinel", 26, Rarity.RARE, mage.cards.s.SilentSentinel.class));
        cards.add(new SetCardInfo("Siren of the Fanged Coast", 50, Rarity.UNCOMMON, mage.cards.s.SirenOfTheFangedCoast.class));
        cards.add(new SetCardInfo("Siren of the Silent Song", 155, Rarity.UNCOMMON, mage.cards.s.SirenOfTheSilentSong.class));
        cards.add(new SetCardInfo("Siren Song Lyre", 161, Rarity.UNCOMMON, mage.cards.s.SirenSongLyre.class));
        cards.add(new SetCardInfo("Skyreaping", 140, Rarity.UNCOMMON, mage.cards.s.Skyreaping.class));
        cards.add(new SetCardInfo("Snake of the Golden Grove", 141, Rarity.COMMON, mage.cards.s.SnakeOfTheGoldenGrove.class));
        cards.add(new SetCardInfo("Sphinx's Disciple", 51, Rarity.COMMON, mage.cards.s.SphinxsDisciple.class));
        cards.add(new SetCardInfo("Spirit of the Labyrinth", 27, Rarity.RARE, mage.cards.s.SpiritOfTheLabyrinth.class));
        cards.add(new SetCardInfo("Spiteful Returned", 84, Rarity.UNCOMMON, mage.cards.s.SpitefulReturned.class));
        cards.add(new SetCardInfo("Springleaf Drum", 162, Rarity.UNCOMMON, mage.cards.s.SpringleafDrum.class));
        cards.add(new SetCardInfo("Stormcaller of Keranos", 112, Rarity.UNCOMMON, mage.cards.s.StormcallerOfKeranos.class));
        cards.add(new SetCardInfo("Stratus Walk", 52, Rarity.COMMON, mage.cards.s.StratusWalk.class));
        cards.add(new SetCardInfo("Sudden Storm", 53, Rarity.COMMON, mage.cards.s.SuddenStorm.class));
        cards.add(new SetCardInfo("Sunbond", 28, Rarity.UNCOMMON, mage.cards.s.Sunbond.class));
        cards.add(new SetCardInfo("Swordwise Centaur", 142, Rarity.COMMON, mage.cards.s.SwordwiseCentaur.class));
        cards.add(new SetCardInfo("Temple of Enlightenment", 163, Rarity.RARE, mage.cards.t.TempleOfEnlightenment.class));
        cards.add(new SetCardInfo("Temple of Malice", 164, Rarity.RARE, mage.cards.t.TempleOfMalice.class));
        cards.add(new SetCardInfo("Temple of Plenty", 165, Rarity.RARE, mage.cards.t.TempleOfPlenty.class));
        cards.add(new SetCardInfo("Thassa's Rebuff", 54, Rarity.UNCOMMON, mage.cards.t.ThassasRebuff.class));
        cards.add(new SetCardInfo("Thunder Brute", 113, Rarity.UNCOMMON, mage.cards.t.ThunderBrute.class));
        cards.add(new SetCardInfo("Thunderous Might", 114, Rarity.UNCOMMON, mage.cards.t.ThunderousMight.class));
        cards.add(new SetCardInfo("Tromokratis", 55, Rarity.RARE, mage.cards.t.Tromokratis.class));
        cards.add(new SetCardInfo("Unravel the Aether", 143, Rarity.UNCOMMON, mage.cards.u.UnravelTheAether.class));
        cards.add(new SetCardInfo("Vanguard of Brimaz", 29, Rarity.UNCOMMON, mage.cards.v.VanguardOfBrimaz.class));
        cards.add(new SetCardInfo("Vortex Elemental", 56, Rarity.UNCOMMON, mage.cards.v.VortexElemental.class));
        cards.add(new SetCardInfo("Warchanter of Mogis", 85, Rarity.COMMON, mage.cards.w.WarchanterOfMogis.class));
        cards.add(new SetCardInfo("Weight of the Underworld", 86, Rarity.COMMON, mage.cards.w.WeightOfTheUnderworld.class));
        cards.add(new SetCardInfo("Whelming Wave", 57, Rarity.RARE, mage.cards.w.WhelmingWave.class));
        cards.add(new SetCardInfo("Whims of the Fates", 115, Rarity.RARE, mage.cards.w.WhimsOfTheFates.class));
        cards.add(new SetCardInfo("Xenagos, God of Revels", 156, Rarity.MYTHIC, mage.cards.x.XenagosGodOfRevels.class));
    }

}
