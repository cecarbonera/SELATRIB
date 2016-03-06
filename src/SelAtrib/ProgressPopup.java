/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SelAtrib;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.border.CompoundBorder;

/**
 * Shows a popup containing a progress bar and a message while
 * long running actions are in process.
 * 
 * In order to make sure the progress popup always goes away, it's important
 * to always call done() in a finally clause.
 * 
 * @author cbare
 */
public class ProgressPopup implements ProgressListener {
	JDialog parentDialog;
	private int accumulator;
	private Popup popup;
	private JProgressBar progressBar;
	private JLabel messageLabel;

	/**
	 * @param parent The JFrame to use as the parent to the popup
	 */
	public ProgressPopup(JDialog parent) {
		this.parentDialog = parent;
	}

	private void createProgressBar(String message) {
		
		// create contents of popup
		Box box = new Box(BoxLayout.Y_AXIS);
		box.setBorder(new CompoundBorder(
				BorderFactory.createLineBorder(Color.DARK_GRAY, 1),
				BorderFactory.createEmptyBorder(10,10,10,10)));
		messageLabel = new JLabel(message);
		box.add(messageLabel);
		box.add(Box.createVerticalStrut(4));
		progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		box.add(progressBar);

		// calculate where to put popup
		Rectangle r = parentDialog.getBounds();
		int x = r.x + r.width / 2 - box.getWidth();
		int y = r.y + r.height / 2 - box.getHeight();

		// This uses swing's PopupFactory, which decides at runtime whether
		// to use a light-weight popup or heavy weight popup. This behavior
		// isn't particularly desirable, if you ask me. But, it does behave
		// correctly, which is more than can be said for a plain JPopup as
		// far as I could tell.
		popup = PopupFactory.getSharedInstance().getPopup(parentDialog, box, x, y);
                this.parentDialog.add(box);
	}


	public void init(String message) {
		init(100, message);
	}

	public void init(final int totalExpectedProgress) {
		init(totalExpectedProgress, "Please wait...");
	}

	public void init(final int totalExpectedProgress, final String message) {
		createProgressBar(message);
		progressBar.setMaximum(totalExpectedProgress);
		popup.show();
	}

	public void done() {
		popup.hide();
	}

	public void setProgress(final int progress) {
		accumulator = progress;
		progressBar.setValue(progress);
	}

	public void progress(int progress, int expected) {
		accumulator = progress;
		progressBar.setValue(progress);
		progressBar.setMaximum(expected);
	}

	public void incrementProgress(final int amount) {
		accumulator += amount;
		progressBar.setValue(accumulator);
	}

	public void setExpectedProgress(int expected) {
		progressBar.setMaximum(expected);
	}

	public void setMessage(String message) {
		this.messageLabel.setText(message);
	}
}