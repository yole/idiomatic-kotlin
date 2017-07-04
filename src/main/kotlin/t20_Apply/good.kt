package t20_Apply.good

import java.awt.Color
import javax.swing.JLabel

fun createLabel() = JLabel("Foo").apply {
    foreground = Color.RED
    background = Color.BLUE
}
