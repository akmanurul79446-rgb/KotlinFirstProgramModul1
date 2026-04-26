fun main(args: Array<String>) {
    // 1. Pesan Morse yang akan didekode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    var message = ""

    // 2. Definisi alfabet dan array Morse
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"

    // Perbaikan: Pastikan semua string morse berada dalam satu baris yang benar
    val morseChars = arrayOf(
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
        ".--", "-..-", "-.--", "--.."
    )

    // 3. Memecah string Morse berdasarkan spasi
    val characters = s.split(" ")

    // 4. Proses Dekode
    for (morseChar in characters) {
        // Mencari posisi karakter morse di dalam array morseChars
        val index = morseChars.indexOf(morseChar)

        // Jika ditemukan (index tidak -1), ambil huruf yang sesuai dari alphabetChars
        if (index != -1) {
            message += alphabetChars[index]
        }
    }

    println("The decoded message: $message")
}