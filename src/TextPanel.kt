import java.awt.Font
import javax.swing.JTextArea

class TextPanel {

    private val textArea = JTextArea()

    init {

        textArea.lineWrap = true
        textArea.wrapStyleWord = true
        textArea.font = Font("Monospaced", Font.PLAIN, 16)
    }

    fun getFontHeight(): Int {

        val fontMetrics = textArea.getFontMetrics(textArea.font)
        return fontMetrics.height
    }

    fun getJTextAreaComponent(): JTextArea {

        return textArea
    }
}