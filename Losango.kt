//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Losango

    print("Digite a diagonal maior do losango: ")

    val diagonalMaior = readLine()!!.toDouble()

    print("Digite a diagonal menor do losango: ")

    val diagonalMenor = readLine()!!.toDouble()
    
    val areaLosango = (diagonalMaior * diagonalMenor) / 2
    println("Área do Losango: $areaLosango")
}