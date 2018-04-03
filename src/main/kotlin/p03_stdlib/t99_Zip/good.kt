package p03_stdlib.t99_Zip.good

fun calculateRequestDurations(
    requestTimestamps: LongArray,
    responseTimestamps: LongArray
) =
    (requestTimestamps zip responseTimestamps).map { (req, res) -> res - req }
