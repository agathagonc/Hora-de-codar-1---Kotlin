//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Trapézio

    print("Digite a base maior do trapézio: ")

    val baseMaior = readLine()!!.toDouble()

    print("Digite a base menor do trapézio: ")

    val baseMenor = readLine()!!.toDouble()

    print("Digite a altura do trapézio: ")

    val alturaTrapezio = readLine()!!.toDouble()
    
    val areaTrapezio = ((baseMaior + baseMenor) * alturaTrapezio) / 2
    println("Área do Trapézio: $areaTrapezio")

}