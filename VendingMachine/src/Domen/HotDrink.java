package Domen;

public class HotDrink extends Product {
    private Integer drinkTemperature;

    public Integer getDrinkTemperuture() {
        return drinkTemperature;
    }

    public void setDrinkTemperuture(Integer drinkTemperuture) {
        this.drinkTemperature = drinkTemperuture;
    }

    // public Integer getDrinkTemprtature() {
    // return drinkTemprtature;
    // }

    public void setDtinkTemprtature(Integer drinkTemperuture) {
        this.drinkTemperature = drinkTemperature;
    }

    // конструкторы
    public HotDrink(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.drinkTemperature = 0;
    }

    public HotDrink(int price, int place, String name, long id, int drinkTemperature) {
        super(price, place, name, id);
        this.drinkTemperature = drinkTemperature;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntemperature=" + drinkTemperature;
    }
}
