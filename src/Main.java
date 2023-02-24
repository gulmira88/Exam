import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car("honda", LocalDate.of(2016, 2, 4), new BigDecimal(220000),
                TypeCar.SEDAN);
        System.out.println(honda);
        honda.determinationYearOfManufacture(honda.getDateOfMade());
        honda.bodyTypeIdentification(honda.getTypeCar());

        System.out.println("******************************");


        Car suzuki = new Car("suzuki", LocalDate.of(2020, 6, 1), new BigDecimal(30000),
                TypeCar.HATCHBACK);
        System.out.println(suzuki);
        suzuki.determinationYearOfManufacture(suzuki.getDateOfMade());
        suzuki.bodyTypeIdentification(suzuki.getTypeCar());

        System.out.println("*******************************");


        Car audi = new Car("audi", LocalDate.of(2019, 10, 2), new BigDecimal(200000),
                TypeCar.CROSSOVER);
        System.out.println(audi);
        audi.determinationYearOfManufacture(audi.getDateOfMade());
        audi.bodyTypeIdentification(audi.getTypeCar());

        System.out.println("***************************");

        Car nissan = new Car("nissan", LocalDate.of(2021, 6, 7), new BigDecimal(120000),
                TypeCar.UNIVERSAL);
        System.out.println(honda);
        nissan.determinationYearOfManufacture(honda.getDateOfMade());
        nissan.bodyTypeIdentification(nissan.getTypeCar());

    }
}