import java.io.BufferedReader
import java.io.FileReader
import javax.swing.JFileChooser
import javax.swing.JTextArea
import javax.swing.filechooser.FileNameExtensionFilter

class FileOpener(private val textArea: JTextArea) {

    private val fileChooser = JFileChooser().apply {

        fileSelectionMode = JFileChooser.FILES_ONLY
        isAcceptAllFileFilterUsed = false
        fileFilter = FileNameExtensionFilter("Text Files", "txt")
    }

    fun openFile() {

        val choice = fileChooser.showOpenDialog(null)

        if (choice == JFileChooser.APPROVE_OPTION) {

            writeSelectedFileToTextArea()
        }
    }

    private fun writeSelectedFileToTextArea() {

        val reader = BufferedReader(FileReader(fileChooser.selectedFile))
        textArea.read(reader, null)
        reader.close()
    }
}