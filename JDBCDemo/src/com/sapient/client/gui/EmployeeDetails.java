/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sapient.client.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * 
 * @author ilisze
 */
public class EmployeeDetails extends javax.swing.JFrame {
	ResultSet glResult=  null;
	Connection glDbConnection = null;
	PreparedStatement glPStatement = null;
	
	Connection dbConnection = null;
	PreparedStatement pStatement = null;
	ResultSet result = null;
	/**
	 * Creates new form EmployeeDetails
	 */
	public EmployeeDetails() {
		initComponents();
		btnNextEmployee.setVisible(false);
		lblEmployeeDisplayed.setVisible(false);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmployeeID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        btnFindID = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFindSalary = new javax.swing.JButton();
        lblEmployeeDisplayed = new javax.swing.JLabel();
        btnNextEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmployeeID.setText("Employee ID");

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblSalary.setText("Salary");

        btnFindID.setText("Find by ID");
        btnFindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIDActionPerformed(evt);
            }
        });

        btnInsert.setText("Add");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Modify");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Remove");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFindSalary.setText("Find by Salary");
        btnFindSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSalaryActionPerformed(evt);
            }
        });

        lblEmployeeDisplayed.setText("Employee Displayed:");

        btnNextEmployee.setText("Next");
        btnNextEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnNextEmployeeActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(lblEmployeeID))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFindSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFindID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsert)
                        .addGap(10, 10, 10)
                        .addComponent(btnUpdate)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEmployeeDisplayed)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNextEmployee)
                        .addGap(286, 286, 286))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalary))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindID)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnFindSalary))
                .addGap(18, 18, 18)
                .addComponent(lblEmployeeDisplayed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextEmployee)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextEmployeeActionPerformed
        // TODO add your handling code here:
    	try {
			if (glResult.next()) {
				txtFirstName.setText(glResult.getString(1));
				txtLastName.setText(glResult.getString(2));
				txtEmployeeID.setText(glResult.getString(3));
			} else {
				btnNextEmployee.setVisible(false);
				lblEmployeeDisplayed.setVisible(false);
				txtFirstName.setText("");
				txtLastName.setText("");
				txtEmployeeID.setText("");
				txtSalary.setText("");
				try {
					if (glResult != null) {
						glResult.close();
					}
					if (glDbConnection != null && !glDbConnection.isClosed()) {
						glDbConnection.close();
					}
					if (glPStatement != null) {
						glPStatement.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_btnNextEmployeeActionPerformed

	private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInsertActionPerformed

		try {
			setConnection();

			// Execute the query
			pStatement = dbConnection
					.prepareStatement("INSERT INTO EMPLOYEES"
							+ "(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID)"
							+ " VALUES (?,?,?,'SKING','515.123.4567',to_date('17-JUN-87','DD-MON-RR'),'AD_PRES',?,null,null,90)");

			pStatement.setInt(1, Integer.parseInt(txtEmployeeID.getText()));
			pStatement.setString(2, txtFirstName.getText());
			pStatement.setString(3, txtLastName.getText());
			pStatement.setInt(4, Integer.parseInt(txtSalary.getText()));

			pStatement.executeUpdate();
			JOptionPane.showMessageDialog(this, "Record Inserted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}// GEN-LAST:event_btnInsertActionPerformed

	/**
	 * 
	 */
	private void closeConnection() {
		try {
			if (dbConnection != null && !dbConnection.isClosed()) {
				dbConnection.close();
			}
			if (pStatement != null) {
				pStatement.close();
			}
			if (result != null) {
				result.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void btnFindIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFindIDActionPerformed
		// Load / Register the driver
		try {
			setConnection();

			// Execute the query
			pStatement = dbConnection
					.prepareStatement("SELECT FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID=?");

			pStatement.setInt(1, Integer.parseInt(txtEmployeeID.getText()));

			result = pStatement.executeQuery();
			if (result.next()) {
				txtFirstName.setText(result.getString(1));
				txtLastName.setText(result.getString(2));
				txtSalary.setText(result.getString(3));
			} else {
				JOptionPane.showMessageDialog(this, "No Record Found",
						"EmployeeId Does Not Exist", JOptionPane.ERROR_MESSAGE);
			}
			// TODO add your handling code here:
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// need to at least check if DBConnection is null
			closeConnection();
		}

	}// GEN-LAST:event_btnFindIDActionPerformed

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
		// TODO add your handling code here:

		int employeeID = Integer.parseInt(txtEmployeeID.getText());
		String firstName = txtFirstName.getText();
		String lastName = txtLastName.getText();
		int salary = Integer.parseInt(txtSalary.getText());
		System.out.println("  salary: " + salary + "  name: " + firstName + " "
				+ lastName + "  employeeID " + employeeID);
		try {
			setConnection();

			// Execute the query
			pStatement = dbConnection
					.prepareStatement("UPDATE EMPLOYEES SET EMPLOYEE_ID = "
							+ employeeID + ", FIRST_NAME = " + "'" + firstName
							+ "'" + ",LAST_NAME = " + "'" + lastName + "'"
							+ ",SALARY = " + salary + " WHERE EMPLOYEE_ID=?");

			pStatement.setInt(1, employeeID);

			int updateSuccess = pStatement.executeUpdate();

			if (updateSuccess > 0) {
				String infoText = "  Updated Values: \n EmployeeID "
						+ employeeID + "\n First Name: " + firstName
						+ "\n Last Name: " + lastName + "\n Salary: " + salary;
				JOptionPane.showMessageDialog(this, "Update Successful",
						infoText, JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, "Update Failed",
						"Employee Values Not Updated",
						JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}// GEN-LAST:event_btnUpdateActionPerformed

	/**
	 * @throws SQLException
	 */
	private void setConnection() throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		// Establish a connection
		dbConnection = DriverManager.getConnection(
				"jdbc:oracle:thin:@deltahiti31202:1521:XE", "Ian",
				"JINli011492");
	}

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed

		try {
			setConnection();

			// Execute the query
			pStatement = dbConnection
					.prepareStatement("DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID=?");

			pStatement.setInt(1, Integer.parseInt(txtEmployeeID.getText()));

			pStatement.executeUpdate();

			txtEmployeeID.setText("");
			txtFirstName.setText("");
			txtLastName.setText("");
			txtSalary.setText("");

			JOptionPane.showMessageDialog(this, "Record Deleted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}// GEN-LAST:event_btnDeleteActionPerformed

	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
		// TODO add your handling code here:
		System.exit(0);
	}// GEN-LAST:event_btnExitActionPerformed

	private void btnFindSalaryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFindSalaryActionPerformed
		if(txtSalary.getText().isEmpty())
			return;
		// Load / Register the driver

		try {
			setConnection();

			// Execute the query
			glPStatement = glDbConnection
					.prepareStatement("SELECT FIRST_NAME,LAST_NAME,EMPLOYEE_ID FROM EMPLOYEES WHERE SALARY=?");

			glPStatement.setInt(1, Integer.parseInt(txtSalary.getText()));

			glResult = glPStatement.executeQuery();
			
			if (glResult.next()) {
				btnNextEmployee.setVisible(true);
				lblEmployeeDisplayed.setVisible(true);
				txtFirstName.setText(glResult.getString(1));
				txtLastName.setText(glResult.getString(2));
				txtEmployeeID.setText(glResult.getString(3));
			} else {
				JOptionPane.showMessageDialog(this, "No Record Found",
						"EmployeeId Does Not Exist", JOptionPane.ERROR_MESSAGE);
			}

			
			
			// TODO add your handling code here:
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}// GEN-LAST:event_btnFindSalaryActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(EmployeeDetails.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(EmployeeDetails.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(EmployeeDetails.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(EmployeeDetails.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EmployeeDetails().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindID;
    private javax.swing.JButton btnFindSalary;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnNextEmployee;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblEmployeeDisplayed;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}