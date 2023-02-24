import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Car implements Type{
 private  String brand;
 private LocalDate dateOfMade;
 private BigDecimal price;
 private TypeCar TypeCar;

    public Car(String brand, LocalDate dateOfMade, BigDecimal price, TypeCar typeCar) {
        this.brand = brand;
        this.dateOfMade = dateOfMade;
        this.price = price;
        TypeCar = typeCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public TypeCar getTypeCar() {
        return TypeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        TypeCar = typeCar;
    }

    @Override
    public void bodyTypeIdentification(TypeCar typeCar) {
        switch (typeCar){
            case SEDAN -> System.out.println("Легковой классындагы машина");
            case HATCHBACK -> System.out.println("Легков классындагы машина");

            case CROSSOVER-> System.out.println("Внедорожник классындагы машина");
            case UNIVERSAL-> System.out.println("Универсал классындагы машина");


        }
    }

    @Override
    public void determinationYearOfManufacture(LocalDate yearOfManufacture) {
        int date= Period.between(dateOfMade,LocalDate.now()).getYears();
        System.out.println("Чыкканына " +date+" жыл болду");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + ' ' +
                "\n dateOfMade=" + dateOfMade +
                "\n price=" + price +
                "\n TypeCar=" + TypeCar +
                '\n';
    }
}
