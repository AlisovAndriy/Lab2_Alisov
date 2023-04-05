/**
Interface for a generic container that stores elements of type T.
 */
interface Container<T> {
    /**
    Adds an element to the container.
    @param element The element to add.
     */
    fun add(element: T)

    /**
    Removes an element from the container at the specified index.
    @param index The index of the element to remove.
     */
    fun remove(index: Int)

    /**
    Updates an element in the container at the specified index with the given element.
    @param index The index of the element to update.
    @param element The new element to replace the existing element.
     */
    fun update(index: Int, element: T)

    /**
    Returns the element at the specified index in the container.
    @param index The index of the element to return.
    @return The element at the specified index.
     */
    fun get(index: Int): T

    /**
    Returns a list of all the elements in the container.
    @return A list of all the elements in the container.
     */
    fun getAll(): List<T>
}

/**
A concrete implementation of the Container interface for storing Vehicle objects.
 */
class VehicleContainer : Container<Vehicle> {
    private val vehicles: MutableList<Vehicle> = mutableListOf()

    /**
    Adds a Vehicle object to the container.
    @param element The Vehicle object to add.
     */
    override fun add(element: Vehicle) {
        vehicles.add(element)
    }

    /**
    Removes the Vehicle object at the specified index from the container.
    @param index The index of the Vehicle object to remove.
     */
    override fun remove(index: Int) {
        vehicles.removeAt(index)
    }

    /**
    Updates the Vehicle object at the specified index in the container with the given Vehicle object.
    @param index The index of the Vehicle object to update.
    @param element The new Vehicle object to replace the existing Vehicle object.
     */
    override fun update(index: Int, element: Vehicle) {
        vehicles[index] = element
    }

    /**
    Returns the Vehicle object at the specified index in the container.
    @param index The index of the Vehicle object to return.
    @return The Vehicle object at the specified index.
     */
    override fun get(index: Int): Vehicle {
        return vehicles[index]
    }

    /**
    Returns a list of all the Vehicle objects in the container.
    @return A list of all the Vehicle objects in the container.
     */
    override fun getAll(): List<Vehicle> {
        return vehicles
    }
}