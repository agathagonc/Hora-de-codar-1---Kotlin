//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Triângulo

    print("Digite a base do triângulo: ")

    val baseTriangulo = readLine()!!.toDouble()

    print("Digite a altura do triângulo: ")

    val alturaTriangulo = readLine()!!.toDouble()
    
    val areaTriangulo = (baseTriangulo * alturaTriangulo) / 2
    println("Área do Triângulo: $areaTriangulo")

}