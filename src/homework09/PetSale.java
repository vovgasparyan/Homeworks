package homework09;

public class PetSale extends Pets {

    protected int incomeFromSoldPet;

    protected void whateverMethodAddsMoneyToIncome() {
        setSold(true, this.incomeFromSoldPet);
    }

}
