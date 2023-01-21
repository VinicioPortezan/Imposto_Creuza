fun main() {
    print("Qual o valor do produto? US$")
    val preco = readln().toDouble()
    val imposto: Double = (preco * 60) / 100
    print(String.format("O imposto será de US$%.2f",imposto))
}