
/* Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga
 (en caso de haber más de una, mostrar la primera) y cuántas palabras había.
 Precondición: se tomará como separador de palabras al carácter “ “ (espacio), ya sea uno o más. */

fun main() {
    print("Introduce una frase: ")
    val frase = readLine()?.trim()

    if (!frase.isNullOrBlank()) {
        val palabras = frase.split(Regex("\\s+"))

        val palabraMasLarga = palabras.maxByOrNull { it.length }

        println("La palabra más larga es: $palabraMasLarga")
        println("Número de palabras: ${palabras.size}")
    } else {
        println("Por favor, introduce una frase válida.")
    }
}
