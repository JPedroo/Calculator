package calculator;

import java.text.DecimalFormat;

public class Scientific_Calculator extends javax.swing.JFrame {

    public Scientific_Calculator() {
        initComponents();
        setLocationRelativeTo(null); 
    }
    
    Double num1,num2;
    String operator;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        visor = new javax.swing.JPanel();
        txt_operation = new javax.swing.JTextField();
        txt_result = new javax.swing.JTextField();
        dark = new javax.swing.JToggleButton();
        scientific = new javax.swing.JLabel();
        switch_calc1 = new javax.swing.JToggleButton();
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
        degree = new javax.swing.JButton();
        radianos = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        log = new javax.swing.JButton();
        e = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        fatorial = new javax.swing.JButton();
        expoente = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        seno = new javax.swing.JRadioButton();
        arcseno = new javax.swing.JRadioButton();
        cosseno = new javax.swing.JRadioButton();
        arccosseno = new javax.swing.JRadioButton();
        tangente = new javax.swing.JRadioButton();
        arctangente = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 520));
        setPreferredSize(new java.awt.Dimension(406, 692));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
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

        dark.setBackground(new java.awt.Color(0, 0, 0));
        dark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_moon.png"))); // NOI18N
        dark.setBorder(null);
        dark.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_moonRollover.png"))); // NOI18N
        dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkActionPerformed(evt);
            }
        });
        visor.add(dark, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, 30));

        scientific.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        scientific.setForeground(new java.awt.Color(229, 228, 229));
        scientific.setText("Scientific");
        visor.add(scientific, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        switch_calc1.setBackground(new java.awt.Color(0, 0, 0));
        switch_calc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn4_Switch_pressed.png"))); // NOI18N
        switch_calc1.setBorder(null);
        switch_calc1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn4_Switch.png"))); // NOI18N
        switch_calc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch_calc1ActionPerformed(evt);
            }
        });
        visor.add(switch_calc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 20));

        getContentPane().add(visor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 180));

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
        rad.add(degree, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        radianos.setBackground(new java.awt.Color(254, 254, 254));
        radianos.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        radianos.setForeground(new java.awt.Color(0, 0, 0));
        radianos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        radianos.setText("rad");
        radianos.setBorder(null);
        radianos.setFocusPainted(false);
        radianos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        radianos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        radianos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        radianos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radianosActionPerformed(evt);
            }
        });
        rad.add(radianos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 50));

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
        rad.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, 50));

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
        rad.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 50, 50));

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

        fatorial.setBackground(new java.awt.Color(254, 254, 254));
        fatorial.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        fatorial.setForeground(new java.awt.Color(0, 0, 0));
        fatorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        fatorial.setText("X!");
        fatorial.setBorder(null);
        fatorial.setFocusPainted(false);
        fatorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fatorial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        fatorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.png"))); // NOI18N
        fatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatorialActionPerformed(evt);
            }
        });
        rad.add(fatorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 50));

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

        buttonGroup1.add(seno);
        seno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seno.setForeground(new java.awt.Color(0, 0, 0));
        seno.setText("Sin");
        seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senoActionPerformed(evt);
            }
        });
        rad.add(seno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 60, 40));

        buttonGroup1.add(arcseno);
        arcseno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        arcseno.setForeground(new java.awt.Color(0, 0, 0));
        arcseno.setText("Sinˉ¹");
        arcseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcsenoActionPerformed(evt);
            }
        });
        rad.add(arcseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 60, 40));

        buttonGroup1.add(cosseno);
        cosseno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cosseno.setForeground(new java.awt.Color(0, 0, 0));
        cosseno.setText("Cos");
        cosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cossenoActionPerformed(evt);
            }
        });
        rad.add(cosseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, 40));

        buttonGroup1.add(arccosseno);
        arccosseno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        arccosseno.setForeground(new java.awt.Color(0, 0, 0));
        arccosseno.setText("Cosˉ¹");
        arccosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arccossenoActionPerformed(evt);
            }
        });
        rad.add(arccosseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 80, 40));

        buttonGroup1.add(tangente);
        tangente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tangente.setForeground(new java.awt.Color(0, 0, 0));
        tangente.setText("Tan");
        tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangenteActionPerformed(evt);
            }
        });
        rad.add(tangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 60, 40));

        buttonGroup1.add(arctangente);
        arctangente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        arctangente.setForeground(new java.awt.Color(0, 0, 0));
        arctangente.setText("Tanˉ¹");
        arctangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arctangenteActionPerformed(evt);
            }
        });
        rad.add(arctangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 70, 40));

        getContentPane().add(rad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 400, 480));

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
         
         else if (operator == "percentage"){
             txt_operation.setText("("+num1 + "%)*" + num2);
             txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00").format(num2*(num1/100))));
         }
         
         else if (operator == "sqrt") {
            num1= Double.parseDouble(txt_operation.getText());
            txt_operation.setText("√"+ num1);
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(Math.sqrt(num1))));
         }
         else if (operator == "expoente"){
            txt_operation.setText(num1 + "^" + num2);
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(Math.pow(num1,num2))));
         }
         
         else if (operator == "log10") {
            num1= Double.parseDouble(txt_operation.getText());
            txt_operation.setText("log("+ num1+")");
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(Math.log10(num1))));
         }
         
         else if (operator == "ln") {
            num1= Double.parseDouble(txt_operation.getText());
            txt_operation.setText("ln("+ num1+")");
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(Math.log(num1))));
         }  
         
         else if (operator == "rad") {
            num1= Double.parseDouble(txt_operation.getText());
            txt_operation.setText("rad("+ num1+")");
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00").format(Math.toRadians(num1))));
         } 
         else if (operator == "deg") {
            num1= Double.parseDouble(txt_operation.getText());
            txt_operation.setText("deg("+ num1+")");
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.0").format(Math.toDegrees(num1)))+"º");
         } 
         
         else if (seno.isSelected()){
             num1= Double.parseDouble(txt_operation.getText());
             txt_operation.setText("Sin("+ num1+")");
             txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.000").format(Math.sin(num1))));
             
         }
         
          else if (cosseno.isSelected()){
             num1= Double.parseDouble(txt_operation.getText());
             txt_operation.setText("Cos("+ num1+")");
             txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.000").format(Math.cos(num1))));
         }
         
          else if (tangente.isSelected()){
             num1= Double.parseDouble(txt_operation.getText());
             txt_operation.setText("Tan("+ num1+")");
             txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.000").format(Math.tan(num1))));
         }
         
         else if (arcseno.isSelected()){
             num1= Double.parseDouble(txt_operation.getText());
             txt_operation.setText("Sin^-1("+ num1+")");
             txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.000").format(Math.asin(num1))));
         }
         
         else if (arccosseno.isSelected()){
             num1= Double.parseDouble(txt_operation.getText());
             txt_operation.setText("Cos^-1("+ num1+")");
             txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.000").format(Math.acos(num1))));
         }
         
         else if (arctangente.isSelected()){
             num1= Double.parseDouble(txt_operation.getText());
             txt_operation.setText("Tan^-1("+ num1+")");
             txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.000").format(Math.atan(num1))));
         }
         
         else if (operator == "fatorial") {
            num1= Double.parseDouble(txt_operation.getText());
            txt_operation.setText(num1+"!");
            
            Double fat=num1;
            if (num1==0){
                fat=1.0;
                txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00").format(fat)));
                
            } else {
                while (num1 > 1){ 
                    fat*= (num1-1);
                    num1--;          
                }
            }
            
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00").format(fat)));
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
        operator = "percentage";
        
    }//GEN-LAST:event_percentActionPerformed

    private void txt_operationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_operationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_operationActionPerformed

    private void degreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeActionPerformed
         operator = "deg";
    }//GEN-LAST:event_degreeActionPerformed

    private void radianosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radianosActionPerformed
        operator = "rad";
    }//GEN-LAST:event_radianosActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
         operator = "ln";
    }//GEN-LAST:event_lnActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        operator = "log10";
    }//GEN-LAST:event_logActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
         double exp = Math.exp(1);
         txt_operation.setText(txt_operation.getText()+exp);
    }//GEN-LAST:event_eActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        double PI = Math.PI;
         txt_operation.setText(txt_operation.getText()+PI);
    }//GEN-LAST:event_piActionPerformed

    private void fatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatorialActionPerformed
          operator = "fatorial";
    }//GEN-LAST:event_fatorialActionPerformed

    private void expoenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expoenteActionPerformed
        num1= Double.parseDouble(txt_operation.getText());
        txt_operation.setText("");
        operator = "expoente";
    }//GEN-LAST:event_expoenteActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        operator = "sqrt";
    
    }//GEN-LAST:event_raizActionPerformed

    private void senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senoActionPerformed

    private void arcsenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcsenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arcsenoActionPerformed

    private void cossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cossenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cossenoActionPerformed

    private void arccossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arccossenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arccossenoActionPerformed

    private void tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tangenteActionPerformed

    private void arctangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arctangenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arctangenteActionPerformed

    private void switch_calc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switch_calc1ActionPerformed
        new Basic_Calculator().setVisible(true);
        dispose();
    }//GEN-LAST:event_switch_calc1ActionPerformed

    private void darkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkActionPerformed
        new ScientificCalc_Dark().setVisible(true);
        dispose();
    }//GEN-LAST:event_darkActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton arccosseno;
    private javax.swing.JRadioButton arcseno;
    private javax.swing.JRadioButton arctangente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JRadioButton cosseno;
    private javax.swing.JToggleButton dark;
    private javax.swing.JButton degree;
    private javax.swing.JButton delete;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton e;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton expoente;
    private javax.swing.JButton fatorial;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton percent;
    private javax.swing.JButton pi;
    private javax.swing.JButton plus;
    private javax.swing.JButton plus_minus;
    private javax.swing.JPanel rad;
    private javax.swing.JButton radianos;
    private javax.swing.JButton raiz;
    private javax.swing.JLabel scientific;
    private javax.swing.JRadioButton seno;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JToggleButton switch_calc1;
    private javax.swing.JRadioButton tangente;
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
