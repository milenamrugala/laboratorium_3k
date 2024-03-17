class Student(
    private var firstName: String,
    private var lastName: String,
    private var id: String
) {

    override fun toString(): String {
        return "Student(firstName='$firstName', lastName='$lastName', id='$id')"
    }

    fun getFirstName(): String {
        return firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun getId(): String {
        return id
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName

    }
}