
/* Escribir un programa que permita gestionar la base de datos de clientes de una empresa.
 Los clientes se guardarán en un diccionario en el que la clave de cada cliente será su NIF,
 y el valor será otro diccionario con los datos del cliente (nombre, dirección, teléfono, correo, preferente),
 donde preferente tendrá el valor True si se trata de un cliente preferente.
 El programa debe preguntar al usuario por una opción del siguiente menú: (1) Añadir cliente,
 (2) Eliminar cliente, (3) Mostrar cliente, (4) Listar todos los clientes, (5) Listar clientes preferentes, (6) Terminar.
 En función de la opción elegida el programa tendrá que hacer lo siguiente:

 Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la base de datos.
 Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
 Preguntar por el NIF del cliente y mostrar sus datos.
 Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
 Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
 Terminar el programa. */

data class Cliente(
    val nombre: String,
    val direccion: String,
    val telefono: String,
    val correo: String,
    val preferente: Boolean
)

fun main() {
    val baseDeDatos = mutableMapOf<String, Cliente>()

    var check = true

    while (check) {
        println("\nSeleccione una opción:")
        println("1. Añadir cliente")
        println("2. Eliminar cliente")
        println("3. Mostrar cliente")
        println("4. Listar todos los clientes")
        println("5. Listar clientes preferentes")
        println("6. Terminar")
        print("Opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Introduce el NIF del cliente: ")
                val nif = readLine()!!
                print("Introduce el nombre del cliente: ")
                val nombre = readLine()!!
                print("Introduce la dirección del cliente: ")
                val direccion = readLine()!!
                print("Introduce el teléfono del cliente: ")
                val telefono = readLine()!!
                print("Introduce el correo del cliente: ")
                val correo = readLine()!!
                print("¿Es cliente preferente? (true/false): ")
                val preferente = readLine()?.toBoolean() ?: false

                val cliente = Cliente(nombre, direccion, telefono, correo, preferente)

                baseDeDatos[nif] = cliente
                println("Cliente añadido correctamente.")
            }
            2 -> {
                print("Introduce el NIF del cliente a eliminar: ")
                val nifEliminar = readLine()!!

                if (baseDeDatos.containsKey(nifEliminar)) {
                    baseDeDatos.remove(nifEliminar)
                    println("Cliente eliminado correctamente.")
                } else {
                    println("No se encontró un cliente con ese NIF.")
                }
            }
            3 -> {
                print("Introduce el NIF del cliente a mostrar: ")
                val nifMostrar = readLine()!!

                val cliente = baseDeDatos[nifMostrar]
                if (cliente != null) {
                    println("Datos del cliente:")
                    println("Nombre: ${cliente.nombre}")
                    println("Dirección: ${cliente.direccion}")
                    println("Teléfono: ${cliente.telefono}")
                    println("Correo: ${cliente.correo}")
                    println("Preferente: ${cliente.preferente}")
                } else {
                    println("No se encontró un cliente con ese NIF.")
                }
            }
            4 -> {
                println("Listado de todos los clientes:")
                for ((nif, cliente) in baseDeDatos) {
                    println("NIF: $nif, Nombre: ${cliente.nombre}")
                }
            }
            5 -> {
                println("Listado de clientes preferentes:")
                for ((nif, cliente) in baseDeDatos) {
                    if (cliente.preferente) {
                        println("NIF: $nif, Nombre: ${cliente.nombre}")
                    }
                }
            }
            6 -> {
                println("Terminando el programa.")
                check = false
            }
            else -> {
                println("Opción no válida. Por favor, elija una opción válida.")
            }
        }
    }
}
