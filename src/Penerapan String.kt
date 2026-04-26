fun main(args: Array<String>) {
    // 1. Perbaikan: Gunakan Triple Quotes (""") untuk string yang panjang/berbaris
    var s = """A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, 
    Wash, and Repeat."""

    println(s)

    // 2. Perbaikan: Gunakan .lowercase() standar Kotlin terbaru
    s = s.lowercase()

    var vowelCount = 0
    var consonantCount = 0

    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    // Loop pengecekan
    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }

    println("\n--- Hasil Analisis Karakter ---")
    println("Vowels (Vokal)    : $vowelCount")
    println("Consonants (Konsonan): $consonantCount")
    println("Other characters (Lainnya): ${s.length - (vowelCount + consonantCount)}")
}