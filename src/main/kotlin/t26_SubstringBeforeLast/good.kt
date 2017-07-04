package t26_SubstringBeforeLast.good

data class PathComponents(val directory: String,
                          val pathName: String)

fun splitPath(path: String): PathComponents {
    return PathComponents(path.substringBeforeLast('/', ""),
            path.substringAfterLast('/'))
}
