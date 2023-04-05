import java.time.LocalDate

data class Battery(
    val model: String,
    val manufacturer: String,
    val type: String,
    val capacity: LocalDate,
    val releaseDate: Int,
    val chargingTime: Double,
    val fastCharging: Boolean
) : Comparable<Battery> {
    override fun compareTo(other: Battery): Int {
        val cmp = model.compareTo(other.model)
        return if (cmp != 0) cmp else chargingTime.compareTo(other.chargingTime)
    }
}
