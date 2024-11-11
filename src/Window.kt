import javax.swing.JFrame

class Window {

    private val frame = JFrame()
    private val mainPanel = MainPanel()

    init {

        frame.setSize(960, 540)
        frame.title = "David Editor"
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        frame.add(mainPanel.getJPanelComponent())
    }

    fun setFrameVisible() {

        frame.isVisible = true
    }
}