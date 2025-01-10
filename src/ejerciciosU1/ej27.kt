
/* Escribir un programa que pregunte el nombre el un producto, su precio y un número de unidades
 y muestre por pantalla una cadena con el nombre del producto seguido de su precio unitario con
 6 dígitos enteros y 2 decimales, el número de unidades con tres dígitos
 y el coste total con 8 dígitos enteros y 2 decimales. */

fun main() {
    print("Introduce el nombre del producto: ")
    val nombre = readLine()

    print("Introduce el precio unitario del producto: ")
    val precio = readLine()?.toDoubleOrNull()

    print("Introduce el número de unidades: ")
    val unidades = readLine()?.toIntOrNull()

    if (nombre != null && precio != null && precio >= 0 && unidades != null && unidades >= 0) {
        val costeTotal = precio * unidades

        println(
            "%-15s %06.2f %03d %08.2f".format(
                nombre,
                precio,
                unidades,
                costeTotal
            )
        )
    } else {
        println("Por favor, introduce valores válidos.")
    }
}
