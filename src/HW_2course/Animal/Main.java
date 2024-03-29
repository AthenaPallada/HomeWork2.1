package HW_2course.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Травоядные:");
        Animal gazelle = new Herbivore(
                "Песчаная газель",
                5,
                "Обитает в пустыни Сахары",
                97,
                "Питается травой, листьями, побегами кустарников.");
        System.out.println(gazelle);
        Animal giraffe = new Herbivore(
                "Южноафриканский жираф",
                2,
                "Обитает в Южной Африке",
                55,
                "Питается листвой древесных крон.");
        System.out.println(giraffe);
        Animal horse = new Herbivore(
                "Домашняя лошадь",
                10,
                "Содержат в конюшне",
                88,
                "Корм  состоит из овса и сена, трава, соломой");
        System.out.println(horse);
        System.out.println("Хищники:");
        Animal hyena = new Predator(
                "Пятнистая гиена",
                8,
                "Обитает в южной и восточной Африке, в Абиссинии и восточном Судане",
                60,
                "Способны поймать и съесть практически любое животное — от мелких антилоп до буйволов и жирафов, реже поедают падаль");
        System.out.println(hyena);
        Animal tiger = new Predator(
                "Амурский тигр",
                6,
                "Обитает в южной части Дальнего Востока",
                80,
                "Основной рацион - кабаны, олени, изюбри и косули. В сильный голод нападают на домашний скот и собак.");
        System.out.println(tiger);
        Animal bear = new Predator(
                "Белый медведь",
                13,
                "Обитает в арктических районах, в зоне континентального шельфа по периферии Северного Ледовитого океана",
                40,
                "Питается кольчатым нерпом, морским заяцем, моржом, так же падалью.");
        System.out.println(bear);
        System.out.println("Земноводные:");
        Animal frog = new Amphibian(
                "Лягушка-бык",
                7,
                "Обитает в пресных водоёмах центра и юго-востока Северной Америки.");
        System.out.println(frog);
        Animal freshWater = new Amphibian(
                "Уж пресноводный",
                10,
                "Обитает почти на всей европейской части России, а также на юге Сибири и Дальнего востока.");
        System.out.println(freshWater);
        System.out.println("Птицы:");
        Animal peacock = new Flightless(
                "Индийский павлин",
                3,
                "Обитает в Шри-Ланке, Индии, Пакистане, Бангладеше и Непале.",
                "При опасности может взлететь, но полет не будет долгим и лишь на несколько метров вперед.");
        System.out.println(peacock);
        Animal penguin = new Flightless(
                "Королевский пингвин",
                15,
                "Гнездится на о. Огненная Земля, Южная Георгия, Южные Сандвичевы острова, Острова Крозе, Кергелен, Маккуори.",
                "Нелетающая птица, по суши ходит медленно, спсобен быстро плавать в воде.");
        System.out.println(penguin);
        Animal birdDodo = new Flightless(
                "Маврикийский дронт",
                5,
                "Являлся эндемиком острова Маврикий",
                "Нелетающая птица, но могла достаточно быстро бегать.");
        System.out.println(birdDodo);
        Animal seagull = new Flying(
                "Реликтовая чайка",
                3,
                "Гнездовые колонии находятся в сухих степях, в песчаных дюнах, на солёных озёрах с непостоянным уровнем воды",
                "Летающая птица, хорошо ходит и плавает, может пикировать за добычей, ныряя неглубоко.");
        System.out.println(seagull);
        Animal albatross = new Flying(
                "Королевский альбатрос",
                58,
                "Гнездится на островах Чатем, Кэмпбелл и Окленд в южной части Тихого океана, а также на юге Новой Зеландии",
                "Отлично летает, ныряет, а на суше передвигается медленно и постоянно спотыкается во время ходьбы.");
        System.out.println(albatross);
        Animal falcon = new Flying(
                "Сапсан",
                20,
                "Сапсан является космополитом — он широко распространён на всех континентах (за исключением Антарктиды)",
                "Сапсан самая быстрая птица в пикирующе полете, по земле ходит мало.");
        System.out.println(falcon);
        System.out.println(giraffe.equals(gazelle));
        tiger.eat();
        seagull.go();
    }
}