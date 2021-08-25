fun main(){
    val likes = 6549811
    if ((likes - 11)%100 == 0 || likes == 11)
        println("Понравилось $likes людям")
    else if ((likes-1)%10 == 0)  println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")
}
