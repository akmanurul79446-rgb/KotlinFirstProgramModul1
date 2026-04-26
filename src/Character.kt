fun main(args: Array<String>) {
    var charA : Char = 'A'

    // 1. Mengecek apakah huruf besar/kecil/angka
    println("Apakah '$charA' huruf kapital? " + charA.isUpperCase())
    println("Apakah '$charA' huruf kecil? " + charA.isLowerCase())
    println("Apakah '$charA' sebuah angka? " + charA.isDigit())

    // 2. Mengubah ke huruf kecil (Gunakan lowercaseChar() atau lowercase())
    println("Hasil ubah ke huruf kecil: " + charA.lowercaseChar())

    // 3. Konversi ke String
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = " + strA)
}