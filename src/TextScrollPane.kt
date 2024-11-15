import javax.swing.BorderFactory
import javax.swing.JScrollPane
import javax.swing.JTextArea

class TextScrollPane {

    private val textArea = TextArea()
    private val scrollPane = JScrollPane(textArea.getJTextAreaComponent())

    init {

        scrollPane.verticalScrollBarPolicy = JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        scrollPane.horizontalScrollBarPolicy = JScrollPane.HORIZONTAL_SCROLLBAR_NEVER

        scrollPane.verticalScrollBar.unitIncrement = textArea.getFontHeight()
        scrollPane.border = BorderFactory.createEmptyBorder()
    }

    fun getJScrollPaneComponent(): JScrollPane {

        return scrollPane
    }

    fun getJTextAreaComponent(): JTextArea {

        return textArea.getJTextAreaComponent()
    }
}