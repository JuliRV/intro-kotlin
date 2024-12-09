package Ejercicios4


// definir clases
class ClassRoom(
    val id: Int,
    val name: String,
    var students: ArrayList<Student>
) : ClassInterface {
    override fun addStudent(student: Student) {
        students.add(student)
    }

    override fun toString(): String {
        return "ClassRoom(id=$id, name='$name', students=$students)"
    }


}

class Student(
    val id: Int,
    val name: String,
    var age: Int
) : StudentInterface {
    override fun write() {
    }

    override fun failExamn() {
    }

    override fun read() {
    }

    override fun passExamn() {
    }

    override fun cry() {
    }

    override fun toString(): String {
        return "Student(id=$id, name='$name', age=$age)"
    }

}

fun main() {
    val studentsA: ArrayList<Student> = arrayListOf()
    val studentsB: ArrayList<Student> = arrayListOf()

    studentsA.add(Student(1, "Manolo", 40))
    studentsA.add(Student(2, "Felipe", 18))
    studentsA.add(Student(3, "Pepe", 22))

    studentsB.add(Student(1, "Maria", 40))
    studentsB.add(Student(2, "Alba", 18))
    studentsB.add(Student(3, "Juan", 22))
    studentsB.add(Student(4, "Dani", 22))


    val classRoomA = ClassRoom(1, "Jueves", studentsA)
    val classRoomB = ClassRoom(2, "Viernes", studentsB)

    println("Class RoomA : ${classRoomA}")
    println("Class RoomB : ${classRoomB}")

    val classrooms = listOf(classRoomA, classRoomB)

    for (c in classrooms) {
        println("Clase: ${c.name}")
        for (Student in c.students) {
            if ('a' in Student.name.lowercase()) {
                println(Student)
            }
        }
        println()
    }
}