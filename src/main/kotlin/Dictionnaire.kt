class Dictionnaire {
    private val entrees = arrayListOf<Entree>()

    fun nombreEntrees(): Int {
        return entrees.size
    }

    fun ajouter(e: Entree) {
        if (entrees.contains(e)) {
            throw IllegalArgumentException("L'entrée existe déjà dans le dictionnaire.")
        } else {
            entrees.add(e)
        }
    }

    fun supprimer(e: Entree): Boolean {
        return entrees.remove(e)
    }

    fun supprimer(motFrancais: String): Boolean {
        val e = entrees.find { it.motFrancais == motFrancais }
        return e?.let { supprimer(it) } ?: false
    }

    fun anFr(motAnglais: String): List<String> {
        return entrees.filter { it.motAnglais == motAnglais }.map { it.motFrancais }
    }

    fun motsAnglais(): Set<String> {
        return entrees.map { it.motAnglais }.toSet()
    }

    fun dictionnaireAnFr(): Map<String, List<String>> {
        return entrees.groupBy { it.motAnglais }.mapValues { it.value.map { it.motFrancais } }
    }

    override fun toString(): String {
        return entrees.joinToString("\n")
    }
}
