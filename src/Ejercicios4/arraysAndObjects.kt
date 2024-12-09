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
    var age: Int,
    var isApproved: Boolean,
    var isProgressing: Boolean
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
        return "Student(id=$id, name='$name', age=$age, isApproved=$isApproved, isProgressing=$isProgressing)"
    }

}

fun main() {
    val studentsA: ArrayList<Student> = arrayListOf()
    val studentsB: ArrayList<Student> = arrayListOf()

    studentsA.add(Student(1, "Manolo", 40, true, true))
    studentsA.add(Student(2, "Felipe", 18, true, true))
    studentsA.add(Student(3, "Pepe", 22, false, false))

    studentsB.add(Student(1, "Maria", 40, false, false))
    studentsB.add(Student(2, "Alba", 18, false, false))
    studentsB.add(Student(3, "Juan", 22, true, false))
    studentsB.add(Student(4, "Dani", 22, true, true))


    val classRoomA = ClassRoom(1, "A", studentsA)
    val classRoomB = ClassRoom(2, "B", studentsB)

    println("Info Clase A: ${classRoomA}")
    println("Info Clase B: ${classRoomB}")
    println()
    val classrooms = listOf(classRoomA, classRoomB)

    for (c in classrooms) {
        println("Alumnos con una 'a' en la clase: ${c.name}")
        for (Student in c.students) {
            if ('a' in Student.name.lowercase()) {
                println(Student)
            }
        }
        println()
    }

    for (s in classrooms) {
        println("Alumnos suspendidos y no progresando en la clase ${s.name}:")
        for (Student in s.students) {
            if (Student.isApproved == false && Student.isProgressing == false) {
                println(Student)
            }
        }
        println()
    }
}