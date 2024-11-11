import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import javax.swing.JButton
import javax.swing.JFileChooser
import javax.swing.JTextArea

class OpenButton(private val textArea: JTextArea) {

    private val button = JButton("Open")

    init {

        button.addActionListener {

            val fileChooser = JFileChooser()
            val result = fileChooser.showOpenDialog(null)

            if (result == JFileChooser.APPROVE_OPTION) {

                val file = fileChooser.selectedFile
                writeFileToTextArea(file)
            }
        }
    }

    private fun writeFileToTextArea(file: File) {

        val reader = BufferedReader(FileReader(file))
        textArea.read(reader, null)
        reader.close()
    }

    fun getJButtonComponent(): JButton {

        return button
    }
}