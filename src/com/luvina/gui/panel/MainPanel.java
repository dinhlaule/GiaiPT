package com.luvina.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.luvina.IAnHien.IAnHien;
import com.luvina.gui.icommon.ICommon;

public class MainPanel extends JPanel implements ICommon {
	private IAnHien event;
	private JLabel lbTitle;
	private JButton btPTBN, btPTBH, btPhepTinh;

	public void addEventMainPanel(IAnHien event) {
		this.event = event;
	}

	public MainPanel() {
		init();
		addComponent();
		addEvent();
	}

	@Override
	public void init() {
		setVisible(true);
		setLayout(null);

	}

	@Override
	public void addComponent() {

		lbTitle = new JLabel();
		lbTitle.setText("Menu");
		// set vị trí
		lbTitle.setBounds(150, 20, 400, 50);
		// set màu
		lbTitle.setForeground(Color.DARK_GRAY);
		// set phông chữ
		lbTitle.setFont(new Font("Arial", Font.BOLD, 30));

		// buton PTBN
		btPTBN = new JButton();
		btPTBN.setText("Giải PTBN");
		// set vị trí
		btPTBN.setBounds(100, 120, 200, 50);
		// set màu
		btPTBN.setForeground(Color.DARK_GRAY);
		// set phông chữ
		btPTBN.setFont(new Font("Arial", Font.BOLD, 30));

		// buton PTBH
		btPTBH = new JButton();
		btPTBH.setText("Giải PTBH");
		// set vị trí
		btPTBH.setBounds(100, 220, 200, 50);
		// set màu
		btPTBH.setForeground(Color.DARK_GRAY);
		// set phông chữ
		btPTBH.setFont(new Font("Arial", Font.BOLD, 30));

		// buton PTBH
		btPhepTinh = new JButton();
		btPhepTinh.setText("Phép Tính");
		// set vị trí
		btPhepTinh.setBounds(100, 320, 200, 50);
		// set màu
		btPhepTinh.setForeground(Color.DARK_GRAY);
		// set phông chữ
		btPhepTinh.setFont(new Font("Arial", Font.BOLD, 30));

		add(lbTitle);
		add(btPTBN);
		add(btPTBH);
		add(btPhepTinh);

	}

	@Override
	public void addEvent() {
		// buton ptbn
		ActionListener ptbn = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				event.anPTBacNhat();

			}
		};
		btPTBN.addActionListener(ptbn);

		// buton ptbh
		ActionListener ptbh = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				event.anPTBacHai();

			}
		};
		btPTBH.addActionListener(ptbh);

		// buton cacPhepTinh
		ActionListener cacPhepTinh = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				event.anCacPhepTinh();

			}
		};
		btPhepTinh.addActionListener(cacPhepTinh);

	}

}
