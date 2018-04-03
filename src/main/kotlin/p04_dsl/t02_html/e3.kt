package p04_dsl.t02_html.e3

import kotlinx.html.TABLE
import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

data class Item(val data: String)

fun createTable(items: List<Item>): String {
    return createHTML().table {
        for (item in items) {
            renderItem(item)
        }
    }
}

private fun TABLE.renderItem(item: Item) {
    tr {
        td {
            +item.data
        }
    }
}
