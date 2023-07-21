package mate.jdbc;

import mate.jdbc.lib.Injector;
import mate.jdbc.service.driver.DriverService;
import mate.jdbc.service.manufacturer.ManufacturerService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.jdbc");

    public static void main(String[] args) {
        ManufacturerService manufacturerService =
                (ManufacturerService) injector.getInstance(ManufacturerService.class);
        manufacturerService.getAll().forEach(System.out::println);
        System.out.println();
        DriverService driverService = (DriverService) injector.getInstance(DriverService.class);
        driverService.getAll().forEach(System.out::println);
    }
}
