package dataProject;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Query1 {
	private static final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void NewWindow1() {
		Display display = Display.getDefault();
		Shell shlQuery = new Shell();
		shlQuery.setSize(637, 193);
		shlQuery.setText("Query 1");
		shlQuery.setLayout(null);
		
		Label lblAreThereMore = new Label(shlQuery, SWT.NONE);
		lblAreThereMore.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		lblAreThereMore.setBounds(10, 29, 189, 31);
		lblAreThereMore.setText("Are there more than");
		
		Spinner spinner = new Spinner(shlQuery, SWT.BORDER);
		spinner.setMaximum(999999);
		spinner.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 9, SWT.NORMAL));
		spinner.setBounds(205, 27, 72, 31);
		
		Label lblNewLabel = new Label(shlQuery, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		lblNewLabel.setBounds(283, 29, 184, 31);
		lblNewLabel.setText("users who looked at");
		
		Combo combo = new Combo(shlQuery, SWT.READ_ONLY);
		combo.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.NORMAL));
		combo.setItems(new String[] {"Frontpage", "News", "Tech", "Local", "Opinion", "On-air", "Misc", "Weather", "MSN-News", "Health", "Living", "Business", "MSN-Sports", "Sports", "Summary", "Bbs", "Travel"});
		combo.setBounds(473, 27, 134, 33);
		formToolkit.adapt(combo);
		formToolkit.paintBordersFor(combo);
		//System.out.println("Index = " + combo.getSelectionIndex());
		
		Label lblNewLabel_1 = new Label(shlQuery, SWT.BORDER);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Microsoft YaHei Light", 10, SWT.ITALIC));
		lblNewLabel_1.setBounds(324, 79, 195, 32);
		formToolkit.adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("Results...");
		
		Button btnRun = new Button(shlQuery, SWT.NONE);
		btnRun.setFont(SWTResourceManager.getFont("Microsoft JhengHei", 9, SWT.NORMAL));
		btnRun.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// USED TO GET USER SELECTION INFORMATION
				System.out.println("Index = " + combo.getSelectionIndex());
				System.out.println("Spinner = " + spinner.getSelection());
				if (combo.getSelectionIndex() == -1) {
					lblNewLabel_1.setText("Select a category");
				} else {
				// Used to set results
				lblNewLabel_1.setText("Loading...");
				lblNewLabel_1.setText(combo.getText());
				}
			}
		});
		
		btnRun.setBounds(88, 76, 195, 35);
		formToolkit.adapt(btnRun, true, true);
		btnRun.setText("Run Query");

		shlQuery.open();
		shlQuery.layout();
		while (!shlQuery.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
