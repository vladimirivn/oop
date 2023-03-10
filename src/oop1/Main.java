package oop1;

import oop1.transport.Car;
import oop1.transport.Bus;
import oop1.transport.Transport;
import oop1.transport.Truck;
import oop1.transport.drivers.DriveC;
import oop1.transport.drivers.DriverB;
import oop1.transport.drivers.DriverD;
import oop1.transport.exception.CantFindLicenseException;
import oop1.transport.exception.WrongLicenseException;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Водитель категории B №" + i, false, i);
            Car car = new Car("Lada_" + i,
                    "Vesta Sport",
                    1.7,
                    driverB,
                    Car.CarBodyType.SEDAN
            );
            DriveC driverC = new DriveC("Водитель категории C №" + i, true, i + 3);
            Bus bus = new Bus("Volzhanin_" + i,
                    "Liner",
                    2.5,
                    driverC,
                    Bus.CapacityBus.EXTRA_SMALL
            );
            DriverD driverD = new DriverD("Водитель категории D №" + i, true, i + 5);
            Truck truck = new Truck("Kamaz_" + i,
                    "Travel",
                    3.5,
                    driverD,
                    Truck.WeightTruck.N3
            );
            System.out.println("-------------------------");
            System.out.println(car);

            car.printType();
            car.pitStop();
            car.bestTimeCircle();
            car.maximumSpeed();
            try {
                car.passDiagnostics();
            } catch (CantFindLicenseException e){
//                     | WrongLicenseException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("-------------------------");
            System.out.println(bus);

            bus.printType();
            bus.pitStop();
            bus.bestTimeCircle();
            bus.maximumSpeed();
            try {
                bus.passDiagnostics();
            } catch (CantFindLicenseException e) {
//                |
//            } WrongLicenseException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("-------------------------");
            System.out.println(truck);

            truck.printType();
            truck.pitStop();
            truck.bestTimeCircle();
            truck.maximumSpeed();
            try {
                truck.passDiagnostics();
            } catch (CantFindLicenseException e) {
//                |
//            } WrongLicenseException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("----------- Заезды --------------");
            printInfoCompeting(car);
            printInfoCompeting(bus);
            printInfoCompeting(truck);
        }
    }

    private static void printInfoCompeting(Transport<?> transport) {
        if (transport.getDriver().isDriversLicense()) {
            System.out.println("водитель " + transport.getDriver().getFullName() +
                    " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        } else {
            System.out.println("водитель " + transport.getDriver().getFullName() +
                    " не может управлять автомобилем " + transport.getBrand() + " и не будет участвовать в заезде");
        }
    }
}
