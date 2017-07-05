package t25_GroupBy.good

class Request(val url: String,
              val remoteIP: String,
              val timestamp: Long)

fun analyzeRequests(log: List<Request>) {
    val map = log.groupBy(Request::url)
}
