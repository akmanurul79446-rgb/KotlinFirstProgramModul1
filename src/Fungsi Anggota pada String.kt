fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    // Perhatikan: startsWith bersifat case-sensitive (huruf besar/kecil berpengaruh)
    println(s.startsWith("Rhin")) // Diubah jadi "Rhin" karena aslinya huruf R besar
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    // Gunakan .lowercase() sebagai ganti .toLowerCase()
    var config = "Fullscreen shaDows autosave"
    config = config.lowercase()

    println("\n--- Game Configuration ---")
    println("Will the game run in fullscreen? " + config.contains("fullscreen"))
    println("Will shadows be turned on? " + config.contains("shadows"))
    println("Will sound be turned off? " + config.contains("nosound"))
    println("Would the player like to use autosave? " + config.contains("autosave"))

    // replace()
    println("\n--- Replace Section ---")
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")

    // Perbaikan: Cetak strJava, bukan s (agar terlihat perubahannya)
    println(strJava)
    println("$strJava is ${strJava.length} characters long.")

    // substring()
    println("\n--- Substring & Compare ---")
    // Mengambil karakter dari indeks 2 sampai sebelum 7 (yaitu 'would')
    println("I would not banish all of these Internets.".substring(2, 7))

    // compareTo()
    // Hasil negatif berarti "alpha" secara alfabetis muncul sebelum "bravo"
    println("alpha".compareTo("bravo"))
}