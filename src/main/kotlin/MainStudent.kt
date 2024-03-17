fun main() {

    fun showStudent(students: List<Student>) {
        for (student in students) {
            println(student)
        }
    }

    val students: List<Student> = listOf(
        Student("Milena", "Mrugała", "51251"),
        Student("Monika", "Fik", "41341"),
        Student("Adam", "Malinowski", "71571"),
        Student("Anna", "Lewandowska", "90890"),
        Student("Barbara", "Starzyńska", "45645")
    )

    showStudent(students)
    println()
    // students.add(Student("Henryk", "Fik", "12431")) - dodanie nowego studenta niemożliwe
    // students.removeAt(0) - - usunięcie studenta niemożliwe


    val secondStudents: MutableList<Student> = mutableListOf(
        Student("Milena", "Mrugała", "51251"),
        Student("Monika", "Fik", "41341"),
        Student("Adam", "Malinowski", "71571"),
        Student("Anna", "Lewandowska", "90890"),
        Student("Barbara", "Starzyńska", "45645")
    )

    showStudent(secondStudents)
    println()
    secondStudents.add(Student("Henryk", "Fik", "12431"))
    secondStudents.removeAt(0)
    showStudent(secondStudents)

}




