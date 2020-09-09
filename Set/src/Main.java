import java.util.ArrayList;

public class Main {

    private static double testSet(Set<String> set, String word) {

        Long startTime = System.nanoTime();

        ArrayList<String> words1 = new ArrayList<>();
//        FileOperation.readFile("pride-and-prejudice.txt", words1);
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            words1.add(String.valueOf(chars[i]));
        }

        System.out.println("Total words:" + words1.size());

        for (String s : words1) {
            set.add(s);
        }
        System.out.println("Total different words:" + set.getSize());


        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;

    }

    public static void main(String[] args) {

        String word = "There were a king with a large jaw and a queen with a plain face, on the\n" +
                "throne of England; there were a king with a large jaw and a queen with\n" +
                "a fair face, on the throne of France. In both countries it was clearer\n" +
                "than crystal to the lords of the State preserves of loaves and fishes,\n" +
                "that things in general were settled for ever.\n" +
                "\n" +
                "It was the year of Our Lord one thousand seven hundred and seventy-five.\n" +
                "Spiritual revelations were conceded to England at that favoured period,\n" +
                "as at this. Mrs. Southcott had recently attained her five-and-twentieth\n" +
                "blessed birthday, of whom a prophetic private in the Life Guards had\n" +
                "heralded the sublime appearance by announcing that arrangements were\n" +
                "made for the swallowing up of London and Westminster. Even the Cock-lane\n" +
                "ghost had been laid only a round dozen of years, after rapping out its\n" +
                "messages, as the spirits of this very year last past (supernaturally\n" +
                "deficient in originality) rapped out theirs. Mere messages in the\n" +
                "earthly order of events had lately come to the English Crown and People,\n" +
                "from a congress of British subjects in America: which, strange\n" +
                "to relate, have proved more important to the human race than any\n" +
                "communications yet received through any of the chickens of the Cock-lane\n" +
                "brood.\n" +
                "\n" +
                "France, less favoured on the whole as to matters spiritual than her\n" +
                "sister of the shield and trident, rolled with exceeding smoothness down\n" +
                "hill, making paper money and spending it. Under the guidance of her\n" +
                "Christian pastors, she entertained herself, besides, with such humane\n" +
                "achievements as sentencing a youth to have his hands cut off, his tongue\n" +
                "torn out with pincers, and his body burned alive, because he had not\n" +
                "kneeled down in the rain to do honour to a dirty procession of monks\n" +
                "which passed within his view, at a distance of some fifty or sixty\n" +
                "yards. It is likely enough that, rooted in the woods of France and\n" +
                "Norway, there were growing trees, when that sufferer was put to death,\n" +
                "already marked by the Woodman, Fate, to come down and be sawn into\n" +
                "boards, to make a certain movable framework with a sack and a knife in\n" +
                "it, terrible in history. It is likely enough that in the rough outhouses\n" +
                "of some tillers of the heavy lands adjacent to Paris, there were\n" +
                "sheltered from the weather that very day, rude carts, bespattered with\n" +
                "rustic mire, snuffed about by pigs, and roosted in by poultry, which\n" +
                "the Farmer, Death, had already set apart to be his tumbrils of\n" +
                "the Revolution. But that Woodman and that Farmer, though they work\n" +
                "unceasingly, work silently, and no one heard them as they went about\n" +
                "with muffled tread: the rather, forasmuch as to entertain any suspicion\n" +
                "that they were awake, was to be atheistical and traitorous.\n" +
                "\n" +
                "In England, there was scarcely an amount of order and protection to\n" +
                "justify much national boasting. Daring burglaries by armed men, and\n" +
                "highway robberies, took place in the capital itself every night;\n" +
                "families were publicly cautioned not to go out of town without removing\n" +
                "their furniture to upholsterers' warehouses for security; the highwayman\n" +
                "in the dark was a City tradesman in the light, and, being recognised and\n" +
                "challenged by his fellow-tradesman whom he stopped in his character of\n" +
                "“the Captain,” gallantly shot him through the head and rode away; the\n" +
                "mail was waylaid by seven robbers, and the guard shot three dead, and\n" +
                "then got shot dead himself by the other four, “in consequence of the\n" +
                "failure of his ammunition:” after which the mail was robbed in peace;\n" +
                "that magnificent potentate, the Lord Mayor of London, was made to stand\n" +
                "and deliver on Turnham Green, by one highwayman, who despoiled the\n" +
                "illustrious creature in sight of all his retinue; prisoners in London\n" +
                "gaols fought battles with their turnkeys, and the majesty of the law\n" +
                "fired blunderbusses in among them, loaded with rounds of shot and ball;\n" +
                "thieves snipped off diamond crosses from the necks of noble lords at\n" +
                "Court drawing-rooms; musketeers went into St. Giles's, to search\n" +
                "for contraband goods, and the mob fired on the musketeers, and the\n" +
                "musketeers fired on the mob, and nobody thought any of these occurrences\n" +
                "much out of the common way. In the midst of them, the hangman, ever busy\n" +
                "and ever worse than useless, was in constant requisition; now, stringing\n" +
                "up long rows of miscellaneous criminals; now, hanging a housebreaker on\n" +
                "Saturday who had been taken on Tuesday; now, burning people in the\n" +
                "hand at Newgate by the dozen, and now burning pamphlets at the door of\n" +
                "Westminster Hall; to-day, taking the life of an atrocious murderer,\n" +
                "and to-morrow of a wretched pilferer who had robbed a farmer's boy of\n" +
                "sixpence.\n" +
                "\n" +
                "All these things, and a thousand like them, came to pass in and close\n" +
                "upon the dear old year one thousand seven hundred and seventy-five.\n" +
                "Environed by them, while the Woodman and the Farmer worked unheeded,\n" +
                "those two of the large jaws, and those other two of the plain and the\n" +
                "fair faces, trod with stir enough, and carried their divine rights\n" +
                "with a high hand. Thus did the year one thousand seven hundred\n" +
                "and seventy-five conduct their Greatnesses, and myriads of small\n" +
                "creatures--the creatures of this chronicle among the rest--along the\n" +
                "roads that lay before them.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "II. The Mail\n" +
                "\n" +
                "\n" +
                "It was the Dover road that lay, on a Friday night late in November,\n" +
                "before the first of the persons with whom this history has business.\n" +
                "The Dover road lay, as to him, beyond the Dover mail, as it lumbered up\n" +
                "Shooter's Hill. He walked up hill in the mire by the side of the mail,\n" +
                "as the rest of the passengers did; not because they had the least relish\n" +
                "for walking exercise, under the circumstances, but because the hill,\n" +
                "and the harness, and the mud, and the mail, were all so heavy, that the\n" +
                "horses had three times already come to a stop, besides once drawing the\n" +
                "coach across the road, with the mutinous intent of taking it back\n" +
                "to Blackheath. Reins and whip and coachman and guard, however, in\n" +
                "combination, had read that article of war which forbade a purpose\n" +
                "otherwise strongly in favour of the argument, that some brute animals\n" +
                "are endued with Reason; and the team had capitulated and returned to\n" +
                "their duty.\n" +
                "\n" +
                "With drooping heads and tremulous tails, they mashed their way through\n" +
                "the thick mud, floundering and stumbling between whiles, as if they were\n" +
                "falling to pieces at the larger joints. As often as the driver rested\n" +
                "them and brought them to a stand, with a wary “Wo-ho! so-ho-then!” the\n" +
                "near leader violently shook his head and everything upon it--like an\n" +
                "unusually emphatic horse, denying that the coach could be got up the\n" +
                "hill. Whenever the leader made this rattle, the passenger started, as a\n" +
                "nervous passenger might, and was disturbed in mind.";
        BSTSet<String> bstSet = new BSTSet<>();
        LinkedListSet<String> linkedListSet = new LinkedListSet<>();
        double time1 = testSet(bstSet, word);
        System.out.println("BSTSet:" + time1 + "s");
        System.out.println();

        double time2 = testSet(linkedListSet, word);
        System.out.println("LinkedListSet:" + time2 + "s");

    }
}
