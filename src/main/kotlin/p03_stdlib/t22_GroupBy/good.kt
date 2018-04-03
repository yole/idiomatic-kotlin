package p03_stdlib.t22_GroupBy.good

class Request(
    val url: String,
    val remoteIP: String,
    val timestamp: Long
)

fun analyzeLog(log: List<Request>) {
    val map = log.groupBy(Request::url)
}
