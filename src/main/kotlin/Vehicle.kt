import java.time.LocalDate

data class Vehicle(
    val brand: String,
    val model: String,
    val manufacturer: String,
    val releaseDate: LocalDate,
    val topSpeed: Int,
    val price: Int,
    val abs: Boolean,
    val battery: List<Battery>
) : Comparable<Vehicle> {
    override fun compareTo(other: Vehicle): Int {
        val cmp = brand.compareTo(other.brand)
        return if (cmp != 0) cmp else price.compareTo(other.price)
    }
}
