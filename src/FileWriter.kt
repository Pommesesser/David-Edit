import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import javax.swing.JFileChooser
import javax.swing.JTextArea
import javax.swing.filechooser.FileNameExtensionFilter

class FileWriter(private val textArea: JTextArea) {

    private val fileChooser = JFileChooser().apply {

        fileSelectionMode = JFileChooser.FILES_ONLY
        isAcceptAllFileFilterUsed = false
        fileFilter = FileNameExtensionFilter("Text Files", "txt")
    }

    fun saveFile() {

        val choice = fileChooser.showSaveDialog(null)

        if (choice == JFileChooser.APPROVE_OPTION) {

            selectedFileToTextFile()
            writeTextAreaToFile()
        }
    }

    private fun selectedFileToTextFile() {

        if (!fileChooser.selectedFile.name.endsWith(".txt", ignoreCase = true)) {

            fileChooser.selectedFile = File("${fileChooser.selectedFile.absolutePath}.txt")
        }
    }

    private fun writeTextAreaToFile() {

        val writer = BufferedWriter(FileWriter(fileChooser.selectedFile))
        textArea.write(writer)
        writer.close()
    }
}
