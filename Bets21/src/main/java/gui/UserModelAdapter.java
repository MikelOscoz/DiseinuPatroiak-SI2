package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import domain.User;

public class UserModelAdapter extends AbstractTableModel {

	private User u;
	private String[] colNames = new String[] { "Event", "Question", "Date", "Bet" };

	public UserModelAdapter(User u) {
		// copy the HashMap data to a sequential data structure
		this.u = u;

	}

	@Override
	public String getColumnName(int col) {
		return colNames[col];
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public int getRowCount() {
		return u.getMugimenduak().size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(u.getMugimenduak().get(rowIndex).getGertaera() != null) {
			switch (columnIndex) {
			case 0:
			
					return ((Object) u.getMugimenduak().get(rowIndex).getGertaera());
			case 1:
			
					return ((Object) u.getMugimenduak().get(rowIndex).getGalderaText());
			case 2:
			
					return ((Object) u.getMugimenduak().get(rowIndex).getGertaera().getEventDate());
			case 3:
			
					return ((Object) u.getMugimenduak().get(rowIndex).getDiruKop());
			}

		}
		return null;
	}
}