package t12_DestructuringList.bad

data class NameComponents(val name: String, val ext: String?)

fun splitNameAndExtension(filename: String): NameComponents {
    if ('.' in filename) {
        val parts = filename.split('.', limit = 2)
        return NameComponents(parts[0], parts[1])
    }
    return NameComponents(filename, null)
}
