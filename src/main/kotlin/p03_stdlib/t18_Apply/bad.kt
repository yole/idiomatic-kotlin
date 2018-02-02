package p03_stdlib.t18_Apply.bad

import java.awt.Color
import javax.swing.JLabel

fun createLabel(): JLabel {
    val label = JLabel("Foo")
    label.foreground = Color.RED
    label.background = Color.BLUE
    return label
}
