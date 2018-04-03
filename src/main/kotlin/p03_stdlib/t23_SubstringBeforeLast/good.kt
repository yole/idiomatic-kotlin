package p03_stdlib.t23_SubstringBeforeLast.good

data class PathParts(
    val dir: String,
    val name: String
)

fun splitPath(path: String) = PathParts(
    path.substringBeforeLast('/', ""),
    path.substringAfterLast('/')
)
