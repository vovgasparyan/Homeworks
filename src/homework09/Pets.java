package homework09;

public class Pets {

    protected String petName;
    protected int petAge;
    protected String petGender;

    private boolean sold;
    protected int incomeFromSoldPet;

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold, int income) {
        this.incomeFromSoldPet += income;
        this.sold = sold;
    }
}
