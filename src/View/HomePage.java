/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author shara
 */
public class HomePage extends JFrame{
    private JButton btnAddCustomer;
    private JButton btnPlaceOrder;
    private JButton btnSearch;
    private JButton btnViewOrder;
    private JButton btnUpdateOrder;
    private JButton btnExit;
    
    private JLabel lblTxt;
    
    public HomePage(){
        setTitle("Home Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
        btnAddCustomer = new JButton("Add Customer");
        btnAddCustomer.setFont(new Font("",Font.PLAIN, 15));
        btnAddCustomer.setBounds(150,80,200,50);
        btnAddCustomer.setFocusable(false);
        btnAddCustomer.addActionListener(evt -> {
            
        });
        
        btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.setFont(new Font("",Font.PLAIN, 15));
        btnPlaceOrder.setBounds(150,160,200,50);
        btnPlaceOrder.setFocusable(false);
        btnPlaceOrder.addActionListener(evt -> {
            
        });
        
        btnSearch = new JButton("Search Order");
        btnSearch.setFont(new Font("",Font.PLAIN, 15));
        btnSearch.setBounds(150,240,200,50);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(evt -> {
            
        });
        
        btnViewOrder = new JButton("View Order");
        btnViewOrder.setFont(new Font("",Font.PLAIN, 15));
        btnViewOrder.setBounds(150,320,200,50);
        btnViewOrder.setFocusable(false);
        btnViewOrder.addActionListener(evt -> {
            
        });
        
        btnUpdateOrder = new JButton("Update Order");
        btnUpdateOrder.setFont(new Font("",Font.PLAIN, 15));
        btnUpdateOrder.setBounds(150,400,200,50);
        btnUpdateOrder.setFocusable(false);
        btnUpdateOrder.addActionListener(evt -> {
            
        });
        
        lblTxt = new JLabel();
        lblTxt.setText("Home Page");
        lblTxt.setFont(new Font("",Font.PLAIN,40));
        lblTxt.setForeground(Color.RED);
        lblTxt.setBounds(0,0,500,70);
        lblTxt.setHorizontalAlignment(JLabel.CENTER);
        lblTxt.setBackground(new Color(47,79,79));
        lblTxt.setOpaque(true);
        
        btnSearch = new JButton("Search Order");
        btnSearch.setFont(new Font("",Font.PLAIN, 15));
        btnSearch.setBounds(150,240,200,50);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(evt -> {
            
        });
        
        
        btnExit = new JButton("Exit");
        btnExit.setFont(new Font("",Font.PLAIN, 15));
        btnExit.setBounds(250,480,100,50);
        btnExit.setFocusable(false);
        btnExit.addActionListener(evt -> {
            System.exit(0);
        });
        add(btnAddCustomer);
        add(btnPlaceOrder);
        add(btnSearch);
        add(btnViewOrder);
        add(btnUpdateOrder);
        add(btnExit);
        add(lblTxt);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/icon/icons8-customer-48.png")));
        
        
    }
    
}
