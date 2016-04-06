package dataProject;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Query5 {

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void NewWindow5() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(752, 205);
		shell.setText("Query 5");
		shell.setLayout(null);
		
		Label lblWhatPercentOf = new Label(shell, SWT.NONE);
		lblWhatPercentOf.setBounds(10, 41, 289, 27);
		lblWhatPercentOf.setText("What percent of users looked at");
		lblWhatPercentOf.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		
		Combo combo = new Combo(shell, SWT.READ_ONLY);
		combo.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		combo.setBounds(305, 38, 142, 33);
		combo.setItems(new String[] {"Frontpage", "News", "Tech", "Local", "Opinion", "On-air", "Misc", "Weather", "MSN-News", "Health", "Living", "Business", "MSN-Sports", "Sports", "Summary", "Bbs", "Travel"});
		
		Label lblMoreThan = new Label(shell, SWT.NONE);
		lblMoreThan.setBounds(453, 41, 95, 27);
		lblMoreThan.setText("more than");
		lblMoreThan.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		
		Combo combo_1 = new Combo(shell, SWT.READ_ONLY);
		combo_1.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		combo_1.setBounds(554, 38, 161, 35);
		combo_1.setItems(new String[] {"Frontpage", "News", "Tech", "Local", "Opinion", "On-air", "Misc", "Weather", "MSN-News", "Health", "Living", "Business", "MSN-Sports", "Sports", "Summary", "Bbs", "Travel"});
		
		Label label = new Label(shell, SWT.BORDER);
		label.setText("Results...");
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.ITALIC));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label.setBounds(380, 96, 195, 32);
		
		Button button = new Button(shell, SWT.NONE);
		button.setFont(SWTResourceManager.getFont("Microsoft YaHei", 9, SWT.NORMAL));
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (combo.getSelectionIndex() == -1) {
					label.setText("Select a category");
				} else {
				// PLACE QUERY HERE
				}
			}
		});
		button.setText("Run Query");
		button.setBounds(138, 93, 195, 35);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
