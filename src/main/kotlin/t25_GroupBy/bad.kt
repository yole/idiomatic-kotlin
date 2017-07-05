package t25_GroupBy.bad

class Request(val url: String,
              val remoteIP: String,
              val timestamp: Long)

fun analyzeRequests(log: List<Request>) {
    val map = mutableMapOf<String, MutableList<Request>>()
    for (request in log) {
        map.getOrPut(request.url) { mutableListOf() }
                .add(request)
    }
}
