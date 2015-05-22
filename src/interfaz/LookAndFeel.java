/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;

/**
 *
 * @author Aldi Vaca
 */
public class LookAndFeel {

    public LookAndFeel() {
        setUIManagerDefaults();
    }

    public Color setBase() {
        return new Color(60, 157, 255); // combo
    }

    public Color setBlueGrey() {
        return new Color(255, 128, 000);// grid y txt
    }

    public Color setControl() {
        return new Color(255, 255, 255);// fondo
    }

    public Color setFocus() {
        return new Color(230, 115, 000);// borde foco
    }

    public Color setSelectionBackground() {
        return new Color(128, 000, 000);// seleccion texto
    }

    public Color setBorder() {
        return new Color(255, 128, 000);// borde tabla
    }

    public Color setTableAlternRow() {
        return new Color(255, 255, 187);// cambio de color en filas tabla
    }

//	public Color setDisabledText() {
//		// return new Color(245, 245, 245); // texto disabled
//		return new Color(50, 50, 50);
//	}
//
//	public Icon setWarningIcon() {
//		Icon image = new javax.swing.ImageIcon(getClass().getResource("/vistas/images/warning48.png"));
//		return image;
//	}
//
//	public Font getFont() {
//		return new Font("Helvetica", Font.PLAIN, 13);
//	}
    private void setUIManagerDefaults() {
        javax.swing.UIManager.put("nimbusBase", setBase());
        javax.swing.UIManager.put("nimbusBlueGrey", setBlueGrey());
        javax.swing.UIManager.put("control", setControl());
        javax.swing.UIManager.put("nimbusFocus", setFocus());
        javax.swing.UIManager.put("nimbusSelectionBackground", setSelectionBackground());
        javax.swing.UIManager.put("nimbusBorder", setBorder());
        javax.swing.UIManager.put("Table.alternateRowColor", setTableAlternRow());
        javax.swing.UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
//		javax.swing.UIManager.put("nimbusDisabledText", setDisabledText());
//		javax.swing.UIManager.put("OptionPane.warningIcon", setWarningIcon());
//		// javax.swing.UIManager.put("defaultFont", getFont());
        // setFont();
    }

//	private void setFont() {
//		javax.swing.UIManager.put("Button.font", getFont());
//		javax.swing.UIManager.put("ToggleButton.font", getFont());
//		javax.swing.UIManager.put("RadioButton.font", getFont());
//		javax.swing.UIManager.put("CheckBox.font", getFont());
//		javax.swing.UIManager.put("ComboBox.font", getFont());
//		javax.swing.UIManager.put("Label.font", getFont());
//		javax.swing.UIManager.put("List.font", getFont());
//		javax.swing.UIManager.put("MenuBar.font", getFont());
//		javax.swing.UIManager.put("MenuItem.font", getFont());
//		javax.swing.UIManager.put("RadioButtonMenuItem.font", getFont());
//		javax.swing.UIManager.put("CheckBoxMenuItem.font", getFont());
//		javax.swing.UIManager.put("Menu.font", getFont());
//		javax.swing.UIManager.put("PopupMenu.font", getFont());
//		javax.swing.UIManager.put("OptionPane.font", getFont());
//		javax.swing.UIManager.put("Panel.font", getFont());
//		javax.swing.UIManager.put("ProgressBar.font", getFont());
//		javax.swing.UIManager.put("ScrollPane.font", getFont());
//		javax.swing.UIManager.put("Table.font", getFont());
//		javax.swing.UIManager.put("TableHeader.font", getFont());
//		javax.swing.UIManager.put("TextField.font", getFont());
//		javax.swing.UIManager.put("PasswordField.font", getFont());
//		javax.swing.UIManager.put("TextArea.font", getFont());
//		javax.swing.UIManager.put("TextPane.font", getFont());
//		javax.swing.UIManager.put("EditorPane.font", getFont());
//		javax.swing.UIManager.put("TitledBorder.font", getFont());
//		javax.swing.UIManager.put("ToolBar.font", getFont());
//		javax.swing.UIManager.put("ToolTip.font", getFont());
//		javax.swing.UIManager.put("Tree.font", getFont());
//	}
}
