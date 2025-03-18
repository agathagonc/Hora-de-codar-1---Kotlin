//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Paralelogramo

    print("Digite a base do paralelogramo: ")

    val baseParalelogramo = readLine()!!.toDouble()

    print("Digite a altura do paralelogramo: ")

    val alturaParalelogramo = readLine()!!.toDouble()

    val areaParalelogramo = baseParalelogramo * alturaParalelogramo
    println("Área do Paralelogramo: $areaParalelogramo")

}