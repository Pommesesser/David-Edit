import javax.swing.JButton
import javax.swing.JTextArea

class OpenButton(private val textArea: JTextArea) {

    private val button = JButton("Open")
    private val fileOpener = FileOpener(textArea)

    init {

        button.addActionListener {

            fileOpener.openFileToTextArea()
        }
    }

    fun getJButtonComponent(): JButton {

        return button
    }
}