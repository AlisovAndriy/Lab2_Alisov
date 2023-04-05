import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.time.LocalDate

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val vehicleContainer = context.getBean(Container::class.java) as VehicleContainer

    val battery = listOf(
        Battery("YN", "Anker", "Li-ion", LocalDate.of(2021, 1, 5), 30, 5.0, true),
        Battery("XH", "Duracell", "NiMH", LocalDate.of(2022, 3, 15), 20, 4.5, false),
        Battery("ZP", "Energizer", "Alkaline", LocalDate.of(2021, 7, 22), 15, 3.0, true),
    )

    vehicleContainer.add(
        Vehicle(
            "Mercedes-Benz", "GLE 350", "Mercedes-Benz Group", LocalDate.of(1997, 2, 19), 209, 81116, true, battery
        ),
    )
    vehicleContainer.add(
        Vehicle(
            "Ford", "Mustang", "Ford Motor Company", LocalDate.of(1964, 4, 17), 210, 78900, false, battery
        ),
    )
    vehicleContainer.add(
        Vehicle(
            "Dodge", "Challenger", "Stellantis", LocalDate.of(1970, 9, 1), 230, 92783, false, battery
        ),
    )
}