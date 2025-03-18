//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Círculo

    print("Digite o raio do círculo: ")

    val raio = readLine()!!.toDouble()

    val areaCirculo = Math.PI * raio * raio

    println("Área do Círculo: $areaCirculo")
}