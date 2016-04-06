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

public class Query3 {

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void NewWindow3() {
		Display display = Display.getDefault();
		Shell shlQuery = new Shell();
		shlQuery.setSize(737, 198);
		shlQuery.setText("Query 3");
		shlQuery.setLayout(null);
		
		Label lblAreThereMore = new Label(shlQuery, SWT.NONE);
		lblAreThereMore.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		lblAreThereMore.setBounds(10, 38, 326, 27);
		lblAreThereMore.setText("Are there more users who looked at");
		
		Label lblThan = new Label(shlQuery, SWT.NONE);
		lblThan.setText("than");
		lblThan.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		lblThan.setBounds(490, 38, 43, 27);
		
		Combo combo = new Combo(shlQuery, SWT.READ_ONLY);
		combo.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		combo.setItems(new String[] {"Frontpage", "News", "Tech", "Local", "Opinion", "On-air", "Misc", "Weather", "MSN-News", "Health", "Living", "Business", "MSN-Sports", "Sports", "Summary", "Bbs", "Travel"});
		combo.setBounds(342, 35, 142, 33);
		
		Combo combo_1 = new Combo(shlQuery, SWT.READ_ONLY);
		combo_1.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		combo_1.setItems(new String[] {"Frontpage", "News", "Tech", "Local", "Opinion", "On-air", "Misc", "Weather", "MSN-News", "Health", "Living", "Business", "MSN-Sports", "Sports", "Summary", "Bbs", "Travel"});
		combo_1.setBounds(539, 35, 142, 33);
		
		Label label = new Label(shlQuery, SWT.BORDER);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label.setText("Results...");
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.ITALIC));
		label.setBounds(347, 89, 195, 35);
		
		Button button = new Button(shlQuery, SWT.NONE);
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
		button.setFont(SWTResourceManager.getFont("Microsoft YaHei", 9, SWT.NORMAL));
		button.setText("Run Query");
		button.setBounds(105, 89, 195, 35);

		shlQuery.open();
		shlQuery.layout();
		while (!shlQuery.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
