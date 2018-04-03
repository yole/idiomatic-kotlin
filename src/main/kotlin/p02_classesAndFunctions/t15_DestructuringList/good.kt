package p02_classesAndFunctions.t15_DestructuringList.good

data class NameExt(
    val name: String,
    val ext: String?
)

fun splitNameAndExtension(filename: String): NameExt {
    if ('.' in filename) {
        val (name, ext) = filename.split('.', limit = 2)
        return NameExt(name, ext)
    }
    return NameExt(filename, null)
}
