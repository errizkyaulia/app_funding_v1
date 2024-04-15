/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import Connection.ConnectionDatabase;
import GUI.Loading;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Rizky
 */
public class ReservationMenu extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    public ReservationMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        TabPanel = new javax.swing.JTabbedPane();
        FindRoom = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cekInDateChooser = new com.toedter.calendar.JDateChooser();
        cekOutDateChooser = new com.toedter.calendar.JDateChooser();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableRoomsTable = new javax.swing.JTable();
        nightsLabel = new javax.swing.JLabel();
        totalNightsLabel = new javax.swing.JLabel();
        RoomCart = new javax.swing.JPanel();
        continueBookingButton = new javax.swing.JButton();
        chooseOtherRoomButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartRoomTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkInDateLabel = new javax.swing.JLabel();
        checkOutDateLabel = new javax.swing.JLabel();
        totalNightsConfirmLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Checkout = new javax.swing.JPanel();
        Confirmation = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        findRoomButton = new javax.swing.JButton();
        myReservationButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservation");
        setMaximizedBounds(getMaximizedBounds());
        setPreferredSize(new java.awt.Dimension(1100, 400));

        TabPanel.setPreferredSize(new java.awt.Dimension(700, 405));

        FindRoom.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setText("Check In Date");

        jLabel2.setText("Check Out Date");

        searchButton.setText("Search Room");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));

        availableRoomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        availableRoomsTable.setColumnSelectionAllowed(true);
        availableRoomsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(availableRoomsTable);
        availableRoomsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        nightsLabel.setText("Total Night(s) =");

        totalNightsLabel.setText("0");

        javax.swing.GroupLayout FindRoomLayout = new javax.swing.GroupLayout(FindRoom);
        FindRoom.setLayout(FindRoomLayout);
        FindRoomLayout.setHorizontalGroup(
            FindRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cekInDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cekOutDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(nightsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalNightsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        FindRoomLayout.setVerticalGroup(
            FindRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindRoomLayout.createSequentialGroup()
                .addGroup(FindRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FindRoomLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(FindRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchButton)
                            .addComponent(nightsLabel)
                            .addComponent(totalNightsLabel))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FindRoomLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FindRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cekInDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(cekOutDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
        );

        TabPanel.addTab("tab1", FindRoom);

        RoomCart.setBackground(new java.awt.Color(204, 255, 204));

        continueBookingButton.setText("Continue Booking");

        chooseOtherRoomButton.setText("Choose Other Room");
        chooseOtherRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseOtherRoomButtonActionPerformed(evt);
            }
        });

        cartRoomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Total Bed", "Max People", "Room Price per Nigth"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cartRoomTable);
        if (cartRoomTable.getColumnModel().getColumnCount() > 0) {
            cartRoomTable.getColumnModel().getColumn(0).setResizable(false);
            cartRoomTable.getColumnModel().getColumn(1).setResizable(false);
            cartRoomTable.getColumnModel().getColumn(2).setResizable(false);
            cartRoomTable.getColumnModel().getColumn(3).setResizable(false);
            cartRoomTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel3.setText("This is the Room You choose:");

        jLabel4.setText("Check In Date:");

        jLabel5.setText("Check Out Date:");

        jLabel6.setText("Total Nights:");

        jLabel7.setText("Total Prices:");

        checkInDateLabel.setText("Eror getting CheckIn data");

        checkOutDateLabel.setText("Eror getting CheckOut data");

        totalNightsConfirmLabel.setText("Eror getting TotalNights data");

        totalPriceLabel.setText("Eror getting TotalPrices data");

        jLabel8.setText("Your Name:");

        jLabel9.setText("Email:");

        javax.swing.GroupLayout RoomCartLayout = new javax.swing.GroupLayout(RoomCart);
        RoomCart.setLayout(RoomCartLayout);
        RoomCartLayout.setHorizontalGroup(
            RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomCartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RoomCartLayout.createSequentialGroup()
                        .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                            .addGroup(RoomCartLayout.createSequentialGroup()
                                .addComponent(chooseOtherRoomButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(continueBookingButton))
                            .addGroup(RoomCartLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RoomCartLayout.createSequentialGroup()
                                        .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoomCartLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkInDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkOutDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(RoomCartLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(RoomCartLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalNightsConfirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))))
        );
        RoomCartLayout.setVerticalGroup(
            RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoomCartLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(checkInDateLabel)
                    .addComponent(totalNightsConfirmLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(checkOutDateLabel)
                    .addComponent(totalPriceLabel))
                .addGap(35, 35, 35)
                .addGroup(RoomCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseOtherRoomButton)
                    .addComponent(continueBookingButton))
                .addGap(47, 47, 47))
        );

        TabPanel.addTab("tab2", RoomCart);

        javax.swing.GroupLayout CheckoutLayout = new javax.swing.GroupLayout(Checkout);
        Checkout.setLayout(CheckoutLayout);
        CheckoutLayout.setHorizontalGroup(
            CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        CheckoutLayout.setVerticalGroup(
            CheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        TabPanel.addTab("tab3", Checkout);

        javax.swing.GroupLayout ConfirmationLayout = new javax.swing.GroupLayout(Confirmation);
        Confirmation.setLayout(ConfirmationLayout);
        ConfirmationLayout.setHorizontalGroup(
            ConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        ConfirmationLayout.setVerticalGroup(
            ConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        TabPanel.addTab("tab4", Confirmation);

        Menu.setBackground(new java.awt.Color(204, 255, 255));
        Menu.setPreferredSize(new java.awt.Dimension(200, 400));

        findRoomButton.setText("Find Room");
        findRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findRoomButtonActionPerformed(evt);
            }
        });

        myReservationButton.setText("My Reservation");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(findRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myReservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(findRoomButton)
                .addGap(35, 35, 35)
                .addComponent(myReservationButton)
                .addGap(38, 38, 38)
                .addComponent(loginButton)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        
        // Reset Table
        DefaultTableModel model = (DefaultTableModel) availableRoomsTable.getModel();
        model.setRowCount(0); // Menghapus semua baris dalam tabel
        
        totalNightsLabel.setText("0");
        
        // Mendapatkan tanggal hari ini
        Date today = new Date();
        Date cekIn = cekInDateChooser.getDate();
        Date cekOut = cekOutDateChooser.getDate();
        
        // Pastikan User Memilih Tanggal dengan benar
        if (cekIn != null && cekOut != null) {
            // Pengecekan apakah tanggal check-in tidak lebih kecil dari tanggal hari ini
            if (cekIn.before(today)) {
                JOptionPane.showMessageDialog(null, "Maaf, Anda tidak dapat memilih tanggal kemarin untuk check-in.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            } else {
                // Pengecekan apakah tanggal check-out lebih besar dari tanggal check-in
                if (cekOut.after(cekIn)) {
                    // Pastikan tanggal check-in dan check-out tidak sama
                    if (cekOut.equals(cekIn)) {
                        JOptionPane.showMessageDialog(null, "Maaf, tanggal check-out harus berbeda dengan tanggal check-in.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Penghitungan total hari
                        long totalHari = ChronoUnit.DAYS.between(cekIn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), 
                                                                cekOut.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                        // Ubah total hari menjadi String
                        String totalHariString = String.valueOf(totalHari);

                        // Set teks label dengan total hari
                        totalNightsLabel.setText(totalHariString);
                        totalNightsConfirmLabel.setText(totalHariString);
                        
                        String ckInDate = String.valueOf(cekIn);
                        String ckOutDate = String.valueOf(cekOut);
                        // Set Tanggal CekIn dan CekOut di Next Tab
                        checkInDateLabel.setText(ckInDate);
                        checkOutDateLabel.setText(ckOutDate);
                        
                        if (totalHari != 0){ // Tidak bisa memesan dengan tanggal cekout yang sama (minimal 1 hari)
                            // Tampilkan Loading
                            Loading loadingScreen = new Loading();
                            loadingScreen.setVisible(true);

                            // Connect into database and fetching user data
                            ConnectionDatabase database = new ConnectionDatabase();
                            Connection conn = database.connect(); // Memanggil metode connect untuk membuat koneksi ke database

                            // Menampilkan kamar yang tersedia dan memberi tahu pengguna
                            showAvailableRooms(conn, cekIn, cekOut);
                            loadingScreen.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Maaf, tanggal check-out harus setelah tanggal check-in.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf, tanggal check-out harus setelah tanggal check-in.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Maaf, pastikan Anda telah memilih tanggal check-in dan check-out.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void findRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findRoomButtonActionPerformed
        // TODO add your handling code here:
        TabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_findRoomButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void chooseOtherRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseOtherRoomButtonActionPerformed
        // TODO add your handling code here:
        TabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_chooseOtherRoomButtonActionPerformed

    // Menampilkan Kamar
    private void showAvailableRooms(Connection conn, Date checkInDate, Date checkOutDate) {
        try {
            // Query untuk mengambil informasi kamar yang tersedia pada rentang tanggal tertentu
            String query = "SELECT * FROM room WHERE room_id NOT IN (SELECT room_id FROM reservation WHERE (? <= check_out AND ? >= check_in)) AND room_status = ?";

            // Persiapkan statement
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setDate(1, new java.sql.Date(checkInDate.getTime())); // Set tanggal cek-in
            statement.setDate(2, new java.sql.Date(checkOutDate.getTime())); // Set tanggal cek-out
            statement.setString(3, "Available");

            // Eksekusi kueri
            ResultSet rs = statement.executeQuery();

            // Buat model tabel
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Available Room");
            model.addColumn("Room Type");
            model.addColumn("Total Bed");
            model.addColumn("Max People");
            model.addColumn("Room Price per Night");
            model.addColumn("Select"); // Kolom tambahan untuk tombol Select


            // Memproses hasil query untuk menambahkan baris ke dalam model tabel
            while (rs.next()) {
                String roomId = rs.getString("room_id");
                String roomType = rs.getString("room_type");
                String totalBed = rs.getString("room_bed");
                String roomCapacity = rs.getString("room_capacity");
                String roomPrice = rs.getString("room_price");
                // Ambil informasi lainnya sesuai kebutuhan Anda

                // Tambahkan baris ke dalam model tabel
                model.addRow(new Object[]{roomId, roomType, totalBed, roomCapacity, roomPrice, "Select"});
            }

            // Set model tabel
            availableRoomsTable.setModel(model);

            // Tambahkan ActionListener untuk tombol Select
            availableRoomsTable.getColumn("Select").setCellRenderer(new ButtonRenderer());
            availableRoomsTable.getColumn("Select").setCellEditor(new ButtonEditor(new JCheckBox()));

            // Tutup statement dan result set
            statement.close();
            rs.close();

            // Open Table
            // TabPanel.setSelectedIndex(1);
        } catch (SQLException e) {
            e.printStackTrace();
            // Tangani pengecualian sesuai kebutuhan Anda
            JOptionPane.showMessageDialog(null, "Gagal Memuat Kamar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Editor untuk tombol Select
    class ButtonEditor extends DefaultCellEditor {
        protected JButton button;

        private String roomId;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Dapatkan room_id dari baris yang diklik
                    roomId = (String) availableRoomsTable.getValueAt(availableRoomsTable.getSelectedRow(), 0);
                    // Tambahkan data ke dalam cartRoomTable
                    addToCart(roomId);
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column) {
            button.setText((value == null) ? "" : value.toString());
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return roomId;
        }

        // Method untuk menambah data ke dalam cartRoomTable
        private void addToCart(String roomId) {
            // Ambil data dari availableRoomsTable berdasarkan roomId
            int selectedRow = availableRoomsTable.getSelectedRow();
            if (selectedRow != -1) { // Pastikan baris terpilih valid
                String[] rowData = new String[availableRoomsTable.getColumnCount()];
                for (int i = 0; i < availableRoomsTable.getColumnCount(); i++) {
                    rowData[i] = availableRoomsTable.getValueAt(selectedRow, i).toString();
                }

                // Buat model baru untuk cartRoomTable
                DefaultTableModel cartModel = new DefaultTableModel();
                cartModel.addColumn("Room Number");
                cartModel.addColumn("Room Type");
                cartModel.addColumn("Total Bed");
                cartModel.addColumn("Max People");
                cartModel.addColumn("Room Price per Night");
                cartRoomTable.setModel(cartModel);

                // Tambahkan data ke dalam cartRoomTable
                cartModel.addRow(rowData);

                // Tampilkan pesan konfirmasi
                JOptionPane.showMessageDialog(null, "Kamar telah ditambahkan ke dalam keranjang.", "Konfirmasi", JOptionPane.INFORMATION_MESSAGE);

                // Pindah ke TabPanel index 1
                TabPanel.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(null, "Pilih kamar yang ingin ditambahkan ke dalam keranjang.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    // Renderer untuk tombol Select
    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus,
                                                       int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Checkout;
    private javax.swing.JPanel Confirmation;
    private javax.swing.JPanel FindRoom;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel RoomCart;
    private javax.swing.JTabbedPane TabPanel;
    private javax.swing.JTable availableRoomsTable;
    private javax.swing.JTable cartRoomTable;
    private com.toedter.calendar.JDateChooser cekInDateChooser;
    private com.toedter.calendar.JDateChooser cekOutDateChooser;
    private javax.swing.JLabel checkInDateLabel;
    private javax.swing.JLabel checkOutDateLabel;
    private javax.swing.JButton chooseOtherRoomButton;
    private javax.swing.JButton continueBookingButton;
    private javax.swing.JButton findRoomButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton myReservationButton;
    private javax.swing.JLabel nightsLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel totalNightsConfirmLabel;
    private javax.swing.JLabel totalNightsLabel;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
