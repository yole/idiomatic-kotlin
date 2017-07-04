package t24_Zip.good

fun calculateRequestDurations(requestTimestamps: LongArray,
                              responseTimestamps: LongArray) =
     (requestTimestamps zip responseTimestamps).map { (req, res) -> res - req }
