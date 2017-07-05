package t26_SubstringBeforeLast.good

data class PathParts(val directory: String,
                     val fileName: String)

fun splitPath(path: String) = PathParts(
    path.substringBeforeLast('/', ""),
    path.substringAfterLast('/'))
