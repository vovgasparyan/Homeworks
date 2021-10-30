package homework09;

public class Cat extends Pets {

    protected int catPrice;

    public void catsSmell() {
        System.out.println("Cats have an acute sense of smell, due in part to their well-developed olfactory bulb " +
                "and a large surface of olfactory mucosa, about 5.8 square centimetres in area, which is about " +
                "twice that of humans.");
    }

    public void catsTaste() {
        System.out.println("Cats have relatively few taste buds compared to humans (470 or so versus more than 9,000 " +
                "on the human tongue). Domestic and wild cats share a taste receptor gene mutation that keeps their " +
                "sweet taste buds from binding to sugary molecules, leaving them with no ability to taste sweetness. " +
                "Their taste buds instead respond to acids, amino acids like protein, and bitter tastes.");
    }

    public void catsInfo() {
        System.out.println("The cat (Felis catus) is a domestic species of small carnivorous mammal. It is the only " +
                "domesticated species in the family Felidae and is often referred to as the domestic cat to " +
                "distinguish it from the wild members of the family. A cat can either be a house cat, a farm cat or " +
                "a feral cat; the latter ranges freely and avoids human contact. Domestic cats are valued by humans " +
                "for companionship and their ability to hunt rodents. About 60 cat breeds are recognized by various " +
                "cat registries.");
    }

}
