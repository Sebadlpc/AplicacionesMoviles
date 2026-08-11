//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val NombreEvento: String = "Kotlin Fest"
    var PrecioEntrada: Int = 12500
    var CantidadEntradas: Int = 3
    var CargoXServicio: Int = 1500
    var Descuento: Int = 5000
    var EventoDisponible: Boolean = true
    var Categoria: String = "A"
    var EdadComprador: Int = 20
    var TieneAutorizacion: Boolean = true

    val subtotal = PrecioEntrada * CantidadEntradas
    val CargoServicio = CargoXServicio * CantidadEntradas
    val AntesDescuento = subtotal + CargoServicio
    val TotalFinal = AntesDescuento - Descuento

    val esMayorEdad = EdadComprador >= 18
    val PuedeComprar = esMayorEdad && TieneAutorizacion

    var CantidadActualizada = CantidadEntradas + 1


    val CompraGrande = CantidadActualizada >= 3 && TotalFinal > 30000

    println(
        "=================================== \n" +
                "        Resumen de Compra \n" +
                "==================================="
    )

    println("Evento: $NombreEvento")
    println("Categoria: $Categoria")
    println("Precion Entrada: $PrecioEntrada")
    println("Cantidad Inicial: $CantidadEntradas")

    println("Subtotal: $subtotal")
    println("Cargo: $CargoServicio")
    println("Total antes del descuento: $AntesDescuento")
    println("Descuento: $Descuento")
    println("Total Final: $TotalFinal")

    println("Evento disponible: $EventoDisponible")
    println("Mayor de Edad: $esMayorEdad")
    println("Evento disponible: $EventoDisponible")
    println("Tiene Autorizacion: $TieneAutorizacion")
    println("Puede Comprar: $PuedeComprar")
    println("Cantidad Actualizada: $CantidadActualizada")
    println("CompraGrande: $CompraGrande")
}