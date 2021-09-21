fun main(){
    val mapOfCountriesAndCapitals = mutableMapOf<String, String>()

    for(i in 0..2){
        print("Enter a country: ")
        val country = readLine()!!
        print("Enter a capital: ")
        val capital = readLine()!!
        mapOfCountriesAndCapitals[country] = capital
    }
    println(mapOfCountriesAndCapitals)
}