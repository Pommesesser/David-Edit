import java.awt.BorderLayout
import javax.swing.JPanel

class MainPanel {

    private val panel = JPanel()
    private val textScrollPane = TextScrollPane()
    private val toolBar = ToolBar(textScrollPane.getJTextAreaComponent())

    init {

        panel.layout = BorderLayout()

        panel.add(toolBar.getJToolBarComponent(), BorderLayout.NORTH)
        panel.add(textScrollPane.getJScrollPaneComponent(), BorderLayout.CENTER)
    }

    fun getJPanelComponent(): JPanel {

        return panel
    }
}