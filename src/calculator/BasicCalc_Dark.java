package calculator;

import java.text.DecimalFormat;

public class BasicCalc_Dark extends javax.swing.JFrame {

    Double num1,num2;
    String operator;
    
    public BasicCalc_Dark() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visor = new javax.swing.JPanel();
        txt_operation = new javax.swing.JTextField();
        txt_result = new javax.swing.JTextField();
        switch_calc = new javax.swing.JButton();
        light = new javax.swing.JButton();
        basic = new javax.swing.JLabel();
        teclado = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visor.setBackground(new java.awt.Color(0, 0, 0));
        visor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_operation.setBackground(new java.awt.Color(0, 0, 0));
        txt_operation.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        txt_operation.setForeground(new java.awt.Color(161, 96, 251));
        txt_operation.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_operation.setBorder(null);
        visor.add(txt_operation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 72, 260, 30));

        txt_result.setBackground(new java.awt.Color(0, 0, 0));
        txt_result.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txt_result.setForeground(new java.awt.Color(255, 255, 255));
        txt_result.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_result.setBorder(null);
        visor.add(txt_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 40));

        switch_calc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn4_Switch.png"))); // NOI18N
        switch_calc.setBorder(null);
        switch_calc.setBorderPainted(false);
        switch_calc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Btn4_Switch_pressed.png"))); // NOI18N
        switch_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch_calcActionPerformed(evt);
            }
        });
        visor.add(switch_calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        light.setBackground(new java.awt.Color(20, 20, 20));
        light.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSun.png"))); // NOI18N
        light.setBorder(null);
        light.setBorderPainted(false);
        light.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSunRollover.png"))); // NOI18N
        light.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightActionPerformed(evt);
            }
        });
        visor.add(light, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        basic.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        basic.setForeground(new java.awt.Color(229, 228, 229));
        basic.setText("Basic");
        visor.add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(visor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        teclado.setBackground(new java.awt.Color(20, 20, 20));
        teclado.setForeground(new java.awt.Color(20, 20, 20));
        teclado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        equal.setBackground(new java.awt.Color(254, 254, 254));
        equal.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 178, 255));
        equal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        equal.setText("=");
        equal.setBorder(null);
        equal.setContentAreaFilled(false);
        equal.setFocusPainted(false);
        equal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        equal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        equal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        teclado.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        minus.setBackground(new java.awt.Color(254, 254, 254));
        minus.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 178, 255));
        minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        minus.setText("-");
        minus.setBorder(null);
        minus.setContentAreaFilled(false);
        minus.setFocusPainted(false);
        minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        minus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        teclado.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        multiply.setBackground(new java.awt.Color(254, 254, 254));
        multiply.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        multiply.setForeground(new java.awt.Color(255, 178, 255));
        multiply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        multiply.setText("×");
        multiply.setBorder(null);
        multiply.setContentAreaFilled(false);
        multiply.setFocusPainted(false);
        multiply.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiply.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        multiply.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        teclado.add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        divide.setBackground(new java.awt.Color(254, 254, 254));
        divide.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        divide.setForeground(new java.awt.Color(255, 178, 255));
        divide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        divide.setText("÷");
        divide.setBorder(null);
        divide.setContentAreaFilled(false);
        divide.setFocusPainted(false);
        divide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        divide.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        divide.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        teclado.add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        plus_minus.setBackground(new java.awt.Color(254, 254, 254));
        plus_minus.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        plus_minus.setForeground(new java.awt.Color(255, 178, 255));
        plus_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        plus_minus.setText("±");
        plus_minus.setBorder(null);
        plus_minus.setContentAreaFilled(false);
        plus_minus.setFocusPainted(false);
        plus_minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus_minus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        plus_minus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        plus_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_minusActionPerformed(evt);
            }
        });
        teclado.add(plus_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 50, 50));

        delete.setBackground(new java.awt.Color(254, 254, 254));
        delete.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 178, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        delete.setText("«");
        delete.setBorder(null);
        delete.setContentAreaFilled(false);
        delete.setFocusPainted(false);
        delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        delete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        teclado.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        clear.setBackground(new java.awt.Color(254, 254, 254));
        clear.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 178, 255));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        clear.setText("C");
        clear.setBorder(null);
        clear.setContentAreaFilled(false);
        clear.setFocusPainted(false);
        clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        clear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        teclado.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        dot.setBackground(new java.awt.Color(254, 254, 254));
        dot.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dot.setForeground(new java.awt.Color(229, 228, 229));
        dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        dot.setText(".");
        dot.setBorder(null);
        dot.setContentAreaFilled(false);
        dot.setFocusPainted(false);
        dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        teclado.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        nine.setBackground(new java.awt.Color(254, 254, 254));
        nine.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(229, 228, 229));
        nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        nine.setText("9");
        nine.setBorder(null);
        nine.setContentAreaFilled(false);
        nine.setFocusPainted(false);
        nine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nine.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        nine.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        teclado.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        eight.setBackground(new java.awt.Color(254, 254, 254));
        eight.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(229, 228, 229));
        eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        eight.setText("8");
        eight.setBorder(null);
        eight.setContentAreaFilled(false);
        eight.setFocusPainted(false);
        eight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eight.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        eight.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        teclado.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        seven.setBackground(new java.awt.Color(20, 20, 20));
        seven.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        seven.setForeground(new java.awt.Color(229, 228, 229));
        seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        seven.setText("7");
        seven.setBorder(null);
        seven.setContentAreaFilled(false);
        seven.setFocusPainted(false);
        seven.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seven.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        seven.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        teclado.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        six.setBackground(new java.awt.Color(254, 254, 254));
        six.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        six.setForeground(new java.awt.Color(229, 228, 229));
        six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        six.setText("6");
        six.setBorder(null);
        six.setContentAreaFilled(false);
        six.setFocusPainted(false);
        six.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        six.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        six.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        teclado.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        five.setBackground(new java.awt.Color(254, 254, 254));
        five.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        five.setForeground(new java.awt.Color(229, 228, 229));
        five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        five.setText("5");
        five.setBorder(null);
        five.setContentAreaFilled(false);
        five.setFocusPainted(false);
        five.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        five.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        five.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        teclado.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        four.setBackground(new java.awt.Color(254, 254, 254));
        four.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        four.setForeground(new java.awt.Color(229, 228, 229));
        four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        four.setText("4");
        four.setBorder(null);
        four.setContentAreaFilled(false);
        four.setFocusPainted(false);
        four.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        four.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        four.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        teclado.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        three.setBackground(new java.awt.Color(254, 254, 254));
        three.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        three.setForeground(new java.awt.Color(229, 228, 229));
        three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        three.setText("3");
        three.setBorder(null);
        three.setContentAreaFilled(false);
        three.setFocusPainted(false);
        three.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        three.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        three.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        teclado.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        two.setBackground(new java.awt.Color(254, 254, 254));
        two.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        two.setForeground(new java.awt.Color(229, 228, 229));
        two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        two.setText("2");
        two.setBorder(null);
        two.setContentAreaFilled(false);
        two.setFocusPainted(false);
        two.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        two.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        two.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        teclado.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        one.setBackground(new java.awt.Color(254, 254, 254));
        one.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        one.setForeground(new java.awt.Color(229, 228, 229));
        one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        one.setText("1");
        one.setBorder(null);
        one.setContentAreaFilled(false);
        one.setFocusPainted(false);
        one.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        one.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        one.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        teclado.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        zero.setBackground(new java.awt.Color(254, 254, 254));
        zero.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        zero.setForeground(new java.awt.Color(229, 228, 229));
        zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/number.png"))); // NOI18N
        zero.setText("0");
        zero.setBorder(null);
        zero.setContentAreaFilled(false);
        zero.setFocusPainted(false);
        zero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        zero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        teclado.add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        plus.setBackground(new java.awt.Color(254, 254, 254));
        plus.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 178, 255));
        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        plus.setText("+");
        plus.setBorder(null);
        plus.setContentAreaFilled(false);
        plus.setFocusPainted(false);
        plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        plus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        teclado.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        percent.setBackground(new java.awt.Color(254, 254, 254));
        percent.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        percent.setForeground(new java.awt.Color(255, 178, 255));
        percent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black.png"))); // NOI18N
        percent.setText("%");
        percent.setBorder(null);
        percent.setContentAreaFilled(false);
        percent.setFocusPainted(false);
        percent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        percent.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        percent.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click.png"))); // NOI18N
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });
        teclado.add(percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        getContentPane().add(teclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 330, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switch_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switch_calcActionPerformed
 
        new ScientificCalc_Dark().setVisible(true);
        dispose();
    }//GEN-LAST:event_switch_calcActionPerformed

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
            txt_result.setText(String.valueOf(new DecimalFormat ("#,#####0.00000").format(num2*(num1/100))));
        }
    }//GEN-LAST:event_equalActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        num1= Double.parseDouble(txt_operation.getText());
        txt_operation.setText("");
        operator = "minus";
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        num1= Double.parseDouble(txt_operation.getText());
        txt_operation.setText("");
        operator = "multiply";
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        num1= Double.parseDouble(txt_operation.getText());
        txt_operation.setText("");
        operator = "divide";
    }//GEN-LAST:event_divideActionPerformed

    private void plus_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_minusActionPerformed
        double change = Double.parseDouble(txt_operation.getText());
        txt_operation.setText(Double.toString(change *= -1));
    }//GEN-LAST:event_plus_minusActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        String op = txt_operation.getText();
        char ch = op.charAt( op.length()-1);

        op= op.replace(String.valueOf(ch),"");
        txt_operation.setText(op);
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        txt_operation.setText("");
        txt_result.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        txt_operation.setText(txt_operation.getText()+".");
    }//GEN-LAST:event_dotActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        txt_operation.setText(txt_operation.getText()+"9");
    }//GEN-LAST:event_nineActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        txt_operation.setText(txt_operation.getText()+"8");
    }//GEN-LAST:event_eightActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        txt_operation.setText(txt_operation.getText()+"7");
    }//GEN-LAST:event_sevenActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        txt_operation.setText(txt_operation.getText()+"6");
    }//GEN-LAST:event_sixActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        txt_operation.setText(txt_operation.getText()+"5");
    }//GEN-LAST:event_fiveActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        txt_operation.setText(txt_operation.getText()+"4");
    }//GEN-LAST:event_fourActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        txt_operation.setText(txt_operation.getText()+"3");
    }//GEN-LAST:event_threeActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        txt_operation.setText(txt_operation.getText()+"2");
    }//GEN-LAST:event_twoActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        txt_operation.setText(txt_operation.getText()+"1");
    }//GEN-LAST:event_oneActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        txt_operation.setText(txt_operation.getText()+"0");
    }//GEN-LAST:event_zeroActionPerformed

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

    private void lightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightActionPerformed
        new Basic_Calculator().setVisible(true);
        dispose();
    }//GEN-LAST:event_lightActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel basic;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton light;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton percent;
    private javax.swing.JButton plus;
    private javax.swing.JButton plus_minus;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton switch_calc;
    private javax.swing.JPanel teclado;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JTextField txt_operation;
    private javax.swing.JTextField txt_result;
    private javax.swing.JPanel visor;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
