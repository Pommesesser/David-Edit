import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import javax.swing.JButton
import javax.swing.JFileChooser
import javax.swing.JTextArea

class WriteButton(private val textArea: JTextArea) {

    private val button = JButton("Write")

    init {

        button.addActionListener {

            val fileChooser = JFileChooser()
            val result = fileChooser.showSaveDialog(null)

            if (result == JFileChooser.APPROVE_OPTION) {

                val file = fileChooser.selectedFile
                writeTextAreaToFile(file)
            }
        }
    }

    private fun writeTextAreaToFile(file: File) {

        val writer = BufferedWriter(FileWriter(file))
        textArea.write(writer)
        writer.close()
    }

    fun getJButtonComponent(): JButton {

        return button
    }
}