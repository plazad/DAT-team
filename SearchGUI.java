package dataProject;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SearchGUI {

	/**
	 * Launch the application.
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		try {
			SearchGUI window = new SearchGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(712, 406);
		shell.setText("Data Analysis Queries");
		shell.setLayout(null);
		
		Label lblDataAnalysis = new Label(shell, SWT.NONE);
		lblDataAnalysis.setFont(SWTResourceManager.getFont("Zantroke", 20, SWT.NORMAL));
		lblDataAnalysis.setAlignment(SWT.CENTER);
		lblDataAnalysis.setBounds(10, 20, 365, 68);
		lblDataAnalysis.setText("Data Analysis");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("@Microsoft YaHei UI", 10, SWT.NORMAL));
		lblNewLabel.setBounds(33, 94, 183, 27);
		lblNewLabel.setText("Select a query:");
		
		Label lblAreThereMore = new Label(shell, SWT.NONE);
		lblAreThereMore.setText("Are there more than _____ users who looked at X");
		lblAreThereMore.setFont(SWTResourceManager.getFont("@Microsoft YaHei Light", 10, SWT.NORMAL));
		lblAreThereMore.setBounds(33, 127, 471, 34);
		
		Label lblWhatPercentOf = new Label(shell, SWT.NONE);
		lblWhatPercentOf.setText("What percent of users looked at X");
		lblWhatPercentOf.setFont(SWTResourceManager.getFont("@Microsoft YaHei Light", 10, SWT.NORMAL));
		lblWhatPercentOf.setBounds(33, 167, 471, 34);
		
		Label lblAreThereMore_1 = new Label(shell, SWT.NONE);
		lblAreThereMore_1.setText("Are there more users who looked at X than Y");
		lblAreThereMore_1.setFont(SWTResourceManager.getFont("@Microsoft YaHei Light", 10, SWT.NORMAL));
		lblAreThereMore_1.setBounds(33, 207, 471, 34);
		
		Label lblHowManyUsers = new Label(shell, SWT.NONE);
		lblHowManyUsers.setText("How many users viewed X _____ number of times");
		lblHowManyUsers.setFont(SWTResourceManager.getFont("@Microsoft YaHei Light", 10, SWT.NORMAL));
		lblHowManyUsers.setBounds(33, 247, 471, 34);
		
		Label lblWhatPercentOf_1 = new Label(shell, SWT.NONE);
		lblWhatPercentOf_1.setText("What percent of users looked at X more than Y");
		lblWhatPercentOf_1.setFont(SWTResourceManager.getFont("@Microsoft YaHei Light", 10, SWT.NORMAL));
		lblWhatPercentOf_1.setBounds(33, 287, 471, 34);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Query1 nw = new Query1();
				nw.NewWindow1();
			}
		});
		btnNewButton.setBounds(540, 127, 129, 27);
		btnNewButton.setText("Select");
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Query2 nw = new Query2();
				nw.NewWindow2();
			}
		});
		button.setText("Select");
		button.setBounds(540, 167, 129, 27);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Query3 nw = new Query3();
				nw.NewWindow3();
			}
		});
		button_1.setText("Select");
		button_1.setBounds(540, 207, 129, 27);
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Query4 nw = new Query4();
				nw.NewWindow4();
			}
		});
		button_2.setText("Select");
		button_2.setBounds(540, 247, 129, 27);
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Query5 nw = new Query5();
				nw.NewWindow5();	
			}
		});
		button_3.setText("Select");
		button_3.setBounds(540, 287, 129, 27);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
