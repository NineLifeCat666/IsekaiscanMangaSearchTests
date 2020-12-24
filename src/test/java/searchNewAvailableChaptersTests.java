
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class searchNewAvailableChaptersTests extends TestBase{

    String searchNewChapter = ("Ищем на главной странице новую главу ");

    @Test
    void searchOnePieceTest(){
       openIsekaiSkan();
        step( searchNewChapter + "OnePiece", () -> {
            $("[class='content-area']").shouldHave(text("One Piece"));
        });
    }

    @Test
    void searchTheUndefeatableSwordsmanTest() {
    openIsekaiSkan();
        step(searchNewChapter + "The Undefeatable Swordsman", () -> {
            $("[class='content-area']").shouldHave(text("The Undefeatable Swordsman"));
        });
    }

    @Test
    void searchBlackCloverTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Black Clover", () -> {
            $("[class='content-area']").shouldHave(text("Black Clover"));
        });
    }

    @Test
    void searchBokuNoHeroAcademiaTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Boku No Hero Academia", () -> {
            $("[class='content-area']").shouldHave(text("Boku No Hero Academia"));
        });
    }

    @Test
    void searchRooftopSwordMasterTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Rooftop Sword Master", () -> {
            $("[class='content-area']").shouldHave(text("Rooftop Sword Master"));
        });
    }

    @Test
    void searchFightingSpiritMainlandTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Fighting Spirit Mainland", () -> {
            $("[class='content-area']").shouldHave(text("Fighting Spirit Mainland"));
        });
    }

    @Test
    void searchTheGodOfWarTest() {
    openIsekaiSkan();
        step(searchNewChapter + "The God Of War", () -> {
            $("[class='content-area']").shouldHave(text("The God Of War"));
        });
    }

    @Test
    void searchTTalesOfDemonsAndGodsTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Tales of Demons and Gods", () -> {
            $("[class='content-area']").shouldHave(text("Tales of Demons and Gods"));
        });
    }

    @Test
    void searchFffClassTrasheroTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Fff-Class Trashero", () -> {
            $("[class='content-area']").shouldHave(text("Fff-Class Trashero"));
        });
    }

    @Test
    void searchTheGreatMageReturnsAfter4000YearsTest() {
    openIsekaiSkan();
        step(searchNewChapter + "The Great Mage Returns After 4000 Years", () -> {
            $("[class='content-area']").shouldHave(text("The Great Mage Returns After 4000 Years"));
        });
    }

    @Test
    void searchLimitBreakerTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Limit Breaker", () -> {
            $("[class='content-area']").shouldHave(text("Limit Breaker"));
        });
    }

    @Test
    void searchStarMartialGodTechniqueTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Star Martial God Technique", () -> {
            $("[class='content-area']").shouldHave(text("Star Martial God Technique"));
        });
    }

    @Test
    void searchVillainInitializationTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Villain initialization", () -> {
            $("[class='content-area']").shouldHave(text("Villain initialization"));
        });
    }

    @Test
    void searchMaxLevelReturnerTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Max Level Returner", () -> {
            $("[class='content-area']").shouldHave(text("Max Level Returner"));
        });
    }

    @Test
    void searchSoloLevelingTest() {
    openIsekaiSkan();
        step(searchNewChapter + "Solo Leveling", () -> {
            $("[class='content-area']").shouldHave(text("Solo Leveling"));
        });
    }

    @Test
    void searchOmniscientReadersViewpointTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Omniscient Reader’s Viewpoint", () -> {
            $("[class='content-area']").shouldHave(text("Omniscient Reader’s Viewpoint"));
        });
    }

    @Test
    void searchTheFirstHunterTest() {
        openIsekaiSkan();
        step(searchNewChapter + "The First Hunter", () -> {
            $("[class='content-area']").shouldHave(text("The First Hunter"));
        });
    }

    @Test
    void searchSurvivalStoryOfASwordKingInAFantasyWorldTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Survival Story of a Sword King in a Fantasy World", () -> {
            $("[class='content-area']").shouldHave(text("Survival Story of a Sword King in a Fantasy World"));
        });
    }

    @Test
    void searchLegendOfTheNorthernBladeTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Legend of the Northern Blade", () -> {
            $("[class='content-area']").shouldHave(text("Legend of the Northern Blade"));
        });
    }

    @Test
    void searchMurimLoginTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Murim Login", () -> {
            $("[class='content-area']").shouldHave(text("Murim Login"));
        });
    }

    @Test
    void searchPeerlessDadTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Peerless Dad", () -> {
            $("[class='content-area']").shouldHave(text("Peerless Dad"));
        });
    }

    @Test
    void searchTheRebirthOfAn8thCircledMageTest() {
        openIsekaiSkan();
        step(searchNewChapter + "The Rebirth of an 8th-Circled Mage", () -> {
            $("[class='content-area']").shouldHave(text("The Rebirth of an 8th-Circled Mage"));
        });
    }

    @Test
    void searchBowbladeSpiritTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Bowblade Spirit", () -> {
            $("[class='content-area']").shouldHave(text("Bowblade Spirit"));
        });
    }
    @Test
    void searchTheMAXLeveledHeroWillReturnTest() {
        openIsekaiSkan();
        step(searchNewChapter + "The MAX leveled hero will return!", () -> {
            $("[class='content-area']").shouldHave(text("The MAX leveled hero will return!"));
        });
    }

    @Test
    void searchWornAndTornNewbieTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Worn and Torn Newbie", () -> {
            $("[class='content-area']").shouldHave(text("Worn and Torn Newbie"));
        });
    }

    @Test
    void searchHowToFightTest() {
        openIsekaiSkan();
        step(searchNewChapter + "How to fight", () -> {
            $("[class='content-area']").shouldHave(text("How to fight"));
        });
    }

    @Test
    void searchOvergeared2020Test(){
        openIsekaiSkan();
        step(searchNewChapter + "Overgeared (2020)", () -> {
            $("[class='content-area']").shouldHave(text("Overgeared (2020)"));
        });
    }

    @Test
    void IAmTheSorcererKingTest() {
        openIsekaiSkan();
        step(searchNewChapter + "I Am The Sorcerer King", () -> {
           $("[class='content-area']").shouldHave(text("I Am The Sorcerer King"));
        });
    }

    @Test
    void searchBuildUpTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Build Up", () -> {
           $("[class='content-area']").shouldHave(text("Build Up"));
        });
    }

    @Test
    void searchSharkTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Shark", () -> {
           $("[class='content-area']").shouldHave(text("Shark"));
        });
    }

    @Test
    void searchRecordOfTheWarGodTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Record of the War God", () -> {
           $("[class='content-area']").shouldHave(text("Record of the War God"));
        });
    }

    @Test
    void searchKenganOmegaTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Kengan Omega", () -> {
           $("[class='content-area']").shouldHave(text("Kengan Omega"));
        });
    }

    @Test
    void searchKillTheHeroTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Kill The Hero", () -> {
            $("[class='content-area']").shouldHave(text("Kill The Hero"));
        });
    }

    @Test
    void searchStrongestFighterTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Strongest Fighter", () -> {
            $("[class='content-area']").shouldHave(text("Strongest Fighter"));
        });
    }

    @Test
    void searchNanoMachineTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Nano Machine", () -> {
            $("[class='content-area']").shouldHave(text("Nano Machine"));
        });
    }

    @Test
    void searchTheBladeOfEvolutionWalkingAloneInTheDungeonTest() {
        openIsekaiSkan();
        step(searchNewChapter + "The Blade of Evolution-Walking Alone in the Dungeon", () -> {
            $("[class='content-area']").shouldHave(text("The Blade of Evolution-Walking Alone in the Dungeon"));
        });
    }

    @Test
    void searchReturnToPlayerTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Return To Player", () -> {
            $("[class='content-area']").shouldHave(text("Return To Player"));
        });
    }

    @Test
    void  searchFukushuuOKoinegauTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Fukushuu o Koinegau Saikyou Yuusha wa, Yami no Chikara de Senmetsu Musou Suru", () -> {
            $("[class='content-area']").shouldHave(text("Fukushuu o Koinegau Saikyou Yuusha wa, Yami no Chikara de Senmetsu Musou Suru"));
        });
    }

    @Test
    void searchRecordOfRagnarokTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Record of Ragnarok", () -> {
            $("[class='content-area']").shouldHave(text("Record of Ragnarok"));
        });
    }

    @Test
    void searchTheBeginningAfterTheEndTest() {
        openIsekaiSkan();
        step(searchNewChapter + "The Beginning After the End", () -> {
            $("[class='content-area']").shouldHave(text("The Beginning After the End"));
        });
    }

    @Test
    void searchTheLiveTest() {
        openIsekaiSkan();
        step(searchNewChapter + "The Live", () -> {
            $("[class='content-area']").shouldHave(text("The Live"));
        });
    }

    @Test
    void searchTheStrongestFloristTest() {
        openIsekaiSkan();
        step(searchNewChapter + "The Strongest Florist", () -> {
            $("[class='content-area']").shouldHave(text("The Strongest Florist"));
        });
    }

    @Test
    void searchRedStormTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Red Storm", () -> {
            $("[class='content-area']").shouldHave(text("Red Storm"));
        });
    }

    @Test
    void searchBugPlayerTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Bug player", () -> {
            $("[class='content-area']").shouldHave(text("Bug player"));
        });
    }

    @Test
    void searchBerserkTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Berserk", () -> {
            $("[class='content=area']").shouldHave(text("Berserk"));
        });
    }

    @Test
    void searchReturnersMagicShouldBeSpecialTest() {
        openIsekaiSkan();
        step(searchNewChapter + "A Returner’s Magic Should Be Special", () -> {
            $("[class='content-area']").shouldHave(text("A Returner’s Magic Should Be Special"));
        });
    }

    @Test
    void searchMurimPossessesTheYoungestSonTest() {
        openIsekaiSkan();
        step(searchNewChapter + "Murim Possesses The Youngest Son", () -> {
            $("[class='content-area']").shouldHave(text("Murim Possesses The Youngest Son"));
        });
    }

    @Test
    void searchTheBoyWhoHadBeenContinuouslyBurned() {
        openIsekaiSkan();
        step(searchNewChapter + "The Boy Who Had Been Continuously Burned", () -> {
            $("[class='content-area']").shouldHave(text("The Boy Who Had Been Continuously Burned by the Fires of Hell. Revived, he becomes the strongest flame user."));
        });
    }

    @Test
    void searchBecomingAGodByMyself() {
        openIsekaiSkan();
        step(searchNewChapter + "Becoming a God by Myself", () -> {
            $("[class='data-area']").shouldHave(text("Becoming a God by Myself"));
        });
    }
}

