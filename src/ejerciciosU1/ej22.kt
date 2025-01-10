
/* Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y
 después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula. */

fun main() {
    print("Introduce una frase: ")
    val frase = readLine()

    print("Introduce una vocal: ")
    val vocal = readLine()

    if (frase != null && vocal != null && vocal.length == 1 && "aeiouAEIOU".contains(vocal)) {
        val resultado = frase.replace(vocal, vocal.uppercase())

        println("La frase con la vocal en mayúscula es: $resultado")
    } else {
        println("Por favor, introduce una frase válida y una vocal.")
    }
}