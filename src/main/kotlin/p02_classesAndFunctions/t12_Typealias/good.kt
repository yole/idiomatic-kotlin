package p02_classesAndFunctions.t12_Typealias.good

class Event

typealias ClickHandler = (Event) -> Unit

class EventDispatcher {
    fun addClickHandler(handler: ClickHandler) {
    }

    fun removeClickHandler(handler: ClickHandler) {
    }
}
