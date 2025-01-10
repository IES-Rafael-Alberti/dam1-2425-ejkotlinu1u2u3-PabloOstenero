
/* Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas,
y muestre por pantalla cada uno de los productos en una línea distinta. */

fun main() {
    print("Introduce los productos de la cesta de la compra, separados por comas: ")
    val productos = readLine()

    if (productos != null && productos.isNotBlank()) {
        val listaProductos = productos.split(",").map { it.trim() }

        println("Los productos de tu cesta son:")
        for (producto in listaProductos) {
            println("- $producto")
        }
    } else {
        println("Por favor, introduce una lista válida de productos.")
    }
}
