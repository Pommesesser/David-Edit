import com.formdev.flatlaf.FlatDarkLaf
import javax.swing.SwingUtilities

fun main() {

    SwingUtilities.invokeLater {

        FlatDarkLaf.setup()
        val window = Window()
        window.setFrameVisible()
    }
}