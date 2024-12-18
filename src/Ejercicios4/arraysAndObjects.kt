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
        return "ClassRoom (id = $id, name = '$name', students = $students)"
    }


}

class Student(
    val id: Int,
    val name: String,
    var age: Int,
    var isApproved: Boolean,
    var isProgressing: Boolean,
    var needHelp: Boolean
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
        return "Student(id = $id, name = '$name', age = $age, isApproved = $isApproved, isProgressing = $isProgressing, needHelp = $needHelp)"
    }

}

fun main() {
    val studentsA: ArrayList<Student> = arrayListOf()
    val studentsB: ArrayList<Student> = arrayListOf()

    studentsA.add(Student(1, "Manolo", 40, true, true, false))
    studentsA.add(Student(2, "Felipe", 18, true, true, false))
    studentsA.add(Student(3, "Pepe", 22, false, false, false))

    studentsB.add(Student(1, "Maria", 40, false, false, false))
    studentsB.add(Student(2, "Alba", 18, false, false, false))
    studentsB.add(Student(3, "Juan", 22, true, false, false))
    studentsB.add(Student(4, "Dani", 22, true, true, false))


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

    for (c in classrooms) {
        println("Alumnos que necesitan ayuda:")
        for (Student in c.students) {
            if (Student.isApproved == false && Student.isProgressing == false) {
                Student.needHelp = true
                println(Student)
            }
        }
        println()
    }
    val failedStudents = arrayListOf<Student>()
    for (c in classrooms) {
        for (Student in c.students) {
            if (Student.isApproved == false && Student.isProgressing == false) {
                Student.needHelp = true
                failedStudents.add(Student)

            }
        }
    }
    println("Alumnos suspendidos de todas las clases: ${failedStudents}")

}