fun main(args: Array<String>) {
    // 1. Penggunaan 'var' (Bisa diubah nilainya)
    var varVariabel: Int
    varVariabel = 56
    println("Pemberian nilai pertama pada varVariabel = $varVariabel")

    varVariabel = 78
    println("Pemberian nilai kedua pada varVariabel = $varVariabel")

    // 2. Penggunaan 'val' (Tetap/Konstanta)
    val phi = 3.14
    println("Nilai phi tetap = $phi")

    // phi = 2.5 // Baris ini HARUS dihapus atau dikomentar karena akan menyebabkan ERROR
}