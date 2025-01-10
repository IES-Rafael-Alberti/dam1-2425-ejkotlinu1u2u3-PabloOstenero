
/* La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes.
Los ingredientes para cada tipo de pizza aparecen a continuación.

 Ingredientes vegetarianos: Pimiento y tofu.
 Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.

 Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no,
 y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija.
 Solo se puede eligir un ingrediente además de la mozzarella y el tomate que están en todas la pizzas.
 Al final se debe mostrar por pantalla si la pizza elegida es vegetariana o no y todos los ingredientes que lleva. */

fun main() {
    println("¿Qué tipo de pizza deseas?")
    println("1. Vegetariana")
    println("2. No vegetariana")
    print("Introduce el número de tu elección: ")
    val tipoPizza = readLine()

    val ingredientesVegetarianos = listOf("Pimiento", "Tofu")
    val ingredientesNoVegetarianos = listOf("Peperoni", "Jamón", "Salmón")

    val basePizza = listOf("Mozzarella", "Tomate")

    when (tipoPizza) {
        "1" -> {
            println("Ingredientes disponibles para pizza vegetariana: ${ingredientesVegetarianos.joinToString(", ")}")
            print("Elige un ingrediente: ")
            val ingredienteElegido = readLine()?.capitalize()

            if (ingredienteElegido in ingredientesVegetarianos) {
                println("Has elegido una pizza vegetariana con los ingredientes: ${basePizza.joinToString(", ")}, $ingredienteElegido.")
            } else {
                println("Ingrediente no válido. Por favor, elige entre ${ingredientesVegetarianos.joinToString(", ")}.")
            }
        }

        "2" -> {
            println("Ingredientes disponibles para pizza no vegetariana: ${ingredientesNoVegetarianos.joinToString(", ")}")
            print("Elige un ingrediente: ")
            val ingredienteElegido = readLine()?.capitalize()

            if (ingredienteElegido in ingredientesNoVegetarianos) {
                println("Has elegido una pizza no vegetariana con los ingredientes: ${basePizza.joinToString(", ")}, $ingredienteElegido.")
            } else {
                println("Ingrediente no válido. Por favor, elige entre ${ingredientesNoVegetarianos.joinToString(", ")}.")
            }
        }

        else -> {
            println("Por favor, introduce una opción válida (1 para vegetariana, 2 para no vegetariana).")
        }
    }
}
