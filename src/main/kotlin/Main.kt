fun main() {
    // Creating entries for the dictionary
    val e1 = Entree("maison", "house")
    val e2 = Entree("chat", "cat")
    val e3 = Entree("chien", "dog")
    val e4 = Entree("oiseau", "bird")

    // Creating a dictionary and adding the entries to it
    val dico = Dictionnaire()
    dico.ajouter(e1)
    dico.ajouter(e2)
    dico.ajouter(e3)
    dico.ajouter(e4)

    // Printing the number of entries in the dictionary
    println("Nombre d'entrées : ${dico.nombreEntrees()}")

    // Printing all the entries in the dictionary
    println("Toutes les entrées du dictionnaire : ")
    println(dico.toString())

    // Removing an entry from the dictionary
    val result1 = dico.supprimer(e3)
    println("Résultat de la suppression de l'entrée $e3 : $result1")

    // Removing an entry by French word
    val result2 = dico.supprimer("oiseau")
    println("Résultat de la suppression de l'entrée avec le mot français 'oiseau' : $result2")

    // Getting all the French words equivalent to an English word
    val motsFrancais = dico.anFr("cat")
    println("Mots français équivalents à 'cat' : $motsFrancais")

    // Getting all the English words in the dictionary
    val motsAnglais = dico.motsAnglais()
    println("Mots anglais dans le dictionnaire : $motsAnglais")

    // Getting a map of English words with their French equivalents
    val dicoAnFr = dico.dictionnaireAnFr()
    println("Dictionnaire anglais-français : $dicoAnFr")
}

fun String.estVideOuBlanche(): Boolean {
    return this.trim().isEmpty() || this.isBlank()
}

fun String.sigle(): String {
    var acronym = ""
    val words = this.trim().split("\\s+".toRegex())
    for (word in words) {
        val firstCapitalLetter = word.trim().first().uppercaseChar()
        acronym += firstCapitalLetter
    }
    return acronym
}
