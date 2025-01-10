
/* Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado, 3-finalizar programa.
 A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3).
 Si elige una opción incorrecta, informarle del error. El menú se debe volver a mostrar luego de ejecutada cada opción,
 permitiendo volver a elegir. Si elige las opciones 1 ó 2 se imprimirá un texto.
 Si elige la opción 3, se interrumpirá la impresión del menú y el programa finalizará.
 */

fun main() {

    var fin = true

    while (fin) {
        println("\nMenú de opciones:")
        println("1. Comenzar programa")
        println("2. Imprimir listado")
        println("3. Finalizar programa")
        print("Elige una opción (1, 2, o 3): ")

        val opcion = readLine()?.toIntOrNull()

        when (opcion) {
            1 -> {
                println("Has elegido comenzar el programa. ¡El programa ha comenzado!")
            }
            2 -> {
                println("Has elegido imprimir el listado. Aquí está el listado:")
                println("Elemento 1\nElemento 2\nElemento 3")
            }
            3 -> {
                println("Has elegido finalizar el programa. ¡Adiós!")
                fin = false
            }
            else -> {
                println("Opción incorrecta. Por favor, elige una opción válida (1, 2, o 3).")
            }
        }
    }
}
