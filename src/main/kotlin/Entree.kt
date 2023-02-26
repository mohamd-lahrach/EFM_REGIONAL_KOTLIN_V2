class Entree(var motFrancais: String, var motAnglais: String) {
    init {
        require(motFrancais.isNotBlank() && motAnglais.isNotBlank()) {
            "Les deux mots ne peuvent pas être vides ou blancs."
        }
    }

    override fun toString(): String {
        return "$motFrancais:$motAnglais"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Entree) return false
        return motFrancais == other.motFrancais
    }

    override fun hashCode(): Int {
        var result = motFrancais.hashCode()
        result = 31 * result + motAnglais.hashCode()
        return result
    }
}
