/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrykaabstrakcyjna;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class Wyglad extends JFrame{
    //private JPanel panel;
    private JLabel czerwony;
    private JLabel niebieski;
    private JLabel zielony;
    private JButton bounty;
    private JButton wafelek;
    private JButton snikers;
    private JButton mleczna;
    private JButton zOrzechami;
    private JButton biala;
    private Integer punktyCzerwone = 0;
    private Integer punktyNiebieskie = 0;
    private Integer punktyZielone = 0;
    private JLabel pktCzer;
    private JLabel pktNieb;
    private JLabel pktZiel;
    public Wyglad(){
        setSize(900,620);
        setTitle("Fabryka Czekolady");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);  
        setResizable(false);
        czerwony = new JLabel();
        czerwony.setOpaque(true);
        czerwony.setBackground(new Color(255,51,51));
        czerwony.setBounds(0,0,300,800);
        mleczna = new JButton(new ImageIcon("obraz\\mleczna.png"));
        mleczna.setBounds(0,30,300,230);
        mleczna.setContentAreaFilled(false);
        mleczna.addActionListener(new CzekoladaMleczna());
        czerwony.add(mleczna);        
        snikers = new JButton(new ImageIcon("obraz\\snickers.png"));
        snikers.setBounds(0,270,200,270);
        snikers.setContentAreaFilled(false);
        snikers.addActionListener(new BatonikSnickers());
        czerwony.add(snikers);
        pktCzer = new JLabel(punktyCzerwone.toString());
        pktCzer.setForeground(Color.WHITE);
        pktCzer.setBounds(140,550,150,50);
        czerwony.add(pktCzer);
        add(czerwony);
        niebieski = new JLabel();
        niebieski.setOpaque(true);
        niebieski.setBackground(new Color(102,204,255));        
        niebieski.setBounds(300,0,300,800);
        biala = new JButton(new ImageIcon("obraz\\biala.png"));
        biala.setBounds(0,30,300,200);
        biala.setContentAreaFilled(false);
        biala.addActionListener(new CzekoladaBiala());
        niebieski.add(biala);        
        bounty = new JButton(new ImageIcon("obraz\\bounty.png"));
        bounty.setBounds(0,250,300,200);
        bounty.setContentAreaFilled(false);
        bounty.addActionListener(new BatonikBounty());
        niebieski.add(bounty);        
        pktNieb = new JLabel(punktyNiebieskie.toString());
        pktNieb.setForeground(Color.WHITE);
        pktNieb.setBounds(140,550,150,50);
        niebieski.add(pktNieb);
        add(niebieski);
        zielony = new JLabel();
        zielony.setOpaque(true);
        zielony.setBackground(new Color(102,255,102));
        zielony.setBounds(600,0,300,800);
        add(zielony);
        zOrzechami = new JButton(new ImageIcon("obraz\\zorzechami.png"));
        zOrzechami.setBounds(0,30,300,250);
        zOrzechami.setContentAreaFilled(false);
        zOrzechami.addActionListener(new CzekoladaZOrzechami());
        zielony.add(zOrzechami);
        wafelek = new JButton(new ImageIcon("obraz\\wafelek.png"));
        wafelek.setBounds(0,290,300,170);
        wafelek.setContentAreaFilled(false);
        wafelek.addActionListener(new BatonikWafelek());
        zielony.add(wafelek);
        pktZiel = new JLabel(punktyZielone.toString());
        pktZiel.setForeground(Color.WHITE);
        pktZiel.setBounds(140,550,150,50);
        zielony.add(pktZiel);
        setVisible(true);
    }
    class CzekoladaMleczna implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Fabryka fabryka = new FabrykaCzerwona();
            Mleczna mleczna = (Mleczna) fabryka.createCzekolada();            
            punktyCzerwone++;
            mleczna.coTo();
            fabryka.setPunkty(punktyCzerwone);
            pktCzer.setText(punktyCzerwone.toString());
            repaint();
        }
        
    }
    class BatonikSnickers implements ActionListener{
       @Override
        public void actionPerformed(ActionEvent e) {
            Fabryka fabryka = new FabrykaCzerwona();
            Snickers snickers = (Snickers) fabryka.createBatonik();            
            punktyCzerwone++;
            snickers.coTo();
            fabryka.setPunkty(punktyCzerwone);
            pktCzer.setText(punktyCzerwone.toString());
            repaint();
        } 
    }
    class CzekoladaBiala implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Fabryka fabryka = new FabrykaNiebieska();
            Biala biala = (Biala) fabryka.createCzekolada();            
            punktyNiebieskie++;
            biala.coTo();
            fabryka.setPunkty(punktyNiebieskie);
            pktNieb.setText(punktyNiebieskie.toString());
            repaint();
        } 
    }
    class BatonikBounty implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Fabryka fabryka = new FabrykaNiebieska();
            Bounty bounty = (Bounty) fabryka.createBatonik();            
            punktyNiebieskie++;
            bounty.coTo();
            fabryka.setPunkty(punktyNiebieskie);
            pktNieb.setText(punktyNiebieskie.toString());
            repaint();
        } 
    }
    class CzekoladaZOrzechami implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Fabryka fabryka = new FabrykaZielona();
            ZOrzechami zorzechami = (ZOrzechami) fabryka.createCzekolada();            
            punktyZielone++;
            zorzechami.coTo();
            fabryka.setPunkty(punktyZielone);
            pktZiel.setText(punktyZielone.toString());
            repaint();
        } 
    }
    class BatonikWafelek implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Fabryka fabryka = new FabrykaZielona();
            Wafelek wafelek = (Wafelek) fabryka.createBatonik();            
            punktyZielone++;
            wafelek.coTo();
            fabryka.setPunkty(punktyZielone);
            pktZiel.setText(punktyZielone.toString());
            repaint();
        } 
    }
}
