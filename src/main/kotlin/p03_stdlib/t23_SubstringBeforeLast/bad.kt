package p03_stdlib.t23_SubstringBeforeLast.bad

data class PathParts(
    val dir: String,
    val name: String
)

val pattern = Regex("(.+)/([^/]*)")

fun splitPath(path: String): PathParts {
    val match = pattern.matchEntire(path)
            ?: return PathParts("", path)

    return PathParts(
        match.groupValues[1],
        match.groupValues[2]
    )
}
