import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import javax.swing.JFileChooser
import javax.swing.JTextArea

class FileOpener(private val textArea: JTextArea) {

    private val fileChooser = JFileChooser()

    fun openFileToTextArea() {

        val choice = fileChooser.showOpenDialog(null)

        if (choice == JFileChooser.APPROVE_OPTION) {

            writeFileToTextArea(fileChooser.selectedFile)
        }
    }

    private fun writeFileToTextArea(file: File) {

        val reader = BufferedReader(FileReader(file))
        textArea.read(reader, null)
        reader.close()
    }
}