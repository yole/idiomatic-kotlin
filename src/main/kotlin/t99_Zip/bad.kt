package t99_Zip.bad

fun calculateRequestDurations(requestTimestamps: LongArray,
                              responseTimestamps: LongArray) =
    requestTimestamps.mapIndexed { index, req ->
        responseTimestamps[index] - req
    }
