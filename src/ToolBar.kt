import javax.swing.JTextArea
import javax.swing.JToolBar

class ToolBar(private val textArea: JTextArea) {

    private val toolBar = JToolBar()
    private val openButton = OpenButton(textArea)
    private val writeButton = WriteButton(textArea)

    init {

        toolBar.add(openButton.getJButtonComponent())
        toolBar.add(writeButton.getJButtonComponent())
    }

    fun getJToolBarComponent(): JToolBar {

        return toolBar
    }
}