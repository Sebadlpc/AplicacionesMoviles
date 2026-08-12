fun main(){

    val notas = listOf(5.5, 3.2, 6.1, 4.0, 2.8, 5.9, 3.9, 6.5)

    fun estaAprobado(nota: Double): Boolean{
        return nota >= 4.0
    }

    fun calcularPromedio(notas: List<Double>): Double{
        return notas.average()
    }

    val notasAprobadas = notas.filter{nota -> nota >= 4.0}
    val notasReprobadas = notas.filter{nota -> nota < 4.0}
    val promedio = notas.average()
    val notaMenor = notas.any{nota -> nota >= 6.0}
    val todosAprobaron = notas.all { nota -> nota >= 4.0 }
    val primeraNotaInferior = notas.find { nota -> nota < 4.0}
    val bonificacion = notas.map { nota -> nota + 0.5}

    println(
        "=================================== \n" +
                "        Reporte Academico \n" +
                "===================================")

    println("Notas Registradas: ")
    notas.forEach { nota -> println("$nota")}
    println("Notas Aprobadas: \n $notasAprobadas")
    println("Notas Reprobadas:\n $notasReprobadas")
    println("Promedio General: $promedio")
    println("Existe una nota 6.0 o superior: $notaMenor")
    println("Todos Aprobaron: $todosAprobaron")
    println("Primera nota reprobada: $primeraNotaInferior")
    println("Notas con Bonificacion: \n $bonificacion")

    println("====================================")
    println("Promedio calculado por funcion: ${calcularPromedio(notas)}")
    }


