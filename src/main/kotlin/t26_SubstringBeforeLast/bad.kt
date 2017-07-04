package t26_SubstringBeforeLast.bad

data class PathComponents(val directory: String,
                          val pathName: String)

val pattern = Regex("(.+)/([^/]*)")

fun splitPath(path: String): PathComponents {
    val match = pattern.matchEntire(path)
            ?: return PathComponents("", path)

    return PathComponents(match.groupValues[1],
            match.groupValues[2])
}
