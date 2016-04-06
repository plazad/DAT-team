package dataProject;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Query4 {

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void NewWindow4() {
		Display display = Display.getDefault();
		Shell shlQuery = new Shell();
		shlQuery.setSize(681, 206);
		shlQuery.setText("Query 4");
		shlQuery.setLayout(null);
		
		Label lblHowManyUsers = new Label(shlQuery, SWT.NONE);
		lblHowManyUsers.setBounds(24, 45, 226, 27);
		lblHowManyUsers.setText("How many users viewed ");
		lblHowManyUsers.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		
		Label lblNumberOfTimes = new Label(shlQuery, SWT.NONE);
		lblNumberOfTimes.setBounds(488, 45, 156, 27);
		lblNumberOfTimes.setText("number of times");
		lblNumberOfTimes.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		
		Combo combo = new Combo(shlQuery, SWT.READ_ONLY);
		combo.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		combo.setBounds(252, 45, 142, 33);
		combo.setItems(new String[] {"Frontpage", "News", "Tech", "Local", "Opinion", "On-air", "Misc", "Weather", "MSN-News", "Health", "Living", "Business", "MSN-Sports", "Sports", "Summary", "Bbs", "Travel"});
		
		Spinner spinner = new Spinner(shlQuery, SWT.BORDER);
		spinner.setMaximum(999999);
		spinner.setFont(SWTResourceManager.getFont("Microsoft YaHei UI Light", 9, SWT.NORMAL));
		spinner.setBounds(410, 43, 72, 37);
		
		Label label = new Label(shlQuery, SWT.BORDER);
		label.setBounds(338, 97, 195, 35);
		label.setText("Results...");
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.ITALIC));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
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
		button.setFont(SWTResourceManager.getFont("Microsoft JhengHei", 9, SWT.NORMAL));
		button.setBounds(103, 93, 195, 39);
		button.setText("Run Query");

		shlQuery.open();
		shlQuery.layout();
		while (!shlQuery.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
