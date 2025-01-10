
/* Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales y
 muestre por pantalla el número de euros y el número de céntimos del precio introducido. */

fun main() {
    print("Introduce el precio del producto en euros (con dos decimales): ")
    val precio = readLine()?.toDoubleOrNull()

    if (precio != null && precio >= 0) {
        val euros = precio.toInt()
        val centimos = ((precio - euros) * 100).toInt()

        println("El precio tiene $euros euros y $centimos céntimos.")
    } else {
        println("Por favor, introduce un precio válido.")
    }
}