package calculator;

import java.text.DecimalFormat;

public class CalculatorWindow extends javax.swing.JFrame {

    public CalculatorWindow() {
        initComponents();
        setLocationRelativeTo(null); 
    }
    
    Double num1,num2;
    String operator;
    Boolean percentage = false;
    Boolean num_decimal = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visor = new javax.swing.JPanel();
        txt_operation = new javax.swing.JTextField();
        txt_result = new javax.swing.JTextField();
        rad = new javax.swing.JPanel();
        equal = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        plus_minus = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        six = new javax.swing.JButton();
        five = new javax.swing.JButton();
        four = new javax.swing.JButton();
        three = new javax.swing.JButton();
        two = new javax.swing.JButton();
        one = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        parentese_dir = new javax.swing.JButton();
        parentese_esq = new javax.swing.JButton();
        seno = new javax.swing.JComboBox<>();
        tangente = new javax.swing.JComboBox<>();
        degree = new javax.swing.JButton();
        degree1 = new javax.swing.JButton();
        seno1 = new javax.swing.JComboBox<>();
        ln = new javax.swing.JButton();
        log = new javax.swing.JButton();
        e = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        plus_minus1 = new javax.swing.JButton();
        expoente = new javax.swing.JButton();
        raiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 520));
        setPreferredSize(new java.awt.Dimension(405, 695));
        setResizable(false);
        setSize(new java.awt.Dimension(330, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visor.setBackground(new java.awt.Color(0, 0, 0));
        visor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_operation.setBackground(new java.awt.Color(0, 0, 0));
        txt_operation.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        txt_operation.setForeground(new java.awt.Color(161, 96, 251));
        txt_operation.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_operation.setBorder(null);
        txt_operation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_operationActionPerformed(evt);
            }
        });
        visor.add(txt_operation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 40));

        txt_result.setBackground(new java.awt.Color(0, 0, 0));
        txt_result.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txt_result.setForeground(new java.awt.Color(255, 255, 255));
        txt_result.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_result.setBorder(null);
        visor.add(txt_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 370, 40));

        getContentPane().add(visor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 180));

        rad.setBackground(new java.awt.Color(255, 255, 255));
        rad.setPreferredSize(new java.awt.Dimension(420, 450));
        rad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        equal.setBackground(new java.awt.Color(254, 254, 254));
        equal.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 255, 255));
        equal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt3.png"))); // NOI18N
        equal.setText("=");
        equal.setBorder(null);
        equal.setFocusPainted(false);
        equal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        equal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt3.png"))); // NOI18N
        equal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        rad.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 50, 50));

        minus.setBackground(new java.awt.Color(254, 254, 254));
        minus.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        minus.setForeground(new java.awt.Color(0, 0, 0));
        minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        minus.setText("-");
        minus.setBorder(null);
        minus.setFocusPainted(false);
        minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        minus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        rad.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 50, 50));

        multiply.setBackground(new java.awt.Color(254, 254, 254));
        multiply.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        multiply.setForeground(new java.awt.Color(0, 0, 0));
        multiply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        multiply.setText("×");
        multiply.setBorder(null);
        multiply.setFocusPainted(false);
        multiply.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiply.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        multiply.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        rad.add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 50, 50));

        divide.setBackground(new java.awt.Color(254, 254, 254));
        divide.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        divide.setForeground(new java.awt.Color(0, 0, 0));
        divide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        divide.setText("÷");
        divide.setBorder(null);
        divide.setFocusPainted(false);
        divide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        divide.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        divide.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        rad.add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 50, 50));

        plus_minus.setBackground(new java.awt.Color(254, 254, 254));
        plus_minus.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        plus_minus.setForeground(new java.awt.Color(0, 0, 0));
        plus_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        plus_minus.setText("±");
        plus_minus.setBorder(null);
        plus_minus.setFocusPainted(false);
        plus_minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus_minus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        plus_minus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        plus_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_minusActionPerformed(evt);
            }
        });
        rad.add(plus_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 50));

        delete.setBackground(new java.awt.Color(254, 254, 254));
        delete.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        delete.setText("«");
        delete.setBorder(null);
        delete.setFocusPainted(false);
        delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        delete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        rad.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 50, 50));

        clear.setBackground(new java.awt.Color(254, 254, 254));
        clear.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        clear.setText("C");
        clear.setBorder(null);
        clear.setFocusPainted(false);
        clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        clear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        rad.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 50, 50));

        dot.setBackground(new java.awt.Color(254, 254, 254));
        dot.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dot.setForeground(new java.awt.Color(0, 0, 0));
        dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        dot.setText(".");
        dot.setBorder(null);
        dot.setFocusPainted(false);
        dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        rad.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 50, 50));

        nine.setBackground(new java.awt.Color(254, 254, 254));
        nine.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(0, 0, 0));
        nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        nine.setText("9");
        nine.setBorder(null);
        nine.setFocusPainted(false);
        nine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nine.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        nine.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        rad.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 50, 50));

        eight.setBackground(new java.awt.Color(254, 254, 254));
        eight.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(0, 0, 0));
        eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        eight.setText("8");
        eight.setBorder(null);
        eight.setFocusPainted(false);
        eight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eight.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        eight.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        rad.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 50, 50));

        seven.setBackground(new java.awt.Color(254, 254, 254));
        seven.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        seven.setForeground(new java.awt.Color(0, 0, 0));
        seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        seven.setText("7");
        seven.setBorder(null);
        seven.setFocusPainted(false);
        seven.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seven.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        seven.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        rad.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 50, 50));

        six.setBackground(new java.awt.Color(254, 254, 254));
        six.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        six.setForeground(new java.awt.Color(0, 0, 0));
        six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        six.setText("6");
        six.setBorder(null);
        six.setFocusPainted(false);
        six.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        six.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        six.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        rad.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 50, 50));

        five.setBackground(new java.awt.Color(254, 254, 254));
        five.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        five.setForeground(new java.awt.Color(0, 0, 0));
        five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        five.setText("5");
        five.setBorder(null);
        five.setFocusPainted(false);
        five.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        five.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        five.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        rad.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 50, 50));

        four.setBackground(new java.awt.Color(254, 254, 254));
        four.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        four.setForeground(new java.awt.Color(0, 0, 0));
        four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        four.setText("4");
        four.setBorder(null);
        four.setFocusPainted(false);
        four.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        four.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        four.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        rad.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 50, 50));

        three.setBackground(new java.awt.Color(254, 254, 254));
        three.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        three.setForeground(new java.awt.Color(0, 0, 0));
        three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        three.setText("3");
        three.setBorder(null);
        three.setFocusPainted(false);
        three.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        three.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        three.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        rad.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 50, 50));

        two.setBackground(new java.awt.Color(254, 254, 254));
        two.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        two.setForeground(new java.awt.Color(0, 0, 0));
        two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        two.setText("2");
        two.setBorder(null);
        two.setFocusPainted(false);
        two.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        two.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        two.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        rad.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 50, 50));

        one.setBackground(new java.awt.Color(254, 254, 254));
        one.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        one.setForeground(new java.awt.Color(0, 0, 0));
        one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        one.setText("1");
        one.setBorder(null);
        one.setFocusPainted(false);
        one.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        one.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        one.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        rad.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 50, 50));

        zero.setBackground(new java.awt.Color(254, 254, 254));
        zero.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        zero.setForeground(new java.awt.Color(0, 0, 0));
        zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        zero.setText("0");
        zero.setBorder(null);
        zero.setFocusPainted(false);
        zero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        zero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        rad.add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 50, 50));

        plus.setBackground(new java.awt.Color(254, 254, 254));
        plus.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        plus.setForeground(new java.awt.Color(0, 0, 0));
        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        plus.setText("+");
        plus.setBorder(null);
        plus.setFocusPainted(false);
        plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        plus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        rad.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 50, 50));

        percent.setBackground(new java.awt.Color(254, 254, 254));
        percent.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        percent.setForeground(new java.awt.Color(0, 0, 0));
        percent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        percent.setText("%");
        percent.setBorder(null);
        percent.setFocusPainted(false);
        percent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        percent.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        percent.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });
        rad.add(percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 50, 50));

        parentese_dir.setBackground(new java.awt.Color(254, 254, 254));
        parentese_dir.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        parentese_dir.setForeground(new java.awt.Color(0, 0, 0));
        parentese_dir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        parentese_dir.setText(")");
        parentese_dir.setBorder(null);
        parentese_dir.setFocusPainted(false);
        parentese_dir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        parentese_dir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        parentese_dir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        parentese_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentese_dirActionPerformed(evt);
            }
        });
        rad.add(parentese_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 50, 50));

        parentese_esq.setBackground(new java.awt.Color(254, 254, 254));
        parentese_esq.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        parentese_esq.setForeground(new java.awt.Color(0, 0, 0));
        parentese_esq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        parentese_esq.setText("(");
        parentese_esq.setBorder(null);
        parentese_esq.setFocusPainted(false);
        parentese_esq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        parentese_esq.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        parentese_esq.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        parentese_esq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentese_esqActionPerformed(evt);
            }
        });
        rad.add(parentese_esq, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 50, 50));

        seno.setBackground(new java.awt.Color(255, 255, 255));
        seno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        seno.setForeground(new java.awt.Color(0, 0, 0));
        seno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sin", "sin-1" }));
        rad.add(seno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, 30));

        tangente.setBackground(new java.awt.Color(255, 255, 255));
        tangente.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tangente.setForeground(new java.awt.Color(0, 0, 0));
        tangente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tan", "tan-1" }));
        rad.add(tangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, 30));

        degree.setBackground(new java.awt.Color(254, 254, 254));
        degree.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        degree.setForeground(new java.awt.Color(0, 0, 0));
        degree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        degree.setText("deg");
        degree.setBorder(null);
        degree.setFocusPainted(false);
        degree.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        degree.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        degree.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        degree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeActionPerformed(evt);
            }
        });
        rad.add(degree, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        degree1.setBackground(new java.awt.Color(254, 254, 254));
        degree1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        degree1.setForeground(new java.awt.Color(0, 0, 0));
        degree1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        degree1.setText("rad");
        degree1.setBorder(null);
        degree1.setFocusPainted(false);
        degree1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        degree1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        degree1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        degree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree1ActionPerformed(evt);
            }
        });
        rad.add(degree1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 50));

        seno1.setBackground(new java.awt.Color(255, 255, 255));
        seno1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        seno1.setForeground(new java.awt.Color(0, 0, 0));
        seno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cos", "cos-1" }));
        rad.add(seno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 80, 30));

        ln.setBackground(new java.awt.Color(254, 254, 254));
        ln.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        ln.setForeground(new java.awt.Color(0, 0, 0));
        ln.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        ln.setText("ln");
        ln.setBorder(null);
        ln.setFocusPainted(false);
        ln.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ln.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        ln.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        rad.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 50, 50));

        log.setBackground(new java.awt.Color(254, 254, 254));
        log.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        log.setForeground(new java.awt.Color(0, 0, 0));
        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        log.setText("lg");
        log.setBorder(null);
        log.setFocusPainted(false);
        log.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        log.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        log.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        rad.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 50, 50));

        e.setBackground(new java.awt.Color(254, 254, 254));
        e.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        e.setForeground(new java.awt.Color(0, 0, 0));
        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        e.setText("e");
        e.setBorder(null);
        e.setFocusPainted(false);
        e.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        e.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        e.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        rad.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 50, 50));

        pi.setBackground(new java.awt.Color(254, 254, 254));
        pi.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        pi.setForeground(new java.awt.Color(0, 0, 0));
        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        pi.setText("π");
        pi.setBorder(null);
        pi.setFocusPainted(false);
        pi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bt2.png"))); // NOI18N
        pi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        rad.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 50, 50));

        plus_minus1.setBackground(new java.awt.Color(254, 254, 254));
        plus_minus1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        plus_minus1.setForeground(new java.awt.Color(0, 0, 0));
        plus_minus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        plus_minus1.setText("X!");
        plus_minus1.setBorder(null);
        plus_minus1.setFocusPainted(false);
        plus_minus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus_minus1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        plus_minus1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        plus_minus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_minus1ActionPerformed(evt);
            }
        });
        rad.add(plus_minus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 50));

        expoente.setBackground(new java.awt.Color(254, 254, 254));
        expoente.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        expoente.setForeground(new java.awt.Color(0, 0, 0));
        expoente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        expoente.setText("^");
        expoente.setBorder(null);
        expoente.setFocusPainted(false);
        expoente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        expoente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        expoente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        expoente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expoenteActionPerformed(evt);
            }
        });
        rad.add(expoente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 50));

        raiz.setBackground(new java.awt.Color(254, 254, 254));
        raiz.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        raiz.setForeground(new java.awt.Color(0, 0, 0));
        raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        raiz.setText("√");
        raiz.setBorder(null);
        raiz.setFocusPainted(false);
        raiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        raiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        raiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });
        rad.add(raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 50));

        getContentPane().add(rad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 430, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        txt_operation.setText(txt_operation.getText()+"8");
    }//GEN-LAST:event_eightActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        String op = txt_operation.getText(); 
        char ch = op.charAt( op.length()-1); 

        op= op.replace(String.valueOf(ch),""); 
        txt_operation.setText(op);
   
    }//GEN-LAST:event_deleteActionPerformed

    private void plus_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_minusActionPerformed
        double change = Double.parseDouble(txt_operation.getText());
        txt_operation.setText(Double.toString(change *= -1));
    }//GEN-LAST:event_plus_minusActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
       num1= Double.parseDouble(txt_operation.getText());
         txt_operation.setText("");
        operator = "divide";
    }//GEN-LAST:event_divideActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        num1= Double.parseDouble(txt_operation.getText());
         txt_operation.setText("");
        operator = "multiply";
    }//GEN-LAST:event_multiplyActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        num1= Double.parseDouble(txt_operation.getText());
         txt_operation.setText("");
        operator = "minus";
    }//GEN-LAST:event_minusActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
         
         num2= Double.parseDouble(txt_operation.getText());
         
         if (operator == "plus") {
            txt_operation.setText(num1 + "+" + num2);
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(num1+num2)));
         }
         
         else if (operator == "minus"){
            txt_operation.setText(num1 + "-" + num2);
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(num1-num2)));
         }
         
         else if (operator == "multiply"){
            txt_operation.setText(num1 + "*" + num2);
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(num1*num2)));
         }
         
         else if (operator == "divide"){
            txt_operation.setText(num1 + "/" + num2);
            
            try{
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(num1/num2)));
            }catch (Exception e){
                System.out.println("Try again! In math, divide a number by 0 is impossible.");
            }
         }
         
         else if (percentage == true){
             txt_operation.setText("("+num1 + "%)*" + num2);
             txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(num2*(num1/100))));
         }
    }//GEN-LAST:event_equalActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        txt_operation.setText("");
        txt_result.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        txt_operation.setText(txt_operation.getText()+"9");
    }//GEN-LAST:event_nineActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        txt_operation.setText(txt_operation.getText()+"7");
    }//GEN-LAST:event_sevenActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        txt_operation.setText(txt_operation.getText()+"4");
    }//GEN-LAST:event_fourActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        txt_operation.setText(txt_operation.getText()+"6");
    }//GEN-LAST:event_sixActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        txt_operation.setText(txt_operation.getText()+"5");
    }//GEN-LAST:event_fiveActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        txt_operation.setText(txt_operation.getText()+"2");
    }//GEN-LAST:event_twoActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        txt_operation.setText(txt_operation.getText()+"1");
    }//GEN-LAST:event_oneActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        txt_operation.setText(txt_operation.getText()+"0");
    }//GEN-LAST:event_zeroActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        txt_operation.setText(txt_operation.getText()+".");
       
    }//GEN-LAST:event_dotActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        txt_operation.setText(txt_operation.getText()+"3");
    }//GEN-LAST:event_threeActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        num1= Double.parseDouble(txt_operation.getText());
         txt_operation.setText("");
        operator = "plus";
    }//GEN-LAST:event_plusActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
       
        num1= Double.parseDouble(txt_operation.getText());
         txt_operation.setText("");
        percentage = true;
        
    }//GEN-LAST:event_percentActionPerformed

    private void txt_operationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_operationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_operationActionPerformed

    private void parentese_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentese_dirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentese_dirActionPerformed

    private void parentese_esqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentese_esqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentese_esqActionPerformed

    private void degreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeActionPerformed

    private void degree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degree1ActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_piActionPerformed

    private void plus_minus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_minus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plus_minus1ActionPerformed

    private void expoenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expoenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expoenteActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raizActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorWindow().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton degree;
    private javax.swing.JButton degree1;
    private javax.swing.JButton delete;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton e;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton expoente;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton parentese_dir;
    private javax.swing.JButton parentese_esq;
    private javax.swing.JButton percent;
    private javax.swing.JButton pi;
    private javax.swing.JButton plus;
    private javax.swing.JButton plus_minus;
    private javax.swing.JButton plus_minus1;
    private javax.swing.JPanel rad;
    private javax.swing.JButton raiz;
    private javax.swing.JComboBox<String> seno;
    private javax.swing.JComboBox<String> seno1;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JComboBox<String> tangente;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JTextField txt_operation;
    private javax.swing.JTextField txt_result;
    private javax.swing.JPanel visor;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

    private void setLocacionRelativeto(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
