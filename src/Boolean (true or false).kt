fun main(args: Array<String>) {
    // Bagian Boolean (Sudah benar)
    var varBool : Boolean = true
    if(varBool) {
        println("varBool bernilai " + varBool)
    }

    // Bagian Int (Perbaikan pada kondisi if)
    var varInt : Int = 1

    // Perbaikan: Bandingkan varInt dengan angka lain agar menghasilkan Boolean
    if(varInt == 1) {
        println("varInt bernilai " + varInt)
    }
}