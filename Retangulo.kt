//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Retângulo

    print("Digite a base do retângulo: ")

    val baseRetangulo = readLine()!!.toDouble()

    print("Digite a altura do retângulo: ")

    val alturaRetangulo = readLine()!!.toDouble()

    val areaRetangulo = baseRetangulo * alturaRetangulo

    println("Área do Retângulo: $areaRetangulo")
}
