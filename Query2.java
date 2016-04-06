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

public class Query2 {

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void NewWindow2() {
		Display display = Display.getDefault();
		Shell shlQuery = new Shell();
		shlQuery.setSize(516, 177);
		shlQuery.setText("Query 2");
		
		Label lblNewLabel = new Label(shlQuery, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		lblNewLabel.setBounds(10, 22, 299, 42);
		lblNewLabel.setText("What percent of users looked at ");
		
		Combo combo = new Combo(shlQuery, SWT.READ_ONLY);
		combo.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		combo.setItems(new String[] {"Frontpage", "News", "Tech", "Local", "Opinion", "On-air", "Misc", "Weather", "MSN-News", "Health", "Living", "Business", "MSN-Sports", "Sports", "Summary", "Bbs", "Travel"});
		combo.setBounds(315, 22, 142, 33);
		
		Label label = new Label(shlQuery, SWT.BORDER);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label.setText("Results...");
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.ITALIC));
		label.setBounds(224, 70, 195, 35);
		
		Button btnRunQuery = new Button(shlQuery, SWT.NONE);
		btnRunQuery.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (combo.getSelectionIndex() == -1) {
					label.setText("Select a category");
				} else {
				// PLACE QUERY HERE	
				}
			}
		});
		btnRunQuery.setFont(SWTResourceManager.getFont("Microsoft JhengHei", 9, SWT.NORMAL));
		btnRunQuery.setBounds(52, 70, 142, 35);
		btnRunQuery.setText("Run Query");

		shlQuery.open();
		shlQuery.layout();
		while (!shlQuery.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
