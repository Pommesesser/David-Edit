import javax.swing.JButton
import javax.swing.JTextArea

class WriteButton(private val textArea: JTextArea) {

    private val button = JButton("Write")
    private val fileWriter = FileWriter(textArea)

    init {

        button.addActionListener {

            fileWriter.saveFile()
        }
    }

    fun getJButtonComponent(): JButton {

        return button
    }
}