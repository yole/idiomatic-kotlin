package p04_dsl.t02_html.e1

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun createTable(): String {
    return createHTML().table {
        tr {
            td {
                +"Hello, World!"
            }
        }
    }
}
