package cn.kevin.dialog;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

/**
 * add field form
 * created by yongkang.zhang
 * added at 2018/3/26
 */
public class MybatisHelperForm {

    private JPanel mainPanel;
    private JLabel Type;
    private JComboBox fieldType;
    private JTextField fieldName;

    public MybatisHelperForm() {
        init();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JLabel getType() {
        return Type;
    }

    public JComboBox getFieldType() {
        return fieldType;
    }

    public JTextField getFieldName() {
        return fieldName;
    }

    @SuppressWarnings(value = {"Duplicates", "unchecked"})
    private void init() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(mainPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        mainPanel.setBorder(BorderFactory.createTitledBorder("Add Field"));
        Type = new JLabel();
        Type.setText("Type");
        mainPanel.add(Type, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        fieldType = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("String");
        defaultComboBoxModel1.addElement("BigDecimal");
        defaultComboBoxModel1.addElement("Integer");
        defaultComboBoxModel1.addElement("Long");
        defaultComboBoxModel1.addElement("Date");
        defaultComboBoxModel1.addElement("Double");
        defaultComboBoxModel1.addElement("Float");
        fieldType.setModel(defaultComboBoxModel1);
        mainPanel.add(fieldType, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("FieldName");
        mainPanel.add(label1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        fieldName = new JTextField();
        mainPanel.add(fieldName, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }


}
