package p02_classesAndFunctions.t15_DestructuringList.bad

data class NameExt(
    val name: String,
    val ext: String?
)

fun splitNameExt(filename: String): NameExt {
    if ('.' in filename) {
        val parts = filename.split('.', limit = 2)
        return NameExt(parts[0], parts[1])
    }
    return NameExt(filename, null)
}
