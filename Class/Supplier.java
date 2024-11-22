

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Supplier extends JFrame {

    private JPanel contentPane;
    private JTable supplierTable;
    private DefaultTableModel tableModel;

    public Supplier() {
        setTitle("Supplier Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 600);

        // Content Pane
        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 248, 255)); // Light blue background
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Title Label
        JLabel titleLabel = new JLabel("Supplier Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setBounds(0, 20, 900, 30);
        contentPane.add(titleLabel);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(50, 70, 800, 50);
        buttonPanel.setLayout(new GridLayout(1, 3, 20, 0)); // 1 row, 3 buttons with spacing
        contentPane.add(buttonPanel);

        // Add Supplier Button
        JButton addSupplierBtn = new JButton("Add Supplier");
        addSupplierBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
        addSupplierBtn.setBackground(new Color(50, 205, 50)); // Lime Green
        addSupplierBtn.setForeground(Color.WHITE);
        buttonPanel.add(addSupplierBtn);

        // Search Supplier Button
        JButton searchSupplierBtn = new JButton("Search Supplier");
        searchSupplierBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
        searchSupplierBtn.setBackground(new Color(255, 140, 0)); // Dark Orange
        searchSupplierBtn.setForeground(Color.WHITE);
        buttonPanel.add(searchSupplierBtn);

        // Remove Supplier Button
        JButton removeSupplierBtn = new JButton("Remove Supplier");
        removeSupplierBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
        removeSupplierBtn.setBackground(new Color(255, 69, 0)); // Red
        removeSupplierBtn.setForeground(Color.WHITE);
        buttonPanel.add(removeSupplierBtn);

        // Table for displaying suppliers
        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Email", "Phone", "Address"}, 0);
        supplierTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(supplierTable);
        scrollPane.setBounds(50, 150, 800, 350);
        contentPane.add(scrollPane);

        // Event Listeners
        addSupplierBtn.addActionListener(e -> addSupplier());
        searchSupplierBtn.addActionListener(e -> searchSupplier());
        removeSupplierBtn.addActionListener(e -> removeLastSupplier());

        // Fetch initial data
        fetchAllSuppliers();
    }

    // Functionality: Fetch All Suppliers and Display in Table
    private void fetchAllSuppliers() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "root")) {
            String query = "SELECT * FROM db";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Clear existing data
            tableModel.setRowCount(0);

            // Populate table with data
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("address")
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching suppliers: " + ex.getMessage());
        }
    }

    // Functionality: Add Supplier
    private void addSupplier() {
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField phoneField = new JTextField();
        JTextField addressField = new JTextField();

        Object[] fields = {
                "ID:", idField,
                "Name:", nameField,
                "Email:", emailField,
                "Phone:", phoneField,
                "Address:", addressField
        };

        int option = JOptionPane.showConfirmDialog(null, fields, "Add Supplier", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "root")) {
                String query = "INSERT INTO db (id, name, email, phone, address) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, idField.getText());
                stmt.setString(2, nameField.getText());
                stmt.setString(3, emailField.getText());
                stmt.setString(4, phoneField.getText());
                stmt.setString(5, addressField.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Supplier added successfully!");
                fetchAllSuppliers(); // Refresh table
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error adding supplier: " + ex.getMessage());
            }
        }
    }

    // Functionality: Search Supplier
// Functionality: Search Supplier
    private void searchSupplier() {
        String supplierName = JOptionPane.showInputDialog("Enter Supplier Name:");
        if (supplierName != null) {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "root")) {
                // Use LOWER() for case-insensitivity
                String query = "SELECT * FROM db WHERE LOWER(name) = LOWER(?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, supplierName); // Input is set directly
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String details = "Name: " + rs.getString("name") + "\n"
                            + "Email: " + rs.getString("email") + "\n"
                            + "Phone: " + rs.getString("phone") + "\n"
                            + "Address: " + rs.getString("address");
                    JOptionPane.showMessageDialog(null, details, "Supplier Details", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Supplier not found!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error searching supplier: " + ex.getMessage());
            }
        }
    }

    // Functionality: Remove Last Supplier
    private void removeLastSupplier() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "root")) {
            String query = "SELECT id FROM db ORDER BY id DESC LIMIT 1"; // Get the last supplier ID
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                int lastId = rs.getInt("id");

                // Delete the supplier
                String deleteQuery = "DELETE FROM db WHERE id = ?";
                PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
                deleteStmt.setInt(1, lastId);
                deleteStmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Last supplier removed successfully!");
                fetchAllSuppliers(); // Refresh table
            } else {
                JOptionPane.showMessageDialog(null, "No supplier found to remove!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error removing supplier: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Supplier frame = new Supplier();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
