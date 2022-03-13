package com.example.jogoforca03kotlin

//import java.awt.event.ActionEvent
//import javax.swing.ImageIcon
//import javax.swing.JButton
//import javax.swing.JFrame
//import javax.swing.JLabel
//import javax.swing.JTextField


class AplicacaoGrafica {
//    private var frame: javax.swing.JFrame? = null
//    private var textField: javax.swing.JTextField? = null
//    private var button_1: javax.swing.JButton? = null
//    private var button: javax.swing.JButton? = null
//    private var label: javax.swing.JLabel? = null
//    private var label_1: javax.swing.JLabel? = null
//    private var label_2: javax.swing.JLabel? = null
//    private var label_3: javax.swing.JLabel? = null
//    private var label_4: javax.swing.JLabel? = null
//    private var label_5: javax.swing.JLabel? = null
//    private var jogo: JogoDaForca? = null
//    private var label_6: javax.swing.JLabel? = null
//    private var label_7: javax.swing.JLabel? = null
//    private var label_8: javax.swing.JLabel? = null
//
//    /**
//     * Launch the application.
//     */
//    @JvmStatic
//    fun main(args: Array<String>) {
//        EventQueue.invokeLater(Runnable {
//            try {
//                val window = AplicacaoGrafica()
//                window.frame.setVisible(true)
//            } catch (e: Exception) {
//                e.printStackTrace()
//            }
//        })
//    }
//
//    /**
//     * Create the application.
//     */
//    fun AplicacaoGrafica() {
//        initialize()
//    }
//
//    /**
//     * Initialize the contents of the frame.
//     */
//    private fun initialize() {
//        frame = javax.swing.JFrame()
//        frame.getContentPane().setFont(Font("Tahoma", Font.PLAIN, 11))
//        frame.setTitle("Jogo da Forca")
//        frame.setBounds(100, 100, 411, 221)
//        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
//        frame.getContentPane().setLayout(null)
//        label_4 = javax.swing.JLabel("Letra:")
//        label_4.setBounds(8, 72, 48, 14)
//        frame.getContentPane().add(label_4)
//        textField = javax.swing.JTextField()
//        textField.setBounds(44, 69, 35, 20)
//        frame.getContentPane().add(textField)
//        textField.setColumns(10)
//        label_5 = javax.swing.JLabel("Palavra=")
//        label_5.setForeground(Color.BLACK)
//        label_5.setFont(Font("Courier New", Font.BOLD, 15))
//        label_5.setBounds(8, 100, 259, 25)
//        frame.getContentPane().add(label_5)
//        label_8 = javax.swing.JLabel("Erros já digitados = ")
//        label_8.setForeground(Color.BLACK)
//        label_8.setFont(Font(Font.SANS_SERIF, Font.PLAIN, 11))
//        label_8.setBounds(8, 118, 267, 25)
//        frame.getContentPane().add(label_8)
//        button = javax.swing.JButton("Iniciar")
//        button.addActionListener(object : ActionListener() {
//            fun actionPerformed(e: java.awt.event.ActionEvent?) {
//                try {
//                    jogo = JogoDaForca("palavras.txt")
//                    jogo.iniciar()
//                    label_1.setText("Acertos: 0")
//                    label_2.setText("Erros: 0")
//                    label_3.setText("Dica: " + jogo.getDica())
//                    label_5.setText("Palavra = " + jogo.getPalavra())
//                    label_8.setText("Erros já digitados:" + jogo.getLetrasErradas())
//                    exibirImagem("0.png")
//                    label.setText("Jogo iniciado")
//                    button_1.setEnabled(true)
//                } catch (e1: Exception) {
//                    label.setText(e1.message)
//                }
//            }
//        })
//        button.setBounds(8, 15, 80, 23)
//        frame.getContentPane().add(button)
//        button_1 = javax.swing.JButton("Adivinhar")
//        button_1.addActionListener(object : ActionListener() {
//            fun actionPerformed(e: java.awt.event.ActionEvent?) {
//                try {
//                    if (textField.getText().isEmpty()) {
//                        label.setText("Campo vazio")
//                        return
//                    }
//                    val letra: String = textField.getText().trim { it <= ' ' }.toUpperCase()
//                    if (jogo.adivinhou(letra)) {
//                        label.setText("acertou a letra $letra")
//                        label_1.setText("Acertos: " + jogo.getAcertos())
//                        label_5.setText("Palavra=" + jogo.getPalavra())
//                    } else {
//                        label.setText("penalidade: removeu " + jogo.getPenalidade())
//                        label_2.setText("Erros: " + jogo.getErros())
//                        label_8.setText("Erros já digitados: " + jogo.getLetrasErradas())
//                        exibirImagem(jogo.getErros().toString() + ".png")
//                    }
//                    textField.setText("")
//                    textField.requestFocus()
//                    if (jogo.terminou()) {
//                        Thread.sleep(2000) //pausa 2seg
//                        label.setText(jogo.getResultado())
//                        button_1.setEnabled(false)
//                    }
//                } catch (e1: Exception) {
//                    label.setText(e1.message)
//                }
//            }
//        })
//        button_1.setBounds(89, 68, 104, 23)
//        frame.getContentPane().add(button_1)
//        label = javax.swing.JLabel("")
//        label.setBounds(8, 158, 377, 14)
//        frame.getContentPane().add(label)
//        label_1 = javax.swing.JLabel("Acertos: 0")
//        label_1.setForeground(Color(0, 128, 0))
//        label_1.setFont(Font("Tahoma", Font.PLAIN, 14))
//        label_1.setBounds(144, 17, 68, 14)
//        frame.getContentPane().add(label_1)
//        label_2 = javax.swing.JLabel("Erros: 0")
//        label_2.setFont(Font("Tahoma", Font.PLAIN, 14))
//        label_2.setForeground(Color(255, 0, 0))
//        label_2.setBounds(254, 17, 68, 14)
//        frame.getContentPane().add(label_2)
//        label_3 = javax.swing.JLabel("Dica:")
//        label_3.setBounds(8, 49, 377, 14)
//        frame.getContentPane().add(label_3)
//        label_6 = javax.swing.JLabel("")
//        label_6.setBounds(291, 68, 80, 88)
//        frame.getContentPane().add(label_6)
//        label_7 = javax.swing.JLabel("Imagem:")
//        label_7.setBounds(218, 72, 61, 14)
//        frame.getContentPane().add(label_7)
//        exibirImagem("6.png")
//    }
//
//    fun exibirImagem(arquivo: String) {
//        val icon: javax.swing.ImageIcon =
//            javax.swing.ImageIcon(this.javaClass.getResource("/imagens/$arquivo"))
//        icon.setImage(icon.getImage().getScaledInstance(label_6.getWidth(), label_6.getHeight(), 1))
//        label_6.setIcon(icon)
//    }
}