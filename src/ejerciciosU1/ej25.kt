/* Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla,
 el día, el mes y el año.
 Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan con un solo carácter. */

fun main() {
    print("Introduce tu fecha de nacimiento (formato dd/mm/aaaa): ")
    val fecha = readLine()

    if (fecha != null) {
        val regex = Regex("""(\d{1,2})/(\d{1,2})/(\d{4})""")
        val matchResult = regex.matchEntire(fecha)

        if (matchResult != null) {
            val (dia, mes, anio) = matchResult.destructured

            println("Día: $dia")
            println("Mes: $mes")
            println("Año: $anio")
        } else {
            println("Formato de fecha inválido. Por favor, usa el formato dd/mm/aaaa.")
        }
    } else {
        println("No se ha introducido ninguna fecha.")
    }
}
