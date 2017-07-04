package t12_DestructuringList.good

data class NameComponents(val name: String, val ext: String?)

fun splitNameAndExtension(filename: String): NameComponents {
    if ('.' in filename) {
        val (name, ext) = filename.split('.', limit = 2)
        return NameComponents(name, ext)
    }
    return NameComponents(filename, null)
}
